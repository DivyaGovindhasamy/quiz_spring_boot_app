package org.jsp.question.serviceimpl;

import org.jsp.question.dao.UserDao;
import org.jsp.question.entity.User;
import org.jsp.question.responsestructure.ResponseStructure;
import org.jsp.question.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userdao;
	@Override
	public ResponseEntity saveUser(User user) {
		 user =	userdao.saveUser(user); 
		return  ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder()
				.httpStatus(HttpStatus.OK.value())
				.message(" Questions saved  Successfully").body(user).build());
	}

}
