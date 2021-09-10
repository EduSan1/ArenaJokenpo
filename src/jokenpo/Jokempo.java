package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jogador = 0, computador, placarJogador = 0, placarComputador = 0;
		int partidasjogadas = 0, contadorDePartidas1 = 1, contadorDePartidas2 = 0, contador4 = 0, contador3 = 0,
				partidas2 = 0;
		int partidas = 0, resetarjogo = 0, resetarjogo2 = 0;
		String EscolhaEscritaComputador = " ", EscolhaEscritaJogador = " ", jogarnovamente = " ";

		Scanner leitor = new Scanner(System.in);
		System.out.println("");
		System.out.println("******** Jokempo ********");
		System.out.println("");

		while (resetarjogo == 0) {
			while (contadorDePartidas2 == 0) {

				System.out.print("Quantas partidas você deseja jogar?(ímpar e igual ou maior que 3)");
				partidas = leitor.nextInt();
				System.out.println("");

				if (partidas % 2 == 0 || partidas < 3) {

					System.out.println("Escolha um número de partidas que seja ímpar e maior ou igual a 3");
				} else {
					contadorDePartidas2++;
				}

				partidas2 = partidas;

			}

			while (partidasjogadas < partidas) {

				System.out.println("Partida:" + contadorDePartidas1);
				System.out.println("");
				System.out.println("1 - pedra");
				System.out.println("2 - papel");
				System.out.println("3 - tesoura");
				System.out.println("");
				System.out.print("digite sua escolha:");

				while (contador4 == 0) {

					jogador = leitor.nextInt();

					if (jogador == 1 || jogador == 2 || jogador == 3) {

						contador4++;

					} else {

						System.out.println("Digite 1, 2 ou 3!");

					}
				}

				Random com = new Random();
				computador = com.nextInt(3) + 1;

				if (computador == 1) {

					EscolhaEscritaComputador = " Pedra";

				} else if (computador == 2) {

					EscolhaEscritaComputador = " Papel";

				} else if (computador == 3) {

					EscolhaEscritaComputador = " Tesoura";

				} else {

					System.out.println("erro");

				}

				if (jogador == 1) {

					EscolhaEscritaJogador = " Pedra";

				} else if (jogador == 2) {

					EscolhaEscritaJogador = " Papel";

				} else if (jogador == 3) {

					EscolhaEscritaJogador = " Tesoura";

				}

				if (computador == 1 && jogador == 2 || computador == 2 && jogador == 3
						|| computador == 3 && jogador == 1) {

					System.out.println("");
					System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
					System.out.println("O computador escolheu" + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("******* YOU WIN ********");
					System.out.println("");
					placarJogador++;
					partidasjogadas++;
					contadorDePartidas1++;
					System.out.println("Jogador = " + placarJogador);
					System.out.println("Computador = " + placarComputador);
					System.out.println("");

				} else if (computador == jogador) {

					System.out.println("");
					System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
					System.out.println("O computador escolheu" + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("******** Empate ********");
					partidas2 = partidas2 - 1;
					System.out.println("");
					partidasjogadas++;
					contadorDePartidas1++;
					System.out.println("Jogador = " + placarJogador);
					System.out.println("Computador = " + placarComputador);
					System.out.println("");

				} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
						|| jogador == 3 && computador == 1) {

					System.out.println("");
					System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
					System.out.println("O computador escolheu" + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("****** GAME OVER *******");
					System.out.println("");
					partidasjogadas++;
					contadorDePartidas1++;
					placarComputador++;
					System.out.println("Jogador = " + placarJogador);
					System.out.println("Computador = " + placarComputador);
					System.out.println("");

				} else {

					System.out.println("Insira um valor valido!");

				}
				if (placarJogador > partidas2 / 2) {
					partidasjogadas = partidas;
					System.out.println("O jogador venceu pois não é mais possivel que o computador o alcance!!");
					System.out.println("PLACAR FINAL");
					System.out.println("Jogador = " + placarJogador);
					System.out.println("Computador = " + placarComputador);
				} else if (placarComputador > partidas2 / 2) {
					partidasjogadas = partidas;
					System.out.println("O Computador venceu pois não é mais possivel que o jogador o alcance!!");
					System.out.println("PLACAR FINAL");
					System.out.println("Jogador = " + placarJogador);
					System.out.println("Computador = " + placarComputador);
				} else {

				}

				if (partidas == partidasjogadas && placarJogador == placarComputador) {

					while (contador3 == 0) {

						System.out.println(
								"ESTAMOS NA ULTIMA DAS BATALHAS, TODOS OS JOGOS ANTERIORES RESULTARAM EM UM GRANDE EMPATE!!");
						System.out.println("JOJADOR ESCOLHA SUA ARMA FINAL!!!!!!");
						System.out.println("1 - pedra");
						System.out.println("2 - papel");
						System.out.println("3 - tesoura");
						System.out.println("");
						System.out.print("digite sua escolha:");
						jogador = leitor.nextInt();
						contador4 = 0;
						while (contador4 == 0) {

							if (jogador == 1 || jogador == 2 || jogador == 3) {

								contador4++;

							} else {

								System.out.println("Digite 1, 2 ou 3!");

							}
						}
						System.out.println("");

						computador = com.nextInt(3) + 1;

						if (computador == 1) {

							EscolhaEscritaComputador = " Pedra";

						} else if (computador == 2) {

							EscolhaEscritaComputador = " Papel";

						} else if (computador == 3) {

							EscolhaEscritaComputador = " Tesoura";

						} else {

							System.out.println("erro!");

						}

						if (jogador == 1) {

							EscolhaEscritaJogador = " Pedra";

						} else if (jogador == 2) {

							EscolhaEscritaJogador = " Papel";

						} else if (jogador == 3) {

							EscolhaEscritaJogador = " Tesoura";

						}

						if (computador == 1 && jogador == 2 || computador == 2 && jogador == 3
								|| computador == 3 && jogador == 1) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("O JOGADOR É O GRANEDE VENCEDOR!!!!!");
							placarJogador++;
							partidasjogadas++;
							contadorDePartidas1++;
							contador3++;
							System.out.println("Jogador = " + placarJogador);
							System.out.println("Computador = " + placarComputador);

						} else if (computador == jogador) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("******** Empate ********");
							System.out.println("Jogador = " + placarJogador);
							System.out.println("Computador = " + placarComputador);

						} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
								|| jogador == 3 && computador == 1) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("****** GAME OVER *******");
							System.out.println("");
							partidasjogadas++;
							contadorDePartidas1++;
							placarComputador++;
							contador3++;
							System.out.println("Jogador = " + placarJogador);
							System.out.println("Computador = " + placarComputador);

						}

					}

				} else {

				}

			}

			resetarjogo2 = 0;

			while (resetarjogo2 == 0) {
				System.out.println("Você deseja jogar novamente?(S/N)");
				jogarnovamente = leitor.next();

				if (jogarnovamente.equals("S") || jogarnovamente.equals("s")) {

					System.out.println("Novo jogo no caprixo pro ce!");
					System.out.println("");
					resetarjogo2++;
					contadorDePartidas2 = 0;
					partidasjogadas = 0;
					placarJogador = 0;
					placarComputador = 0;
					partidas2 = 0;
					partidas = 0;
					jogador = 0;
					contadorDePartidas1 = 0;
					contador4 = 0;
					contador3 = 0;
					computador = 0;

				} else if (jogarnovamente.equals("N") || jogarnovamente.equals("n")) {

					resetarjogo++;
					resetarjogo2++;
					System.out.println("Obrigado por jogar :)");

				} else {

					System.out.println("Insira S ou N!");

				}
			}
		}
		leitor.close();
	}
}