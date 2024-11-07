import java.util.Scanner;

/**
 * MergeString
 */
public class MergeString {
  public static String Merge(String word1, String word2) {
    int size=0;
    if(word1.length()<=word2.length()){
      size=word1.length();
    }
    else{
      size=word2.length();
    }
    String temp="";
    for(int i=0;i<size;i++){
      temp=temp+word1.charAt(i)+word2.charAt(i);

    }
    if(size<word1.length()){
      temp=temp+word1.substring(size);

    }
    else{
      temp=temp+word2.substring(size);
    }


    return temp; 
  }

  public static void main(String[] args) {
    String word1, word2;
    @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
    System.out.println("Enter the two words:");
    word1 = in.next();
    word2 = in.next();
    System.out.println("After Merging the string is : " + Merge(word1, word2));
  }
}
