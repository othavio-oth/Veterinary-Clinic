package com.gft.dto.atendimento;

import java.util.Date;

import com.gft.dto.cachorro.CachorroMapper;
import com.gft.dto.cachorro.ConsultaCachorro;
import com.gft.dto.cachorro.ConsultaCachorroTutor;
import com.gft.dto.veterinario.ConsultaVeterinario;
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
		return new ConsultaAtendimento(atendimento.getId(), CachorroMapper.fromEntity(atendimento.getCachorroId()).getTutor(),
				CachorroMapper.fromEntity(atendimento.getCachorroId()), VeterinarioMapper.fromEntity(atendimento.getVeterinarioId()),
				AtendimentoMapper.dadosFromEntity(atendimento.getDados()), atendimento.getComentarios(), atendimento.getDataEHora());
	}

}



