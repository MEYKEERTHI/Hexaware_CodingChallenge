import Com.java.service.OrderManagement;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
public static void main(String args[]) {
	OrderManagement obj=new OrderManagement();
	
	
	while(true)
	{
		System.out.println("1 - create user ");
		System.out.println("2 - create product ");
		System.out.println("3 - Display product ");
		System.out.println("4 - create order ");
		System.out.println("5 - Get product ordered by user");
		System.out.println("6 - cancel order ");
		System.out.println("7 - Exit");
		
		
		System.out.println("Enter your choice :");
		int ch=sc.nextInt();
		if(ch==1)
		{
			obj.createUser();
		}
		else if(ch==2)
		{
			obj.creatProduct();
		}
		else if(ch==3)
		{
			obj.getAllProducts();
		}
		else if(ch==4)
		{
			obj.createOrder();;
		}
		else if(ch==5)
		{
			obj.getorderByuser();
		}
		else if(ch==6)
		{
			obj.cancelOrder();
		}
		else if(ch==7)
		{
			break;
		}
	}
}
	
}
