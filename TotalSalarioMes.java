package nick.exercicio8;

import java.util.Scanner;

public class TotalSalarioMes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = scan.nextDouble();
		System.out.println("Qual � o n�mero de horas trabalhadas no m�s? ");
		double horasTrabalhadasMes = scan.nextDouble();
		
		double totalSalarioMes = valorHora * horasTrabalhadasMes;
		
		System.out.println("O total do seu sal�rio no m�s �: " + totalSalarioMes);
				
		
	

	}

}
