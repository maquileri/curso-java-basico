import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Quanto você ganha por hora?");
			double valorHora = scan.nextDouble();
			
			System.out.println("Qual é o número de horas trabalhadas no mês? ");
			double horasTrabalhadasMes = scan.nextDouble();
			
			double salarioBruto = valorHora * horasTrabalhadasMes;
			
			double inss = (salarioBruto / 100) * 8 ;
			double sindicato = (salarioBruto / 100) * 5;
			double ir = (salarioBruto / 100) * 11;
			
			double totalDesconto = inss+ sindicato + ir;
			double salarioLiquido = salarioBruto - totalDesconto;
			
						
			System.out.println("Salário bruto é: " + salarioBruto);
			System.out.println("INSS: " + inss);
			System.out.println("Sindicato: " + sindicato);
			System.out.println("IR: " + ir);
			System.out.println("O total de descontos: " + totalDesconto);
			System.out.println("Salário líquido: " + salarioLiquido);
					
			

	}

}