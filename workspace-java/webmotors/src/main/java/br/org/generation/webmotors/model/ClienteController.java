package br.org.generation.webmotors.model;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDCliente;

@RestController
public class ClienteController {
	
	// aqui criei o meu banco de dados 
	
	private BDCliente bd = new BDCliente();
	
	//@GetMapping("/cliente/teste")
	//public Cliente testeCliente() {
		//Cliente c = new Cliente();
		//c.setId(5);
		//c.setNome("Generosa");
		//c.setEmail("geniamaral28@.com");
		//c.setCpf("234.589.674.00");
		//c.setTelefone("96436-5034");
		//c.setDataNasc("28/06/91");
		//return c;
//}
	@PostMapping("/cliente/novo")	
      public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente){
	  bd.gravar(cliente);
	  return ResponseEntity.ok(cliente);
	}
	
	
	
	
	@GetMapping("/cliente/{id}")// depois do barra cliente posso passar qualquer valor que entra no variable
	public ResponseEntity<Cliente> getCliente(@PathVariable int id){ // o que ele passar no variable vai no id cliente com colchete
	Cliente cli = bd.buscar(id);
	if (cli != null) { // encontrei um cliente com ID especificado
		return ResponseEntity.ok(cli);
	}
	else {
		return ResponseEntity.notFound().build();
	}
	
	}
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	// é exclusivamente para atualizar
	@PutMapping("/cliente")
	public ResponseEntity<String> alteraCliente(@RequestBody Cliente cliente){
	bd.atualizar(cliente);
	return ResponseEntity.ok("Sucesso");
	}
	

	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
	
	
	
	
}
