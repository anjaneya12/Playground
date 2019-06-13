import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int n = gcd(n1,n2);
      int g= gcd(n,n3);
      System.out.println(g);
	}
  public static int gcd(int n1,int n2){
    int min,gcd1=0;
    if(n1<n2)
      min=n1;
    else
      min=n2;
    while(min>=1)
    {
      if((n1%min==0) && (n2%min==0))
      {
        gcd1=min;
        break;
      }
      min--;
    }
    return(gcd1);
  }

}