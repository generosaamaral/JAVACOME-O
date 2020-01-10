import java.util.Scanner;
public class Prova {
public static void main(String args []) {
	Scanner teclado = new Scanner(System.in);
	
	
	String  respostaUser;
	int acertos = 0;
    QuestaoSimples simulado[] = new QuestaoSimples [4];
	
	simulado[0] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
	simulado[1] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
	simulado[2] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
	simulado[3] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
	
	simulado[2].corrigir("PA Cabral");
	
	
	for (int i=0; i<simulado.length;i++);
}

}
