package com.enquero.connector.internal.param;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class CustomParameters {
	@Parameter
	@Optional(defaultValue = "Demo APP")
	private String apiName;

	@Parameter
	@Optional(defaultValue = "Demo Flow")
	private String flowName;

	@Parameter
	@Optional(defaultValue = "Demo Error Code 123")
	private String errorCode;

	@Parameter
	@Optional(defaultValue = "Demo Error Msg")
	private String errorMsg;

	@Optional(defaultValue = "Demo transID: 101")
	@Parameter
	private String transactionID;

	@Parameter
	@Optional(defaultValue = "Demo Source")
	private String source;

	@Optional(defaultValue = "Demo destinaion")
	@Parameter
	private String destination;

	@Optional(defaultValue = "Demo LogTime")
	@Parameter
	private String logTime;
	
	
	

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getLogTime() {
		return logTime;
	}

	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

}
