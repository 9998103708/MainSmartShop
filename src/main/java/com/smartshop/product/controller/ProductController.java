package com.smartshop.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartshop.product.entity.Product;
import com.smartshop.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService productservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return productservice.addProduct(product);
	}
	@GetMapping("/saveproduct")
	public List<Product> saveProduct(List<Product> product){
		return productservice.saveProducts(product);
	}
	@GetMapping("/getAllProduct")
	public List<Product> GetAllProducts(){
		return productservice.GetAllProducts();
	}
	@GetMapping("/getProductByName/{productName}")
	public Product findByProductName(@PathVariable("productName") String productName){
		return productservice.findByProductName(productName);
	}
	@DeleteMapping("/deleteProduct/{productId}")
	public void DeleteProductById(@PathVariable("productId")int productId) {
		productservice.DeleteProductById(productId);
	}
	
	

}
