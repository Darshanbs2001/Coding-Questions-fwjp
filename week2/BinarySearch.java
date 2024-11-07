import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {
  static int binarySearch(int low, int high,int arr[],int key){
    int mid=0;

    while(low<high){
      mid=(low+high)/2;
      if(arr[mid]==key){
        return mid;
      }
      else if(key>arr[mid]){
        low=mid+1;

      }
      else{
        high=mid-1;
      }
    }
    return -1;

  }
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=in.nextInt();
    int arr[]=new int[5];
    System.out.println("Enter the elementes into the array:");
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();

    }
    System.out.println("Enter the search element:");
    int key=in.nextInt();
    int pos=binarySearch(0, n-1, arr, key);
    if(pos!=-1){
      System.out.println("Element is found at "+pos+" position");
    }
    else{
      System.out.println("Element is not found");
    }


  }

}
