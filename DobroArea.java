package nick.exercicio7;

import java.util.Scanner;

public class DobroArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base e altura: ");
		
		int base = scan.nextInt();
		int altura = scan.nextInt();	
		
		int dobroArea = (base * altura) * 2; 
		
		System.out.println("O dobro da área é:" + dobroArea);
		

	}

}
