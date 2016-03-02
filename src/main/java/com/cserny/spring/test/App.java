package com.cserny.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Leonardo on 02.03.2016.
 */
public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();
    }
}
