package org.zerock.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
	@GetMapping("/health")
	public String healthCheck() {	//서버가 잘 동작하는지 check하는 기능
		return "OK";
	}
}
