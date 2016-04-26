package com.krisnela.test.heroku;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerHiman {
	@RequestMapping(value = "/Users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> getAllUsers() {
//		Query query = new Query();
//		query.limit(30);
//		query.skip(0);
		// query.addCriteria(Criteria.where("name").is("Himan Dev"));
		List<User> userList=new ArrayList<>();
		User u1=new User();
		u1.setName("Himan");
		User u2=new User();
		u2.setName("Dev");
		User u3=new User();
		u3.setName("Chandan");
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		return userList;
	}
}
