package com.itvedant.repositories;

import java.util.Collection;
import com.itvedant.models.Product;

public interface ProductRepository {
	public Product addProduct(Product product);
	public Collection<Product> getAllProducts();
	public Product getProductById(int productId)throws Exception;
	public Product updateProductById(Product product)throws Exception;
	public void deleteProductById(int productId)throws Exception;
	
}
