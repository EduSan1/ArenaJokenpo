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
				"Ap�s muito andar, voc� finalmente chega na lend�ria ARENA JOKENPO, um local onde bravos guerreiros se enfrentam,");
		System.out.println("em busca de receber o titulo de O INCR�VEL!");
		System.out.println(
				"Voc� anda at� a recep��o e ve um homem grande, careca, com um grande bigode e muito musculoso l�, ele se vira at� voc� e grita:");
		System.out.println(" ");
		System.out.println("- OL� JOVEM, EU SOU O GRANDE NARRADOR DA ARENA!");
		System.out.println(" ");
		System.out.println(
				"Essa grande figura te olha de cima a baixo, com um olhar decepicionado, e ent�o ele grita novamente:");
		System.out.println(" ");

		// COME�ANDO O JOGO

		while (resetarjogo == 0) {

			// DECIDINDO QUANTOS JOGOS SER�O JOGADOS

			while (contadorDeQuantasPartidas == 0) {

				if (contadorHistoria2 == 0) {

					System.out.print(
							"- QUANTAS LUTAS ALGU�M T�O FRAQUINHO QUANTO VOC� ACHA QUE TEM CORAGEM DE ENFRENTAR NA ARENA!?");
					partidas = leitor.nextInt();
					System.out.println("");

				} else if (contadorHistoria2 > 0) {

					System.out.print("QUANTAS PARTIDAS VAI QUERER DESSA VEZ DESAFIANTE?");
					partidas = leitor.nextInt();
					System.out.println("");
				}

				if (partidas % 2 == 0 || partidas < 3) {

					System.out.println(
							"-ESCOLHA UM N�MERO DE PARTIDAS QUE DE GRA�A DE JOGAR!! ALGO QUE N TENHA COMO DAR EMPATE E QUE DE TEMPO PRA GENTE SE DIVERTIR VENDO!!");
					System.out.println(" ");
				} else {
					contadorDeQuantasPartidas++;
				}

				if (contadorHistoria2 > 0) {

					System.out.println(
							"Ap�s dizer isso ele da meia volta em dire��o ao seu lugar, dando altas gargalhadas.");

				} else {

					System.out.println(
							"- INFELIZMENTE VOC� DEU AZAR DESAFIANTE, IR� TER QUE LUTAR CONTRA O INCR�VEL JORGINHO, O CAMPE�O DA ARENA");

				}

				// MOSTRA QUANTAS PARTIDAS S�O NECESS�RIAS PARA A VITORIA

				System.out.println(" ");
				VitoriasNecessarias = partidas / 2 + 1;
				System.out.println("- PARA VENCER A GUERRA VOC� PRECISA GANHAR " + VitoriasNecessarias + " LUTAS! ");
				System.out.println("");
				if (contadorHistoria2 == 0) {

					System.out.println("- EU SEI QUE VC N � CAPAZ, MAS BOA SORTE MOSTRE PRA ELE QUEM � QUE MANDA!!");

				}else {
					
					System.out.println("- COMO VOC� J� TEM EXPERIENCIA TALVEZ GANHE DESSA VEZ.");
					
				}
				System.out.println(" ");
				partidas2 = partidas;

			}

			// MOSTRANDO A PARTIDA
			if (contadorHistoria2 == 0) {
			System.out.println(
					"Voc� entra na arena e ve uma figura alta, meio musculosa, com um longo cabelo preto e preso, al�m disso ele porta uma c�psula de armas muito mais bonita que a sua.");
			System.out.println("Ele te olha com um olha tedioso, como se j� solbesse o resultado que est� por vir");
			System.out.println("");
			}else {
				System.out.println("Voc� ve novamente Jorginho que dessa vez est� com um olhar empolgado em sua dire��o!");
				System.out.println("");
			}
			while (contadorJogo == 0) {

				contadorDePartidasPlacar = contadorDePartidasPlacar + 1;
				System.out.println(
						"_______________________________________________________________________________________________________");
				System.out.println("- SENHORAS E SENHORES!! NOS ESTAMOS NA LUTA DE N�MERO " + contadorDePartidasPlacar
						+ " ENTRE O MERO DESAFIANTE, CONTRA O INCR�VEL JORGINHO, O GRANDE CAMPE�O!!");
				System.out.println("");
				System.out.println("1 - A GRANDE PEDRA");
				System.out.println("2 - O R�PIDO PAPEL");
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

				// TRANFORMANDO O N�MERO EM PALAVRA

				if (computador == 1) {

					EscolhaEscritaComputador = " A GRANDE PEDRA";

				} else if (computador == 2) {

					EscolhaEscritaComputador = " O R�PIDO PAPEL";

				} else if (computador == 3) {

					EscolhaEscritaComputador = " A PERFURANTE TESOURA";

				} else {

					System.out.println("erro");

				}

				if (jogador == 1) {

					EscolhaEscritaJogador = " A GRANDE PEDRA";

				} else if (jogador == 2) {

					EscolhaEscritaJogador = " O R�PIDO PAPEL";

				} else if (jogador == 3) {

					EscolhaEscritaJogador = " A PERFURANTE TESOURA";

				}

				System.out.println("- OLHA S� PARECE QUE FINALMENTE NOSSA LUTA CHEGOU AO SEU FIM");

				// RESULTADO DA LUTA

				if (computador == 1 && jogador == 2 || computador == 2 && jogador == 3
						|| computador == 3 && jogador == 1) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCR�VEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("�MPOSSIVEL, JORGINHO PERDEU EST� LUTA");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("");
					placarJogador++;
					partidasJogadas++;
					System.out.println("VIT�RIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VIT�RIAS DO INCR�VEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else if (computador == jogador) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCR�VEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println(
							"QUE EMBATE INCR�VEL, AMBOS OS LUTADORES DERAM SEU M�XIMO MAS N CONSEGUIRAM DERROTAR SEU INIMIGO!!");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("");
					System.out.println("VIT�RIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VIT�RIAS DO INCR�VEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else if (jogador == 1 && computador == 2 || jogador == 2 && computador == 3
						|| jogador == 3 && computador == 1) {

					System.out.println("");
					System.out.println("O DESAFIANTE UTILIZOU " + EscolhaEscritaJogador);
					System.out.println("O INCR�VEL JORGINHO UTILIZOU " + EscolhaEscritaComputador);
					System.out.println("");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("O INCR�VEL JORGINHO OBVIAMENTE � O VENCEDOR DESTA LUTA!!");
					System.out.println(
							"_______________________________________________________________________________________________________");
					System.out.println("");
					partidasJogadas++;
					placarComputador++;
					System.out.println("VIT�RIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VIT�RIAS DO INCR�VEL JORGINHO = " + placarComputador);
					System.out.println("");

				} else {

					System.out.println("Insira um valor valido!");

					// DETERMINA��O DE QUEM VENCE A LUTA POR VANTAGEM

				}
				if (placarJogador > partidas2 / 2) {
					partidasJogadas = partidas;
					System.out.println(
							"-SENHARAS E SENHORES COMO � IMPOSSIVEL QUE O JORGINHO VENCE EST� GUERRA, O VENCEDOR � O DESAFI... INCR�VEL DESAFIANTE!!");
					System.out.println("PLACAR FINAL");
					System.out.println("VIT�RIAS DO INCR�VEL DESAFIANTE = " + placarJogador);
					System.out.println("VIT�RIAS DO JORGINHO = " + placarComputador);
				} else if (placarComputador > partidas2 / 2) {
					partidasJogadas = partidas;
					System.out.println(
							"COMO ERA DE SE ESPERAR O INCR�VEL JORGINHO AMASSOU NOSSO DESAFIANTE, DE FORMA QUE ELE N TEM MAIS CHANCES DE VIT�RIA!!");
					System.out.println("PLACAR FINAL");
					System.out.println("VIT�RIAS DO DESAFIANTE = " + placarJogador);
					System.out.println("VIT�RIAS DO INCR�VEL JORGINHO = " + placarComputador);
				} else {

				}

				// TRETA DE OURO, UM GRANDE EMBATE NA ARENA QUE DETERMINAR� DE UMA VEZ POR TODAS
				// QUEM IRA SER O VENCEDOR

				if (partidas == partidasJogadas && placarJogador == placarComputador) {

					while (contador3 == 0) {

						System.out.println(
								"ESTAMOS NA ULTIMA DAS LUTAs, TODOS OS EMBATES ANTERIORES RESULTARAM EM UM GRANDE EMPATE ENTRE O INCR�VEL JORGINHO E O DESAFIANTE, AGORA � TUDO OU NADA!!");
						System.out.println("");
						System.out.println("1 - A GRANDE PEDRA");
						System.out.println("2 - O R�PIDO PAPEL");
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

							EscolhaEscritaComputador = " O R�PIDO PAPEL";

						} else if (computador == 3) {

							EscolhaEscritaComputador = " Tesoura";

						} else {

							System.out.println("erro");

						}

						if (jogador == 1) {

							EscolhaEscritaJogador = " A GRANDE PEDRA";

						} else if (jogador == 2) {

							EscolhaEscritaJogador = " O R�PIDO PAPEL";

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
							System.out.println("N�O ACREDITO! O DESAFI... O INCR�VEL DEAFIANTE � O GRANDE VENCEDOR");
							System.out.println(
									"_______________________________________________________________________________________________________");
							placarJogador++;
							partidasJogadas++;
							contador3++;
							System.out.println("VIT�RIAS DO INCR�VEL DESAFIANTE = " + placarJogador);
							System.out.println("VIT�RIAS DO JORGINHO = " + placarComputador);
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
							System.out.println("O INCR�VEL JORGINHO OBVIAMENTE � O GRANDE VENCEDOR!!");
							System.out.println(
									"_______________________________________________________________________________________________________");
							System.out.println("");
							partidasJogadas++;
							placarComputador++;
							contador3++;
							System.out.println("VIT�RIAS DO DESAFIANTE = " + placarJogador);
							System.out.println("VIT�RIAS DO INCR�VEL JORGINHO = " + placarComputador);
							System.out.println("");

						}

					}

				} else {

				}

				// CONFIRMA��O DO USUARIO PARA IR PARA A PROXIMA PARTIDA

				contadorContinuarPartida = 0;
				while (contadorContinuarPartida == 0) {
					if (partidas <= partidasJogadas) {

					} else {
						System.out.print("VOC�S ESTAM PRONTOS PARA MAIS UMA LUTADORES?(s/n)");
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
									"DESAFIANTE, SE VOC� N�O DISSER S OU N EU N�O VOU ENTENDER SE QUER CONTINUAR OU N�O, ENT�O SE DECIDA!!");
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
						"Voc� ve Jorginho andando em sua dire��o com um olhar confiante mas, ao mesmo tempo triste!");
				System.out.println(
						"-DESAFIANTE! Essa foi uma das melhores lutas que eu j� tive, vamos lutar novamente!!");
			} else if (placarComputador > placarJogador) {

				System.out
						.println("Voc� ve Jorginho andando em sua dire��o com um olhar confiante te olhando de cima!!");
				System.out.println(
						"-DESAFIANTE! O resultado foi obivo, mas mesmo assim eu me diverti com voc�, ent�o... VAMOS LUTAR NOVAMENTE!!");

			}

			resetarjogo2 = 0;
			while (resetarjogo2 == 0) {
				System.out.println(
						"Voc� ve a figura do narrador vindo em sua dire��o, e novamente ele grita ao invez de s� falar:");
				System.out.println("- TENS FOR�AS PARA MAIS UMA LUTA?(s/n)");
				jogarnovamente = leitor.next();

				if (jogarnovamente.equals("S") || jogarnovamente.equals("s")) {

					System.out.println("VOC� TEM CORAGEM N�, ESPERO QUE N�O MORRA DESSA VEZ DESAFIANTE!!");
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
					System.out.println("-BOM, ESPERAVA MAIS DE VOC�, MAS ENTENDO QUE TEM HORAS QUE DEVEMOS DESCANSAR!");

				} else {

					System.out.println("INSIRA S OU N!");

				}
				resetarjogo2 = 1;
			}
		}
		leitor.close();
	}
}
