package com.guksi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping(value="base")
	public String base() {
		return "base";
	}
}
