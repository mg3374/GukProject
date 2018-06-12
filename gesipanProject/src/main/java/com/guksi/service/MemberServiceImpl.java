package com.guksi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guksi.dao.MemberDao;
import com.guksi.dto.MemberDto;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public MemberDto idSelect(String id) {
		System.out.println(id+" seletct");
		MemberDto member = dao.idSelect(id);  
		return member;
	}

}
