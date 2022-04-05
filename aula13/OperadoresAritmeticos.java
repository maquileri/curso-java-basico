package nick.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] arg) {
		
		int resultado = 1+2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado ++; // ++ significa add mais um 
		System.out.println(resultado);
		
		System.out.println(resultado ++); // primeiro imprimir o valor do resulta e depois add mais um
		//mesma coisa que 
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
			
		
		System.out.println(++resultado);//add primeiro e depois imprime 
		//mesma coisa que 
		//resultado += 1;
		//System.out.println(resultado);
		
		
		resultado --;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		
		
	}
}
