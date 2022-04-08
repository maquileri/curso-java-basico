package nick.exercicio6;

import java.util.Scanner;

public class CalculaArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double raio = scan.nextDouble();
		
		double area = (3.14 * (raio * raio));
		
		//class Math fornece varios funções e métodos para cancular sen, cos, potencia etc...
		//double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é: " + area);
	

	}

}
