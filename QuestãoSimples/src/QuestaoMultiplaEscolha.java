
public class QuestaoMultiplaEscolha extends QuestaoSimples {

	private String a1;
	private String a2;
	private String a3;
	private String a4;

	public QuestaoMultiplaEscolha(String enuciado, String resposta, String a1, String a2, String a3, String a4) {
		super(enuciado, resposta);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}

	@Override
	public void aplicarQuestao() {
		System.out.println(enuciado);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

	}

}
