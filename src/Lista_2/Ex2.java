package Lista_2;

import java.util.Scanner;

public class Ex2 {

	/*2. Desenvolver um algoritmo que leia a altura de 15 pessoas. 
	 * Este programa deverá calcular e mostrar:
	 * • A menor altura do grupo; 
	 * • A maior altura do grupo.
*/
	
	public void maiorOuMenorDoGrupo() {
		Scanner input = new Scanner(System.in);

		double alturas[] = new double[15];
		
		System.out.println("Informe a altura de 15 pessoas.\n");
		
		// PERCORRER O ARRAY
		for (int i = 0; i < alturas.length; i++) {
            System.out.printf("Informe a altura da pessoa %d: ", i + 1);
            alturas[i] = input.nextDouble();
        }
		
		double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        
        // for each
        for (double altura : alturas) {
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }

        // SAIDA
        System.out.printf("\nA menor altura do grupo é %.2f metros.\n", menorAltura);
        System.out.printf("A maior altura do grupo é %.2f metros.\n", maiorAltura);
		
	}// FIM METODO
	
}// FIM CLASSE







		
		
		
		