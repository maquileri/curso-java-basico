package nick.exercicio10;

import java.util.Scanner;

public class TempGrausFarenheit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em celsius? ");
		double tempCelsius = scan.nextDouble();
		
		double converteGrauFarenheit = (tempCelsius *9/5) + 32; //or (x�C x 1.8) + 32 = �F
		
		System.out.println("A temperatura em farenheit �: " + converteGrauFarenheit);

	}

}
