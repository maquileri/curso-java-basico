package nick.exercicio11;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double numR = scan.nextDouble();
		
		//o produto do dobro do primeiro com metade do segundo
		int produto = (num1 * 2 * num2) / num2;
		
		//a soma do triplo do primeiro com o terceiro
		int soma = (int) (num1 * 3 + numR); 
		
		//o terceiro elevado ao cubo 
		double cubo = numR * 9;
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("a soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("o terceiro elevado ao cubo: " + cubo);
		
		
	
		

	}

}
