import java.util.Scanner;
public class Cadastro {
 public static void main(String args[]) {
	 PRODUTO lista[]= new PRODUTO[5];
	 int posicao;
	 posicao = 0;
	 Scanner teclado = new Scanner (System.in);
	
	 do {
		
	try {
		System.out.println("--- posicao "+posicao);
		PRODUTO p = new PRODUTO();
		
		System.out.println("Digite o ID do PRODUTO");
		int id = Integer.parseInt(teclado.nextLine());
		p.setId(id);
		
		System.out.println("Digite o nome do produto");
		String nome = teclado.nextLine();
		p.setNome(nome);
		
		System.out.println("Digite os detalhes dos produtos");
		String detalhe = teclado.nextLine();
		p.setDetalhe(detalhe);
		
		System.out.println(" posicao" +posicao);
		System.out.println("digite o preco do produto");
		float preco = Float.parseFloat(teclado.nextLine());
		p.setPreco(preco);
		
		System.out.println("posicao" +posicao);
		System.out.println("Digite a quantidade de estoque");
		Float qEstoque = Float.parseFloat(teclado.nextLine());
		p.setQestoque(qEstoque);
		
		
		lista[posicao]= p;
		posicao++;
	
	}catch(Exception ex) {
		System.out.println("ops!... erro ao cadastrar");
		System.out.println("motivo"+ex.getMessage());
			
	}
		
	 }while(posicao> 5);	
	
	for(PRODUTO p: lista) {
		System.out.println(p);
		
	}
	 
	 
	 }
 
	
 }















