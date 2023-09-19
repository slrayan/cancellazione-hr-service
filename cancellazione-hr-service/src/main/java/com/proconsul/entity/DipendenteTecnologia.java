package com.proconsul.entity;

import java.io.Serializable;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "dipendente_tecnologia")
@SuppressWarnings("serial")
public class DipendenteTecnologia implements Serializable {

	@EmbeddedId
	private DipendenteTecnologiaId dipendenteTecnologiaId;

	@Column(nullable = false)
	@Size(min = 1)
	private String esperienza;

	@Column(nullable = false)
	@Size(min = 1)
	private String competenza;

	public DipendenteTecnologiaId getDipendenteTecnologiaId() {
		return dipendenteTecnologiaId;
	}

	public void setDipendenteTecnologiaId(DipendenteTecnologiaId dipendenteTecnologiaId) {
		this.dipendenteTecnologiaId = dipendenteTecnologiaId;
	}

	public String getEsperienza() {
		return esperienza;
	}

	public void setEsperienza(String esperienza) {
		this.esperienza = esperienza;
	}

	public String getCompetenza() {
		return competenza;
	}

	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}
	
	public DipendenteTecnologia(DipendenteTecnologiaId dipendenteTecnologiaId, @Size(min = 1) String esperienza,
			@Size(min = 1) String competenza) {
		super();
		this.dipendenteTecnologiaId = dipendenteTecnologiaId;
		this.esperienza = esperienza;
		this.competenza = competenza;
	}

	protected DipendenteTecnologia() {
		super();
	}

}
