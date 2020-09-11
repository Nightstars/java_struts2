package com.christ.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("execute Action");
        return SUCCESS;
    }
}
