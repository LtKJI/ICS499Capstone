/*
 * Author: Thrown Exceptions
 * ICS499 Capstone 2020
 */
package com.ICS499.ThrownException.DigitalFileCabinet;

public interface DFCState {
    void setState(DFCContext context);
    void createAccount();
    void makeQuery();
}
