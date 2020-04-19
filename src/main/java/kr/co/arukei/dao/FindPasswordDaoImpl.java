package kr.co.arukei.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.arukei.entity.User_Info;

@Repository
public class FindPasswordDaoImpl implements FindPasswordDao {
	
	@Autowired
	Connection conn;

	@Override
	public String findPassword(String id, String email) throws Exception {
		
		EntityManager em = conn.getConnection();
		// LoginDao에서 설정한 NamedQuery 안의 name을 호출, 그리고 파라미터값을 setParameter로 입력
		List<User_Info> result = em.createNamedQuery("User_Info.findUserPassword", User_Info.class)
				.setParameter("email", email)
				.setParameter("id", id)
				// 실행된 결과를 받아옴 
				.getResultList();

		User_Info userinfo = result.get(0);
		
		String password =userinfo.getPassword();

		
		return password;
	}

}
