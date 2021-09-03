package aula_03_09_2021;

import java.util.Scanner;

public class Ex4_03_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			double[][] matriz = new double[3][3];
			double soma = 0.0, somaDiag;
			
			System.out.println("Insira os valores pra matriz: ");
			for (int l = 0; l < matriz.length; l++) {
				
				for (int c = 0; c < matriz[l].length; c++) {
					
					matriz[l][c] = leia.nextDouble();
					soma = soma + matriz[l][c];
					
				}
			}
			somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2];
			
			System.out.println("A soma dos valores é " + soma + ".");
			System.out.println("A soma da diagonal principal é " + somaDiag + ".");
			
			leia.close();
			
	}

}
