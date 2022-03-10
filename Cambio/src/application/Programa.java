package application;

import java.util.Locale;
import java.util.Scanner;
import util.calculaDolar;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calculaDolar comp = new calculaDolar();
		
		System.out.print("Entre com o valor do dolar: ");
		comp.dolar = sc.nextDouble();
		
		System.out.print("Quantos dolares você ira comprar? ");
		comp.quantidade = sc.nextInt();
	
		
		System.out.print(comp);
		
		sc.close();

	}

}
