package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {

	
	public void addProduct( Product porduct);
	public List<Product> getProduct();
}
