package kws.ws.client;

import kws.ws.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:client-spring-context.xml");
        HelloWorld client = (HelloWorld) context.getBean("helloWorld");
        client.sayHello();

    }
}
