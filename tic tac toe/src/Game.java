
import java.util.Scanner;

public class Game
	{
		 
		public static void main(String[] args)
			{
			ticTacToe game = new ticTacToe();
			Scanner userInput = new Scanner(System.in);
				//greetings();
			   game.fillBoard();
			   {
			   game.display();
			   int row;
			   int col;
			   {
				   
				   System.out.println("player " + game.currentPlayer + " enter a empty row and column to place your marker." );
				   row = userInput.nextInt()-1;
				   col = userInput.nextInt()- 1;
				 
			   }
			   while (!game.placeMarker(row, col));
			   game.changePlayer();
			   }  
			while(!game.checkForWinner() && !game.isBoardFull());
			if(game.isBoardFull() && !game.checkForWinner() )
			{
				System.out.println("Tied Game");
			}
			
			else
			{
				game.display();
				game.changePlayer();
				System.out.println("player " + game.currentPlayer + " enter a empty row and column to place your marker." );
				
			}

			}
		public static void greetings()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name ?");
				String name = userInput.nextLine();
				System.out.println("Hello,"  + name +  "!");
				System.out.println(" Let`s play Tic Tac Toe");
				String a = userInput.nextLine();
			}

	}