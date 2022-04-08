package nick.exercicio4;

import java.util.Scanner;

public class NotasBim {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota n1, n2, n3 e n4: ");
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		System.out.println("Sua média é: " + (nota1 + nota2 + nota3 + nota4) / 4);

	}

}
