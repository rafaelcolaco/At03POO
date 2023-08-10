package at01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite M para Matutino ou V para Vespertino ou N para Noturno");
		char turno = input.next().charAt(0);
		input.close();
		if (turno == 'M')
			System.out.println("Bom dia!");
		else if (turno == 'V')
			System.out.println("Boa tarde");
		else
			System.out.println("Boa noite");
	}

}