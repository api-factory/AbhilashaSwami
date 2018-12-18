import java.util.Scanner;

public class EvenOrOdd {
	
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number to check whether no. is an even or odd no.");
	
	int n=sc.nextInt();
	
	if(n%2==0)
	{
		System.out.println(n + " is an even no.");
	}
	else
	{
		System.out.println(n + " is an odd no.");
	}

}
}
