package com.codinghub.User1ServiceInterface;

import java.util.List;

import com.codinghub.UserEntity.User1;

public interface User1ServiceInterface 
{


	String save(User1 user1);

	List<User1> findAll();
	
	String findById(long id);

	String deleteById(long id);

	String update(long id, User1 user1);

	 public User1 findByEmail(String email);

}
