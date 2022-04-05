package nick.cursojava.aula14;

public class Casting {

	public static void main(String[] args) {
		
		/*double d = 3.1415;
		int i = d; //não compila
		
		
		int i = 3.1415;// não compila 
		*/
		
		/*
		double d = 5;
		int i = d; //não compila 
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
		int i = x; //não compila, pois pode estar perdendo informação.
		*/
		
		//com casting
		//long x = 10000;
		//int i = (int) x; 
		
		//float x = 0.0;// não compila, todos os literais são considerados double pelo Java.
	
		//float x = 0.0f; 
		
		
		//o Java faz as contas e vai armazenando sempre no maior tipo que apareceu durante as operações neste caso, o double
		double d = 5;
		float f = 3;
		float x = f +(float)d; 
		
	
	}
	

}
