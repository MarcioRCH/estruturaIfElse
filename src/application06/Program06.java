package application06;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler um valor e informar seu intervalo entre os seguintes: ([0,25], (25,50], (50,75], (75,100])");
		System.out.println();
		System.out.print("Digite um número: ");
		double n = sc.nextDouble();
		
		if(n > 0  && n <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if (n >  25 && n <= 50) {
			System.out.println("Intervalo (25,50]");
		}else if (n > 50 && n <= 75) {
			System.out.println("Intervalo (50,75]");
		}else if(n > 75 && n <= 100) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo.");
		}
		
		sc.close();

	}

}
