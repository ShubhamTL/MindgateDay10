package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {
	
	public void addProduct( Product porduct);
	public List<Product> getProduct();
}
