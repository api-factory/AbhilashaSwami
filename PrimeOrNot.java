import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main( String args[]){
		
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Enter a number to check whether no. is prime or not:");
	
		int n=scan.nextInt();
     
		for(int i=2;i<=n/2;i++)
		{
	           temp=n%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(n + " is a Prime Number");
		else
		   System.out.println(n + " is not a Prime Number");
	   }
	}
