package PraticaExercicios;

import java.util.Scanner;

public class ProgramacaoSequencial2 {

	public static void main(String[] args) {
		
		//Exercício 2 - Programação Sequencial
		
		int  total_dias,anos,meses,dias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o total de dias vividos :");
		total_dias = leia.nextInt();
		
		anos = total_dias / 365;
		meses = (total_dias%365) / 30;
		dias = (total_dias%365) % 30;
		
		System.out.println("\nVocê viveu: "+anos+ " ano(s)"+meses+" mês(es)"+dias+" dia(s) de vida.");
				 

	}

}
