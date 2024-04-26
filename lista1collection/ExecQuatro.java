package lista1collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExecQuatro {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int escolha;

		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = (int) (Math.random() * 51);
			numeros.add(numeroAleatorio);
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		escolha = leia.nextInt();

		if (numeros.contains(escolha)) {
			System.out.println("O número " + escolha + " foi encontrado!");
		} else {
			System.out.println("O número " + escolha + " não foi encontrado!");
		}

	}

}
