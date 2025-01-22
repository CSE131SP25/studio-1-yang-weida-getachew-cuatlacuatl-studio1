package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First Variable?");
		int n1 = in.nextInt();
		System.out.println("Second Variable?");
		int n2 = in.nextInt();
		double avg = (n1+n2)/2;
		System.out.println("Your average is " + avg +".");
	}

}
