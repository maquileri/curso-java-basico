package nick.cursojava.aula14;

public class Casting {

	public static void main(String[] args) {
		
		/*double d = 3.1415;
		int i = d; //n�o compila
		
		
		int i = 3.1415;// n�o compila 
		*/
		
		/*
		double d = 5;
		int i = d; //n�o compila 
		*/
		
		/*
		int i = 5;
		double d2 = i;
		*/
		
		
		/*
		double d3 = 3.14;
		int i = (int) d3;
		*/
		
		/*
		long x = 10000;
		int i = x; //n�o compila, pois pode estar perdendo informa��o.
		*/
		
		//com casting
		//long x = 10000;
		//int i = (int) x; 
		
		//float x = 0.0;// n�o compila, todos os literais s�o considerados double pelo Java.
	
		//float x = 0.0f; 
		
		
		//o Java faz as contas e vai armazenando sempre no maior tipo que apareceu durante as opera��es neste caso, o double
		double d = 5;
		float f = 3;
		float x = f +(float)d; 
		
	
	}
	

}
