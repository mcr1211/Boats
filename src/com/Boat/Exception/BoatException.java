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
public class BoatException extends Exception {

    /**
     * Creates a new instance of <code>BoatException</code> without detail
     * message.
     */
    public BoatException() {
    }

    /**
     * Constructs an instance of <code>BoatException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BoatException(String msg) {
        super(msg);
    }
}
