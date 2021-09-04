package com.fsd.phase5.cicdimplemention;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdImplementionApplication {
	
	  @RequestMapping("/")
	  public String home() {
	    return "CiCd Implementaion with Docker.. works !!!";
	  }

	public static void main(String[] args) {
		SpringApplication.run(CicdImplementionApplication.class, args);
	}

}
