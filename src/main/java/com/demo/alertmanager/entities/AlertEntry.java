package com.demo.alertmanager.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by id961900 on 19/07/2017.
 */
// @Builder
// @ToString
// @EqualsAndHashCode
// @Data
public class AlertEntry implements Serializable {
    private List<String> errors;
    private String errorCode;
    private String serviceId;
    private String severity;

    public List<String> getErrors() {
	return errors;
    }

    public void setErrors(List<String> errors) {
	this.errors = errors;
    }

    public String getErrorCode() {
	return errorCode;
    }

    public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
    }

    public String getServiceId() {
	return serviceId;
    }

    public void setServiceId(String serviceId) {
	this.serviceId = serviceId;
    }

    public String getSeverity() {
	return severity;
    }

    public void setSeverity(String severity) {
	this.severity = severity;
    }

}
