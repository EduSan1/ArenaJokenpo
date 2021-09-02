package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jog, numc;

		System.out.println("******** Jokempo ********");
		System.out.println("1 - pedra");
		System.out.println("2 - papel");
		System.out.println("3 - tesoura");
		System.out.print("digite sua escolha:");
		Scanner leitor = new Scanner(System.in);
		jog = leitor.nextInt();
		leitor.close();

		Random com = new Random();
		numc = com.nextInt(3) + 1;
		System.out.println("O computador escolheu " + numc);

		if (numc == 1 && jog == 2 || numc == 2 && jog == 3 || numc == 3 && jog == 1) {

			System.out.println("******* YOU WIN ********");

		} else if (numc == jog ) {
			
			System.out.println("******** Empate ********");
			
		} else {
			
			System.out.println("****** GAME OVER *******");
			
		}

	}

}
