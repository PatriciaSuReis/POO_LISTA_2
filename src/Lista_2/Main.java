package Lista_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		do {
			int op;
			
			System.out.println("----------------------------------");
			System.out.println("Escolha de 1 a 8 ou 0 para sair:");
			System.out.print("Opcao: ");
			op = input.nextInt();
			System.out.println("----------------------------------");
			if(op == 0) {
				break;
			}
			
			switch (op) {
			case 1: 
				Ex1 ex1 = new Ex1();
				ex1.somarImparesMultiplosTres();
				break;
			case 2: 
				Ex2 ex2 = new Ex2();
				ex2.maiorOuMenorDoGrupo();
				break;
			case 3: 
				Ex3 ex3 = new Ex3();
				ex3.core();
				ex3.relatorio(10);
				break;
			case 4: 
				Ex4 ex4 = new Ex4();
				ex4.intervalos();
				break;
			case 5: 
				 Ex5 ex5 = new Ex5();
				 ex5.receberValor();
				 ex5.qtdParImpar(ex5.valorRecebido);
				 ex5.mediaParGeral(ex5.valorRecebido);
				 ex5.exibirResultados();
				break;
			case 6: 
				break;
			case 7: 
				break;
			case 8: 
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
			
			System.out.println("----------------------------------");
			System.out.println("Quer continuar: S(sim) ou N(nao)");
			input.nextLine();
			
		}while (input.nextLine().equalsIgnoreCase("s"));
		
		input.close();
	}

}
















