package week1;
import java.util.Scanner;

public class LogicalOperators{
public static void main(String args[]){

int num;
Scanner in =new Scanner(System.in);
System.out.println("Enter the number:");
num=in.nextInt();
if(num<=0){
System.out.println("Sorry invalid number");
return ;
}
if(num%3==0 && num%5==0){
 System.out.println("The number is divisible by both 3 and 5");
}
else{
 System.out.println("The number is not divisble by both 3 and 5");
}
}
}