package com.gft.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.gft.entities.Atendimento;
import com.gft.entities.Cachorro;
import com.gft.entities.Cliente;
import com.gft.entities.DadosDoAnimalNoDia;
import com.gft.entities.Usuario;
import com.gft.entities.Veterinario;

@Service
public class PopularBancoService {
	
	ClienteService clienteService;
	VeterinarioService veterinarioRepository;
	AtendimentoService atendimentoRepository;
	CachorroService cachorroRepository;
	AutenticacaoService autenticacaoService;
	
	
	public PopularBancoService(ClienteService clienteRepository, VeterinarioService veterinarioRepository,
			 AtendimentoService atendimentoRepository,
			CachorroService cachorroRepository, AutenticacaoService autenticacaoService) {
		this.clienteService = clienteRepository;
		this.veterinarioRepository = veterinarioRepository;
		this.atendimentoRepository = atendimentoRepository;
		this.cachorroRepository = cachorroRepository;
		this.autenticacaoService = autenticacaoService;
	}
	
	
	public void popularBanco(){
		Veterinario v2 = new Veterinario(null, "Rafael Castro", "2222", "bbb@gft.com", "(64) 2633-2358");
		Veterinario v1 = new Veterinario(null, "Élia Cortesão Bernardes", "1111", "aaa@gft.com", "(96) 2228-4575");
		Veterinario v3 = new Veterinario(null, "Kelton Nobre Gameiro", "3333", "ccc@gft.com", "(61) 3635-2686");
		Veterinario v4 = new Veterinario(null, "Suéli Resende Roçadas", "4444", "ddd@gft.com", "(96) 2168-6551");

		veterinarioRepository.salvarVeterinario(v1);
		veterinarioRepository.salvarVeterinario(v2);
		veterinarioRepository.salvarVeterinario(v3);
		veterinarioRepository.salvarVeterinario(v4);

		Usuario u1 = new Usuario( "aaa@gft.com", "1111");
		Usuario u2 = new Usuario( "bbb@gft.com", "2222");
		Usuario u3 = new Usuario( "ccc@gft.com", "3333");
		Usuario u4 = new Usuario( "ddd@gft.com", "4444");
		
		autenticacaoService.criarUsuario(u1);
		autenticacaoService.criarUsuario(u2);
		autenticacaoService.criarUsuario(u3);
		autenticacaoService.criarUsuario(u4);
		
		

		Cliente c1 = new Cliente(null, "Oleksandr Ataíde Raposo", "65342485576", "aaa@hotmail.com", "(27) 2933-1213", "1111", null, null);
		Cliente c2 = new Cliente(null, "Bernardo Guedes Cabeça de Vaca", "23115963904", "bbb@yahoo.com", "(27) 3544-6338", "2222", null, null);
		Cliente c3 = new Cliente(null, "Aida Marroquim Aldeia", "64137250790", "ccc@yahoo.com", "(84) 2782-6809", "3333", null, null);
		Cliente c4 = new Cliente(null, "Matheus Amaro Maior", "76525130816", "ddd@gmail.com", "(86) 3162-2143", "4444", null, null);
		
		clienteService.salvarCliente(c1);
		clienteService.salvarCliente(c2);
		clienteService.salvarCliente(c3);
		clienteService.salvarCliente(c4);
		
		
		Cachorro ca1 = new Cachorro(null, "Dudu", "Silky Terrier", "1111", c1);
		Cachorro ca2 = new Cachorro(null, "Leila", "Husky Siberiano", "2222", c1);
		Cachorro ca3 = new Cachorro(null, "Mel", "Weimaraner", "3333", c2);
		Cachorro ca4 = new Cachorro(null, "Marlon", "Bulmastife", "4444", c3);
		Cachorro ca5 = new Cachorro(null, "Jeison", "Husky Siberiano", "5555", c4);
		
		cachorroRepository.salvarCachorro(ca1);
		cachorroRepository.salvarCachorro(ca2);
		cachorroRepository.salvarCachorro(ca3);
		cachorroRepository.salvarCachorro(ca4);
		cachorroRepository.salvarCachorro(ca5);
		
		
		DadosDoAnimalNoDia dadosA1 = new DadosDoAnimalNoDia("19,9kg", "80cm", "7 anos");
		DadosDoAnimalNoDia dadosA2 = new DadosDoAnimalNoDia("10,5kg", "50cm", "10 anos");
		DadosDoAnimalNoDia dadosB = new DadosDoAnimalNoDia("8,5kg", "30cm", "31 anos");
		DadosDoAnimalNoDia dadosC = new DadosDoAnimalNoDia("20,5kg", "79cm", "7 anos");
		
		
		
		
		Atendimento a1 = new Atendimento(null, c4, ca5, v4, dadosA1, "Como esperado, a perda de peso pode ser resultado da falta de apetite, situação que se agrava .... ",
				dataEHoraConverter("19/07/2022 19:40"));
		Atendimento a2 = new Atendimento(null, c1, ca1, v1, dadosA2, "alterações nas fezes podem indicar problemas mais graves, como verminoses, giardíases, viroses ... ",
				dataEHoraConverter("21/02/2022 21:40"));
		Atendimento a3 = new Atendimento(null, c2, ca1, v3, dadosB, "lterações na frequência, no volume e na coloração da urina também podem estar ...  ",
				dataEHoraConverter("19/04/2022 08:00"));
		Atendimento a4 = new Atendimento(null, c4, ca5, v4, dadosC, "Dor articular, dor abdominal, doenças que cursam com febre (como infecções) e alterações cardiorres... ",
				dataEHoraConverter("02/07/2022 19:40"));
		
		atendimentoRepository.registrar(a1);
		atendimentoRepository.registrar(a2);
		atendimentoRepository.registrar(a3);
		atendimentoRepository.registrar(a4);

	}
	
	
	public LocalDateTime dataEHoraConverter(String dataEHora) {
		String str = dataEHora;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		return dateTime;
	}

}
