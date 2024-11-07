package week1;
import java.util.Scanner;
public class Swap{

public static void main(String args[]){
  int a,b;
  Scanner in =new Scanner(System.in);
  System.out.println("Enter the two numbers");
  a=in.nextInt();
  b=in.nextInt();
  System.out.println("Before swaping a="+a+"b="+b);
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("After swaping a="+a+"b="+b);

}
}