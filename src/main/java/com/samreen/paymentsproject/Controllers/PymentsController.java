package com.samreen.paymentsproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PymentsController {
	
	@GetMapping("/transaction")
	public String getTransactionDetails()
	{
		return "Transaction successful";
	}
	
	@GetMapping("/helloWorld")
	public String getMessage()
	{
		return "Hello World";
	}

}
