package com.test.test;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class AppConfig extends ResourceConfig
{
    public AppConfig() {

        packages("com.test.resources");
    }
}
