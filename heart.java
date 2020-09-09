/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author qayab
 */

public class heart {
    

 public static void main(String[] args) {

int age;
int hR = 220;

Scanner num = new Scanner(System.in); 


System.out.println("What is your age?:");
age = num.nextInt();

int max = hR - age;

System.out.println("Your maximum heart rate should be "+ max + " beats per minute");

double low = max*0.5;
double high = max*0.85;

System.out.println("Your target HR Zone is " +low +" - "+ high + " beats per minute");

  }
} 
     

