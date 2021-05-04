
public class ProductManager implements IProduct {
	
	
	public ProductManager() {
		
	}

	@Override
	public void add(Product product, Campaign campaign) {
		System.out.println("�r�n eklendi: " + product.getName() + " �r�n�n Fiyat�: " + product.getUnitPrice());		
		if (campaign.getDiscount() == 0) {
			System.out.println("Herhangi bir kampanya tan�mlanmam��t�r.");
		}else {
			System.out.println("Kampanya Ad�: " + campaign.getName() + " Kampanya sonras� �r�n�n fiyat�: " + campaign.finalPrice());
		}
	}
	
	public void delete(Product product) {
		System.out.println("�r�n silindi: " + product.getName());
	}


	@Override
	public void update(Product product, Campaign campaign) {
		System.out.println("�r�n g�ncellendi: " + product.getName());
	}
}
