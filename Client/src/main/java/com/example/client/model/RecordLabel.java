package com.example.client.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RecordLabel implements Serializable{
	@EqualsAndHashCode.Include
	private Integer id;
	@NotEmpty(message = "Record must have a name")
	private String name;
}