import java.util.Scanner;
class SumOfN
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    int sum;
    while(t-->0){
        int n=in.nextInt();
	sum=0;
	for(int i=1;i<=n;i++)
	{
          sum=sum+i;
	}
	System.out.println(sum);

   }
  }
}