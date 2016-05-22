/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Boat.Exception;

/**
 *
 * @author Elio
 */
public class RepetitException extends Exception {

    /**
     * Creates a new instance of <code>RepetitException</code> without detail
     * message.
     */
    public RepetitException() {
    }

    /**
     * Constructs an instance of <code>RepetitException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public RepetitException(String msg) {
        super(msg);
    }
}
