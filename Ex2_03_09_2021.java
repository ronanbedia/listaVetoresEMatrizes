package vetoreseEMatrizes;

import java.util.Scanner;

public class Ex2_03_09_2021 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int lances[] = new int[5], maior = 0, qt = 0;
		
		double media = 0;
		
		System.out.println("Role o dado");
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "ª jogada: ");
			lances[i] = leia.nextInt();
			
			media += lances[i];
			
			if (lances[i] > maior) {
				maior = lances[i];
				qt = 0;
			}
			else if(lances[i] == maior) {
				qt++;
			}
		}
		leia.close();
		System.out.println("O maior número foi " + maior + " e foi lançado " + qt + "vezes. "
							+ "A media foi " + media/5);
	}

}
