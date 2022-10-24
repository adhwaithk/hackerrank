package hackerrank;

import java.util.Scanner;

public class pg3 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int sum=0;
		int m1=n1;
		while(n1>0) {
			int r=n1%10;
			sum=(sum*10)+r;
			n1=n1/10;
		}
		if(m1==sum)
		{
			System.out.println(m1 +" is palindrome");
		}
		else {
			System.out.println(m1 +" is not palindrome");
		}

	}

}
