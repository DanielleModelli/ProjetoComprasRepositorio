package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="dbo", name = "ErrorLog")
public class ErrorLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ErrorLogID")
	private Integer ErrorLogID ;

	@Column(name = "ErrorTime")
	private Date ErrorTime;
	
	@Column(name = "UserName")
	private String UserName; 
	
	@Column(name = "ErrorNumber")
	private Integer ErrorNumber; 
	
	@Column(name = "ErrorSeverity")
	private Integer ErrorSeverity; 
	
	@Column(name = "ErrorState")
	private Integer ErrorState; 
	
	@Column(name = "ErrorLine")
	private Integer ErrorLine; 
	
	@Column(name = "ErrorProcedure")
	private String ErrorProcedure;
	
	@Column(name = "ErrorMessage")
	private String ErrorMessage;

	public Integer getErrorLogID() {
		return ErrorLogID;
	}

	public void setErrorLogID(Integer errorLogID) {
		ErrorLogID = errorLogID;
	}

	public Date getErrorTime() {
		return ErrorTime;
	}

	public void setErrorTime(Date errorTime) {
		ErrorTime = errorTime;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public Integer getErrorNumber() {
		return ErrorNumber;
	}

	public void setErrorNumber(Integer errorNumber) {
		ErrorNumber = errorNumber;
	}

	public Integer getErrorSeverity() {
		return ErrorSeverity;
	}

	public void setErrorSeverity(Integer errorSeverity) {
		ErrorSeverity = errorSeverity;
	}

	public Integer getErrorState() {
		return ErrorState;
	}

	public void setErrorState(Integer errorState) {
		ErrorState = errorState;
	}

	public Integer getErrorLine() {
		return ErrorLine;
	}

	public void setErrorLine(Integer errorLine) {
		ErrorLine = errorLine;
	}

	public String getErrorProcedure() {
		return ErrorProcedure;
	}

	public void setErrorProcedure(String errorProcedure) {
		ErrorProcedure = errorProcedure;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

}