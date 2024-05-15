package Com.java.model;

public class Electronics extends product
{
	
	String brand;
	int warrantyPeriod;
	
	public Electronics()
	{
		
	}
	
	public Electronics(String brand, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
}
