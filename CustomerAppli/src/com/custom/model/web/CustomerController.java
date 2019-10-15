package com.custom.model.web;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.custom.model.persistance.Customer;
import com.custom.model.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "all_customers", method = RequestMethod.GET)

	public String getcustomers(ModelMap map) {
		map.addAttribute("customers", customerService.getAllCustomers());
		return "all_customers";
	}

	@RequestMapping(value = "addcustomer", method = RequestMethod.GET)
	public String addCustomerGet(ModelMap map) {
		map.addAttribute("customer", new Customer());
		return "addcustomer";
	}

	@RequestMapping(value = "addcustomer", method = RequestMethod.POST)
	public String addCustomerUpdatePost(@Valid @ModelAttribute(value="customer")Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "addcustomer";
		} else {
			if (customer.getId() == 0)
				customerService.addCustomer(customer);

			else

				customerService.updateCustomer(customer);

			return "redirect:all_customers";// PRG design pattern
			
		}
	}

	
	@RequestMapping(value = "delete", method = RequestMethod.GET)

	public String deleteCustomer(HttpServletRequest req) {
		int customerId = Integer.parseInt(req.getParameter("id"));
		customerService.removeCustomer(customerId);
		return "redirect:all_customers";// PRG design pattern
	}
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updateCustomerGet(HttpServletRequest req, ModelMap map) {
		int customerId = Integer.parseInt(req.getParameter("id"));
		Customer customerToBeUpdated = customerService.getCustomerById(customerId);
		System.out.println(customerToBeUpdated);
		map.addAttribute("customer", customerToBeUpdated);
		return "addcustomer";// PRG design pattern
	}
}


