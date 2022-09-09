package no.hvl.dat100;

import java.util.Scanner;


public class Oppgave03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heltall;
		int res;
		
		res = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn heltal for fakultet utrekning: ");
		heltall = sc.nextInt();
		sc.close();
		
		if (heltall > 0) {
			for (int i = 1; i <= heltall; i++){
				res *= i;
				System.out.println(res);
			} }
		
		
		else {
			System.out.println("Heltallet må være større enn 0 ");
		}
		
	}

}
