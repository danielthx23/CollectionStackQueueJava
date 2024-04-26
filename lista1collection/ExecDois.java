package lista1collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecDois {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int contador, escolha;

		for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.random() * 51));
		}

		System.out.println("Digite o número que você deseja encontrar: ");
		escolha = leia.nextInt();

		if (numeros.contains(escolha)) {
			System.out.println("O número " + escolha + " está localizado na posição: " + numeros.indexOf(escolha));
		} else {
			System.out.println("O número " + escolha + " não foi encontrado!");
		}

	}

}
