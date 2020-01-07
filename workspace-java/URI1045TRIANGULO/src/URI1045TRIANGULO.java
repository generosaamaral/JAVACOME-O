import java.util.Scanner;

public class URI1045TRIANGULO {

	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		//System.out.println("Digite os três valores");

		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		double aux;

		if (B > A && B > C) {
			aux = A;
			aux = B;
			B = aux;
		} else {
			if (C > A) {
				aux = A;
				A = C;
				C = aux;

			}

		}

		
		if (A >= (B + C))
			System.out.println("NÃO FORMA TRIANGULO");

		else {
			if ((A * B) == (B * B) + (C * C))
				System.out.println("TRIANGULO RETANGULO");

			if ((A * A) > (B * B) + (C * C))
				System.out.println("TRIANGULO OBTUSANGULO");

			if ((A * A) < (B * B) + (C * C)) 
				System.out.println("TRIANGULO OCUTANGULO");
			

			if ((A == B) && (A == C))
				System.out.println("TRIANGULO EQUILATERO");

			if ((A == B || A == C) || (A == C && A != B) || A != C)
				System.out.println("TRIANGULO ISOSCELES");

		}

	}

}
