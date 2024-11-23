package week3;
import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the principle amount:");
    int amount=in.nextInt();
    System.out.println("Enter the rate of intereset:");
    double intereset=in.nextDouble();
    System.out.println("Enter the time period in years:");
    double time=in.nextDouble();
    double SimpleInterest=(amount*intereset*time)/100;
    System.out.println("Simple interest is: "+SimpleInterest);
    in.close();


  }
}
