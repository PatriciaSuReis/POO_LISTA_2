package Lista_2;

import java.util.Scanner;

public class Ex4 {
	/*4. Implemente um programa que leia uma quantidade desconhecida 
	 * de números e conte quantos deles estão nos seguintes intervalos: 
	 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve 
	 * terminar quando for lido um número negativo.*/
	
	protected int valorRecebido;

	protected int intervalo1 = 0; // [0-25]
	protected int intervalo2 = 0; // [26-50]
	protected int intervalo3 = 0; // [51-75]
	protected int intervalo4 = 0; // [76-100]
	protected int intervaloMaior = 0; 
	
	public void intervalos() {
		Scanner input = new Scanner(System.in);
	
        do {
        	System.out.println("Digite um numero ou um numero negativo "
        			+ "\npara sair.");
        	valorRecebido = input.nextInt();
        	 
        	 if (valorRecebido >= 0 && valorRecebido <= 25) {
                 intervalo1++;
             } else if (valorRecebido >= 26 && valorRecebido <= 50) {
                 intervalo2++;
             } else if (valorRecebido >= 51 && valorRecebido <= 75) {
                 intervalo3++;
             } else if (valorRecebido >= 76 && valorRecebido <= 100) {
                 intervalo4++;
             }else if (valorRecebido > 100) {
            	 intervaloMaior++;
             }
        	 
         } while (valorRecebido >= 0);
        
        System.out.println("\nQuantidade de números nos intervalos:");
        System.out.printf("[0-25]: %d%n", intervalo1);
        System.out.printf("[26-50]: %d%n", intervalo2);
        System.out.printf("[51-75]: %d%n", intervalo3);
        System.out.printf("[76-100]: %d%n", intervalo4);
        System.out.printf("Maiores: %d%n", intervaloMaior);
	}// FIM METODO
	
}//FIM CLASSE




















