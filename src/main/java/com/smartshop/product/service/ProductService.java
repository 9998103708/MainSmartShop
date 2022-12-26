package com.smartshop.product.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.smartshop.product.entity.Product;

@Service
public interface ProductService {
	public Product addProduct(Product product);
	//public Product UpdatePrdoductbyName(String productName);
	public List<Product> saveProducts(List<Product> products);
	public List<Product> GetAllProducts();	
	public Product findByProductName(String productName);
	public void DeleteProductById(int productId);
	
	


}
