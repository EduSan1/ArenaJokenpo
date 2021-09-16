package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jogador = 0, computador, placarJogador = 0, placarComputador = 0;
		int partidasJogadas = 0, contadorDePartidasPlacar = 0, contadorDeQuantasPartidas = 0,
				ContadorEscolhaDoJogador = 0, contador3 = 0, partidas2 = 0, VitoriasNecessarias = 0;
		int partidas = 0, resetarjogo = 0, resetarjogo2 = 0, contadorJogo = 0, contadorContinuarPartida = 0;
		String EscolhaEscritaComputador = " ", EscolhaEscritaJogador = " ", jogarnovamente = " ", continuar = " ";

		Scanner leitor = new Scanner(System.in);
		System.out.println("");
		System.out.println("******** JOKENPO ********");
		System.out.println("");
		System.out.println("Após muito andar, você finalmente chega na lendária arena de batalha...");
		System.out.println("Você anda até a recepção e ve um homem grande, com um grande bigode e muito musculoso, ele se vira até você e grita:");
		System.out.println("- OLÁ JOVEM, EU SOU O GRANDE NARRADOR DA ARENA!");
		System.out.println("Essa grande figura te olha de cima a baixo, com um olhar decepicionado, e então ele grita novamente:");

		// COMEÇANDO O JOGO

		while (resetarjogo == 0) {

			// DECIDINDO QUANTOS JOGOS SERÃO JOGADOS

			while (contadorDeQuantasPartidas == 0) {
				
				

				System.out.println("- QUANTAS LUTAS ALGUÉM TÃO FRAQUINHO QUANTO VOCÊ ACHA QUE TEM CORAGEM DE ENFRENTAR NA ARENA!?");
				partidas = leitor.nextInt();
				System.out.println("");

				if (partidas % 2 == 0 || partidas < 3) {

					System.out.println(
							"ESCOLHA UM NÚMERO DE PARTIDAS QUE DE GRAÇA DE JOGAR!! ALGO QUE N TENHA COMO DAR EMPATE E QUE DE TEMPO PRA GENTE SE DIVERTIR VENDO!!");
				} else {
					contadorDeQuantasPartidas++;
				}

				// MOSTRA QUANTAS PARTIDAS SÃO NECESSÁRIAS PARA A VITORIA
				System.out.println("- INFELIZMENTE VOCÊ DEU AZAR DESAFIANTE, IRÁ TER QUE LUTAR CONTRA O GRANDE JORGINHO, O CAMPEÃO DA ARENA");
				VitoriasNecessarias = partidas / 2 + 1;
				System.out.println("- PARA VENCER A GUERRA VOCÊ PRECISA GANHAR " + VitoriasNecessarias
						+ " LUTAS! ");
				System.out.println("-EU SEI QUE VC N É CAPAZ, MAS BOA SORTE MOSTRE PRA ELE QUEM É QUE MANDA!!");
				partidas2 = partidas;

			}

			// MOSTRANDO A PARTIDA

			System.out.println("Você entra na arena e ve uma figura alta, meio musculosa, com um longo cabelo preto e preso, além disso ele porta uma cápsula de armas muito mais bonita que a sua.");
			while (contadorJogo == 0) {

				contadorDePartidasPlacar = contadorDePartidasPlacar + 1;
				System.out.println("_______________________________________________________________________________________________________");
				System.out.println("- SENHORAS E SENHORES!! NOS ESTAMOS NA LUTA DE NÚMERO " + contadorDePartidasPlacar +" ENTRE O MERO DESAFIANTE, CONTRA O INCRÍVEL JORGINHO, O GRANDE CAMPEÃO!!");
				System.out.println("");
				System.out.println("1 - A GRANDE PEDRA");
				System.out.println("2 - O RÁPIDO PAPEL");
				System.out.println("3 - A PERFURANTE TESOURA");
				System.out.println("");
				System.out.print("- ESCOLHAM SUAS ARMAS!!");
				

				// LENDO A ESCOLHA DO JOGADOR

				ContadorEscolhaDoJogador = 0;
				while (ContadorEscolhaDoJogador == 0) {

					jogador = leitor.nextInt();

					if (jogador == 1 || jogador == 2 || jogador == 3) {

						ContadorEscolhaDoJogador++;

					} else {

						System.out.println("- ESCOLHA A ARMA 1, 2 OU A 3!");

					}
				}

				// ESCOLHA DO COMPUTADOR

				Random com = new Random();
				computador = com.nextInt(3) + 1;

				// TRANFORMANDO O NÚMERO EM PALAVRA

				if (computador == 1) {

					EscolhaEscritaComputador = " A GRANDE PEDRA";

				} else if (computador == 2) {

					EscolhaEscritaComputador = " O RÁPIDO PAPEL";

				} else if (computador == 3) {

					EscolhaEscritaComputador = " A PERFURANTE TESOURA";

				} else {

					System.out.println("erro");

				}

				if (jogador == 1) {

					EscolhaEscritaJogador = " A GRANDE PEDRA";

				} else if (jogador == 2) {

					EscolhaEscritaJogador = " O RÁPIDO PAPEL";

				} else if (jogador == 3) {

					EscolhaEscritaJogador = " A PERFURANTE TESOURA";

				}

				System.out.println("- OLHA SÓ PARECE QUE FINALMENTE NOSSA LUTA CHEGOU AO SEU FIM");

				// RESULTADO DA LUTA

				if (computador == 1 && jogador == 2 || computador == 2 && jogador == 3
						|| computador == 3 && jogador == 1) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCRíVEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("ÍMPOSSIVEL, JORGINHO PERDEU ESTÁ LUTA");
					System.out.println("");
					placarJogador++;
					partidasJogadas++;
					System.out.println("VITÓRIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO INCRÍVEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else if (computador == jogador) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCRíVEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("QUE EMBATE INCRíVEL, AMBOS OS LUTADORES DERAM SEU MÁXIMO MAS N CONSEGUIRAM DERROTAR SEU INIMIGO!!");
					System.out.println("");
					System.out.println("VITÓRIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO INCRÍVEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
						|| jogador == 3 && computador == 1) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCRíVEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println("O INCRÍVEL JORGINHO OBVIAMENTE É O VENCEDOR DESTA LUTA!!");
					System.out.println("");
					partidasJogadas++;
					placarComputador++;
					System.out.println("VITÓRIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO INCRÍVEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else {

					System.out.println("Insira um valor valido!");

					// DETERMINAÇÃO DE QUEM VENCE A LUTA POR VANTAGEM

				}
				if (placarJogador > partidas2 / 2) {
					partidasJogadas = partidas;
					System.out.println("-SENHARAS E SENHORES COMO É IMPOSSIVEL QUE O JORGINHO VENCE ESTÁ GUERRA, O VENCEDOR É O DESAFI... INCRÍVEL DESAFIANTE!!");
					System.out.println("PLACAR FINAL");
					System.out.println("VITÓRIAS DO INCRÍVEL DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO JORGINHO = " + placarComputador);
				} else if (placarComputador > partidas2 / 2) {
					partidasJogadas = partidas;
					System.out.println("COMO ERA DE SE ESPERAR O INCRÍVEL JORGINHO AMASSOU NOSSO DESAFIANTE, DE FORMA QUE ELE N TEM MAIS CHANCES DE VITORIA!!");
					System.out.println("PLACAR FINAL");
					System.out.println("VITÓRIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO INCRÍVEL JORGINHO = " + placarComputador);
				} else {

				}

				// TRETA DE OURO, UM GRANDE EMBATE NA ARENA QUE DETERMINARÁ DE UMA VEZ POR TODAS
				// QUEM IRA SER O VENCEDOR

				if (partidas == partidasJogadas && placarJogador == placarComputador) {

					while (contador3 == 0) {

						System.out.println(
								"ESTAMOS NA ULTIMA DAS LUTA, TODOS OS EMBATES ANTERIORES RESULTARAM EM UM GRANDE EMPATE ENTRE O INCRÍVEL JORGINHO E O DESAFIANTE, AGORA É TUDO OU NADA!!");
						System.out.println("");
						System.out.println("1 - A GRANDE PEDRA");
						System.out.println("2 - O RÁPIDO PAPEL");
						System.out.println("3 - A PERFURANTE TESOURA");
						System.out.println("");
						System.out.print(" ESCOLHAM SUAS ARMAS PARA O EMBATE FINAL!!!!!!");
						jogador = leitor.nextInt();
						ContadorEscolhaDoJogador = 0;
						while (ContadorEscolhaDoJogador == 0) {

							if (jogador == 1 || jogador == 2 || jogador == 3) {

								ContadorEscolhaDoJogador++;

							} else {

								System.out.println("Digite 1, 2 ou 3!");

							}
						}
						System.out.println("");

						computador = com.nextInt(3) + 1;

						if (computador == 1) {

							EscolhaEscritaComputador = " A GRANDE PEDRA";

						} else if (computador == 2) {

							EscolhaEscritaComputador = " O RÁPIDO PAPEL";

						} else if (computador == 3) {

							EscolhaEscritaComputador = " Tesoura";

						} else {

							System.out.println("erro");

						}

						if (jogador == 1) {

							EscolhaEscritaJogador = " A GRANDE PEDRA";

						} else if (jogador == 2) {

							EscolhaEscritaJogador = " O RÁPIDO PAPEL";

						} else if (jogador == 3) {

							EscolhaEscritaJogador = " A PERFURANTE TESOURA";

						}

						if (computador == 1 && jogador == 2 || computador == 2 && jogador == 3
								|| computador == 3 && jogador == 1) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("NÃO ACREDITO! O DESAFI... O INCRÍVEL DEAFIANTE É O GRANDE VENCEDOR");
							placarJogador++;
							partidasJogadas++;
							contador3++;
							System.out.println("VITÓRIAS DO INCRÍVEL DESAFIANTE = " + placarJogador);
							System.out.println("VITÓRIAS DO JORGINHO = " + placarComputador);
							System.out.println();
							System.out.println("Você ve Jorginho andando em sua direção com um olhar confiante mas, ao mesmo tempo triste!");
							System.out.println("-DESAFIANTE! Essa foi uma das melhores lutas que eu já tive, vamos lutar novamente!!");

						} else if (computador == jogador) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("MAS QUE ESPETACULO SENHORAS E SENHORES! A LUTA ACABOU MAS NENHUM DOS LUTADORES CAIU!!");
							System.out.println("Jogador = " + placarJogador);
							System.out.println("Computador = " + placarComputador);

						} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
								|| jogador == 3 && computador == 1) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println("O INCRÍVEL JORGINHO OBVIAMENTE É O GRANDE VENCEDOR!!");
							System.out.println("");
							partidasJogadas++;
							placarComputador++;
							contador3++;
							System.out.println("VITÓRIAS DO DESAFIANTE = " + placarJogador);
							System.out.println("VITÓRIAS DO INCRÍVEL JORGINHO = " + placarComputador);
							System.out.println("");

						}

					}

				} else {

				}

				// CONFIRMAÇÃO DO USUARIO PARA IR PARA A PROXIMA PARTIDA

				contadorContinuarPartida = 0;
				while (contadorContinuarPartida == 0) {
					if (partidas <= partidasJogadas) {

					} else {
						System.out.print("VOCÊS ESTAM PRONTOS PARA MAIS UMA LUTADORES?(s/n)");
						continuar = leitor.next();
						if (continuar.equals("S") || continuar.equals("s")) {

							System.out.println("");
							
							contadorContinuarPartida++;

						} else if (continuar.equals("N") || continuar.equals("n")) {

							resetarjogo++;
							contadorJogo++;
							contadorContinuarPartida++;

						} else {
							System.out.println("Insira S ou N para continuar.");
						}

					}

					if (partidasJogadas < partidas) {

					} else {

						contadorJogo++;
						contadorContinuarPartida++;

					}
				}

				// FIM DAS LUTAS

			}

			// DESEJA ENTRAR NA ARENA NOVAMENTE
			if (placarJogador>placarComputador) {
			System.out.println("Você ve Jorginho andando em sua direção com um olhar confiante mas, ao mesmo tempo triste!");
			System.out.println("-DESAFIANTE! Essa foi uma das melhores lutas que eu já tive, vamos lutar novamente!!");
			} else if (placarComputador>placarJogador) {
				
				System.out.println("Você ve Jorginho andando em sua direção com um olhar confiante te olhando de cima!!");
				System.out.println("-DESAFIANTE! Essa foi uma das melhores lutas que eu já tive, o resultado foi obivo, mas mesmo assim... VAMOS LUTAR NOVAMENTE!!");
				
			}

			resetarjogo2 = 0;
			while (resetarjogo2 == 0) {
				System.out.println("TENS FORÇAS PARA MAIS UMA LUTA?(s/n)");
				jogarnovamente = leitor.next();

				if (jogarnovamente.equals("S") || jogarnovamente.equals("s")) {
					
					System.out.println("Você ve a figura do narrador vindo em sua direção, e novamente ele grita ao invez de só falar:");
					System.out.println("VOCÊ TEM CORAGEM NÉ, ESPERO QUE NÃO MORRA DESSA VEZ DESAFIANTE!!");
					System.out.println("");
					resetarjogo2++;
					contadorDeQuantasPartidas = 0;
					partidasJogadas = 0;
					placarJogador = 0;
					placarComputador = 0;
					partidas2 = 0;
					partidas = 0;
					jogador = 0;
					contadorDePartidasPlacar = 0;
					ContadorEscolhaDoJogador = 0;
					contador3 = 0;
					computador = 0;
					contadorJogo = 0;
					contadorContinuarPartida = 0;
					resetarjogo = 0;

				} else if (jogarnovamente.equals("N") || jogarnovamente.equals("n")) {

					resetarjogo++;
					resetarjogo2++;
					System.out.println("-Okay então, outro dia realizaremos mais uma luta");

				} else {

					System.out.println("INSIRA S OU N!");

				}
				resetarjogo2 = 1;
			}
		}
		leitor.close();
	}
}
