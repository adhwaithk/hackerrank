package hackerrank;

import java.util.Scanner;

public class pg11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		String ans="";
		if(a%2==1) {
			ans="weird";
		}
		else {
			if(a>=6 && a<=20) {
				ans="weird";
			}
			else {
				ans="not weird";
			}
		}
		System.out.println(ans);

	}

}
