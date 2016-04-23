/**
 * Name： com.uniview.thrifttail.iface
 * Copyright： (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 */
package com.domain.parasect.iface;

/**
 * Description :
 *
 * @author T02452 on 4/21/2016.
 */
public interface LoginV {


    void loginSuccess(String info);

    void loginFailed(String errorInfo);


}
