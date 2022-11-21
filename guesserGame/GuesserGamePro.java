package guesserGame;
import java.util.Scanner;

public class GuesserGamePro {

	public static void main(String[] args) 
	{
       Umpire u=new Umpire() ;
       u.collectNumFromGuesser();
	   u.collectNumFromPlayer();
	   u.collectresult();
	
	  
	}
	}

class Guesser
{
	int GuessNum;
	int guessNum() {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Guesser Kindly GUESS the Number");
	 GuessNum=scan.nextInt();
	 return GuessNum;
	}
}

class Player1{
	int GuessNum1;
	int guessNum1() {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Player1 Kindly GUESS the Number");
	 GuessNum1=scan.nextInt();
	 return GuessNum1;
	}
	
}
class Player2{
	int GuessNum2;
	int guessNum2() {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Player2 Kindly GUESS the Number");
	 GuessNum2=scan.nextInt();
	 return GuessNum2;
	}
	}
class Player3{
	int GuessNum3;
	int guessNum3() {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Player3 Kindly GUESS the Number");
	GuessNum3=scan.nextInt();
	 return GuessNum3;
	}
	
}
class Umpire{
	int numberOfGuesser;
	int numberOfPlayer1;
	int numberOfPlayer2;
	int numberOfPlayer3;
   
	void collectNumFromGuesser (){
		Guesser g=new Guesser();
		numberOfGuesser=g.guessNum();
		 
	}
	void collectNumFromPlayer (){
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		 numberOfPlayer1=p1.guessNum1();
		 numberOfPlayer2=p2.guessNum2();
		numberOfPlayer3=p3.guessNum3();
	}
	void collectresult(){
    if(numberOfGuesser==numberOfPlayer1) {
    if(numberOfGuesser==numberOfPlayer2 && numberOfGuesser==numberOfPlayer3) {
    	System.out.println("All Players won");
    }else if(numberOfGuesser==numberOfPlayer2) {
    	System.out.println("Player 1 & Player 2  Won");
    }else if(numberOfGuesser==numberOfPlayer3) {
    	System.out.println("Player 1  & Player 3  won");
    }else {
    	System.out.println("Player 1 won");
    }
	}else if(numberOfGuesser==numberOfPlayer2) {
    	
     if(numberOfGuesser==numberOfPlayer3) {
    	System.out.println("Playerr 2  & Player 3  Won");
    }else {
    	System.out.println("Player 2 won");
    }
}else if(numberOfGuesser==numberOfPlayer3) {
	System.out.println("Player 3 won");
}else {
	System.out.println("Game Lost!!");
}
	}
	
	

}
   
