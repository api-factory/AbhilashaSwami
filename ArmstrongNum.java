import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int temp=0, sum=0;
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check whether no. is palindrome or not");
		
		int n=sc.nextInt();
		temp=n;
		
		while(temp>0)
		{
			int rem = temp%10;
			temp=temp/10;
			sum=(rem*rem*rem)+sum;
			
		}
		
		if(sum==n)
		
		System.out.println(n+ " is an armstrong no.");
		
		else
			
			System.out.println(n+ "is not an armstrong no.");

	}

}
