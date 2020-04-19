package kr.co.arukei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.arukei.dao.RegUserDao;
import kr.co.arukei.entity.User_Info;

@Service
public class RegUserServiceImpl implements RegUserService {

	@Autowired
	RegUserDao dao;
	
	@Override
	public int insertUserInfo(String id, String password, String email1, String email2) throws Exception {
		
		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		userinfo.setPassword(password);
		String email = email1+"@"+email2;
		userinfo.setEmail(email);

		// 0으로 고정된 값이 돌아옴. 수정
		int result = dao.insertUserInfo(userinfo);
		
		return result;
	}

}
