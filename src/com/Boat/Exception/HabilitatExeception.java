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
public class HabilitatExeception extends Exception {

    /**
     * Creates a new instance of <code>HabilitatExeception</code> without detail
     * message.
     */
    public HabilitatExeception() {
    }

    /**
     * Constructs an instance of <code>HabilitatExeception</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HabilitatExeception(String msg) {
        super(msg);
    }
}
