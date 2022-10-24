package hackerrank;

import java.util.Scanner;

public class pg14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int m=n*i;
			System.out.printf("%d * %d = %d\n",n,i,m);
		}

	}

}
