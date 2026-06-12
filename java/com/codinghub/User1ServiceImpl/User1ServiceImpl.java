package com.codinghub.User1ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.User1RepositoryInterface.User1Repo;
import com.codinghub.User1ServiceInterface.User1ServiceInterface;
import com.codinghub.UserEntity.User1;

@Service
public class User1ServiceImpl implements User1ServiceInterface
{
	@Autowired
	private User1Repo repo;


	

	@Override
	public String save(User1 user1) {
		// TODO Auto-generated method stub
		return repo.save(user1)+"\n User Adding Successfuly".toString();
	}




	@Override
	public List<User1> findAll()
	{
		// TODO Auto-generated method stub
		return (List<User1>)repo.findAll();
	}




	@Override
	public String findById(long id)
	{
		Optional<User1> opt=repo.findById(id);
		if(opt.isPresent())
		{
			return opt.get().toString();
		}
		else
			return "User with Id= "+id+" Does Not Exist";
	}




	@Override
	public String deleteById(long id) 
	{
		Optional<User1> opt=repo.findById(id);
		if(opt.isPresent())
		{
			User1 user=opt.get();
			repo.delete(user);
			return  "User with Id= "+id+" Deleted Successfully";
		}
		else
			return  "User with Id= "+id+" Does Not Exist";
		
	}




	@Override
	public String update(long id, User1 user1) 
	{
		Optional<User1> opt=repo.findById(id);
		if(opt.isPresent()) 
		{
			User1 old_user=opt.get();
			System.out.println("This is Old User Data \n "+old_user);
			old_user.setName(user1.getName());
			old_user.setEmail(user1.getEmail());
			old_user.setPassword(user1.getPassword());
			
			System.out.println("New User Data is \n "+old_user);
			User1 new_user=repo.save(old_user);
			return new_user+"\nUser with id = "+id+"Updated Successfully";
		
		}
		else
			return "User With Id = "+id+" Does Not Exist";

	}




	@Override
	public User1 findByEmail(String email)
	{
		return repo.findByEmail(email);
		
	}




}
