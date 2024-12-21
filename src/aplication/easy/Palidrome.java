package aplication.easy;

public class Palidrome {

	public static void main(String[] args) {
		

	}

	public static boolean isPalidrome(int numb) {
		int invertido = inverterNumero(numb);
			if(numb<0|| numb % 10 == 0 && numb != 0) return false;
			
			return invertido == numb;
		
	}


	public static int inverterNumero(int numero) {
		int invertido = 0;
		
		while(numero!= 0) {
			invertido = invertido * 10 + numero % 10;
			numero /= 10; 
		}
		
		return invertido;
	}
}
