package kr.co.arukei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.arukei.service.RegUserService;


@Controller
public class RegUserController {
	@Autowired
	RegUserService service;
	
	private static final Logger logger = LoggerFactory.getLogger(RegUserController.class);
	
	@RequestMapping("/movereguser")
	public String movereguser() {
		logger.info("회원가입 화면 이동처리");
		return "reguser";
	}
	
	@RequestMapping("/reguser")
	public ModelAndView reguser(String id, String password, String email1, String email2) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		int result = service.insertUserInfo(id, password, email1, email2);
		if(result==0) {
			mv.setViewName("home");
			mv.addObject("msg", "정상적으로 가입완료되었습니다.");
		}else {
			mv.setViewName("redirect:/movereguser");
		}
		
		return mv;
	}

}
