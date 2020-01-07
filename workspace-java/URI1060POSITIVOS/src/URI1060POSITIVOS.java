import java.util.Scanner;

public class URI1060POSITIVOS {
	public static void main(String args[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int QtdPositivo = 0;
		int i;
		float Numero;

		//System.out.println("Digite os valores");
		for (i = 1; i <= 6; i++) {
			Numero = teclado.nextFloat();

			if (Numero > 0) {
				QtdPositivo = QtdPositivo + 1;
			}
		}
		System.out.println( QtdPositivo+ " valores positivos");

		teclado.close();
	
	}

}
