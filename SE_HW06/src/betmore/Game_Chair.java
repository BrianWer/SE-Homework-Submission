package betmore;

import java.util.Scanner;

public class Game_Chair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
		
		System.out.println("Press Key to start"); 


		 int startgame = in.nextInt(); 
		 in.close();
		 
		 if (startgame!=0) { */
			 
			 start();
			 
	
			
			
		//}
		 
		
	}

	private static  void start() {
		// TODO Auto-generated method stub
		
		int CardPlayer1=new Player_1().play();	
		int CardPlayer2=new Player_2().play();
		
		
		
		FindWinner(CardPlayer1,CardPlayer2);
	}

	private static  void FindWinner(int cardPlayer1, int cardPlayer2) {
		// TODO Auto-generated method stub
		
		if (cardPlayer1< cardPlayer2) {
			System.out.println("Player 2 wins");
			
		}
		
		else {
			System.out.println("Player 1 wins");
		}
	}

}
