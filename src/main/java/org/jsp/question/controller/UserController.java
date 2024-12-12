package org.jsp.question.controller;

import java.util.List;

import org.jsp.question.entity.User;
import org.jsp.question.responsestructure.ResponseStructure;
import org.jsp.question.service.QuestionService;
import org.jsp.question.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
}
	