package br.com.bsmgeneration.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSM {
	@GetMapping
	public String bsm()
	{
		return "<br/> BSM para Spring Boot: "
				+"<br/>"
				+"<br/>MUITA Persistência"
				+"<br/>"
				+"<br/>Atenção aos detalhes"
				+"<br/>"
				+"<br/> Trabalho em equipe";
	}

}
