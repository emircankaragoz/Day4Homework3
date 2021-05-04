
public class PlayerManager {
	
	Logger[] loggers;
	PlayerCheckManager checkManager;
	
	public PlayerManager(Logger[] loggers, PlayerCheckManager checkManager) {
		this.loggers = loggers;
		this.checkManager = checkManager;
	}
	
	public void register(Player player) {
		
		if(checkManager.checkIfRealPerson(player)) {
			System.out.println("Kimlik Do�ruland�.");
			System.out.println("Oyuncu kaydedildi: " + player.getFirstName());
			Utils.runLoggers(loggers, player.getFirstName());
		}else {
			System.out.println("Ge�erli De�il.");
		}
		
		
	}
	
	public void delete(Player player) {
		System.out.println("Oyuncu silindi: " + player.getFirstName());
		
		Utils.runLoggers(loggers, player.getFirstName());
	}
	
	public void update(Player player) {
		System.out.println("Oyuncu g�ncellendi: " + player.getFirstName());
		
		Utils.runLoggers(loggers, player.getFirstName());
	}
}
