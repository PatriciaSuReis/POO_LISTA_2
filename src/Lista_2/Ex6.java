package Lista_2;

public class Ex6 {

	/* 6. Implemente um programa que gera e escreve os números 
	 * ímpares entre 100 e 200.
	 */
	
	public void impares100e200() {
		
		System.out.println("Numeros impares entre 100 e 200.");
		
		for (int i = 100; i < 200; i++) {
			
			if(i % 2 == 1) {
				System.out.println(i);
			}// fim if
			
		}// fim for
		
	}// fim metodo
	
}// fim classe
