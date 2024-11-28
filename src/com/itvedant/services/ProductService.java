package com.itvedant.services;

import java.util.Collection;
import java.util.LinkedHashMap;
import com.itvedant.models.Product;
import com.itvedant.repositories.ProductRepository;

public class ProductService implements ProductRepository {
	private LinkedHashMap<Integer, Product> products=new LinkedHashMap<Integer, Product>();
	
	//add a new product
	@Override
	public Product addProduct(Product product) {
		products.put(product.getProductId(),product);
		return products.get(product.getProductId());
	}

	//List all products
	@Override
	public Collection<Product> getAllProducts() {
		
		return products.values();
	}

	//get product by id
	@Override
	public Product getProductById(int productId) throws Exception {
		Product product=products.get(productId);
		if(product!=null) {
			return product;
		}
		else {
			throw new Exception("Invalid product Id");
		}
	}

	
	@Override
	public Product updateProductById(Product product) {
		products.put(product.getProductId(), product);
		return products.get(product.getProductId());
		
	}
	

	
	//delete product by id
		@Override
		public void deleteProductById(int productId) throws Exception {
			Product product=getProductById(productId);
			products.remove(productId);
		}

		
	
	
}
