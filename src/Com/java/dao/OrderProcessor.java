package Com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Com.java.Connect.DBUtil;
import Com.java.model.order;
import Com.java.model.product;
import Com.java.model.user;

public class OrderProcessor implements IOrderManagementRepository
{
	
	private Connection con;
	PreparedStatement stat;
	
	public OrderProcessor()
	{
		con=DBUtil.getConnect();
	}

	@Override
	public void createOrder(order o)
	{
		try 
		{
			stat=con.prepareStatement("insert into orders (orderId,userId,productId) values (?,?,?)");
			stat.setInt(1,o.getOrderId());
			stat.setInt(2, o.getUserId());
			stat.setInt(3, o.getProductId());
			stat.executeUpdate();
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public void createProduct(product p) 
	{
		try 
		{
			stat=con.prepareStatement("insert into product (productId,userId,productName,description,price,quantityInStock,type) values (?,?,?,?,?,?,?)");
			stat.setInt(1, p.getProductId());
			stat.setInt(2,p.getUserId());
			stat.setString(3,p.getProductName());
			stat.setString(4,p.getDescription());
			stat.setDouble(5,p.getPrice());
			stat.setInt(6, p.getQuantityInStock());
			stat.setString(7,p.getType());
			stat.executeUpdate();
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void cancelOrder(int orderId, int userId) throws orderNotFoundException {
		try 
		{
			
				stat=con.prepareStatement("delete from orders where orderid=? AND userid=?");
				stat.setInt(1, orderId);
				stat.setInt(2, userId);
			    stat.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			System.out.println("The entered is Order ID not found   "+e.getMessage());
		}	
	}

	@Override
	public void createUser(user u) 
	{
		try {
			stat=con.prepareStatement("insert into user (userId,userName,password,role) values (?,?,?,?)");
			stat.setInt(1, u.getUserId());
			stat.setString(2,u.getUserName());
			stat.setString(3,u.getPassword());
			stat.setString(4,u.getRole());
			stat.executeUpdate();
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void getAllProducts() 
	{
		try 
		{
			
			stat=con.prepareStatement("select * from product");
			ResultSet r=stat.executeQuery();
			while(r.next()){
            System.out.print("Product ID: "+r.getInt(1)+" "+"Product Name is :"+r.getString(2)+" "+"Description :"+" "+r.getString(3)+" "+"Price :"+" "+r.getInt(4)+" "+"Quantity in stock :"+" "+r.getInt(5)+" "+"Type :"+" "+r.getString(6)+"User ID :"+" "+r.getInt(7));
            System.out.println();
            System.out.println();
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	  public static List<product> getOrderByUser(user u) throws userNotFoundException {
        List<product> products = new ArrayList<product>();
        try {
            if (!userExists(user.getUserId())) {
                throw new userNotFoundException("User with ID " + user.getUserId() + " not found.");
            }

	
}
