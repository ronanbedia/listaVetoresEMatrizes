package aula_03_09_2021;

import java.util.Scanner;

public class Ex4_03_09_2021 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];

		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		int l, c;

		for(l = 0; l <= 3; l++) {
			for(c= 0; c <= 5; c++) {

				System.out.println("Digite os valores de N1: ");
				N1[l][c] = leia.nextInt();

				System.out.println("Digite os valores de N2: ");
				N2[l][c] = leia.nextInt();

				M1[l][c] = N1[l][c] + N2[l][c];
				M1[l][c] = N1[l][c] - N2[l][c];
					
			}
		}

		for (l = 0; l <= 3; l++) {
			for(c= 0; c <= 5; c++) {

				System.out.println("\nMatriz M1: " + M1[l][c]);
				System.out.println("\nMatriz M2: " + M2[l][c]);
		
			}

		}
	}
}
