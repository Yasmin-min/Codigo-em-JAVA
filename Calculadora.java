package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 1;
		
		while (opcao != 0) { 
		menu();
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
		
			double resultado = soma();
			System.out.print("O resultado da sua soma é "+resultado);
			break;
		case 2:
			resultado = subitrair();
			System.out.print("O resultado da sua subitração é "+resultado);
			break;
		case 3:
			resultado = multiplicar();
			System.out.print("O resultado da sua multiplicação é "+resultado);
			break;
		case 4:
			resultado = dividir();
			System.out.print("O resultado da sua divisão é "+resultado);
			break;
		case 0:
			System.out.print("Obrigada por usar essa calculadora!");
			break;
		default:
			System.out.println("Valor inválido, tente novamente!");
		}
		}
		
	}
	
	public static void menu() {
		System.out.println("\n"
				+ "\n-----MENU-----\n"
				+ "\n1. Somar"
				+ "\n2. Subitrair"
				+ "\n3. Multiplicar "
				+ "\n4. Dividir"
				+ "\n0. Sair");
		System.out.print("Digite a opção desejada: ");
	}

	public static double soma() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double soma = n1+n2;
		return soma;
	}
	public static double subitrair() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double subitrair = n1-n2;
		return subitrair;
	}
	public static double multiplicar() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double multiplicar = n1-n2;
		return multiplicar;
	}
	public static double dividir() {
		Scanner entrada = new Scanner(System.in);
		double n1, n2;
		while (true) {
		System.out.print("Digite o divisor: ");
		n1 = entrada.nextDouble();
		if (n1==0) {
			System.out.println("Não é possivel dividir 0, digite outro número");
		}else {
			break;
		}
		}
		while (true) {
		System.out.println("Digite o dividendo: ");
		n2 = entrada.nextDouble();
		if (n2==0){
			System.out.println("Não possivel dividir um número por 0, digite outro número");
		}else {
			break;
		}
		}
		double dividir = n1-n2;
		return dividir;
		
	}
	
}
