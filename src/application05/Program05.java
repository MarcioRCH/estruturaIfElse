package application05;

import java.util.Locale;
import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler o código e a quantidade e informar o valor a ser pago.");
		System.out.println();
		System.out.println("1   Cachorro Quente   R$4.00");
		System.out.println("2   X-Salada          R$4.50");
		System.out.println("3   X-Bacon           R$5.00");
		System.out.println("4   Torrada Simples   R$2.00");
		System.out.println("5   Refrigerante      R$1.50");
		System.out.println();
		System.out.print("Digite o código do produto: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		double total = 0;

		if (codigo == 1) {
			total = quantidade * 4.00;
		}else if (codigo == 2) {
			total = quantidade * 4.5;
		}else if (codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.00;
		}else {
			total = quantidade * 1.50;
		}
		System.out.printf("Total: R$%.2f%n", total);

			sc.close();

	}

}
