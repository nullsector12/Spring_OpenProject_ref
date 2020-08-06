package com.aia.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.aia.rest.member.Member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/rest/v1")
public class RestTestController {
	
	
	@GetMapping
	public Member getMember () {
		
		Member member =  new Member();
		member.setIdx(1);
		member.setUid("홀롤롤로");
		member.setUpw("홀롤로");
		member.setUname("호로로롤롤");
		
		return member;
	}
	
	
	public String testString () {
		
		return "ㅎㅇ";
	}

}