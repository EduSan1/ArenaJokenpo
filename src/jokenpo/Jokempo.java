package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jog, numc;
		String num =" ", nump = " ";

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
		
		if (numc == 1) {
			
			num = " Pedra";
			
		} else if (numc == 2) {
			
			num = " Papel";
			
		} else if (numc == 3) {
			
			num = " Tesoura";
			
		}else {
			
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
			
			System.out.println("O jogador escolheu" + nump );
			System.out.println("O computador escolheu" + num );
			System.out.println("******* YOU WIN ********");

		} else if (numc == jog ) {
			
			System.out.println("O jogador escolheu" + nump );
			System.out.println("O computador escolheu" + num );
			System.out.println("******** Empate ********");
			
		} else if (jog == 1 && numc == 2 || jog == 2 && numc == 3 || jog == 3 && numc == 1) {
			
			System.out.println("O jogador escolheu" + nump );
			System.out.println("O computador escolheu" + num );
			System.out.println("****** GAME OVER *******");
			
		} else {
			
			System.out.println("Insira um valor valido!");
			
		}

	}

}
