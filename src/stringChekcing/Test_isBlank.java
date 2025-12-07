package stringChekcing;

import java.util.Scanner;

public class Test_isBlank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		if(name.isEmpty()) {
			System.out.println("Print error message username can not be empty");
			
		} else {
			System.out.println("Welcome" + name);
		}

	}

}
// Now clearly understood the basics and coding logic. 
