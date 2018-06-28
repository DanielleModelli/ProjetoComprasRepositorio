package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="person", name = "entidadecomercial")
public class EntidadeComercial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "businessentityid")
	private Integer BusinessEntityID ;

	@Column(name = "rowguid")
	private String NumeroID;

	@Column(name = "datamodificacao")
	private Date DataModificacao;
}