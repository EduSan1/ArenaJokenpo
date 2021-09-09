package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jog, numc, contpc = 0, contpl = 0;
		int cont = 0;
		String num = " ", nump = " ";

		Scanner leitor = new Scanner(System.in);
		System.out.println("");
		System.out.println("******** Jokempo ********");
		
		while (cont != 3) {
			System.out.println("");
			System.out.println("******** Escolha ********");
			System.out.println("");
			System.out.println("1 - pedra");
			System.out.println("2 - papel");
			System.out.println("3 - tesoura");
			System.out.println("");
			System.out.print("digite sua escolha:");
			jog = leitor.nextInt();
			System.out.println("");

			Random com = new Random();
			numc = com.nextInt(3) + 1;

			if (numc == 1) {

				num = " Pedra";

			} else if (numc == 2) {

				num = " Papel";

			} else if (numc == 3) {

				num = " Tesoura";

			} else {

				System.out.println("erro");

			}

			if (jog == 1) {

				nump = " Pedra";

			} else if (jog == 2) {

				nump = " Papel";

			} else if (jog == 3) {

				nump = " Tesoura";

			}

			if (numc == 1 && jog == 2 || numc == 2 && jog == 3 || numc == 3 && jog == 1) {

				System.out.println("");
				System.out.println("O jogador escolheu" + nump);
				System.out.println("O computador escolheu" + num);
				System.out.println("");
				System.out.println("******* YOU WIN ********");
				contpl++;
				cont = contpl;
				System.out.println("__________________");
				System.out.println("|Placar Jogador " + contpl + "|");
				System.out.println("|Placar Máquina " + contpc + "|");
				System.out.println("|________________|");
				System.out.println("");

			} else if (numc == jog) {

				System.out.println("");
				System.out.println("O jogador escolheu" + nump);
				System.out.println("O computador escolheu" + num);
				System.out.println("");
				System.out.println("******** Empate ********");
				System.out.println("__________________");
				System.out.println("|Placar Jogador " + contpl + "|");
				System.out.println("|Placar Máquina " + contpc + "|");
				System.out.println("|________________|");
				System.out.println("");

			} else if (jog == 1 && numc == 2 || jog == 2 && numc == 3 || jog == 3 && numc == 1) {

				System.out.println("");
				System.out.println("O jogador escolheu" + nump);
				System.out.println("O computador escolheu" + num);
				System.out.println("");
				System.out.println("****** GAME OVER *******");
				System.out.println("");
				contpc++;
				cont = contpc;
				System.out.println("__________________");
				System.out.println("|Placar Jogador " + contpl + "|");
				System.out.println("|Placar Máquina " + contpc + "|");
				System.out.println("|________________|");
				System.out.println("");

			} else {

				System.out.println("Insira um valor valido!");

			}

		}
		leitor.close();
	}

}
