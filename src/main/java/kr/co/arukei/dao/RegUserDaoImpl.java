package kr.co.arukei.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.arukei.entity.User_Info;

@Repository
public class RegUserDaoImpl implements RegUserDao {

	@Autowired
	Connection conn;
	
	@Override
	public int insertUserInfo(User_Info userinfo) throws Exception {
		
		EntityManager em = conn.getConnection();
		
		// 트랜잭션 open
		em.getTransaction().begin();
		
		em.persist(userinfo);
		
		// 트랜잭션 close 직전 커밋
		em.getTransaction().commit();

		return 0;
	}

}
