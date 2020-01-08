import java.util.Scanner;

public class AppQueTestaTV {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;

		TELEVISAO t1; // declarei que t1 vai manipular uma tv
		t1 = new TELEVISAO("Sony", 110, 32); // reservo um espaço na memoria para isso

		// t1.setMarca("Sony");
		// t1.setVoltagem(110);
		// t1.setTamanho(32);
		// t1.setLigada(false);
		// t1.Canal(5);
		// t1.Volume(2);

		// t1.switchPower();

		do {
			System.out.println("*******************************");
			System.out.println(" controle remoto da TV          ");
			System.out.println(" ---------------------          ");
			System.out.println(" 1 - ligar/desligar             ");
			System.out.println(" 2 - aumentar volume            ");
			System.out.println(" 3-  diminuir volume             ");
			System.out.println(" 4 - avancar canal              ");
			System.out.println(" 5- voltar canal                ");
			System.out.println(" 0- encerrar sistema            ");
			System.out.println(" ***************************    ");
			opcao = teclado.nextInt();

			// logica das opcoes

			switch (opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;

			}

			System.out.println("\n");

		} while (opcao != 0);

	}

}
