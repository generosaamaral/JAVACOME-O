import java.util.Scanner;
public class URI1047HORAJOGO {
	
public static void main(String args) {
	Scanner teclado;
    teclado = new Scanner (System.in);

 System.out.print("Digite a hora e minutos inicial e horas inicial e minutos final");
 
 int HoraInicial   = teclado.nextInt();
 int HoraFinal     = teclado.nextInt();
 int MinutoInicial = teclado.nextInt();
 int MinutoFinal   = teclado.nextInt();
 
  
 if(HoraInicial == HoraFinal && MinutoInicial == MinutoFinal) {
	System.out.print("O JOGO DUROU 24 HORAS E 0 MINUTOS"); 
 }




}



}