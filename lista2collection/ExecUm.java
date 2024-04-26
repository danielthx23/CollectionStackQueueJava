package lista2collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExecUm {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int decisao = 0;

		do {
			System.out.println("************************************\n"
		+"\n1 - Adicionar Cliente na Fila" 
		+ "\n2 - Listar Todos os Clientes" 
		+ "\n3 - Retirar Cliente da Fila" 
		+ "\n0 - Sair"
		+ "\n\n************************************" 
		+ "\nEntre com a opção desejada:");
			
			decisao = leia.nextInt();
			
			switch(decisao) {
			case 1: 
				leia.nextLine();
				System.out.println("Insira o nome: ");
				nomes.add(leia.nextLine());
				System.out.println("Fila: " + "\n");
				for(String nome : nomes) {
					System.out.println(nome);
				}
				System.out.println("\n" + "Cliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: " + "\n");
				for(String nome : nomes) {
					System.out.println(nome);
				}
				break;
			case 3: 
				nomes.remove();
				System.out.println("Fila: " + "\n");
				for(String nome : nomes) {
					System.out.println(nome);
				}
				System.out.println("\n" + "O Cliente foi chamado!");
				break;
			case 0:
				System.out.println("Programa encerrado!");
				break;
			default: 
				System.out.println("Opção inválida (0-3)");
			}

		} while (decisao != 0);

	}

}

