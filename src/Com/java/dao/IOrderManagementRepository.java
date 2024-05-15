package Com.java.dao;

import java.util.List;

import Com.java.model.order;
import Com.java.model.product;
import Com.java.model.user;

public interface IOrderManagementRepository 
{
	List<product> getOrderByUser(user u) throws userNotFoundException;
	void createOrder(order o);
	void cancelOrder(int orderId,int userId) throws orderNotFoundException;
	void createProduct(product p);
	void createUser(user u);
	void getAllProducts();
	
	
}
