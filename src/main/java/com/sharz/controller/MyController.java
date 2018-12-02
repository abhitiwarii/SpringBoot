package com.sharz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sharz.domain.User;
import com.sharz.service.MyService;

@RestController
public class MyController {
	
		@Autowired
		MyService myService;
	
		@RequestMapping("/")
		public String defaultMessage() {
			return "Default response";
		}

		@RequestMapping("/user")
		public Map<String, String> getUser(@RequestParam Long id) throws Exception {
			Map<String, String> responseMap = new HashMap<String, String>();
			User user = myService.getUser(id);
			responseMap.put("success", "Y");
			responseMap.put("data", user.toString());
			return responseMap;
		}
		
		@RequestMapping(value = "/user", method= RequestMethod.POST)
		public Map<String, String> saveUser(@RequestBody User user) throws Exception {
			myService.saveUser(user);
			return null;
		}

		@RequestMapping(value = "/user", method= RequestMethod.PUT)
		public Map<String, String> updateUser() {
			return null;
		}

		@RequestMapping(value = "/user", method= RequestMethod.DELETE)
		public Map<String, String> deleteUser() {
			return null;
		}

}
