package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	// GetMapping é onde é definido os Endpoints com todos os métodos.
	@GetMapping("/veiculo/teste")
	public Veiculo testeVeiculo() {
	Veiculo v = new Veiculo();
	v.setId(1234);
	v.setMarca ("Vokis");
	v.setModelo("Ranger");
	v.setAno(2020);
	v.setCor("Preto");
	v.setTipo("Esportivo");
	v.setPreco(11111);	
	v.setDetalhes("Veiculo de ultima geração."
			+ "carro movido energia solar" 
			+ "acabamento em couro bege"
			+ "tem camera de ");
	return v;
		
	}

	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo){
	bd.gravar(veiculo);
	return ResponseEntity.ok(veiculo);
	}
		
	
	@GetMapping("/veiculo/{id}")
	public ResponseEntity <Veiculo> getVeiculo (@PathVariable int id){
	Veiculo cli = bd.buscar(id);
	if(cli != null) {
	 ResponseEntity.ok(cli);
	}
	else{
		return ResponseEntity.notFound().build();
	}
	
	}
	
	@GetMapping("/buscarTodos")
	 public ResponseEntity<ArrayList<Veiculo>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/veiculo")
	public ResponseEntity<String> alterarVeiculo (@RequestBody Veiculo veiculo) {
	bd.atualizar(veiculo);
	return ResponseEntity.ok("sucesso");
	}
	
	@DeleteMapping("/veiculo")
	public ResponseEntity<String> removeVeiculo (@PathVariable int id){
	if(bd.apagar(id)) {
	return ResponseEntity.ok ("DELETE");
	}
	else {
		return ResponseEntity.notFound().build();
	}
	
	}
	
}
	
	

