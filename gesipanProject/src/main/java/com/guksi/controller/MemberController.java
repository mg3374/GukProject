package com.guksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guksi.dto.MemberDto;
import com.guksi.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@RequestMapping(value="join")
	public String MemberJoin(@RequestParam String id,Model model) {
		MemberDto member = service.idSelect(id);
		model.addAttribute("member",member);
		return "join";
	}
}
