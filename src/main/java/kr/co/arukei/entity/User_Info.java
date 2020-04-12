package kr.co.arukei.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

// name 으로 검색할 테이블명을 지정가능
@Table(name = "user_info")

// name으로 원하는 SQL문을 호출 가능
// SOQL처럼 변수값? 파라미터값의 앞에는 :붙임 
@NamedQuery(
		name="User_Info.findBypassword",
		query = "SELECT u FROM User_Info u WHERE u.password = :password and u.id=:id")
public class User_Info {

	private String id;
	@Id
	private int no;
	private String password;
	private String auth1;
	private String status;
	private String reg_date;
	private String email;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the auth1
	 */
	public String getAuth1() {
		return auth1;
	}

	/**
	 * @param auth1 the auth1 to set
	 */
	public void setAuth1(String auth1) {
		this.auth1 = auth1;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}

	/**
	 * @param reg_date the reg_date to set
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User_info [id=" + id + ", no=" + no + ", password=" + password + ", auth1=" + auth1 + ", status="
				+ status + ", reg_date=" + reg_date + ", email=" + email + "]";
	}

}
