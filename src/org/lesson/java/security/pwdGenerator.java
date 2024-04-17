package org.lesson.java.security;

import java.util.Scanner;

public class pwdGenerator {

	public static void main(String[] args) {
		
		String nome;
		String cognome;
		String colorePreferito;
		int giorno;
		int mese;
		int anno;
		int sommaDataDiNascita;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci il tuo nome");
		nome = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		cognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		colorePreferito = input.nextLine();
		
		System.out.println("Inserisci il tuo giorno di nascita");
		giorno = input.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita");
		mese = input.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita");
		anno = input.nextInt();
		
		
		System.out.println("La tua password più insicura al mondo è: " + nome + "-" + cognome + "-" + colorePreferito + "-" + (giorno + mese + anno));
		
	}

}
