mport java.util.*;
//Import Require Pakages//
//by Eng.nebil Sharifi//
public class Main {
//main Class and Name This file Main and format .java //
	public static void main(String[] args) {
                //Define variables for the limit and question//
		int answer,guess;
		boolean is_courcet;
		int try_count;
		is_courcet=false;
		try_count=0;
                //Getting the entrance from the Camer//
		Scanner input=new Scanner(System.in);
		System.out.print("Player 1:Enter Number form 1-10:");
		answer=input.nextInt();
                //Ring Checking Game Status//
		while(try_count<10 && is_courcet==false){
		   Scanner g=new Scanner(System.in);
		   System.out.print("Player 2:Guess a Number:");
		   guess=g.nextInt();
		   if(answer==guess){
		       System.out.print("Player1:You won !!!");
		       is_courcet=true;
		   }
		   else if(answer<guess){
		       System.out.println("Your guess is smaller answer Please Guess A Number !");
		       try_count++;
		   }
		   else{
		       System.out.println("Your guess is bigger answer!");
		       try_count++;
		   }
		   
		}
		if(is_courcet==false){
		    System.out.println("Player2:You Lost !!!");
		}
	}
}
