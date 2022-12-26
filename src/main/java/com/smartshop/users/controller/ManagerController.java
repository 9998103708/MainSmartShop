package com.smartshop.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.users.entity.Manager;
import com.smartshop.users.entity.Product;
import com.smartshop.users.service.ManagerService;



@RestController
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService manageService;
	
	
	@PostMapping("/loginManager")
//	@CrossOrigin(origins = "http://localhost:4200")
	public Manager loginUser(@RequestBody Manager manager) throws Exception {
		String tempUserName = manager.getManagerUserName();
		String tempPassword = manager.getManagerPassword();
		Manager managerObj = null;
		if(tempUserName != null && tempPassword!=null) {
			managerObj = manageService.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(managerObj == null) {
			throw new Exception("Invalid UserName Or Password!");
		}
		return managerObj;
	}
	
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return manageService.addProduct(product);
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		return manageService.getAllproducts();
	}
	
	@GetMapping("/getByName/{pName}")
	public Product findBypName(@PathVariable("pName") String pName) {
		return manageService.findBypName(pName);
	}
}
