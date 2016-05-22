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
public class EliminarException extends Exception {

    /**
     * Creates a new instance of <code>EliminarException</code> without detail
     * message.
     */
    public EliminarException() {
    }

    /**
     * Constructs an instance of <code>EliminarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EliminarException(String msg) {
        super(msg);
    }
}
