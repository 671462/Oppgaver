package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		double brutto, sats;
		int trinn;
		
		
		sats = 0;
		trinn = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn brutto inntekt: ");
		brutto = sc.nextInt();
		sc.close();
		
		if(brutto <= 164100) {
			System.out.println("Tallet må være over 164 100 ");
			
		}
		else if ((164100 < brutto) && (brutto <= 230950))  {
			sats = 1.017;
			trinn = 1;
		}
		
		else if ((brutto > 230950)&&(brutto <= 580650)) {
			sats = 1.04;
			trinn = 2;
		}
		
		else if ((brutto < 580650) && (brutto <= 934050)) {
			sats = 1.134;
			trinn = 3;
		}
		
		else if (brutto > 934050) {
			sats = 1.164;
			trinn = 4;
		}
		
		
		
		else {

			System.out.println("Du skrev ikke inn en gyldig verdi ");
			
		}
		
		
		if (brutto > 164100) { 
			System.out.println("Ditt trinnskatt nivå er trinn: "+ trinn + " Skatten du betaler er; " + (brutto*sats - brutto)); }
		
		

	}

}
