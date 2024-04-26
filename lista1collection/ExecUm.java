package lista1collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecUm {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Por favor, digite as cores:");
			cores.add(leia.nextLine());
		}
		System.out.println("\n\nListar todas as cores:" + "\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		System.out.println("\n\nOrdenar as cores:" + "\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
	}

}
