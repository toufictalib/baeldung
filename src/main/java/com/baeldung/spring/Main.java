package com.baeldung.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext("context.xml");
            BaeldungManager t = context.getBean(BaeldungManager.class);
            t.display();
        } finally {
            if (context != null) {
                context.stop();
            }
        }
    }

}
