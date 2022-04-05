package nick.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o seu nome, idade, qta filhos, sua altura e se tem pet:");
			String nome = scan.next();
			int idade = scan.nextInt();
			byte qtafilhos = scan.nextByte();
			float altura = scan.nextFloat();
			boolean temPet = scan.hasNext();
					
			System.out.println("Você digitou:");
			System.out.println("nome:" + nome);
			System.out.println("idade:" + idade);
			System.out.println("qtafilhos:" + qtafilhos);
			System.out.println("altura:" + altura);
			System.out.println("temPet:" + temPet);
		}
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto =scan.nextLine();
		System.out.println("Seu nome completo é: "+nomeCompleto);
		
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome =scan.nextLine();
		System.out.println("Seu primeiro nome é : "+primeiroNome);
		
		System.out.println("Digite a sua idade");
		int idade =scan.nextInt();
		System.out.println("Sua idade é: " +idade);
		
		System.out.println("Digite sua altura:");
		double altura =scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
	
	}

}
