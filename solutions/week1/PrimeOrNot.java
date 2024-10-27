package week1;

import java.util.Scanner;
public class PrimeOrNot
{
 public static void main(String args[]){
  Scanner in =new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=in.nextInt();
  for(int i=2;i<=Math.sqrt(num);i++)
  {
   
     if(num%i==0){
       System.out.println("Sorry number is not a prime");
       return;
	}
    }
   
  System.out.println("Number is a prime");
  
}
}