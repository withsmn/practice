package arrayinput;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args ) {
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends name that you are gonna enter?");
		length = input.nextInt();
		
		String[] names = new String[length];
		for (int c = 0; c < length; c++ ) {
			System.out.println("Enter the name of friend" +(c+1));
			names[c] = input.next();
			
			
		}
		
		input.close();
		
		System.out.println("Your friends are");
		for (int c = 0; c < length; c++ ) {
			System.out.println(names[c]);
		}
	}

}
