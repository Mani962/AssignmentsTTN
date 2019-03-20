package com.ttn.springboot.event;
import com.ttn.springboot.entity.Student;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class Bootstrap {
    @EventListener(Student.class)
    public void init(){
        System.out.println("Your Application is up FOR STUDENT and running");
    }
}