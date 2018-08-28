package com.demo.alertmanager.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by id961900 on 08/08/2017.
 */
// @EqualsAndHashCode
// @Getter
// @Setter
// @ToString
public class AlertConfigEntry implements Serializable {
    String serviceCode;
    String errorCode;
    List<String> emails;
    int maxCount;

    public String getServiceCode() {
	return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
	this.serviceCode = serviceCode;
    }

    public String getErrorCode() {
	return errorCode;
    }

    public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
    }

    public List<String> getEmails() {
	return emails;
    }

    public void setEmails(List<String> emails) {
	this.emails = emails;
    }

    public int getMaxCount() {
	return maxCount;
    }

    public void setMaxCount(int maxCount) {
	this.maxCount = maxCount;
    }

}
