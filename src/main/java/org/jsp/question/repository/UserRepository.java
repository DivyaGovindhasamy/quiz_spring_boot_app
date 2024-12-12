package org.jsp.question.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface UserRepository extends JpaRepository<User, Integer>{

	org.jsp.question.entity.User save(org.jsp.question.entity.User user);




}
