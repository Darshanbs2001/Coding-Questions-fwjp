import java.util.Scanner;
public class PositiveOrNegative{
  public static void main(String args[])
 {
   Scanner in =new Scanner(System.in);
   System.out.println("Enter the number: ");
   int n= in.nextInt();
   if(n>0)
   System.out.println("Is a Positive");
   if(n<0)
   System.out.println("Is a Negative");
   if(n==0)
   System.out.println("Is a Zero");
 }
}