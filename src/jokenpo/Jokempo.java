package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		int jogador = 0, computador, placarJogador = 0, placarComputador = 0, contadorHistoria2 = 0,
				partidasJogadas = 0, contadorDePartidasPlacar = 0, contadorDeQuantasPartidas = 0,
				ContadorEscolhaDoJogador = 0, contador3 = 0, partidas2 = 0, VitoriasNecessarias = 0, partidas = 0,
				resetarjogo = 0, resetarjogo2 = 0, contadorJogo = 0, contadorContinuarPartida = 0;
		String EscolhaEscritaComputador = " ", EscolhaEscritaJogador = " ", jogarnovamente = " ", continuar = " ";

		Scanner leitor = new Scanner(System.in);
		System.out.println("");
		System.out.println("******** ARENA JOKENPO ********");
		System.out.println("");
		System.out.println(
				"Após muito andar, você finalmente chega na lendária ARENA JOKENPO, um local onde bravos guerreiros se enfrentam,");
		System.out.println("em busca de receber o titulo de O INCRÍVEL!");
		System.out.println(
				"Você anda até a recepção e ve um homem grande, careca, com um grande bigode e muito musculoso lá, ele se vira até você e grita:");
		System.out.println(" ");
		System.out.println("- OLÁ JOVEM, EU SOU O GRANDE NARRADOR DA ARENA!");
		System.out.println(" ");
		System.out.println(
				"Essa grande figura te olha de cima a baixo, com um olhar decepicionado, e então ele grita novamente:");
		System.out.println(" ");

		// COMEÇANDO O JOGO

		while (resetarjogo == 0) {

			// DECIDINDO QUANTOS JOGOS SERÃO JOGADOS

			while (contadorDeQuantasPartidas == 0) {

				if (contadorHistoria2 == 0) {

					System.out.print(
							"- QUANTAS LUTAS ALGUÉM TÃO FRAQUINHO QUANTO VOCÊ ACHA QUE TEM CORAGEM DE ENFRENTAR NA ARENA!?");
					partidas = leitor.nextInt();
					System.out.println("");

				} else if (contadorHistoria2 > 0) {

					System.out.print("QUANTAS PARTIDAS VAI QUERER DESSA VEZ DESAFIANTE?");
					partidas = leitor.nextInt();
					System.out.println("");
				}

				if (partidas % 2 == 0 || partidas < 3) {

					System.out.println(
							"-ESCOLHA UM NÚMERO DE PARTIDAS QUE DE GRAÇA DE JOGAR!! ALGO QUE N TENHA COMO DAR EMPATE E QUE DE TEMPO PRA GENTE SE DIVERTIR VENDO!!");
					System.out.println(" ");
				} else {
					contadorDeQuantasPartidas++;
				}

				if (contadorHistoria2 > 0) {

					System.out.println(
							"Após dizer isso ele da meia volta em direção ao seu lugar, dando altas gargalhadas.");

				} else {

					System.out.println(
							"- INFELIZMENTE VOCÊ DEU AZAR DESAFIANTE, IRÁ TER QUE LUTAR CONTRA O INCRÍVEL JORGINHO, O CAMPEÃO DA ARENA");

				}

				// MOSTRA QUANTAS PARTIDAS SÃO NECESSÁRIAS PARA A VITORIA

				System.out.println(" ");
				VitoriasNecessarias = partidas / 2 + 1;
				System.out.println("- PARA VENCER A GUERRA VOCÊ PRECISA GANHAR " + VitoriasNecessarias + " LUTAS! ");
				System.out.println("");
				if (contadorHistoria2 == 0) {

					System.out.println("- EU SEI QUE VC N É CAPAZ, MAS BOA SORTE MOSTRE PRA ELE QUEM É QUE MANDA!!");

				}else {
					
					System.out.println("- COMO VOCÊ JÁ TEM EXPERIENCIA TALVEZ GANHE DESSA VEZ.");
					
				}
				System.out.println(" ");
				partidas2 = partidas;

			}

			// MOSTRANDO A PARTIDA
			if (contadorHistoria2 == 0) {
			System.out.println(
					"Você entra na arena e ve uma figura alta, meio musculosa, com um longo cabelo preto e preso, além disso ele porta uma cápsula de armas muito mais bonita que a sua.");
			System.out.println("Ele te olha com um olha tedioso, como se já solbesse o resultado que está por vir");
			System.out.println("");
			}else {
				System.out.println("Você ve novamente Jorginho que dessa vez está com um olhar empolgado em sua direção!");
				System.out.println("");
			}
			while (contadorJogo == 0) {

				contadorDePartidasPlacar = contadorDePartidasPlacar + 1;
				System.out.println(
						"_______________________________________________________________________________________________________");
				System.out.println("- SENHORAS E SENHORES!! NOS ESTAMOS NA LUTA DE NÚMERO " + contadorDePartidasPlacar
						+ " ENTRE O MERO DESAFIANTE, CONTRA O INCRÍVEL JORGINHO, O GRANDE CAMPEÃO!!");
				System.out.println("");
				System.out.println("1 - A GRANDE PEDRA");
				System.out.println("2 - O RÁPIDO PAPEL");
				System.out.println("3 - A PERFURANTE TESOURA");
				System.out.println("");
				System.out.print("- ESCOLHAM SUAS ARMAS!!");
				System.out.println(" ");

				// LENDO A ESCOLHA DO JOGADOR

				ContadorEscolhaDoJogador = 0;
				while (ContadorEscolhaDoJogador == 0) {

					jogador = leitor.nextInt();

					if (jogador == 1 || jogador == 2 || jogador == 3) {

						ContadorEscolhaDoJogador++;

					} else {

						System.out.println("- ESCOLHA A ARMA 1, 2 OU A 3!");
						System.out.println(" ");

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
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("ÍMPOSSIVEL, JORGINHO PERDEU ESTÁ LUTA");
					System.out.println(
							"_______________________________________________________________________________________________________");
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
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println(
							"QUE EMBATE INCRíVEL, AMBOS OS LUTADORES DERAM SEU MÁXIMO MAS N CONSEGUIRAM DERROTAR SEU INIMIGO!!");
					System.out.println(
							"_______________________________________________________________________________________________________");
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
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("O INCRÍVEL JORGINHO OBVIAMENTE É O VENCEDOR DESTA LUTA!!");
					System.out.println(
							"_______________________________________________________________________________________________________");
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
					System.out.println(
							"-SENHARAS E SENHORES COMO É IMPOSSIVEL QUE O JORGINHO VENCE ESTÁ GUERRA, O VENCEDOR É O DESAFI... INCRÍVEL DESAFIANTE!!");
					System.out.println("PLACAR FINAL");
					System.out.println("VITÓRIAS DO INCRÍVEL DESAFIANTE = " + placarJogador);
					System.out.println("VITÓRIAS DO JORGINHO = " + placarComputador);
				} else if (placarComputador > partidas2 / 2) {
					partidasJogadas = partidas;
					System.out.println(
							"COMO ERA DE SE ESPERAR O INCRÍVEL JORGINHO AMASSOU NOSSO DESAFIANTE, DE FORMA QUE ELE N TEM MAIS CHANCES DE VITÓRIA!!");
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
								"ESTAMOS NA ULTIMA DAS LUTAs, TODOS OS EMBATES ANTERIORES RESULTARAM EM UM GRANDE EMPATE ENTRE O INCRÍVEL JORGINHO E O DESAFIANTE, AGORA É TUDO OU NADA!!");
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
							System.out.println(
									"_______________________________________________________________________________________________________");
							System.out.println("NÃO ACREDITO! O DESAFI... O INCRÍVEL DEAFIANTE É O GRANDE VENCEDOR");
							System.out.println(
									"_______________________________________________________________________________________________________");
							placarJogador++;
							partidasJogadas++;
							contador3++;
							System.out.println("VITÓRIAS DO INCRÍVEL DESAFIANTE = " + placarJogador);
							System.out.println("VITÓRIAS DO JORGINHO = " + placarComputador);
							System.out.println();

						} else if (computador == jogador) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println(
									"_______________________________________________________________________________________________________");
							System.out.println(
									"MAS QUE ESPETACULO SENHORAS E SENHORES! A LUTA ACABOU MAS NENHUM DOS LUTADORES CAIU!!");
							System.out.println(
									"_______________________________________________________________________________________________________");
							System.out.println("Jogador = " + placarJogador);
							System.out.println("Computador = " + placarComputador);
							System.out.println(" ");

						} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
								|| jogador == 3 && computador == 1) {

							System.out.println("");
							System.out.println("O jogador escolheu" + EscolhaEscritaJogador);
							System.out.println("O computador escolheu" + EscolhaEscritaComputador);
							System.out.println("");
							System.out.println(
									"_______________________________________________________________________________________________________");
							System.out.println("O INCRÍVEL JORGINHO OBVIAMENTE É O GRANDE VENCEDOR!!");
							System.out.println(
									"_______________________________________________________________________________________________________");
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
							System.out.println(
									"DESAFIANTE, SE VOCÊ NÃO DISSER S OU N EU NÃO VOU ENTENDER SE QUER CONTINUAR OU NÃO, ENTÃO SE DECIDA!!");
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
			if (placarJogador > placarComputador) {
				System.out.println(
						"Você ve Jorginho andando em sua direção com um olhar confiante mas, ao mesmo tempo triste!");
				System.out.println(
						"-DESAFIANTE! Essa foi uma das melhores lutas que eu já tive, vamos lutar novamente!!");
			} else if (placarComputador > placarJogador) {

				System.out
						.println("Você ve Jorginho andando em sua direção com um olhar confiante te olhando de cima!!");
				System.out.println(
						"-DESAFIANTE! O resultado foi obivo, mas mesmo assim eu me diverti com você, então... VAMOS LUTAR NOVAMENTE!!");

			}

			resetarjogo2 = 0;
			while (resetarjogo2 == 0) {
				System.out.println(
						"Você ve a figura do narrador vindo em sua direção, e novamente ele grita ao invez de só falar:");
				System.out.println("- TENS FORÇAS PARA MAIS UMA LUTA?(s/n)");
				jogarnovamente = leitor.next();

				if (jogarnovamente.equals("S") || jogarnovamente.equals("s")) {

					System.out.println("VOCÊ TEM CORAGEM NÉ, ESPERO QUE NÃO MORRA DESSA VEZ DESAFIANTE!!");
					System.out.println("");
					resetarjogo2++;
					contadorHistoria2++;
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
					System.out.println("-BOM, ESPERAVA MAIS DE VOCÊ, MAS ENTENDO QUE TEM HORAS QUE DEVEMOS DESCANSAR!");

				} else {

					System.out.println("INSIRA S OU N!");

				}
				resetarjogo2 = 1;
			}
		}
		leitor.close();
	}
}
