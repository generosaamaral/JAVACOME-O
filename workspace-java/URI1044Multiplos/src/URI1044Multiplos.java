import java.util.Scanner;
public class URI1044Multiplos {
	
	public static void main(String args[]) {
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		int A, B;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		
		if(A%B == 0 || B%A == 0 ){
		
		System.out.println("Sao Multiplos");
		
		}	
		
		else {
			System.out.println("Nao sao Multiplos");
		}
		
	
        teclado.close();
		
	}

}
