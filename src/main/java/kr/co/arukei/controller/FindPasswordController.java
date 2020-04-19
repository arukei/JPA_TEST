package kr.co.arukei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.arukei.service.FindPasswordService;

@Controller
public class FindPasswordController {
	@Autowired
	FindPasswordService service;
	
	@RequestMapping("/movefindpassword")
	public String moveFindPassword() {
		
		return "findpassword";
	}
	
	@RequestMapping("/findpassword")
	public ModelAndView findPassword(String id, String email1, String email2) throws Exception {
		ModelAndView mv = new ModelAndView();
		String password = service.FindPassword(id, email1, email2);
		mv.addObject("password", password);
		mv.setViewName("findpasswordResult");
		
		
		
		return mv;
	}

}
