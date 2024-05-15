package Com.java.model;

public class product extends Clothing 
{
	
	int productId;
	int userId;
	String productName;
	String description;
	double price;
	int quantityInStock;
	String type;
	
	public product()
	{
		
	}
	
	public product(int productId,int userId, String productName, String description, double price, int quantityInStock,
			String type,String size,String color) 
	{
		super(size,color);
		this.productId = productId;
		this.userId=userId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantityInStock = quantityInStock;
		this.type = type;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
