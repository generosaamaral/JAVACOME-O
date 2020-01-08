//informações sobre a Biblioteca
	
public class BIBLIOTECAExercicio {
  private    String titulo;
  private    String autor;
  private    int    ano;
  private    String categoria;
  private	 int    estante;
  private    int    prateleira;
  private    boolean emprestado;



//declaração do constructor

BIBLIOTECAExercicio(String titulo, String autor, int ano, int estante ){
	this.titulo = titulo;
	this.autor = autor;
	this.ano   = ano;
	this.estante = estante;
	
}

public void settitulo(String titulo) {
       this.titulo = titulo;
       
public String getTitulo() {
	   return titulo;
}

}











}

