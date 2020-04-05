import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import kr.co.arukei.entity.User_info;


public class App {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
		EntityManager em = emf.createEntityManager();

		// select * from user_info where no = 1;
		User_info result = em.find(User_info.class, 1);
		System.out.println(result);
//		List<User_info> results = em.createQuery("select u from User_info u",User_info.class).getResultList();
//		System.out.println(results);
		
		
		
	}

}
