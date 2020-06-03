package com.enquero.connector.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.net.URL;
import java.net.URLConnection;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;

import com.enquero.connector.internal.param.CustomParameters;

/**
 * This class is a container for operations, every public method in this class
 * will be taken as an extension operation.
 */
public class BasicOperations {

	@MediaType(value = ANY, strict = false)
	@Alias("AuditOps")
	public String Audit(@Config BasicConfiguration config,
			@ParameterGroup(name = "Custom Params") CustomParameters param) {

		return "Parameters:\n " + "\nAPI Name: " + param.getApiName() + "\nDesitination: " + param.getDestination()
				+ "\nDEsitination: " + param.getErrorCode() + "\nDEsitination: " + param.getErrorMsg()
				+ "\nDEsitination: " + param.getFlowName() + "\nDEsitination: " + param.getLogTime()
				+ "\nDEsitination: " + param.getSource() + "\nDEsitination: " + param.getTransactionID()
				+ " \nConfig Details:\n " + config.getProtocol();

	}

	@MediaType(value = ANY, strict = false)
	@Alias("LoggingOps")
	public String Logging(@Config BasicConfiguration config,
			@ParameterGroup(name = "Custom Params2") CustomParameters param) {
		return "Parameters: " + param + " \nConfig Details:\n " + config.getProtocol();
	}

	@MediaType(value = ANY, strict = false)
	private String getCall(@Config BasicConfiguration config) {
		String response = null;
		String protocol = config.getProtocol().equals("HTTPS") ? "https://" : "http://";
		try {
			URL url = new URL(protocol);
			URLConnection con = url.openConnection();
		} catch (Exception e) {

		}

		return null;
	}

}
