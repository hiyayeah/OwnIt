package com.teamone.ownit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping(value = "/member_findEmail")
	public String findEmail() {
		return "member/member_findEmail";
	}
	
	@GetMapping(value = "/member_findPasswd")
	public String findPasswd() {
		return "member/member_findPasswd";
	}
	
	@GetMapping(value = "/member_joinForm")
	public String joinForm() {
		return "member/member_joinForm";
	}
	
	@GetMapping(value = "/member_login")
	public String login() {
		return "member/member_login";
	}
	
}
