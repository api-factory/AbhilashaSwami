import java.util.Scanner;

public class PalindromeOrNot {
	
	public static void main(String args[])
	{
		
		int temp=0;
		int sum=0;int rem = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check whether no. is palindrome or not");
		
		int n1=sc.nextInt();
		temp=n1;
		while(temp>0)
		{
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(sum==n1)
		
			System.out.println("No. is palindrome");
		else
		System.out.println("No. is not palindrome");
		
	}
	

}

