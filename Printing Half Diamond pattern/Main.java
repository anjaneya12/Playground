import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int row,temp,c,n;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            temp = n;
            for ( row = 1 ; row <= n ; row++ )
               {
                  for ( c = 1 ; c < temp ; c++ )
                    System.out.print(" ");

                  temp--;

                  for ( c = 1 ; c <= 2*row - 1 ; c++ )
                      System.out.print("*");

                  System.out.println("");
               }
	}
}