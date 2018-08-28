package com.demo.alertmanager.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.demo.alertmanager.entities.AlertEntry;
import com.demo.alertmanager.services.AlertsService;
import com.google.gson.Gson;

/**
 * Created by id961900 on 11/08/2017.
 */
public class AlertsControllerTest {
    private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
	    MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    private MockMvc mockMvc;

    private AlertsService alertsService;

    private AlertEntry alertEntry;

    @Before
    public void setUp() throws Exception {
	AlertsController alertsController = new AlertsController();
	alertEntry = null;// AlertEntry.builder().errorCode("errorCode").serviceId("serviceCode").severity("CRITICAL").errors(Arrays.asList("error
			  // one")).build();
	ErrorHandler errorHandler = new ErrorHandler();
	this.alertsService = Mockito.mock(AlertsService.class);
	ReflectionTestUtils.setField(alertsController, "alertsService", this.alertsService);
	this.mockMvc = MockMvcBuilders.standaloneSetup(alertsController, errorHandler).build();

    }

    @Test
    public void getAllAlerts() throws Exception {
	Mockito.when(this.alertsService.getAllAlerts()).thenReturn(new ArrayList<>());
	this.mockMvc.perform(get("/alerts")).andExpect(status().isOk());
    }

    @Test
    public void createAlert() throws Exception {
	Mockito.doNothing().when(this.alertsService).createAlertEntry(Mockito.any());
	this.mockMvc.perform(post("/alerts").contentType(APPLICATION_JSON_UTF8).content(new Gson().toJson(alertEntry)))
		.andExpect(status().isCreated());
    }

    @Test
    public void UpdateAlert() throws Exception {
	Mockito.doNothing().when(this.alertsService).updateAlertEntry(Mockito.anyString(), Mockito.anyString(),
		Mockito.any());
	this.mockMvc.perform(put("/alerts/serviceId/codeId").contentType(APPLICATION_JSON_UTF8)
		.content(new Gson().toJson(alertEntry))).andExpect(status().isOk());
    }

    @Test
    public void deleteAlter() throws Exception {
	Mockito.doNothing().when(this.alertsService).deleteAlertEntry(Mockito.anyString(), Mockito.anyString());
	this.mockMvc.perform(delete("/alerts/serviceId/codeId")).andExpect(status().isOk());
    }

    // @Test
    // public void getServiceAlert() throws Exception {
    // Mockito.when(this.alertsService.getAlertForServiceId(Mockito.anyString())).thenReturn(Arrays.asList(
    // AlertEntry.builder().errorCode("errorCode").serviceId("serviceCode").severity("CRITICAL").build()));
    // this.mockMvc.perform(get("/alerts/serviceId")).andExpect(status().isOk()).andExpect(content().string(
    // "[{\"errors\":null,\"errorCode\":\"errorCode\",\"serviceId\":\"serviceCode\",\"severity\":\"CRITICAL\"}]"));
    // }

}