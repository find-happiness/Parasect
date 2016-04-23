/**
 * Name： com.uniview
 * Copyright： (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 */
package com.uniview;

import java.io.File;

/**
 * Description :
 *
 * @author T02452 on 4/21/2016.
 * @see
 */
public class FH {

    public static String s(String path) {
        return  path.replace("/", File.separator).replace("\\", File.separator);
    }
}
