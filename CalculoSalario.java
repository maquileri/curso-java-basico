import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Quanto voc� ganha por hora?");
			double valorHora = scan.nextDouble();
			
			System.out.println("Qual � o n�mero de horas trabalhadas no m�s? ");
			double horasTrabalhadasMes = scan.nextDouble();
			
			double salarioBruto = valorHora * horasTrabalhadasMes;
			
			double inss = (salarioBruto / 100) * 8 ;
			double sindicato = (salarioBruto / 100) * 5;
			double ir = (salarioBruto / 100) * 11;
			
			double totalDesconto = inss+ sindicato + ir;
			double salarioLiquido = salarioBruto - totalDesconto;
			
						
			System.out.println("Sal�rio bruto �: " + salarioBruto);
			System.out.println("INSS: " + inss);
			System.out.println("Sindicato: " + sindicato);
			System.out.println("IR: " + ir);
			System.out.println("O total de descontos: " + totalDesconto);
			System.out.println("Sal�rio l�quido: " + salarioLiquido);
					
			

	}

}