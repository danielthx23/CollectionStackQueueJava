package lista1collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExecTres {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira um número: ");
			numeros.add(leia.nextInt());
		}
		
		System.out.println("Listar dados do set: \n");
		
        Iterator<Integer> iNum = numeros.iterator();
		
		while(iNum.hasNext()) {
			System.out.println(iNum.next());
		}

	}

}
