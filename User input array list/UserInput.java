import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scString = new Scanner (System.in);
		Scanner scInt = new Scanner (System.in);
		System.out.println("Enter your name: ");
		String name = scString.nextLine();
		System.out.println("Enter your age: ");
		int age = scInt.nextInt();
		
		System.out.println("Name: "+name+"\n"+"Age: "+age);
		

	}

}
