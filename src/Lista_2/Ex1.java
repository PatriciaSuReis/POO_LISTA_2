package Lista_2;

public class Ex1 {
	/*1. Desenvolver um algoritmo que efetue a soma de todos os 
	 * números ímpares que são múltiplos de três e que se encontram 
	 * no conjunto dos números de 1 até 500.
	 */
	
	public void somarImparesMultiplosTres() {
		int total = 0;
		
		for (int i = 1; i <= 500; i++) {
			if ((i % 2 == 1) &&  (i % 3 == 0)){
				total += i;
			}
		}
		
		System.out.println("A soma de todos os numeros impares,"
				+ "\nmutiplos de tres de 1 ate 500.");
		System.out.println("Resutado: " + total);
	}// FIM METODO
	
}// FIM CLASSE
