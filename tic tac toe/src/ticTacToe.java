
import java.util.Scanner;
public class ticTacToe
	{
		static char currentPlayer;
		static char [][] board;

			{
				currentPlayer = 'x';
				board = new char[3][3];
				fillBoard();

			}
			public char getCurrentPlayer()
			{
				return currentPlayer;
			}
		
		public static void fillBoard()
		{
			for (int i = 0; i < 3; i++)
						{
						  for (int j = 0; j <3; j++)
							  {
								  board [i][j] = '-';
							  }
						}
		}
		
		public static void display()
		{
			
			System.out.println(" |     |     |     |   ");
			System.out.println(" | " + board[0][0] + "   |  " + board[0][1] + "  |  " + board[0][2] + "  |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" | " + board[1][0] + "   | " + board[1][1] + "   | " + board[1][2] + "   |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" | " + board[2][0] + "   | " + board[2][1] + "   | " + board[2][2] + "   |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			
		}
		
	public static boolean isBoardFull()
	{
		boolean isFull= true;
		for (int i = 0; i < 3; i++)
			{
			  for (int j = 0; j <3; j++)
				  {
					 if (board [i][j] == '-')
						 {
							 isFull = false;
						 }
				  }
			}
		return isFull;
		
	}
	
	public static boolean checkForWinner()
	{
		return(checkRows() || checkColumns() || checkDiagonal());
	}
	
	public static boolean checkRows()
	{
		for (int i = 0; i<3; i++)
			{
				if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
				{
					return true;
				}
			}
		return false;
	
	}
	 public static boolean checkColumns()
	 {
		     {
				for (int i = 0; i<3; i++)
					{
						if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
							{
								return true;
							}
						}
					return false;
				
				}
	 }
	 
	 public static boolean checkDiagonal()
			{
					{
				for (int i = 0; i<3; i++)
					{
						if (checkRowCol(board[0][0], board[1][1], board[2][2]) == true || checkRowCol(board[0][2], board[1][1], board[2][0]) == true )
						{
							return true;
						}
					}
				return false;
					}
			
			}
	
	private static boolean checkRowCol(char c, char d, char e)
		{
			return ((c != ' ') && (c == d) && (d == e));
	
		}
	 
	public static void changePlayer()
	{
		if (currentPlayer == 'x')
			{
				currentPlayer ='o';
			}
		else
			{
				currentPlayer = 'x';
			}
	}
	public static boolean placeMarker(int row , int col)
	{
		if ((row >= 0) && (row <3))
			{
				if ((col >= 0) && (col<3))
					{
						if (board [row][col] == '-')
							{
								board[row][col] = currentPlayer;
								return true;
							}
					}
			}
		return false;
	}
	
	
	
}