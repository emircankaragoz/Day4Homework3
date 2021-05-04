
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.setFirstName("Emircan");
		
		
		Logger[] loggers = {new DatabaseLogger()};
		
		
		PlayerManager playerManager = new PlayerManager(loggers,new PlayerCheckManager());
		playerManager.register(player);
		
		
		
		
	
		
		Product game1 = new Product();
		game1.setName("Numerary");
		game1.setUnitPrice(100);
		
		Campaign campaign1 = new Campaign(game1);
		campaign1.setName("Kampanya 1");
		campaign1.setDiscount(10);
		
		ProductManager productManager = new ProductManager();
		productManager.add(game1,campaign1);

		
	}
}


