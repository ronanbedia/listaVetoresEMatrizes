package aula_03_09_2021;

import java.util.Scanner;

public class ExemploMatriz2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] pontos = new int[5];
		int maiorPonto = 0;
		
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite a " + (i + 1) + "ª pontuação.");
			pontos[i] = leia.nextInt();
			
			if (pontos[i] > maiorPonto) {
				maiorPonto = pontos[i];
				
			}
			
		}
		System.out.println("O maior ponto é " + maiorPonto);
	}

}
