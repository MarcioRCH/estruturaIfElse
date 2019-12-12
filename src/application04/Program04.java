package application04;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler a hora inicial e final e informar o intervalo.");
		System.out.print("Digite a hora inicial: ");
		int n1 = sc.nextInt();
		System.out.print("Digite a hora final: ");
		int n2 = sc.nextInt();
		int d;
		
		if(n1 < n2) {
			d = n2 - n1;
		}else {
			d = 24 - n1 + n2;
		}
		System.out.print("O intervalo é: " + d + " hora(s).");
		
		
		sc.close();

	}

}
