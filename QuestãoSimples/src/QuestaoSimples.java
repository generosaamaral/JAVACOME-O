
public class QuestaoSimples {
	protected String enuciado;
	protected String resposta;

	public QuestaoSimples(String enuciado, String resposta) {
		this.enuciado = enuciado;
		this.resposta = resposta;
	}

	public void aplicarQuestao() {
		System.out.println(enuciado);
	}

	public boolean corrigir(String resp) {
		if (resp == resposta) {
			System.out.println("Resposta certa");
			return true;
		} else {
			System.out.println("Resposta errada");
			return false;
		}
	}

	public String getEnuciado() {
		return enuciado;
	}

	public void setEnuciado(String enuciado) {
		this.enuciado = enuciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}