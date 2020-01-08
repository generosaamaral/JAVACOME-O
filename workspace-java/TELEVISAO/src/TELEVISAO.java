//class defini��o do tipo de dado televis�o
public class TELEVISAO {
// informa��es sobre uma TV
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;

	// declara�ao de constructor
	public TELEVISAO(String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 2;
		this.canal = 5;

	}

	// Abaixo temos as vari�veis

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;

	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean istLigada() {
		return ligada;
	}

	public void setvolume(int volume) {
		this.volume = volume;
	}

	public int getvolume() {
		return volume;
	}

	public void setcanal(int canal) {
		this.canal = canal;
	}

	public int getcanal() {
		return canal;
	}

//Abaixo temos os m�todos(o que diferencia os dois � o parenteses porque ela pode receber parametros e retornar valores ou n�o)

	void switchPower() {
		ligada = !ligada;
		System.out.println("A " + marca + " esta " + ((ligada) ? "ligada" : "desligada"));
	}

	void aumentarVolume() {
		if (ligada == true) {
			volume++;
		} else {
			if (ligada == false) {
				System.out.print("A TV" + marca + " esta desligada ligue!");
			}
		}

		if (volume > 10) {
			System.out.print("A TV " + marca + " esta no volume maximo!");

		} else {
			if (volume != 10) {
				System.out.print("A TV " + marca + " esta no volume" + volume);

			}

		}

	}

	void diminuirVolume() {
		if (ligada == true) {
			volume--;
		} else {

			if (ligada == false) {
				System.out.print("A TV " + marca + "esta desligada. vc pode ligar!");
			}

		}

		if (volume == 0) {
			System.out.println("A TV " + marca + "esta no mudo aumente o volume");
		} else {
			if (volume != 0) {
				System.out.print("A TV" + marca + "esta com volume");
			}
		}

	}

	void avancarCanal() {
		if (ligada == true) {
			canal++;
			System.out.print("A TV" + marca + " esta no canal" + canal);

		} else {
			if (ligada == false) {
				System.out.print("A TV" + marca + " esta desligada! nao esta no canal");
			}
		}
	}
}

//void ligar() {
// ligada = true;
// System.out.println("a tv" +marca+ "esta ligada");
//}

//void aumentarVolume() {
// volume++;
// System.out.println("A TV "+marca+" esta no volume "+volume );
//}

// void diminuirVolume() {
// volume--;
// System.out.println("A TV "+marca+" esta no volume "+volume);
// }
