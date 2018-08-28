package com.demo.alertmanager.entities;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by id961900 on 09/08/2017.
 */
@EqualsAndHashCode
@ToString
@Getter
@Setter
@Builder
public class AlertHolder implements Serializable {
    private String serviceCode;
    private List<AlertEntry> alerts;

    public String getServiceCode() {
	return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
	this.serviceCode = serviceCode;
    }

    public List<AlertEntry> getAlerts() {
	return alerts;
    }

    public void setAlerts(List<AlertEntry> alerts) {
	this.alerts = alerts;
    }

    public static AlertHolder builder() {

	return null;
    }
}
