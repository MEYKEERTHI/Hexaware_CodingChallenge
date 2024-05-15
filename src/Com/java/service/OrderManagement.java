package Com.java.service;

import java.util.List;
import java.util.Scanner;

import Com.java.dao.OrderProcessor;
import Com.java.dao.orderNotFoundException;
import Com.java.dao.userNotFoundException;
import Com.java.model.order;
import Com.java.model.product;
import Com.java.model.user;


public class OrderManagement {
	
	static Scanner sc;
	OrderProcessor o_dao;
	
	public OrderManagement()
	{
		sc=new Scanner(System.in);
		o_dao=new OrderProcessor();
	}
	public static void getOrderbyUser() {
        System.out.println("Get Order by User");
        System.out.print("Enter user ID: ");
        int userId = sc.nextInt();

        try {
            List<product> products = OrderProcessor.getOrderByUser(new user(userId, "", "", ""));
            System.out.println("Products Ordered by User " + userId + ":");
            for (product product : products) {
                System.out.println(product);
            }
        } catch (userNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
	public void createOrder()
	{
		order o=new order();
		System.out.println("Enter order id :");
		o.setOrderId(sc.nextInt());
		System.out.println("Enter user ID :");
		o.setUserId(sc.nextInt());
		System.out.println("Enter product ID :");
		o.setProductId(sc.nextInt());
		o_dao.createOrder(o);
	}
	
	public void cancelOrder()
	{
		order o=new order();
		System.out.println("Enter order id  to be calcelled :");
		int orderid=sc.nextInt();
		System.out.println("Enter user id :");
		int userid=sc.nextInt();
	    try {
			o_dao.cancelOrder(orderid, userid);
		} 
	    catch (orderNotFoundException e) {
			e.getMessage();
		}
	}
	public void creatProduct()
	{
		product p=new product();
		System.out.println("Enter product ID :");
		p.setProductId(sc.nextInt());
		System.out.println("Enter user ID :");
		p.setUserId(sc.nextInt());
		System.out.println("Enter product name :");
		sc.nextLine();
		p.setProductName(sc.nextLine());
		System.out.println("Enter product description :");
		p.setDescription(sc.nextLine());
		System.out.println("Enter price :");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter quantity in stock :");
		p.setQuantityInStock(sc.nextInt());
		System.out.println("Enter type either Clothing or Electronics :");
		sc.nextLine();
		p.setType(sc.nextLine());
		
		o_dao.createProduct(p);
	}
	
	public void createUser()
	{
		user u=new user();
		System.out.println("Enter user ID :");
		u.setUserId(sc.nextInt());
		System.out.println("Enter User name :");
		sc.nextLine();
		u.setUserName(sc.nextLine());
		System.out.println("Enter Password :");
		u.setPassword(sc.nextLine());
		System.out.println("Enter role either Admin or User :");
		u.setRole(sc.nextLine());
		o_dao.createUser(u);
	}
	
	public void getAllProducts()
	{
		o_dao.getAllProducts();
	}
	 
}
