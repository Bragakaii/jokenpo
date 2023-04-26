package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
		int escolha;
		int escolhaDoPc;
		escolhaDoPc = gerador.nextInt(4) + 1;
		
		System.out.println("-------------------------------------");
		System.out.println("               JOKENPO               ");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("REGRAS DO JOGO:                      ");
		System.out.println("°1- Pedra     2- Papel     3- Tesoura");
		System.out.println("° Escolha somente números entre 1 e 3");
		System.out.println("-------------------------------------");
		System.out.println("              BOA SORTE              ");
		System.out.println("-------------------------------------");
		System.out.print("Escolha um número: ");
		escolha = teclado.nextInt();
		
		System.out.println("Sua escolha " + escolha + ", Escolha do Computador " + escolhaDoPc);
		
		if ((escolha == 1 && escolhaDoPc == 2) || (escolha == 2 && escolhaDoPc == 3) || (escolha == 3 && escolhaDoPc == 1)) {
			
			System.out.println("VOCÊ PERDEU!! :(");
			
		} else if ((escolha == 2 && escolhaDoPc == 1) || (escolha == 3 && escolhaDoPc == 2) || (escolha == 1 && escolhaDoPc == 3)) {
			
			System.out.println("VOCÊ GANHOU!! :)");
			
		} else {
			
			System.out.println("QUE PENA, EMPATOU :((");
			
		}
		
 
	}

}
