package application03;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler dois números e informar se são multiplos");
		System.out.print("Digite o primeiro numero: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite o segudo numero: ");
		double n2 = sc.nextDouble();
		
		if(n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São multiplos.");
		}else {
			System.out.println("Não são multiplos.");
		}
		 
		sc.close();

	}

}
