import java.util.Scanner;

public class Prova {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		String respostaUser;
		int acertos = 0;
		QuestaoSimples simulado[] = new QuestaoSimples[4];
        
		// usamos polimorfismo para instanciar quaisquer questões (tanto pai quanto filhas)
		simulado[0] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
		simulado[1] = new QuestaoMultiplaEscolha("Quem descobriu a agua?", "H2O", "chuva", "H2O2", "H2S04",);
		simulado[2] = new QuestaoSimples("Qual a cor do cavalo branco de Napoleão?", "Marron");
		simulado[3] = new QuestaoMultiplaEscolha("Quanto é 1+1?", "2", "8", "6", "4", "2");
		simulado[3] = new QuestaoComDica("Qual é a linguagem do cueso?", "Java", "começa com JA termina com Va");
  
		//* aqui vamos percorrer o vetor. Para cada item do vetor, vamos exibi-lo, pedir 
		 //* para o usuario digitar uma resposta e usar o método corrigir para comparar as
		// * respostas. 
		
		for (int i = 0; i < simulado.length; i++) {
        System.out.println(simulado[i].aplicarQuestao());
        respostaUser = teclado.nextLine();
        if( simulado[i].corrigir(respostaUser)) {
        	acertos++;
        }
		}
		System.out.println("Voce teve "+acertos+" acertos");
	}
}