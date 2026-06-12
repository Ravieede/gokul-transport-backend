package com.codinghub.User1RepositoryInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codinghub.UserEntity.User1;

public interface User1Repo  extends JpaRepository<User1,Long>
{


	User1 findByEmail(String email);


}
