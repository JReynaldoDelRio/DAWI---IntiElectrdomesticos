package com.inti.model;

import jakarta.persistence.Entity;



import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "tb_marca")
@Data

public class Marca {
	@Id
	private int id_marc;
	private String nomb_marc;

	
}
