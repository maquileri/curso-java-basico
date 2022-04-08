package nick.exercicio10;

import java.util.Scanner;

public class TempGrausFarenheit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em celsius? ");
		double tempCelsius = scan.nextDouble();
		
		double converteGrauFarenheit = (tempCelsius *9/5) + 32; //or (xºC x 1.8) + 32 = ºF
		
		System.out.println("A temperatura em farenheit é: " + converteGrauFarenheit);

	}

}
