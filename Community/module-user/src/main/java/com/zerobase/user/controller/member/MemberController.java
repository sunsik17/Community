package com.zerobase.user.controller.member;

import com.zerobase.common.member.Member;
import com.zerobase.user.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

	private final MemberService memberService;
	@GetMapping("/{id}")
	public String hello(@PathVariable Long id) {

		Member m = new Member(1L, "ss", "010", "@");

		return memberService.hello(id);
	}
}
