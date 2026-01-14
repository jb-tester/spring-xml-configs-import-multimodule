package com.mytests.spring.app.runners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class SrcInAllModules {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("files_from_src.xml");
        System.out.println("--- beans is context:");
        Arrays.sort(ctx.getBeanDefinitionNames());
        for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
