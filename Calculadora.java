package calculadora;

import java.util.Scanner;

public class Calculadora {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
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
			resultado = subtrair();
			System.out.print("O resultado da sua subtração é "+resultado);
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
				+ "\n2. Subtrair"
				+ "\n3. Multiplicar "
				+ "\n4. Dividir"
				+ "\n0. Sair");
		System.out.print("Digite a opção desejada: ");
	}

	public static double soma() {
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double soma = n1+n2;
		return soma;
	}
	public static double subtrair() {
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double subtrair = n1-n2;
		return subtrair;
	}
	public static double multiplicar() {
		System.out.print("Digite o 1° número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o 2° número: ");
		double n2 = entrada.nextDouble();
		double multiplicar = n1-n2;
		return multiplicar;
	}
	public static double dividir() {
		double n1, n2;
		while (true) {
			System.out.println("Digite o dividendo: ");
			n1 = entrada.nextDouble();
			System.out.print("Digite o divisor: ");
			n2 = entrada.nextDouble();
			if (n1==0 || n2==0){
				System.out.println("Não possui divisões com 0, digite outros valores");
			}else {
				break;
			}
			}
		
		double dividir = n1-n2;
		return dividir;
		
	}
	
}
