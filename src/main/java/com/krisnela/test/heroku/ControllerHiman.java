package com.krisnela.test.heroku;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerHiman {
	@Autowired
	private MongoOperations mongoOperations;

	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	public  User getAllUsers(@RequestBody User user) {
		mongoOperations.save(user);
		return user;
	}
	@RequestMapping(value="Users",method=RequestMethod.GET)
	public List<User> get(){
		return mongoOperations.findAll(User.class);
	}
}
