package org.jsp.question.service;

import org.jsp.question.entity.User;
import org.jsp.question.responsestructure.ResponseStructure;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<ResponseStructure<User>> saveUser(User user);

}
