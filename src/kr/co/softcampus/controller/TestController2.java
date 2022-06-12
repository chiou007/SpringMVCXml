package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;

@Controller
public class TestController2 {
	
	@Autowired
	SqlSessionTemplate SqlSessionTemplate;
	
	@GetMapping("/input_data")
	public String input_data() {
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(DataBean dataBean) {
		
		SqlSessionTemplate.insert("test_db.insert_data", dataBean);
		
		return "input_pro";
	}
	
	@GetMapping("/read_data")
	public String read_data(Model model) {
		
		List<DataBean> list = SqlSessionTemplate.selectList("test_db.select_data");
		model.addAttribute("list", list);
		
		return "read_data";
		
	} 
	
	@GetMapping("/test3")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
		System.out.printf("data33 : %s\n", data33);
		
		for(String str : data3) {
			System.out.printf("str : %s\n", str);
		}
		
		return "result";
	}
	
	@GetMapping("/test4")
	// public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {
	public String test2(DataBean3 bean1, DataBean2 bean2) {
		
		System.out.printf("data1 : %d\n", bean1.getData1());
		System.out.printf("data2 : %d\n", bean1.getData2());
		
		for(int number1 : bean1.getData3()) {
			System.out.printf("data3 : %d\n", number1);
		}
		
		System.out.printf("bean2.data1 : %d\n", bean2.getData1());
		System.out.printf("bean2.data2 : %d\n", bean2.getData2());
		return "result";
	}
}






