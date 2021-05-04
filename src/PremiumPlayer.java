
public class PremiumPlayer extends Player{
	
	private int goldenToken;
	
	public PremiumPlayer() {
		
	}
	

	public PremiumPlayer(int goldenToken) {
		super();
		this.goldenToken = goldenToken;
	}
	
	

	public int getGoldenToken() {
		return goldenToken;
	}

	public void setGoldenToken(int goldenToken) {
		this.goldenToken = goldenToken;
	}
	

}
