
public class ProductManager implements IProduct {
	
	
	public ProductManager() {
		
	}

	@Override
	public void add(Product product, Campaign campaign) {
		System.out.println("Ürün eklendi: " + product.getName() + " Ürünün Fiyatý: " + product.getUnitPrice());		
		if (campaign.getDiscount() == 0) {
			System.out.println("Herhangi bir kampanya tanýmlanmamýþtýr.");
		}else {
			System.out.println("Kampanya Adý: " + campaign.getName() + " Kampanya sonrasý ürünün fiyatý: " + campaign.finalPrice());
		}
	}
	
	public void delete(Product product) {
		System.out.println("Ürün silindi: " + product.getName());
	}


	@Override
	public void update(Product product, Campaign campaign) {
		System.out.println("Ürün güncellendi: " + product.getName());
	}
}
