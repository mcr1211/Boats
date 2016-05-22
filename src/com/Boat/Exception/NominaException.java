/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Exception;

/**
 *
 * @author Toni Dalmau Martínez
 */
public class NominaException extends Exception {

    /**
     * Creates a new instance of <code>NominaException</code> without detail
     * message.
     */
    public NominaException() {
    }

    /**
     * Constructs an instance of <code>NominaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NominaException(String msg) {
        super(msg);
    }
}
