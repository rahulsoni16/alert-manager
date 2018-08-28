package com.demo.alertmanager.entities;

import java.io.Serializable;

/**
 * {@link CustomErrorResponse} will be returned in case of custom error
 * occurrence Necessary for proper Swagger documentation.
 *
 * @author romih
 */
@SuppressWarnings("unused")
// @AllArgsConstructor
// @Getter
public class CustomErrorResponse implements Serializable {

    private static final long serialVersionUID = -7755563009111273632L;

    private String errorCode;

    private String errorMessage;

    public CustomErrorResponse(String errorCode, String errorMessage) {
	super();
	this.errorCode = errorCode;
	this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
	return errorCode;
    }

    public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
    }

    public String getErrorMessage() {
	return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
    }

}
