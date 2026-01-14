package com.mytests.spring.app.runners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class NoPrefixImport {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("no_prefix.xml");
        System.out.println("--- beans is context:");
        Arrays.sort(ctx.getBeanDefinitionNames());
        for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
