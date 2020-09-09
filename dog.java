package com.sg.doggenetics;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qayab
 */
public class dog {
    
    
  public static void main(String[] args) {
      
      
    
      
      
        Random num = new Random();
        Scanner name = new Scanner(System.in);
        String dogName;
        
         int breed1;
         int breed2;
         int breed3;
         int breed4;
         int breed5;
        
       
            breed1 = num.nextInt(100);
            breed2 = num.nextInt(100 - breed1);
            breed3 = num.nextInt(100 - breed1 - breed2);
            breed4 = num.nextInt(100 - breed1 - breed2 - breed3);
            breed5 = 100 - breed1 - breed2 - breed3 - breed4;
       

        System.out.println("What is your dog's name? ");
        dogName = name.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println("");
        
        System.out.println(dogName + " is:");
        
        System.out.println("");
        
        System.out.println(breed1 + "% St. Bernard");
        
        System.out.println(breed2 + "% Chihuahua");
        
        System.out.println(breed3 + "% Dramatic RedNosed Asian Pug");
        
        System.out.println(breed4 + "% Common Cur");
        
        System.out.println(breed5 + "% King Doberman");

}
}
