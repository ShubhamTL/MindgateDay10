package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;
@Repository
public class ProductRepositoryIMP1 implements ProductRepository {

	private static List<Product> products= new ArrayList<Product>();
	@Override
	public void addProduct(Product porduct) {

		System.out.println("in reposuitrory");
		products.add(porduct);
	}

	@Override
	public List<Product> getProduct() {
		
		return products;
	}

}
