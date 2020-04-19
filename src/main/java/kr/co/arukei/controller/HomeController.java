package kr.co.arukei.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.arukei.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	LoginService loginservice;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("초기처리 시작");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("/logincheck")
	public ModelAndView logincheck(String id, String password) throws Exception {
		logger.info("로그인 체크 시작");
		
		ModelAndView mv = new ModelAndView();
		int count = loginservice.checkLogin(id, password);
		mv.setViewName("result");
		mv.addObject("count",count);
	
		
		return mv;
		
	}
	
}
