
public class QuestaoComDica extends QuestaoSimples {
	
	 String dica;

	public QuestaoComDica(String enuciado, String resposta, String dica) {
		super(enuciado, resposta);
		this.dica = dica;

	}
	
	//@Override
	//public void aplicarQuestao() {
		// System.out.println(enuciado);
		// System.out.println(dica);
	//}


public String aplicarQuestao() {
	return super.aplicarQuestao()+"\n  Dica:"+this.dica;
}
public String getDica() {
	return dica;
}

public void setDica(String dica) {
	this.dica = dica;
}
}