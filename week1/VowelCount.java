package week1;
import java.util.Scanner;
public class VowelCount{
public static void main(String args[]){
 String word;
 int vowelCount=0;
 Scanner in =new Scanner(System.in); 
 System.out.println("Enter the word:");
 word=in.next();
 for(int i=0;i<word.length();i++){
  switch(word.charAt(i))
  {
    case 'a': 
    case 'e':
    case 'i':
    case 'o':
    case 'u': vowelCount++;
		break;
    default: continue;

  }
 }
if(vowelCount>0)
{
System.out.println("A vowel is present in the word");
}
else{
System.out.println("The vowel is not present in the word");
}
}
}