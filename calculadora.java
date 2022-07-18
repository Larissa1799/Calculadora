package Calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
try (Scanner scan = new Scanner(System.in)) {
	int a, b;
	System.out.println("Digite o primeiro valor: ");
	a = scan.nextInt();
	System.out.println("Digite o segundo valor: ");
	b = scan.nextInt();
	int somar = somar(a,b);
	int subtrair = subtrair(a,b);
	int dividir = dividir(a,b);
	int multiplicar = multiplicar(a,b);
	System.out.println("a soma é: " + somar);
	System.out.println("a subtração é: " + subtrair);
	System.out.println("a multiplicação é: " + multiplicar);
	System.out.println("a divisão é: " + dividir);
}







}

	private static int multiplicar(int a, int b) {
		return a * b;
	}

	private static int dividir(int a, int b) {
		return a / b;
	}

	private static int subtrair(int a, int b) {
		return a - b;
	}

	private static int somar(int a, int b) {
		return a + b;
	}
}
