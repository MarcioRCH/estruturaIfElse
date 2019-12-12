package application02;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler um número e informar se é par ou ímpar");
		System.out.print("Digite um numero: ");
		double n = sc.nextDouble();
		
		if(n %2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número ímpar");
		}
		
		sc.close();

	}

}
