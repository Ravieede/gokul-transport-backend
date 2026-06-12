package com.codinghub.User1Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.User1ServiceInterface.User1ServiceInterface;
import com.codinghub.UserEntity.User1;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin(origins= {"http://localhost:3000","https://gokul-transport-admin.vercel.app"})
public class User1Controller 
{
	@Autowired
	 private User1ServiceInterface service;
	
	@PostMapping("/add")
	public String save(@RequestBody User1 user1)
	{
		return service.save(user1);
	}
	@PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User1 loginDetails) {
      
        User1 user = service.findByEmail(loginDetails.getEmail());

       
        if (user != null && user.getPassword().equals(loginDetails.getPassword())) {
           
            return ResponseEntity.ok("Login Successful!");
        } else {
         
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
	
	@GetMapping("/all")
	public List<User1> findAll()
	{
		return service.findAll();
	}
	@GetMapping("/id/{id}")
	public String findById(@PathVariable long id)
	{
		return service.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable long id)
	{
		return service.deleteById(id);
	}
	@PutMapping("/update/{id}")
    public String update(@PathVariable long id, @RequestBody User1 user1) 
    {
        return service.update(id, user1);
    }
	

}
