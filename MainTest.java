package homework_2;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {

		Random rand=new Random();       
		int rast;           // randomly generated letters to keep the ascii code variable
		Stack bag_1=new Stack(26);    // Creation of the bag_1 stack for alphabets
		Stack bag_2=new Stack(26);    // Stack to which the selected letters enter
		System.out.print("Bag 1: ");
		char select=' ';
		for(char alph='A'; alph<='Z'; alph++)   
		{
			bag_1.push(alph);
			select=(char) ((char)rand.nextInt(26)+65);
			System.out.print(bag_1.peek()+" ");
		}
		
		System.out.println();
		Stack tempstack=new Stack(26);
		while(!(bag_1.isEmpty()))    
		{
			tempstack.push(bag_1.pop());
		}
		while(!(bag_1.isEmpty()))
		{
			bag_1.push(tempstack.pop());
		}
		
		System.out.print("Bag 2: ");
		bag_2.push(select);
		System.out.println(bag_2.peek());
		
		Stack player1=new Stack(8);     //Creation of the stack for player1
		Stack tempplayer1=new Stack(8);  // Stack controlled for player1
		
		System.out.print("PLAYER 1: ");
		for(int k=1; k<=4; k++)
	    {
		    rast=rand.nextInt(14)+65;       //A-N between letters
		   	char letter1=(char)rast;     // random integer convert to character
		   	player1.push(letter1);
	        System.out.print(player1.peek()+" ");	
	    }
		
     while(!(player1.isEmpty()))
     {
    	 tempplayer1.push(player1.pop());
     }
	while(!(player1.isEmpty()))
	 {
		player1.push(tempplayer1.pop());
	 }
	
    for(int k=1; k<=4; k++)
    {
    	rast=rand.nextInt(12)+79; //A-N between letters
    	char letter2=(char)rast;   // random integer convert to character
    	player1.push(letter2);
    	
    	System.out.print(player1.peek()+" ");
    }
	while(!(player1.isEmpty()))
	{
   	    tempplayer1.push(player1.pop());
	}
	while(!(player1.isEmpty()))
	{
		player1.push( tempplayer1.pop());
	}
	System.out.println();
	
	Stack player2=new Stack(8);
	Stack tempplayer2=new Stack(8);
	
	System.out.print("PLAYER 2: ");
	for(int k=1; k<=4; k++)
    {
	    rast=rand.nextInt(14)+65;          //A-N between letters
	   	char letter3=(char)rast;         // random integer convert to character
	   
	   	player2.push(letter3);
	   System.out.print(player2.peek()+" ");
	  
	   	
    }
	while(!(player2.isEmpty()))
	{
		tempplayer2.push(player2.pop());
	}
	while(!(player2.isEmpty()))
	{
		player2.push(tempplayer2.pop());
	}
		
	 for(int k=1; k<=4; k++)
	  {
	    	rast=rand.nextInt(12)+79;    //A-N between letters
	    	char letter4=(char)rast;       // random integer convert to character
	    	player2.push(letter4);
	    	System.out.print(player2.peek()+" ");
	  }
	while(!(player2.isEmpty()))
	{
	   	    tempplayer2.push(player2.pop());
	}
	while(!(player2.isEmpty()))
	{
		
		player2.push( tempplayer2.pop());
	}
	System.out.println();
	System.out.println("SELECTED  :"+select);
	
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
