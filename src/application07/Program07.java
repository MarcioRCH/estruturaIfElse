package application07;

import java.util.Locale;
import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler dois valores e identificar a posição em plano cartesiando");
		System.out.println();
		System.out.println("       |Y");
		System.out.println("__Q2___|___Q1___X");
		System.out.println("  Q3   |   Q4  ");
		System.out.println();
		System.out.print("Digite o valor de X: ");
		double x = sc.nextDouble();
		System.out.print("Digite o valor de Y: ");
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Posição Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Posição Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Posição Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Posição Q4");
		}else if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		sc.close();

	}

}
