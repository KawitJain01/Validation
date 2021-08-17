package com.example.demo;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerNew {
	
	@Autowired Validator validator;
	
	@ResponseBody
	@PostMapping("/validate")
	public String validate( @RequestBody RequestInfo requestInfo)
	{
		System.out.println(requestInfo);
		Set<ConstraintViolation<RequestInfo>> v = validator.validate(requestInfo);
		
		if(!v.isEmpty())
		{
			throw new RuntimeException("Invalid input");
		}
		return "SUCCESS";
	}
}
