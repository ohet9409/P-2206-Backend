package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public static String index(String[] args) {
	
		System.out.println("TEST »£√‚");
		
		return "index";

	}

}
