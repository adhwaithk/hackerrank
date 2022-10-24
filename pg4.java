package hackerrank;

import java.util.Scanner;

public class pg4 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int m1=1;
		for(int i=1;i<=n1;i++)
		{
			m1=m1*i;
			
		}
		System.out.println("factorial of " +n1 +" is " +m1);

	}

}
