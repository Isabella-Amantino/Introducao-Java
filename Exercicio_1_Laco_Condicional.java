package PraticaExercicios;

import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		
		//Exercício 1 - Laço Condicional
		
		int x1,x2,x3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro número :");
		x1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número :");
		x2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro número :");
		x3 = leia.nextInt();
		
		if(x1 > x2 && x1 > x3) {
			System.out.println("\nO maior número é: "+x1);
		}else if(x2 > x1 && x2 > x3) {
			System.out.println("\nO maior número é: "+x2);
		}else {
			System.out.println("\nO maior número é: "+x3);
		}

	}

}
