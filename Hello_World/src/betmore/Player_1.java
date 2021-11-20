package betmore;

public class Player_1 {
	
	int cardPlayer1;

	
	public int play(){
	
		cardPlayer1=new BetMore_Game().pick_card();
		
	System.out.println("Card Player 1: "+cardPlayer1);
	
return cardPlayer1;
}
}