package hackerrank;

import java.util.Scanner;

public class pg2 {

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int flag =0;
		int m1;
		m1=n1/2;
		for(int i=2;i<=m1;i++)
		{
			if(n1%i==0)
			{
				System.out.println("not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}

	}

}
