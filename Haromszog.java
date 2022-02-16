/*
* File: Haromszog.java
* Author: Gubis Zsombor Dániel
* Copyright: 2021, Gubis Zsombor Dániel
* Group: Szoft_I_N
* Date: 2022.02.16.
* Github: https://github.com/Zsomi/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class Haromszog {
	public static void main(String[] args) {
	System.out.println("Gubis Zsombor Dániel, 2022.02.16, Szoft_I_N");
	System.out.println("-------------------------------------------");

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Magasság: ");
			double magassag = scan.nextDouble();

			System.out.print("A oldal: ");
			double aOldal = scan.nextDouble();

			double terulet = aOldal * magassag / 2;
			System.out.printf("%.2f", terulet);
		}
	}
}