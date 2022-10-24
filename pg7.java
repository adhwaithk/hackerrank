package hackerrank;

public class pg7 {

	public static void main(String[] args) {
		int min=200;
		int max=400;
		System.out.println("random numbers between 200 and 400");
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		int b =(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
	}

}
