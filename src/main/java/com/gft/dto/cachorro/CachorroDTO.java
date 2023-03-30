package com.gft.dto.cachorro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CachorroDTO {

	private String nome;
	private String raca;
	private String carteirinha;
	private Long tutor;
	private Boolean status;

}
