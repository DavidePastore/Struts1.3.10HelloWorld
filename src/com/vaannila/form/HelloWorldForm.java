package com.vaannila.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {

    private static final long serialVersionUID = -473562596852452021L;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}