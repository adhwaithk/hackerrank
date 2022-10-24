package hackerrank;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class pg5 {
	
	static boolean isarmstrong(int n) {
		int temp,digits=0,sum=0,last=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0) {
			last= temp%10;
			sum += (Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int num;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(isarmstrong(num)) {
			System.out.println(num +" is armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		

	}

}
