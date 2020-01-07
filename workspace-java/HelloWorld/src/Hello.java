
public class Hello {
	
	
	//args receive parameter the line of the command
	// vector args serve exclusively for the prompt the command
	// main this is method associate the class
	//System.out.print("Oi tudo bem? feliz ano novo! já deu tudo certo hhaha");
	
	public static void main(String args[]) {
		
		float salarioMinimo, qtdeKw, precoKw, totalBruto, total;
		
		salarioMinimo= Float.parseFloat(args[0]);
		qtdeKw       = Float.parseFloat(args[1]);
		
		
		precoKw = salarioMinimo / 700;
		totalBruto = precoKw * qtdeKw;
		total = totalBruto * 0.9f;
		
		
		System.out.print("valor de um 1 kw   R$"   +precoKw);
		System.out.print("total da conta R$ "+totalBruto  );
		System.out.print("total com desconto é" +total);
		
	}
	
}