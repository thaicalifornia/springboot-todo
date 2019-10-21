package com.thaicalifornia.rest.webservice.restfulwebservices.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins="http://localhost:4200")
public class RestController {
	
	@GetMapping(path="/hello")
	public String hello() {
		return "hello world";
	}
	@GetMapping(path="/hello-bean")
	public helloBean helloBean() {
//		throw new RuntimeException("Some error happened !!");
		return new helloBean("hello world from restful backend");
	}
	//hello/path-variable/thaicalifornia
	@GetMapping(path="/hello/path-variable/{name}")
	public helloBean helloPath(@PathVariable String name) {
		return new helloBean(String.format("hello world, %s",name));
	}
}
