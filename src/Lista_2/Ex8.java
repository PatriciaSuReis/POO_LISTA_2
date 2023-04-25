package Lista_2;

import java.util.Scanner;

public class Ex8 {

	/*8. Implemente um programa que leia um valor inicial A e 
	 * imprima a sequência de valores do cálculo de A! e o seu 
	 * resultado. Ex: 5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1 =120
	 */
	
	private int numero;
	
	public void valorRecebido() {
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um valor inteiro:");
		num = leia.nextInt();

		if (num >= 0) {
			numero = num;
		} else {
			System.out.println("A valor tem que ser positivo.");
		}

	}// fim metodo
	
	public void sequenciaEFatorial() {
	
		int fatorial = 1;
		
		System.out.println();
	    System.out.print(numero + "! = ");
	    
	    for (int i = numero; i >= 1; i--) {
	        fatorial *= i;
	        System.out.print(i);
	        if (i > 1) {
	            System.out.print(" * ");
	        }
	    }
	    
	    System.out.println(" = " + fatorial);
    
	}// fim metodo
	
}// fim class







