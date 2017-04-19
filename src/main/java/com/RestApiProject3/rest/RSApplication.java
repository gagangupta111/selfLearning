package com.RestApiProject3.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class RSApplication extends Application
{
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(JSONService.class);
        return s;
    }
}