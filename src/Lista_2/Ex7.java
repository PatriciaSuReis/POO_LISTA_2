package Lista_2;

import java.util.Scanner;

public class Ex7 {

	/*7. Implemente um programa que leia um valor para uma 
	 * variável N de 1 a 10 e calcule a tabuada de N. Mostre 
	 * a tabuada na forma: 
	 * 0 ∗ N = 0, 1 ∗ N = 1N, 2 ∗ N = 2N, · · · , 10 ∗ N =	10N.
	 */
	
	private int numero;
	
	public void receberValor() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("          TABUADA          ");
		System.out.print("\nDigite um numero entre 1 e 10. \nNumero: ");
		int num = leia.nextInt();
		
		if (num >= 1 && num <= 10) {
			numero = num;
		} else {
			System.out.println("Apenas valor entre 1 e 10. :(");
		}
		System.out.println();
		
	}// fim metodo
	
	public void tabuadaN() {
		
		int resultado;
		
		for (int i = 0; i <= 10; i++) {
			
			resultado = i * numero;
			System.out.printf("%d x %d = %d\n", numero, i, resultado);
		
		}// fim for
		
	}// fim metodo
}







