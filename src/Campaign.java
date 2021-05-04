
public class Campaign {
	private int id;
	private String name;
	private double discount;
	private String detail;

	
	Product product;
	
	
	public Campaign(Product product) {
		this.product = product;
	}
	
	public Campaign(int id,String name, double discount, String detail) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.detail = detail;

	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double finalPrice() {
		return  product.getUnitPrice() - (product.getUnitPrice() * this.discount / 100) ;
	}

	
}	
