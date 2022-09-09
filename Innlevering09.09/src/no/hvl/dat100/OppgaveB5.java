package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int poeng;
		String karakter;
		
		karakter = "";
		
		for (int i = 1; i < 11; i++) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn karakter poeng: ");
		poeng = sc.nextInt();
		
		
		
		
		if ((poeng >= 0) && (poeng <= 39)) {
			karakter = "F";
		}
		
		else if ((poeng > 40 ) && (poeng <= 49)) {
			karakter = "E";}
		
		else if ((poeng > 49) && (poeng <= 59)) {
			karakter = "D";
		}
		
		else if ((poeng > 59)&&(poeng <= 79)) {
			karakter = "C";
		} 
		
		else if ((poeng > 79) && (poeng <=89)) {
			karakter = "B";
		}
		
		else if ((poeng > 89) && (poeng <= 100 )) {
			karakter = "A";
		}
		
		else if (poeng > 100) {
			System.out.println("Du kan ikke ha over 100 i karakter poeng");
		}
		
		else if (poeng < 0) {
			System.out.println("Du kan ikke ha en negativ verdi som karakter poeng");
		}
		
		else {
			System.out.println("Du må skrive inn karakter poeng mellom 0-100");
		}
		
		if ((poeng >= 0) && (poeng <= 100)) {
			System.out.println("Student nr. " + i + " Din karakter er " + karakter);
			
		}
		else if ((poeng > 100)	|| (poeng < 0)) {
			i = i-1;
			System.out.println("Prøv på nytt");
		}
		}
		
	}
		
	
}
