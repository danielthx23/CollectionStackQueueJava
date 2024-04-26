package lista2collection;

import java.util.Scanner;
import java.util.Stack;

public class ExecDois {

	public static void main(String[] args) {
		 Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int decisao = 0;

		do {
			System.out.println("\n" + "\n" + "************************************\n"
		+"\n1 - Adicionar Livro na Pilha" 
		+ "\n2 - Listar Todos os Livros" 
		+ "\n3 - Retirar Livro da Pilha" 
		+ "\n0 - Sair"
		+ "\n\n************************************" 
		+ "\nEntre com a opção desejada:");
			
			decisao = leia.nextInt();
			
			
			
			switch(decisao) {
			case 1: 
				leia.nextLine();
				System.out.println("\n" + "Insira o nome: ");
				livros.push(leia.nextLine());
				System.out.println("\n" + "Pilha: " + "\n");
				for(String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\n" + "O Livro foi Adicionado!" + "\n");
				break;
			case 2:
				if(!livros.isEmpty()) {
				System.out.println("\n" + "Pilha: " + "\n");
				for(String livro : livros) {
					System.out.println(livro);
				}
			} else {
				System.out.println("\n" + "A Pilha está vazia!" + "\n");
			}
				break;
			case 3: 
				livros.pop();
				System.out.println("\n" + "Pilha: " + "\n");
				for(String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\n" + "Um Livro foi retirado da pilha!" + "\n");
				break;
			case 0:
				System.out.println("\n" + "Programa encerrado!" + "\n");
				break;
			default: 
				System.out.println("Opção inválida (0-3)");
			}

		} while (decisao != 0);

	}

}
