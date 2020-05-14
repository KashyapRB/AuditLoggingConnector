package com.enquero.connector.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import java.net.URL;
import java.net.URLConnection;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

/**
 * This class is a container for operations, every public method in this class
 * will be taken as an extension operation.
 */
public class BasicOperations {

	@MediaType(value = ANY, strict = false)
	@Alias("AuditOps")
	public String Audit(@Config BasicConfiguration config, String apiName, String transID, String errorMsg) {

		return "Config Details:\n " + config.getAppId() + ":" + config.getAppName() + ": " + config.getAppVersion()
				+ ",\n API Name: " + apiName + ", TransactionID: " + transID + ", Error Msg: " + errorMsg;
	}

	@MediaType(value = ANY, strict = false)
	@Alias("LoggingOps")
	public String Logging(@Config BasicConfiguration config, String apiName, String transID, String errorMsg) {
		return "Config Details:\n " + config.getAppId() + ":" + config.getAppName() + ": " + config.getAppVersion()
				+ ", API Name: " + apiName + ", TransactionID: " + transID + ", Error Msg: " + errorMsg;
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
