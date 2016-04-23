package com.domain.parasect.iface;

/**
 * Description :
 *
 * @author T02452 on 4/21/2016.
 */
public interface LoginP {

    /**
     * user login
     * @param host host domain or ip
     * @param port port
     * @param username user name
     * @param password password
     */
    void login(String host, int port, String username, String password);

}
