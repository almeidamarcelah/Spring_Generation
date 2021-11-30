package br.com.bsmgeneration.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class HelloWord {
	@GetMapping
	public String objetivo()
	{
		return "<b> Objetivo de aprendizagem da semana: <b>"
				+"<b/>"
				+ "<b/> Aprender a não surtar com o Spring e me encantar com ele";
	}

}
