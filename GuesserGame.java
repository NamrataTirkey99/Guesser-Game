package launchgame;
//import java.io.IOException;
import java.util.*;

class Guesser
{
	int GNum;
	public int GuessTheNumber()
	{
		System.out.println("Dear Guesser, please guess the number: ");
		
		
		Scanner sc = new Scanner(System.in);
		GNum = sc.nextInt();		 
		
		return GNum;
		
	}
 
}

class Player
{
	int PNum;
	public int GuessTheNumber(int Player_no)
	{		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dear Player "+Player_no+", please guess the number: ");
		PNum = sc.nextInt();		 
		
		return PNum;
		
	}
 
}

class Umpire
{
	
 	int numFromGuesser;
 	
	Player[] PNum; 
	int[] numFromPlayers; 
	
	public void CollectNumFromGuesser()
	{
		Guesser GNum= new Guesser();
		numFromGuesser = GNum.GuessTheNumber();
	}
	
	  int[]  CollectNumFromPlayer(int No_Of_Players) {
		
		Player[] PNum = new Player[No_Of_Players];
		int[] numFromPlayers = new int[No_Of_Players];
		
		for(int i = 0 ; i < No_Of_Players ; i++)
		{
			 PNum[i]= new Player();
		}
		
		int counter= 0 ;
		for(int i = 0 ; i < No_Of_Players ; i++)
		{
		 
			numFromPlayers[i] = PNum[i].GuessTheNumber(++counter);
		}
		
		 return	numFromPlayers; 
		
 
	}
	
	 
	
 	public void compare(int []numFromPlayers, int No_Of_Players) {
 
 	
 		switch(No_Of_Players)
 		{
 			case 2: 
 					if(numFromGuesser == numFromPlayers[0])
 					{
 							if(numFromGuesser == numFromPlayers[1]   )
 							{
 								System.out.println("All the Players won!");
 							}
 			 
 							else
 							{
 								System.out.println("Player 1 won!");
 							}
 					}
 					
 					else if(numFromGuesser == numFromPlayers[1])
 					{
 				  
 						System.out.println("Player 2 won!");
 				 
 					}
 					
 					else
 					{
 						System.out.println("Game Over");
 					}
 					break;
 		
 			case 3:
 					if(numFromGuesser == numFromPlayers[0])
 					{
 						
							if(numFromGuesser == numFromPlayers[1] && numFromGuesser == numFromPlayers[2] )
							{
								System.out.println("All the Players won!");
							}
							
							else if(numFromGuesser == numFromPlayers[1])
							{
								System.out.println("Players 1 & 2 won!");
							}
							
							else if(numFromGuesser == numFromPlayers[2])
							{
								System.out.println("Players 1 & 3 won!");
							}
							else
							{
								System.out.println("Player 1 won!");
							}
 					}
 					
 					else if(numFromGuesser == numFromPlayers[1])
 					{
 							if(numFromGuesser == numFromPlayers[2])
 							{
 								System.out.println("Players 2 & 3 won!");
 							}
 							else
 							{
 								System.out.println("Player 2 won!");
 							}
 					}
 					
 					else if(numFromGuesser == numFromPlayers[2])
 					{
 						System.out.println("Player 3 won!");
			 
 					}
 					else
 					{
 						System.out.println("Game Over");
 					}
		 
 					break;
 					
 			case 4:
 				if(numFromGuesser == numFromPlayers[0])
					{
						
						if(numFromGuesser == numFromPlayers[1] && numFromGuesser == numFromPlayers[2] && numFromGuesser == numFromPlayers[3])
						{
							System.out.println("All the Players won!");
						}
						
						else if(numFromGuesser == numFromPlayers[1])
						{
							if(numFromGuesser == numFromPlayers[2])
								System.out.println("Players 1, 2 & 3 won!");
							
							else if(numFromGuesser == numFromPlayers[3])
								System.out.println("Players 1, 2 & 4 won!");
							
							else 
								System.out.println("Players 1 & 2 won!");
						}
						
						else if(numFromGuesser == numFromPlayers[2])
						{
							 if(numFromGuesser == numFromPlayers[3])
								 	System.out.println("Players 1, 3 & 4 won!");
							 else
								 	System.out.println("Players 1 & 3 won!");
						}
						
						else if(numFromGuesser == numFromPlayers[3])
						{
							  System.out.println("Players 1 & 4 won!");
						}
						else
						{
							System.out.println("Player 1 won!");
						}
					}
 				
 				else if(numFromGuesser == numFromPlayers[1])
					{
						
						if(numFromGuesser == numFromPlayers[2] && numFromGuesser == numFromPlayers[4] )
						{
							System.out.println("Players 2, 3 & 4 won!");
						}
						
						else if(numFromGuesser == numFromPlayers[2])
						{
							System.out.println("Players 2 & 3 won!");
						}
						
						else if(numFromGuesser == numFromPlayers[3])
						{
							System.out.println("Players 2 & 4 won!");
						}
						else
						{
							System.out.println("Player 2 won!");
						}
					}
					
					else if(numFromGuesser == numFromPlayers[2])
					{
							if(numFromGuesser == numFromPlayers[3])
							{
								System.out.println("Players 3 & 4 won!");
							}
							else
							{
								System.out.println("Player 3 won!");
							}
					}
					
					else if(numFromGuesser == numFromPlayers[3])
					{
						System.out.println("Player 4 won!");
		 
					}
					else
					{
						System.out.println("Game Over");
					}
	 
					break;
 				
 					
 					 
		 
 			default : System.out.println("Invalid Number");
 						break;
 		}
 		
 		
		
	}
}

public class GuesserGame {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		//------------Front Page-----------------
		
