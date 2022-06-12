package kr.co.softcampus.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.softcampus.model.User;

@Repository
public class UserRepository {

	public static List<User> users;
	
	static {
		users=new ArrayList<>();
		
		users.add(new User(100, "kim"));
		users.add(new User(200, "lee"));
		users.add(new User(300, "choi"));
		users.add(new User(400, "park"));
		users.add(new User(500, "kwon"));
		users.add(new User(600, "hwang"));
	}
	
	public List<User> getAllUsers()
	{
		System.out.println("사용자 전체보기");
		return users;
	}
	
	public User getUserByUserid(Integer userid)
	{
		System.out.println("사용자 상세보기");
		return users.stream()
				.filter(user -> user.getUserid()==userid)
				.findAny()
				.orElse(new User(0,"no user"));
	}	
	
	public User insertUser(User user)
	{
		System.out.println("사용자 등록");
		
		users.add(user);
		return user;
	
	}
	
	public void updateUser(User user) {
		System.out.println("사용자 수정");
		
		users.stream()
		.filter(item -> item.getUserid()==user.getUserid())
		.findAny()
		.orElse(new User(0, "no uswer"))
		.setUsername(user.getUsername());
	}
	
	public void deleteUser(Integer userid)
	{
		System.out.println("사용자 삭제");
		
		users.removeIf(user -> user.getUserid()==userid);
		
	}
}
