package kr.co.arukei.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.arukei.dao.LoginDao;

@Service 
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao logindao;

	@Override
	public int checkLogin(String id, String password) throws Exception {
		
		int count =logindao.findUser(id,password);
		
		return count;
	}

}
