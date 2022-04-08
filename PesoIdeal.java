package nick.exercicio12;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (altura * 72.7) - 58;
				
		System.out.println("O peso ideal é: " + pesoIdeal);		

	}

}
