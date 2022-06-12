package kr.co.softcampus.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softcampus.model.User;
import kr.co.softcampus.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
//
//	@Autowired
//	private UserService userService;
//	
//	@GetMapping("")
//	public List<User> getAllUsers()
//	{
//		return userService.getUsers();
//	}
//	
//	@GetMapping("/{userid}")
//	public User getUser(@PathVariable("userid") Integer userid)
//	{
//		return userService.getUser(userid);
//	}
//	
//	@GetMapping("/userid")
//	public User getUserByUserid(Integer userid)
//	{
//		userService.getUserById(userid);
//	}
//	
//	@PostMapping("")
//	public User registUser()
//	{
//		User user =TODO();
//		return userService.registUser(user);
//	}
//	
//	@PostMapping("")
//	public Map<String, Object> createUser(
//			@RequestParam(value="userid") Integer userid,
//			@RequestParam(value="username") String username)
//	{
//		Map<String, Object> map=new HashMap<String, Object>();
//		userService.createUser(userid, username);
//		map.put("result", "added");
//		return map;
//	}
//	
//	@PutMapping("")
//	public Map<String, Object> updateUser(
//			@RequestParam(value="userid") Integer userid,
//			@RequestParam(value="username") String username)
//	{
//		Map<String, Object> map = new LinkedHashMap<String, Object>();
//		userService.updateUser(userid, username);
//		map.put("result", "updated");
//		retunr map;
//	}
//	
//	@PutMapping("")
//	public void modifyUser(String userid)
//	{
//		User user=.user.equals(obj);
//		userService.modifyUser(userid, user);
//	}
//	
//	@DeleteMapping("/userid")
//	public void removeUser(String userid)
//	{
//		userService.removeUser(userid);
//	}
}
