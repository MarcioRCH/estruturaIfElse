package application08;

import java.util.Locale;
import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo de imposto de renda");
		System.out.print("Digite o valor do seu salario: ");
		double salario = sc.nextDouble();
		double total = 0;
		
		if(salario > 0 && salario <= 2000.00) {
			total = 0;
		}else if(salario > 2000.00 && salario <= 3000.00) {
			total = (salario - 2000.00) * 0.08;
		}else if(salario > 3000.00 && salario <= 4500.00) {
			total = (salario - 3000.00)* 0.18 + 1000.00 * 0.08;
		}else  {
			total = (salario - 4500.00)* 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		if (total == 0) {
			System.out.println("Você está isento.");
		}else {
			System.out.printf("Você deverá pagar: R$%.2f de imposto", total);
		}
		sc.close();

	}

}
