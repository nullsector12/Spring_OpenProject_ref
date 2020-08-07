package w1f1.ksy.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import w1f1.ksy.test.model.Member;
import w1f1.ksy.test.model.MemberEditRequest;
import w1f1.ksy.test.model.MemberRegRequest;
import w1f1.ksy.test.service.MemberDeleteService;
import w1f1.ksy.test.service.MemberEditService;
import w1f1.ksy.test.service.MemberListService;
import w1f1.ksy.test.service.MemberRegService;
import w1f1.ksy.test.service.MemberViewService;

@RestController
@RequestMapping("/members") // /members?pageNum=1&cnt=10 ...
public class MemberRestController {
	
	@Autowired
	MemberListService listService;
	
	@Autowired
	MemberRegService regService;
	
	@Autowired
	MemberViewService viewService;
	
	@Autowired
	MemberEditService editService;
	
	@Autowired
	MemberDeleteService deleteService;
	
	// 회원의 리스트 출력 => GET방식으로 Json 응답
	@GetMapping // GET | /members
	public List<Member> getMemberList() {
		
		return listService.getMemberList() ;
	}
	
//	public String test() {
//		return "Request GET";
//	}
	
	
	
	// 회원 가입 => POST 방식
	@PostMapping // POST | /members 
	public int reg (
			MemberRegRequest regRequest,
			HttpServletRequest request
			) {
		
		return regService.regMember(regRequest, request);
	}

	// 한명의 회원 정보 출력
	@GetMapping("/{idx}") // GET | /members/{idx}
	public Member getMemberInfo (
			@PathVariable("idx") int idx
			) {
		
		return viewService.getMember(idx);
		
	}
	
	// 한명의 회원 정보 수정
	//@PutMapping("/{idx}") // PUT | /members/{idx} put방식은 파일업로드가 안됨
	@PostMapping("/{idx}")
	public int edit(
			@PathVariable("idx") int idx,
			MemberEditRequest editRequest,
			HttpServletRequest request
			) {
		
		editRequest.setIdx(idx);
		
		return editService.editMember(editRequest, request);
	}
	
	// 회원 탈퇴 or 삭제
	@DeleteMapping("/{idx}") // DELETE | /members/{idx}
	public int delete (
			@PathVariable("idx") int idx
			) {
		
		return deleteService.deleteMember(idx);
	}
	
}
