package kr.co.softcampus.model;

public class User {
	int userid;
	String username;

	public User(int i, String string) {
		this.userid=i;
		this.username=string;
	}

	public Integer getUserid() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}

}

