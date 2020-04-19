package kr.co.arukei.dao;


public interface FindPasswordDao {
	
	public String findPassword(String id, String email)throws Exception;

}
