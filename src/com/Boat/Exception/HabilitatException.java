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
public class HabilitatException extends Exception {

    /**
     * Creates a new instance of <code>habilitatException</code> without detail
     * message.
     */
    public HabilitatException() {
    }

    /**
     * Constructs an instance of <code>habilitatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HabilitatException(String msg) {
        super(msg);
    }
}
