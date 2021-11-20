package betmore;

public class BetMore_Game {
	
	int min=1;
	int max=100;
	
	public int pick_card() {
		
		int cardnumber= (int) (Math.random()*(max-min)) + min;
		
		
		return cardnumber;
	}

	

}
