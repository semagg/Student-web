package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


}

	@RestController
	public class Controller {	
		@RequestMapping(value="/student")
		public Student student() {
		Student student = new Student("sema","güngör",22,12,12);
			return student;
		}
		}
	}
