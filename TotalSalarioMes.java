package nick.exercicio8;

import java.util.Scanner;

public class TotalSalarioMes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scan.nextDouble();
		System.out.println("Qual é o número de horas trabalhadas no mês? ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		double totalSalarioMes = valorHora * horasTrabalhadasMes;
		
		System.out.println("O total do seu salário no mês é: " + totalSalarioMes);
				
		
	

	}

}
