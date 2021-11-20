package betmore;

import java.util.Scanner;

public class Player_2 {
	
int cardPlayer2;
int counter=0;


Scanner Scanner = new Scanner(System.in);

	
	public int play(){
	
		cardPlayer2=new BetMore_Game().pick_card();
		
	System.out.println("Card Player 2: "+cardPlayer2);
	System.out.println("Press 1 to shuffel");
	System.out.println("Press 2 to take card");
	
	
	int ChoicePlayer2 = Scanner.nextInt();
	
	
	
	//in.close();
	 
	
	if (ChoicePlayer2==2) {
		 return cardPlayer2;
		
	}
	 else {
		 counter++;
		 if (counter==5) {
			 return cardPlayer2;
		 }
		 play();
	 } 
	 return cardPlayer2;

	}

	
}
