package com.baeldung.spring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
    	try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml")) {
    		LearningManager t = context.getBean(LearningManager.class);
            t.display();
    	}
    }

}
