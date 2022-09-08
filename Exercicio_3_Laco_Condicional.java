package PraticaExercicios;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		//Exercício 3 - Laço Condicional
		
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade :");
		idade = leia.nextInt();
		
		if(idade>= 10 && idade<=14) {
			System.out.println("\nSua categoria é infantil");
		}else if(idade>=15 && idade<=17){
			System.out.println("\nSua categoria é juvenil");
		}else if(idade>=18 && idade<=25){
			System.out.println("\nSua categoria é adulto");
			
		}
		}

}
