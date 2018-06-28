package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="dbo", name = "DatabaseLog")
public class DatabaseLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DatabaseLogID")
	private Integer DatabaseLogID ;

	@Column(name = "PostTime")
	private Date PostTime;
	
	@Column(name = "DatabaseUser")
	private String DatabaseUser; 
	
	@Column(name = "Event")
	private String Event; 
	
	@Column(name = "[Schema]")
	private String Schema; 
	
	@Column(name = "Object")
	private String Object; 
	
	@Column(name = "TSQL")
	private String TSQL; 
	
	@Column(name = "XmlEvent")
	private String XmlEvent;

	public Integer getDatabaseLogID() {
		return DatabaseLogID;
	}

	public void setDatabaseLogID(Integer databaseLogID) {
		DatabaseLogID = databaseLogID;
	}

	public Date getPostTime() {
		return PostTime;
	}

	public void setPostTime(Date postTime) {
		PostTime = postTime;
	}

	public String getDatabaseUser() {
		return DatabaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		DatabaseUser = databaseUser;
	}

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public String getSchema() {
		return Schema;
	}

	public void setSchema(String schema) {
		Schema = schema;
	}

	public String getObject() {
		return Object;
	}

	public void setObject(String object) {
		Object = object;
	}

	public String getTSQL() {
		return TSQL;
	}

	public void setTSQL(String tSQL) {
		TSQL = tSQL;
	}

	public String getXmlEvent() {
		return XmlEvent;
	}

	public void setXmlEvent(String xmlEvent) {
		XmlEvent = xmlEvent;
	}

	
	
}