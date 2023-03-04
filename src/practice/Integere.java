// WAP to print integer in java

package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Integere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int c;
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		
        // How to get using input using Scanner Class
		// How to get using input using Scanner Class
		// How to get using input using Scanner Class
		/*int a;
		float b;
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String value");
		s= sc.next();
		System.out.println(" String value   "+s);
		System.out.println("Enter Integer Value");
		a = sc.nextInt();
		System.out.println("Integer Value   "+a);
		System.out.println("Enter Float value");
		b= sc.nextFloat();
		System.out.println("Float value     "+b);*/
		
// WAP how to convert Fahrenheit to	celcious program in java.
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please Ask Temperature");
		float temperature = sc.nextInt();
		temperature = ((temperature - 32)*5)/9;
		System.out.println("Temperature in celcious"+temperature);*/
		
// WAP how to swap 2 no. without using 3rd variable.
		/*int x,y,temp;
		Scanner sc = new Scanner(System.in)
		System.out.println("Enter x and y value");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swaping"+x+" "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap"+x+" "+y);*/
		
		
// WAP how to swap 2nos. without using 3 variables.
		
		/*int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X and Y Value");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("Before Swapping  "+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After  Swapping  "+x+" "+y);*/
		
		
		// For Large Number
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		String num1=sc.next();
		System.out.println("Enter the Second Number");
		String num2 = sc.next();
		 
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
        BigInteger sum;
        sum = first.add(second);
		System.out.println("Add the value  "+sum);*/
		
// WAP find Largest number in java		
		/*int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x value");
		x=sc.nextInt();
		System.out.println("Enter the y Value");
		y=sc.nextInt();
		System.out.println("Enter the z value");
		z=sc.nextInt();
		
		if(x>y && x>z){
			System.out.println(" x is Largest Number");
		}
			else if (y>x && y>z) {
				System.out.println(" y is Largest Number");
			}
				else if(z>x && z>y){
					System.out.println(" z is Largest Number");
				}
					else {
						System.out.println(" They all are Equal");
	             	}*/
		
// IF_ELSE clause in java		
		/*int markobtained,passing_mark = 40;
		Scanner sc = new Scanner(System.in);
		System.out.println("Obtained the Mark");
		markobtained = sc.nextInt();
		
		if(markobtained>=passing_mark) {
			System.out.println("your passed");
		}
		else {
			System.out.println("your fail");
		}*/
		
// Nested If-Else clause in java	
		
		/*int markobtaine,passing_marks;
		passing_marks=40;
		char scale;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		markobtaine = sc.nextInt();
		if(markobtaine>=passing_marks) {
			if(markobtaine>90) 
			    scale = 'A';
			else if(markobtaine>70) 
				scale='B';
			else if(markobtaine>60) 
				scale='c';
			else 
				scale='d';
				System.out.println("your passed garde is  "+scale);
			}
			else {
				scale='f';
				System.out.println("your failed grade is  "+scale);
			}*/

// Even or Odd program	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int x=sc.nextInt();
		if(x%2==0) {
			System.out.println(" Even Number");
		}
		else {
			System.out.println("Odd Number");
		}*/
		
// WAP of factorial number
		
		/*int fact = 5;
		for (int j=fact-1;j>1;j--) {
		fact=fact*j;
		System.out.println(+fact);
		}*/
		
// how to complete 2 string in java
	    /*String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		s1= sc.next();
		System.out.println("Enter the value");
		s2 = sc.next();
		
		if(s1.compareTo(s2)>0) 
			System.out.println("first greater than second ");
		else if(s1.compareTo(s2)<0)
			System.out.println("Seccond is smaller than first");
		else {
			System.out.println("They are Equal");
		}*/
		
// WAP while loop in java
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Input an Integer");
		int n = sc.nextInt();
		
		while(n>=0) {
			System.out.println("Enter the 1st value   "+n);
			System.out.println("Input an Integer");
		}
		System.out.println("out of Loop");*/
		
		
// WAP print reverse number using while loop
		/*Scanner sc = new Scanner (System.in);
		System.out.println("enter reverse number");
		int n=sc.nextInt();
		int reverse=0;
		while(n!=0) {
			reverse= reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Enter Reverse number  "+reverse);*/
		
// WAP Break using loop
		/*int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		while(true) {
			System.out.println("Input an Integer");
			n= sc.nextInt();
			if(n==0) 
			break;
		}
		System.out.println("you entered   "+n);*/
		
//WAP to print A to Z Alphabet.
		
	/*	char i;
		for( i='A';i<='Z';i++){ 
			System.out.println(i);
		}*/
		
// WAP write Enhance loop in java
		/*int Prime []= {2,4,5,7,11,13,17,19,23,29,31};
		for(int i:Prime){
			System.out.println(i);
			}*/
		
// WAP write Multiplication Table
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Table");
		int n=sc.nextInt();
		System.out.println("multiplication of table is "+n+" is:-");
		for(int i=1;i<=10;i++) {
			System.out.println(n+" "+i+" "+(n*i));
		}*/
		
		// for any number
		/*int a,b,c,d;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(c=a;c<=b;c++) {
			System.out.println("Multiplication of table is "+c);
			for(d=1;d<=10;d++) {
				System.out.println(c+" "+d+" " +(c*d));
			}
		}*/
		}	
		}
		
		
















