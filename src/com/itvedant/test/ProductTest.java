package com.itvedant.test;

import java.util.Collection;
import java.util.Scanner;

import com.itvedant.models.Product;
import com.itvedant.services.ProductService;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService service=new ProductService();
		int i,q;
		String n ,c;
		double p;
		while(true) {
			System.out.println("\n==============================================");
			System.out.println("       *** Product Inventory Management ***");
			System.out.println("==============================================");
			System.out.println("1. Add New Product");
			System.out.println("2. List All Products");
			System.out.println("3. View Product by ID");
			System.out.println("4. Update Product by ID");
			System.out.println("5. Delete Product by ID");
			System.out.println("6. Exit");
			System.out.println("==============================================");
			System.out.print("Enter your choice (1-6): ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: 
				System.out.println("\n--- Add New Product ---");
				System.out.print("Enter product id,name,category,price,quantity : ");
				i=sc.nextInt();
				n =sc.next();
				c=sc.next();
				p=sc.nextDouble();
				q=sc.nextInt();
				Product prod=new Product(i,n,c,p,q);
				service.addProduct(prod);
				System.out.println("\n✅ Product added successfully!");
				break;
			case 2://list
				System.out.println("\n--- List of All Products ---");

				Collection<Product> allProducts =service.getAllProducts();
				//				allProducts.forEach(product -> System.out.println(product));
				if (allProducts.isEmpty()) {
					System.out.println("⚠️ No products found in the inventory.");
				} else {
					allProducts.forEach(product -> System.out.println(product));
				}
				break;
			case 3://get byId
				System.out.println("\n--- View Product by ID ---");
				System.out.print("Enter product ID to view details: ");

				i = sc.nextInt();
				try {
					Product product=service.getProductById(i);
					System.out.println("\n✅ Product Details:");

					System.out.println(product);
				}catch(Exception e){
					System.err.println("⚠️ Product not found with ID: " + i);

				}
				break;
			case 4://update
				System.out.println("\n--- Update Product by ID ---");
				System.out.print("Enter product ID to update details: ");

				i = sc.nextInt();
				try {
					Product product=service.getProductById(i);
					System.out.println("\n✅ Current Product Details:"+product);
					System.out.println("\nEnter new details:");

					System.out.print("Enter new name, category, price, and quantity: ");
					n=sc.next();
					c=sc.next();
					p=sc.nextDouble();
					q=sc.nextInt();
					product.setProductName(n);
					product.setCategory(c);
					product.setPrice(p);
					product.setQuantity(q);
					Product updatedProduct = service.updateProductById(product);
					System.out.println("\n✅ Product updated successfully!");
					System.out.println("Updated Details: " + updatedProduct);


				} catch (Exception e) {
					System.err.println("⚠️ Product not found with ID: " + i);

				}
				break;



			case 5://delete
				System.out.println("\n--- Delete Product by ID ---");
				System.out.print("Enter product ID to delete: ");
				i= sc.nextInt();
				try {
					service.deleteProductById(i);
					  System.out.println("\n✅ Product deleted successfully!");
	                  
					
				}catch(Exception e) {
					   System.err.println("⚠️ Product not found with ID: " + i);
		                
				}
				break;

			case 6: // Exit
				  System.out.println("\nThank you for using the Product Inventory Management System!");
                  System.out.println("Goodbye!");
                  sc.close();
                  System.exit(0);

			default:
				  System.err.println("⚠️ Invalid choice. Please select a valid option (1-6).\n");
			        
			}

		}
	}
}
