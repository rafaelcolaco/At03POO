package at01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		char letra = input.next().charAt(0);
		input.close();
		if (((((letra == 'a') || (letra == 'e')))) || (letra == 'i') || (letra == 'o') || (letra == 'u')) 
			System.out.println("A letra digitada é uma vogal");
			else 
				System.out.println("A letra digitada não é uma vogal");
	}	
}