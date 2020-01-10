//informações sobre a Biblioteca
	
public class BIBLIOTECAExercicio {
  private    String titulo;
  private    String autor;
  private    int    ano;
  private    String categoria;
  private	 int    nestante;
  private    int    nprateleira;
  private    boolean emprestado = false;
  
  
  public void exibirinfo() {
	 System.out.print("+-----------------");
	 System.out.print("Livro: "+this.titulo+" ("+this.autor+")");
	 System.out.print("Ano" +this.ano+ "categoria: "+this.categoria+"");
	 System.out.print("Nprateleira "+this.nprateleira+ "Nestante" +this.nestante+"");

 

//declaração do constructor

/*BIBLIOTECAExercicio(String titulo, String autor, int ano, int estante ){
	//this.titulo = titulo;
	this.autor = autor;
	this.ano   = ano;
	this.estante = estante;*/
	
}

public void settitulo(String titulo) {
       this.titulo = titulo;
       
public String getTitulo() {
	   return titulo;
}

public void setano(String ano) {
	   this.ano = ano;
}




}











}

