package br.com.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class funcionariosController {
	@GetMapping("/funcionarios/novo")
	public String novo() {
		return "CadastroFuncionario";
	}

}
