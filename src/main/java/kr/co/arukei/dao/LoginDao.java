package kr.co.arukei.dao;

public interface LoginDao {
	public int findUser(String id, String password)throws Exception;

}
