import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindText {
  static boolean findText(String str, String pattern) {
    if (str.equalsIgnoreCase(pattern))
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    File file = new File("./input.txt");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      String stmt=br.readLine();
      Scanner in =new Scanner(System.in);
      System.out.println("Enter the string to search");
      String search=in.nextLine();
      while(stmt!=null){
        if(findText(stmt, search))
        {
          System.out.println("The text is found");
          return;
        }
        stmt=br.readLine();

      }
      System.out.println("The text is not found");
      br.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
