package com.vlup.vlnidhibank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Designation")
public class Designation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int desig_id;
	
	@Column(length = 50, nullable = false)
	private String desigName;

}
