package PraticaExercicios;

import java.util.Scanner;

public class ProgramacaoSequencial {

	public static void main(String[] args) {
		
		
		//Exercício 1 - Programação Sequencial
		
		int dia,diaAtual,mes,mesAtual,ano,anoAtual,total_dias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDia de Nascimento :");
		dia = leia.nextInt();
		System.out.println("\nMês de Nascimento :");
		mes = leia.nextInt();
		System.out.println("\nAno de Nascimento :");
		ano = leia.nextInt();
		System.out.println("\nDia Atual :");
		diaAtual = leia.nextInt();
		System.out.println("\nMês Atual :");
		mesAtual = leia.nextInt();
		System.out.println("\nAno Atual :");
		anoAtual = leia.nextInt();
		
		dia =  (diaAtual - dia)*1;
		mes = (mesAtual - mes)*30;
		ano = (anoAtual - ano)*365;
		
		total_dias = dia+mes+ano;
		System.out.println("\nVocê tem "+total_dias+" dias.");
		
		
		

	}

}
