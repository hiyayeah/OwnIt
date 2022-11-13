package com.teamone.ownit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamone.ownit.mapper.ProductMapper;
import com.teamone.ownit.vo.ImageVO;
import com.teamone.ownit.vo.ProductVO;
import com.teamone.ownit.vo.WishlistVO;

@Service
public class ProductService {
	@Autowired
	private ProductMapper mapper;
	// 상품목록 조회
	public List<ProductVO> getProductList(String sId) {
		System.out.println("ProductService - getProductList()");
		return mapper.getProductList(sId);
	}

	public List<ProductVO> getCategorisedProduct(String id) {
		System.out.println("getCategorisedProduct()");
		return mapper.getCategorisedProduct(id);
	}

	public List<ProductVO> arrayByCategory(String id) {
		System.out.println("arrayByCategory()");
		return mapper.arrayByCategory(id);
	}

	public int checkLike(String sId, int product_idx) {
		System.out.println("checkLike()");
		return mapper.checkLike(sId, product_idx);
	}

	






























































// 박주닮
	public ProductVO productDetail(int product_idx) {
		return mapper.productDetail(product_idx);
	}


	public ImageVO selectDetailImage(int product_idx) {
		return mapper.selectDetailImage(product_idx);
	}

	

	

	




















































































}
