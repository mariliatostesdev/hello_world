package com.generation.hello_world.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	ArrayList<String> listaBsm = new ArrayList<>() {
		{
			add("Lista de BSMs:");
			add("comunicação");
			add("proatividade");
			add("orientação ao detalhe");
			add("trabalho em equipe");
			add("mentalidade de crescimento");
			add("orientação ao futuro");
			add("responsabilidade pessoal");
			add("persistência");
		}
	};

	ArrayList<String> listaObjetivos = new ArrayList<>() {
		{
			add("Objetivos de Aprendizagem - Quero melhorar em:");
			add("trabalho em equipe");
			add("persistência");
			add("orientação ao futuro");
			add("adaptabilidade");
		}
	};

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/lista-bsm")
	public ArrayList<String> bsmList() {
		return listaBsm;
	}

	@GetMapping("/objetivos-de-aprendizagem")
	public ArrayList<String> objetivos() {
		return listaObjetivos;
	}

}
