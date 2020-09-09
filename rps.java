/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rps;

/**
 *
 * @author qayab
 */
import java.util.Scanner;
import java.util.Random; 



public class rps {

  public static void main(String[] args) {

 boolean stop = false;    
while(!stop) {

     String yourInput; //User's play -- "R", "P", or "S" 
    String computerInput = ""; //Computer's play -- "R", "P", or "S" 
    int computerInt; //Randomly generated number used to determine 
                     //computer's play 
    int rounds;
    int win =0;
    int loss =0;
    int tie =0;
    


    Scanner scan = new Scanner(System.in); 
    Scanner num = new Scanner(System.in);
    Scanner key = new Scanner(System.in);
    Random rGen = new Random();




   
 
    System.out.println("How many rounds do you want to play?");
    
    rounds = num.nextInt();

    while((rounds > 10) || (rounds < 1)) {System.out.println("oops number has to be between 1 and 10 TRY AGAIN!");
    rounds = num.nextInt();}
    
    
    
    
    System.out.println("Hey Welcome to Rock, Paper, Scissors!\n" + 
                       "Please enter your choice.\n" + "Rock = R, Paper" + 
                       "= P, Scissors = S.");
    
   
    System.out.println();

   
   


    //Get player's play from input
    
    for (int i = 0; i < rounds; i++) {
        
        computerInt = rGen.nextInt(3) + 1; 
        
        if (computerInt == 1) 
       computerInput = "R"; 
    else if (computerInt == 2) 
       computerInput = "P"; 
    else if (computerInt == 3) 
       computerInput = "S"; 
     
    System.out.println("Enter your choice: "); 
    yourInput = scan.next();

   
    yourInput = yourInput.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer play is: " + computerInput); 
     

    //See who won. 

    if (yourInput.equals(computerInput)) { 
       System.out.println("It's a tie!");
       tie++;}
    
    
    if (yourInput.equals("R")) {
       if (computerInput.equals("S")){ 
          System.out.println("Rock crushes scissors. You win!!");
          win++;}
    else if (computerInput.equals("P")) {
            System.out.println("Paper eats rock. You lose!!"); 
            loss++;}
    }
    
   if (yourInput.equals("P")) {
       if (computerInput.equals("S")) {
       System.out.println("Scissor cuts paper. You lose!!"); 
       loss++;}
    else if (computerInput.equals("R")) {
            System.out.println("Paper eats rock. You win!!"); 
            win++;}
   }
    
     if (yourInput.equals("S")) {
         if (computerInput.equals("P")) {
         System.out.println("Scissor cuts paper. You win!!"); 
         win++;}
    else if (computerInput.equals("R")) {
            System.out.println("Rock breaks scissors. You lose!!"); 
            loss++;}
     }
    
    
    }

    System.out.println("tie:" + tie);
    System.out.println("win:" + win);
    System.out.println("loss:" + loss);

    if (win > loss)
        System.out.println("Congrats you win :) ");
    else if (loss > win)
        System.out.println("You lose maybe next time :( ");
    else 
        System.out.println("Its a tie :|");
   

    
    System.out.println("Would you like to continue? (yes or no)");
    String yN = key.nextLine();
    if(yN.equals("no")) {
        stop = true;
    }
}

   }
  }

  
