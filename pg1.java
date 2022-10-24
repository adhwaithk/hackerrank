package hackerrank;

import java.util.Scanner;

public class pg1 {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		int n4=10;
		System.out.println(n1);
		System.out.println("");
		System.out.println(n2);
		
		for(int i=2;i<n4;i++) {
			n3=n2+n1;
			System.out.println(n3);
			System.out.println("");
			n1=n2;
			n2=n3;
			
			
		}

	}

}
