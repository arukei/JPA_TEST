package kr.co.arukei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.arukei.dao.FindPasswordDao;
import kr.co.arukei.entity.User_Info;

@Service
public class FindPasswordServiceImpl implements FindPasswordService {
	@Autowired
	FindPasswordDao dao;

	@Override
	public String FindPassword(String id, String email1, String email2) throws Exception {

		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		String email = email1 + "@" + email2;
		userinfo.setEmail(email);
		
		
		
		String password = dao.findPassword(id, email);
		String result;
		if(!password.contains("없습니다.")) {
			// Password 첫글자와 마지막 글자 잘라내기
			String first=password.substring(0,1);
			String last=password.substring(password.length()-1,password.length());
			
			// 잘라낸 글자 사이에  문자 숫자만큼 * 추가  한자리 두자리는 가입 시점에서 가입못하는 걸로 가정
			int starNum = password.length()-2;
			String starStr="";
			for(int i=0; i<starNum; i++) {
				starStr=starStr+"*";
			}
			
			 result = first + starStr +last;
			 
		
		}else {
			result = password;
		}

		return result;
	}

}
