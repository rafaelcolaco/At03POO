package at01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número");
		int numero = input.nextInt();
		input.close();
		if (numero == '1') 
			System.out.println("domingo");
		else if (numero == '2')
			System.out.println("Segunda");
		else if (numero == '3')
			System.out.println("Terça");
		else if (numero == '4')
			System.out.println("Quarta");
		else if (numero == '5')
			System.out.println("Quinta");
		else if (numero == '6')
			System.out.println("Sexta");
		else if (numero == '7')
			System.out.println("Sábado");
		else
			System.out.println("Número invalido");
		
		

	}

}