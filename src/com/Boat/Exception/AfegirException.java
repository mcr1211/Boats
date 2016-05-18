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
public class AfegirException extends BoatException {

    /**
     * Creates a new instance of <code>AfegirException</code> without detail
     * message.
     */
    public AfegirException() {
    }

    /**
     * Constructs an instance of <code>AfegirException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AfegirException(String msg) {
        super(msg);
    }
}
