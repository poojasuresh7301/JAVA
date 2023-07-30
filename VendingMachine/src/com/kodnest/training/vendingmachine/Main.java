package com.kodnest.training.vendingmachine;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String productCode =scan.next();
		 getProduct(productCode);

	}
	public static void getProduct(String productCode)

	{

	 if(productCode=="P01") {
		 System.out.println("Coca Cola");
	 }
	 else if(productCode=="P02") {
		 System.out.println("Pepsi");
	 }
	 else if(productCode=="P03") {
		 System.out.println("7up");
	 }
	 else {
		 System.out.println("Product Not Available");
	 }
	 
	 

	}
}
