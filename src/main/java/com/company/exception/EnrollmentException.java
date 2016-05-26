/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.exception;

/**
 *
 * @author P0007
 */
public class EnrollmentException extends RuntimeException {

    private static final long serialVersionUID = -6513666078709813858L;
    private String exceptionMessage;

    public EnrollmentException(String exceptionMessage) {
        super();
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
