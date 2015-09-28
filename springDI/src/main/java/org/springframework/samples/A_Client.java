package org.springframework.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A_Client {

    public static void main(String[] args){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("/META-INF/application-context.xml");

        B_Service b = (B_Service)context.getBean("b");
        long total = b.adjustment("フェーズ2B研修", 10);
        System.out.println("合計:" + total);


    }

}
