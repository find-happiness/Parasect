/**
 * Name： com.uniview
 * Copyright： (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 */
package com.uniview;

/**
 * Description :
 *
 * @author T02452 on 4/21/2016.
 * @see
 */
public class ThriftMethod {

    String comment = "";
    String retType = "";
    String method = "";
    String params = "";
    String args = "";

    public ThriftMethod(String comment, String retType, String method, String params, String args) {
        this.comment = comment;
        this.retType = retType;
        this.method = method;
        this.params = params;
        this.args = args;
    }

    public ThriftMethod() {
    }
    

    public ThriftMethod setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public ThriftMethod setRetType(String retType) {
        this.retType = retType;
        return this;
    }

    public ThriftMethod setMethod(String method) {
        this.method = method;
        return this;
    }

    public ThriftMethod setParams(String params) {
        this.params = params;
        return this;
    }

    public ThriftMethod setArgs(String args) {
        this.args = args;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public String getRetType() {
        return retType;
    }

    public String getMethod() {
        return method;
    }

    public String getParams() {
        return params;
    }

    public String getArgs() {
        return args;
    }
}
