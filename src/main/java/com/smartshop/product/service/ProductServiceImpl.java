package com.smartshop.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;
import com.smartshop.product.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	public ProductRepository proRepository;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return proRepository.save(product);
	}
	@Override
	public List<Product> saveProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return proRepository.saveAll(products);
	}
	@Override
	public List<Product> GetAllProducts() {
		// TODO Auto-generated method stub
		return proRepository.findAll();
	}

//	@Override
//	public Product UpdatePrdoductbyName(String productName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Product findByProductName(String productName) {
		// TODO Auto-generated method stub
		return proRepository.findByProductName(productName);
	}
	@Override
	public void DeleteProductById(int productId) {
		// TODO Auto-generated method stub
		proRepository.deleteById(productId);
	}

	


	

	

}
