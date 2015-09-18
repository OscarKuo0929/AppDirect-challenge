package com.appdirect.application;

import com.appdirect.api.AppDirectREST;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by oscarkuo on 9/17/15.
 */
public class MainApplication extends Application {

    private Set<Class<?>> classes = new HashSet<Class<?>>();
    private HashSet<Object> singletons = new HashSet<Object>();

    public MainApplication() {

        try {

            ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("applicationContext.xml");

            singletons.add(springContext.getBean("appDirectREST", AppDirectREST.class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Set<Class<?>> getClasses() {
        return classes;
    }

    protected ApplicationContext springContext;

    public Set<Object> getSingletons() {
        return singletons;
    }

}
