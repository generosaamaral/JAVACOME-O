
import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String args[]) {
	Scanner teclado;
	teclado = new Scanner(System.in);
  
	int a;
	float b;
	String texto;
	
	
	System.out.print("digite um nome");
	texto = teclado.nextLine();
	System.out.print("Digite um valor inteiro:");
	a = teclado.nextInt();
	System.out.print("digite um valor real:");
	b =teclado.nextFloat();
	
	System.out.println("o texto digitado vale:");
	System.out.print(texto);
	System.out.println(" voc� digitou os valores "+a+" e "+b);
	
//	System.out.printf(%.3f);
	 
	teclado.close();
	
	}



}
