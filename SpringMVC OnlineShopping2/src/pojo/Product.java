package pojo;

public class Product {
	
	 private String code;
	   private String name;
	  private double price;
	  private String description;
	public Product(String code, String name, double price, String description) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	public Product() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	  

}
