package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		//동일명일때는 Map 에서는 하나의 값만 가져온다,  파라미터와 동일명의 변수이름으로 List 를 정의해야 한다.
		//data3=100&data3=200
		//숫자형으로 넘어올 때 <String, Integer>으로 정의하면 에러난다. 자동으로 형변환을 하지 못하므로 String을 사용 후 함수내부에서 변환해야 함
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
	
	@GetMapping("/test2")
	// public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {
	//	ModelAttribute 어노테이션을 사용하면 파라미터를 객체로 주입받을 수 있습니다.
	//	전달되는 파라미터의 이름과 동일한 프로퍼티에 자동으로 주입됩니다.
	//	이 어노테이션은 생략이 가능합니다.
	//	이러한 객체를 커맨드 객체(Command Object)라고 부릅니다.
 
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













