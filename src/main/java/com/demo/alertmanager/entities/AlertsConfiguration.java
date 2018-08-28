package com.demo.alertmanager.entities;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by id961900 on 08/08/2017.
 */
@Configuration
@ConfigurationProperties(prefix = "alerts")
// @Getter
// @Setter
public class AlertsConfiguration {

    private List<AlertConfigEntry> alertConfigurations;

    public List<AlertConfigEntry> getAlertConfigurations() {
	return alertConfigurations;
    }

    public void setAlertConfigurations(List<AlertConfigEntry> alertConfigurations) {
	this.alertConfigurations = alertConfigurations;
    }

}
