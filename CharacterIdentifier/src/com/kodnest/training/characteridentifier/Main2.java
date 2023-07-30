package com.kodnest.training.characteridentifier;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        identifyCharacter(ch);

	}
	public static void identifyCharacter(char ch)

	{
      if(Character.isDigit(ch)) {
    	  System.out.println("Entered character is digit");
      }
      else if(!Character.isLetter(ch)) {
    	  System.out.println("Entered character is special character");
      }
      else {
    	  switch(Character.toLowerCase(ch)) {
    	  case 'a':
    	  case 'e':
    	  case 'i':
    	  case 'o':
    	  case 'u':
    		  if(Character.isLowerCase(ch)) {
    			  System.out.println("Entered character is lower case vowel");
    		  }
    		  else {
    			  System.out.println("Entered character is upper case vowel");
    		  }
    		  break;
    		  default:
    			  if(Character.isLowerCase(ch)) {
    				  System.out.println("Entered character is lower case consonant");
        		  }
        		  else {
        			  System.out.println("Entered character is upper case consonant");
        		  }
    			  }
    	  }
      }
	

	}


