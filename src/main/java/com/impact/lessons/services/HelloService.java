package com.impact.lessons.services;

import com.impact.lessons.constants.AppConstants;

public class HelloService {
    public HelloService(){
        AppConstants appConstants = new AppConstants();
    }

    public String sayHello(){
        return AppConstants.HelloWorld;
    }

}