		for(int i = 0 ; i <= 22; i++)
		{
			for(int j = 0 ; j <= 125; j++)
			{
				if(i == 0 || i == 22 || i == 21 || i == 1   )
				{
					//if(j == 0 || j == 1 || j == 124 || j == 125)
						System.out.print("*");
					//else
						//System.out.print(" ");
					
				}
				if(i >= 2 && i <=7 )
				{
					if(j == 0 || j == 1 || j == 124 || j == 125)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				if(i >= 16 && i <=20 )
				{
					if(j == 0 || j == 1 || j == 124 || j == 125)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
				if(i == 8)
				{
					if( j == 17 || j == 18 || j == 19 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31 || j == 32 || j == 33 || j == 34 || j == 34 || j == 35 || j == 36 || j == 37 || j == 38 || j == 41 || j == 42 || j == 43 || j == 44 || j == 45 || j == 46 || j == 50 || j == 51 || j == 52 || j == 53 || j == 54 || j == 55 || j == 58 || j == 59 || j == 60 || j == 61 || j == 62 || j == 63 || j == 64 || j == 65 || j == 67 || j == 68 || j == 69 || j == 70 || j == 71 || j == 72 || j==79	|| j==80	|| j==81	|| j==82	|| j==83	|| j==84 || j==88	|| j==89	|| j==90	|| j==91	|| j==92	|| j==93 || j==96 || j==103 || j == 105	|| j == 106	|| j == 107	|| j == 108	|| j == 109	|| j == 110	|| j == 111	|| j == 112	|| j==95)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 9)
				{
					if(j == 15 || j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31 || j == 40 || j == 47 || j == 49 || j == 56 || j == 58 || j == 67 || j == 73 || j == 78 || j == 85 || j==87 || j==94 || j==96 || j==103  || j==97 || j==102 || j == 105)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 10)
				{
					if(j == 14 || j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31 || j == 40 || j == 49 || j == 58 || j == 67 || j == 73 || j == 78 || j == 85  || j==87 || j==94  || j==96 || j==103  || j==97 || j==101 || j == 105)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 11)
				{
					if(j == 14 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31 || j == 32 || j == 33 || j == 34 || j == 34 || j == 35 || j == 41 || j == 42 || j == 43 || j == 44 || j == 45 || j == 46 || j == 50 || j == 51 || j == 52 || j == 53 || j == 54 || j == 55 || j == 58 || j == 59 || j == 60 || j == 61 || j == 62 || j == 67 || j == 68 || j == 69 || j == 70 || j == 71 || j == 72 || j == 78 || j==87	|| j==88	|| j==89	|| j==90	|| j==91	|| j==92	|| j==93	|| j==94  || j==96 || j==103  || j==99 || j==100 || j == 105	|| j == 106	|| j == 107	|| j == 108	|| j == 109)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 12)
				{
					if(j == 14 || j == 17 || j == 18 || j ==19 || j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31 || j == 47 || j == 56 || j == 58 || j == 67 || j == 70  || j == 78 || j==81	|| j==82	|| j==83	|| j==84	|| j==85  || j==87 || j==94  || j==96 || j==103 || j == 105)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 13)
				{
					if(j == 15 || j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31  || j == 40 || j == 47  || j == 58  || j == 67 || j == 71 || j == 79|| j == 85 || j==87 || j==94  || j==96 || j==103 || j == 105)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 14)
				{
					if(j == 17 || j == 18 || j ==19 || j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 22 || j == 29 || j == 31  || j == 41 || j == 47  || j == 50 || j == 56 || j == 58  || j == 67 || j == 72 || j==80 || j==81	|| j==82	|| j==83	|| j==84	|| j==85  || j==87 || j==94  || j==96 || j==103 || j == 105 )
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else if(i == 15)
				{
					if(j == 20 || j == 0 || j == 1 || j == 124 || j == 125 || j == 25 || j == 26 || j == 23 || j == 28 || j == 24 || j == 27 || j == 31 || j == 32 || j == 33 || j == 34 || j == 34 || j == 35 || j == 36 || j == 37 || j == 38 || j == 42 || j == 43 || j == 44 || j == 45 || j == 46 || j == 51 || j == 52 || j == 53 || j == 54 || j == 55 | j == 58 || j == 59 || j == 60 || j == 61 || j == 62 || j == 63 || j == 64 || j == 65 || j == 67 || j == 73 || j == 85  || j==87 || j==94  || j==96 || j==103 || j == 105 || j == 106 || j == 107 || j == 108	|| j == 109	|| j == 110	|| j == 111	|| j == 112	|| j==95)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				 
			
			}
			System.out.println(" ");
		}
		
		//----------------------------End Of Front Page---------------------------
		
		System.out.println();
		 
	 
	 
		
		
 		char play=' ';
		int No_Of_Players;
//		
 		Scanner sc = new Scanner(System.in);
//		
 		do
 		{
 			Umpire U = new Umpire();
 		 
			System.out.println("Please select the number of Players");
			System.out.println("Enter 2 for 2 Players"); 
			System.out.println("Enter 3 for 3 Players"); 
			System.out.println("Enter 4 for 4 Players"); 
			No_Of_Players = sc.nextInt();		System.out.println(No_Of_Players);
			if(No_Of_Players == 2 || No_Of_Players == 3 || No_Of_Players == 4  )
			{
				int Numbers[] = new int[No_Of_Players];
				U.CollectNumFromGuesser();
//				U.CollectNumFromPlayer();
				Numbers=U.CollectNumFromPlayer(No_Of_Players);
				U.compare(Numbers,No_Of_Players);
 
			}
			else { 
				System.out.println("Invalid number!");

			}
 			System.out.println("Play Again? (Y/N): ");
 			play=sc.next().charAt(0);
//			
//			
 		}while(play == 'y' || play == 'Y' );
//		
		
sc.close();
	}
	
}



