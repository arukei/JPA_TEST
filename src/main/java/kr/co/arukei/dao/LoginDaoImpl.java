package kr.co.arukei.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.arukei.entity.User_Info;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	Connection conn;

	@Override
	public int findUser(String id, String password) throws Exception {

		EntityManager em = conn.getConnection();
		// LoginDao에서 설정한 NamedQuery 안의 name을 호출, 그리고 파라미터값을 setParameter로 입력
		List<User_Info> result = em.createNamedQuery("User_Info.findBypassword", User_Info.class)
				.setParameter("password", password)
				.setParameter("id", id)
				// 실행된 결과를 받아옴 
				.getResultList();

		int size = result.size();

		return size;
	}

}
