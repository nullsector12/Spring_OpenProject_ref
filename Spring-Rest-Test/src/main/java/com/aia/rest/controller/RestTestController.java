package com.aia.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.aia.rest.member.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/rest/v1")
public class RestTestController {
	
	
	@RequestMapping("/memberlist")
	public Map<Integer, Member> getMap() {
		
		Map<Integer, Member> map = new HashMap<Integer, Member>();
		
		map.put(1 ,new Member(1, "cool1", "coooool", "coolname", new Date()));
		map.put(2, new Member(2, "cool2", "coooool", "coolname", new Date()));
		map.put(3, new Member(3, "cool3", "coooool", "coolname", new Date()));
		map.put(4, new Member(4, "cool4", "coooool", "coolname", new Date()));
		
		return map;
	}
	
	
	
//	@RequestMapping("/memberlist")
//	public List<Member> getList() {
//		
//		List<Member> list = new ArrayList<Member>();
//		
//		list.add(new Member(1, "cool1", "coooool", "coolname", new Date()));
//		list.add(new Member(2, "cool2", "coooool", "coolname", new Date()));
//		list.add(new Member(3, "cool3", "coooool", "coolname", new Date()));
//		list.add(new Member(4, "cool4", "coooool", "coolname", new Date()));
//		
//		return list;
//	}
	
	
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
