package week1;
import java.util.Scanner;

public class PalindromeOrNot{
public static void main(String args[]){
 int n;
 Scanner in =new Scanner(System.in);
 System.out.println("Enter the number: ");
 n=in.nextInt();
int temp=n;
int rem=0;
int sum=0; 
while(n!=0){
  rem=n%10;
  sum=sum*10+rem;
  n=n/10;
 }
if(temp==sum)
System.out.println("The number is a palindrome");
else
System.out.println("The number is not a palindrome");
}
}