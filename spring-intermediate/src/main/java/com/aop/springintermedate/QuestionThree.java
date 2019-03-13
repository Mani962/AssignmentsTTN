package com.aop.springintermedate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Database implements ApplicationEventPublisherAware {

    @Value("3306")
    private int port;
    @Value("MySql")
    private String name;
    private ApplicationEventPublisher applicationEventPublisher;

    int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void connect() {
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("=============Database Connected...=================");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}

class CustomEvent extends ApplicationEvent {
    CustomEvent(Object object) {
        super(object);
    }
}

@Component
class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.getSource());
    }
}

public class QuestionThree {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springi-config.xml");
        Database db = ctx.getBean("database", Database.class);
        System.out.println("==========Database: " + db.getName() + " Port: " + db.getPort());
        ctx.start();
        db.connect();
        ctx.stop();
        ctx.close();

    }
}
