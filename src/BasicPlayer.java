
public class BasicPlayer extends Player{
	
	private int silverToken;
	
	public BasicPlayer() {
		
	}

	public BasicPlayer(int silverToken) {
		super();
		this.silverToken = silverToken;
	}

	public int getSilverToken() {
		return silverToken;
	}

	public void setSilverToken(int silverToken) {
		this.silverToken = silverToken;
	}
	
}
