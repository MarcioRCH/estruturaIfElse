package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler um número e informar se é nagativo ou positivo");
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
		
		if (n < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
		
		sc.close();

	}

}
