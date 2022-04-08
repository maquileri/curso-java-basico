package nick.exercicio5;

import java.util.Scanner;

public class Converte {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em metros: ");
		double metros = scan.nextDouble();
		
		double converte = metros * 100; 
		
		System.out.println("O comprimentro em centímetros é: " + converte);

	}

}
