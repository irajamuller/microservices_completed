package com.store.municipio.evento;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MunicipioEvent {
	
	public static final String TOPIC = "municipio-atualizado-topic";
	
	private UUID id;
	private String nome;
	private LocalDateTime dtAtualizacao;
	
	
}
