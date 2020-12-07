import java.util.Random;
import java.util.Scanner;

public class Jogo2 {
	
	public static void main(String[] args) {
		
	Random gerador = new Random();	
	Scanner scan = new Scanner(System.in);
	
		
	int escolha_jogador;
	int escolha_computador;
	
		System.out.println("Olá, qual é o seu nome? ");
		String nome = scan.nextLine();
		System.out.println("Prazer em conhece-lo, " + nome);
		System.out.println(nome + " Você gostaria de jogar comigo? (escolha um número)");
		System.out.println("1-> SIM");
		System.out.println("2-> NÃO");
		int opcao = scan.nextInt();
	
			if (opcao == 2) {
				System.out.println("Que pena!! Até a próxima!");
			}else if(opcao == 1 ) {
				System.out.println("Que legal! Vou te ensinar como vai ser o jogo!");
				System.out.println("Eu vou escolher um número aleatóriamente de 0 a 10 "
						+ "e você vai tentar adivinhar até acertar.");
						
				escolha_computador = gerador.nextInt(11);
				
				System.out.println("Pronto, já escolhi. Tente adivinhar.");
				
				do {
					escolha_jogador = scan.nextInt();
					if(escolha_jogador != escolha_computador) {
						System.out.println("Você errou, tente novamente!");
					} else {
						System.out.println("PARABÉNS, VOCÊ ACERTOU!!!");
					} 
					
				 }while (escolha_jogador != escolha_computador);
				
			}
				
	}
	
}
