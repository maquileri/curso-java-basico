package nick.exercicio9;

import java.util.Scanner;

public class TempGrausCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Farenheit? ");
		double tempFarenheit = scan.nextDouble();
		
		double converteGrauCelsius = (5* (tempFarenheit - 32)/9);
		// or (x�F -32) * .5556 = X�C
		System.out.println("A temperatura em celsius �: " + converteGrauCelsius);
		
	}

}
