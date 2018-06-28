package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="dbo", name = "AWBuildVersion")
public class AWBuildVersion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SystemInformationID")
	private Integer SystemInformationID ;

	@Column(name = "DatabaseVersion")
	private String DatabaseVersion; 
	
	@Column(name = "VersionDate")
	private Date VersionDate;
		
	@Column(name = "ModifiedDate")
	private Date DataModificacao;

	public Integer getSystemInformationID() {
		return SystemInformationID;
	}


	public void setSystemInformationID(Integer systemInformationID) {
		SystemInformationID = systemInformationID;
	}


	public String getDatabaseVersion() {
		return DatabaseVersion;
	}


	public void setDatabaseVersion(String databaseVersion) {
		DatabaseVersion = databaseVersion;
	}


	public Date getVersionDate() {
		return VersionDate;
	}


	public void setVersionDate(Date versionDate) {
		VersionDate = versionDate;
	}


	public Date getDataModificacao() {
		return DataModificacao;
	}


	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}
	
}