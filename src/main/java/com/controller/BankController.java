package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
@RequestMapping("/Account")

public class BankController {
	
	 
	
	
		@RequestMapping(value = "/{Account}", method = RequestMethod.GET)
		public void deposit(@PathVariable String name, ModelMap model) {

			model.addMethod("Deposit", deposit);
			return "amount";
		
		@RequestMapping(value = "/{Account}", method = RequestMethod.GET)
			public void withdraw(@PathVariable String name, ModelMap model) {

				model.addMethod("Withdraw", withdraw);
				return "amount";
		
		@RequestMapping(value = "/{Account}", method = RequestMethod.GET)
				public double interestEarned(@PathVariable String name, ModelMap model) {

					model.addAttribute("Interested Earned", interestEarned);
					return "amount";
					
		
				

		}

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public double sumTransactions(ModelMap model) {

			model.addAttribute("Transactions", "true");
			return "amount";

		}

	}
	    
	 


