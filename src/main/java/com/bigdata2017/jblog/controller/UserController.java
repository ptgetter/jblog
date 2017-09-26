package com.bigdata2017.jblog.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata2017.jblog.service.MemberService;
import com.bigdata2017.jblog.vo.MemberVo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Log LOG = LogFactory.getLog( UserController.class );

	@Autowired
	private MemberService memberSerivce;
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(@ModelAttribute MemberVo vo) {
		boolean result = memberSerivce.join(vo);
		LOG.debug(result);
		return "redirect:/user/joinsuccess";
	}
	
//	@RequestMapping(value="/join",method=RequestMethod.POST)
//	public String join(
//			@RequestParam(value="name", required=true, defaultValue="") String name,
//			@RequestParam(value="id", required=true, defaultValue="") String id,
//			@RequestParam(value="password", required=true, defaultValue="") String password) {
//		return "user/joinSuccess";
//	}
	
	@RequestMapping("joinsuccess")
	public String joinSuccess() {
		return "user/joinsuccess";
	}

}
