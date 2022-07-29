package com.gft.dto.cachorro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gft.entities.Cachorro;

public class CachorroMapper {
	
	
	public static ConsultaCachorro fromEntity(Cachorro cachorro) {
		return new ConsultaCachorro(cachorro);
	}
	
	public static List<ConsultaCachorro> fromEntityList(List<Cachorro> cachorros) {
		List<ConsultaCachorro> cachorroDtoList = new ArrayList<>();
		if(cachorros==null) {
			cachorros=Collections.emptyList();
		}
		
		for (Cachorro cachorro : cachorros) {
			ConsultaCachorro cachorroDto = new ConsultaCachorro(cachorro);
			
			cachorroDtoList.add(cachorroDto);
		}
		
		return cachorroDtoList;
	}


}
