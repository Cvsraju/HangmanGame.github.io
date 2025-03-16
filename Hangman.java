package com.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Hangman {

	public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the below options :");
		   System.out.println("1:Animals");
		   System.out.println("2:Birds");
		   System.out.println("3:Vechicles");
		   System.out.println("4:FoodItems");
		   
		   int useroption = sc.nextInt();
		   
		   
		   
		   
		   
		   
		   useroption =useroption-1;
		   String[][] arr= {
				   {"LION","TIGER","CHEETAH","ELEPHANT","CROCODILE"},
				   {"CROW","EAGLE","PARROT"},
				   {"MARUTI","HUNDAI","AUDI","BENZ","MAHINDRA"},
				   {"IDLY","CAHPATI","PONGAL","VADA"}
		   };
		   
		   
		   Random obj =new Random();
		   int useroptionlength=arr[useroption].length;
		   int ind = obj.nextInt(useroptionlength);  // it can access random number in between 0 t0 length    
		   											// 0 or 1 or 2 or 3  and so on ..								
		   String input =arr[useroption][ind];
		   
		   StringBuffer result=new StringBuffer();
		   
		   ArrayList<Character> store = new ArrayList<>();
		   
		   for(int i=0;i<input.length();i++)
		   {
			   result.append('_');
		   }
		   
		   while(true)
		   {
			   System.out.println(result);
			   System.out.print("Enter a letter: ");
			   char inputuser = sc.next().charAt(0);
			   
			   inputuser =Character.toUpperCase(inputuser);

	            if (store.contains(inputuser)) {
	                System.out.println("You already guessed '" + inputuser + "'. Try a different letter.");
	                continue;
	            }

	            store.add(inputuser); // Add to guessed characters

	            
	            if (input.contains(String.valueOf(inputuser))) {
	                List<Integer> index = new ArrayList<>();

	                for (int i = 0; i < input.length(); i++) {
	                    if (input.charAt(i) == inputuser) {
	                        index.add(i);
	                    }
	                }

	                for (int i : index) {
	                    result.setCharAt(i, inputuser);
	                }
	            } 
	            
	            else {
	                System.out.println("'" + inputuser + "' is not in the word.");
	            }

	            
	            if (result.toString().equals(input)) {
	                System.out.println("Congratulations! You won the match. The word was: " + input);
	                break;
	            }
	        }
	}
}
















