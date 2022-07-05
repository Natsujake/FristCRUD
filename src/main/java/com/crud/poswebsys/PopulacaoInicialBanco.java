package com.crud.poswebsys;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crud.poswebsys.rh.dominio.Pessoa;
import com.crud.poswebsys.rh.dominio.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa("João");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("Joao123das1234@gmail.com");
		p1.setCpf("22222255566");
		p1.setTelefone("33222233");
		
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(1990, 2, 21));
		p2.setEmail("Mariapppqrs@gmail.com");
		p2.setCpf("06506506505");
		p2.setTelefone("33223322");
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
		
	}

}
