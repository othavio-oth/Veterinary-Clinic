package com.gft.dto.atendimento;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gft.dto.cachorro.CachorroMapper;
import com.gft.dto.veterinario.VeterinarioMapper;
import com.gft.entities.Atendimento;
import com.gft.entities.DadosDoAnimalNoDia;

public class AtendimentoMapper {
	
	public static DadosDoAnimalNoDia fromDTO(DadosDoAnimaDTO dto) {
		return new DadosDoAnimalNoDia(dto);
	}
	
	
	public static DadosDoAnimaDTO dadosFromEntity(DadosDoAnimalNoDia dados) {
		return new DadosDoAnimaDTO(dados);
	}
	
	public static ConsultaAtendimento fromEntity(Atendimento atendimento) {
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		 
			
		return new ConsultaAtendimento(atendimento.getId(), CachorroMapper.fromEntity(atendimento.getCachorroId()).getTutor(),
				CachorroMapper.fromEntity(atendimento.getCachorroId()), VeterinarioMapper.fromEntity(atendimento.getVeterinarioId()),
				AtendimentoMapper.dadosFromEntity(atendimento.getDados()), atendimento.getComentarios(), formatter.format(atendimento.getDataEHora()));
	}
	
	public static List<ConsultaAtendimento> fromEntityList(List<Atendimento> atendimentos){
		List<ConsultaAtendimento> atendimentoDtoList = new ArrayList<>();
		if(atendimentos==null) {
			atendimentos = Collections.emptyList();
		}
		
		for(Atendimento atendimento : atendimentos) {
			ConsultaAtendimento atendimentoDto = fromEntity(atendimento);
			atendimentoDtoList.add(atendimentoDto);
		}
		
		return atendimentoDtoList;
	}
	


}



