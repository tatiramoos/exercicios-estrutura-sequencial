package ex001;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
				
		
		System.out.printf("area=%.4f%n", area);
		
		sc.close();

	}

}
