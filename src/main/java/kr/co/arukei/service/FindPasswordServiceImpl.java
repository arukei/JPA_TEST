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

		return password;
	}

}
