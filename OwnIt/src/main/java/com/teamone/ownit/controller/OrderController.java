package com.teamone.ownit.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.teamone.ownit.service.OrderService;
import com.teamone.ownit.vo.AccountVO;
import com.teamone.ownit.vo.AddressVO;
import com.teamone.ownit.vo.ImageVO;
import com.teamone.ownit.vo.MemberAddressAccountVO;
import com.teamone.ownit.vo.MemberVO;
import com.teamone.ownit.vo.Order_sellVO;
import com.teamone.ownit.vo.ProductVO;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	// 구매주문 폼
	@GetMapping(value = "order_buyForm")
	public String order_buyForm(@RequestParam int product_idx, Model model) {
		//이미지 하나 가져오는 작업 불필요시 삭제
		ImageVO image = service.selectDetailImage(product_idx);
		model.addAttribute("image", image);
	
		//프로덕트 정보 가져오는 작업 불필요시 삭제
		ProductVO product = service.productDetail(product_idx);
		model.addAttribute("product", product);
		return "order/order_buyForm";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
// 박주닮 101번째라인
	
	
	
	
	
	
	// 상품 판매 동의
	@GetMapping(value = "order_sellAgree")
	public String order_sellAgree(@RequestParam int product_idx, Model model,HttpSession session) {
		//상품 판매 버튼 클릭시 세션아이디가 없으면 로그인화면으로
		session.setAttribute("sId", "test2@naver.com"); // 세션아이디 임시 테스트용
		String sId = (String)session.getAttribute("sId");
		if(sId != null && !sId.equals("")) { // 로그인 중일경우 실행
			System.out.println(sId);
			ImageVO image = service.selectDetailImage(product_idx);
			model.addAttribute("image", image);
			
			ProductVO product = service.productDetail(product_idx);
			model.addAttribute("product", product);
			return "order/order_sellAgree";
		}
		return "member/member_login";
	}
	
	// 상품판매폼
	@GetMapping(value = "order_sellForm")
	public String order_sellForm(@RequestParam int product_idx, Model model, HttpSession session) {
		//상품의 이미지를 불러오는 메서드
		ImageVO image = service.selectDetailImage(product_idx);
		model.addAttribute("image", image);
		//상품의 정보를 불러오는 메서드
		ProductVO product = service.productDetail(product_idx);
		model.addAttribute("product", product);
		//판매자의 정보를 불러오는 메서드
		String sId = (String)session.getAttribute("sId");
		MemberAddressAccountVO member = service.selectMember(sId);
		model.addAttribute("member",member);
		
		return "order/order_sellForm";
	}
	
	
	
	// 상품 판매 (맵핑호출 시 account_idx 를 주면 insert작업수행, account_idx를 주지않으면 insert작업 수행)
	@PostMapping(value = "order_sellDetail")
	public String order_sellDetail(@ModelAttribute Order_sellVO order_sell, Model model) {
		ImageVO image = service.selectDetailImage(order_sell.getProduct_idx());
		model.addAttribute("image", image);
		ProductVO product = service.productDetail(order_sell.getProduct_idx());
		model.addAttribute("product", product);
		
		//판매성공시 판매자 정보 입력
		if(order_sell.getAccount_idx() != 0) { // 계좌정보를 입력 받았을때만 insert작업 수행
			int insertCount = service.insertOrderSell(order_sell);
			
			if(insertCount > 0) {
				Order_sellVO orderSell = service.selectOrderSell(order_sell);
				model.addAttribute("orderSell",orderSell);
				
				System.out.println("판매자 정보 등록 성공");
				return "order/order_sellDetail";
			}else {
				System.out.println("판매실패");
				return "order/order_sellForm";
			}
		} else {
			Order_sellVO orderSell = service.selectOrderSell(order_sell);
			model.addAttribute("orderSell", orderSell);
			System.out.println("insert 작업 없이 그냥 정보만 조회");
			return "order/order_sellDetail";
		}
		
	}
	
	//상품 구매 동의
	@GetMapping(value = "order_buyAgree")
	public String order_buyAgree(@RequestParam int product_idx, Model model,HttpSession session) {
//		session.setAttribute("sId", "test2@naver.com"); // 세션아이디 임시 테스트용
		String sId = (String)session.getAttribute("sId");
		if(sId != null && !sId.equals("")) { // 로그인 중일경우 실행
			ImageVO image = service.selectDetailImage(product_idx);
			model.addAttribute("image", image);
		
			ProductVO product = service.productDetail(product_idx);
			model.addAttribute("product", product);
			return "order/order_buyAgree";
		}
		return "member/member_login";
	}
	
	
	
	
	
	
	
	
				
}//200번라인
