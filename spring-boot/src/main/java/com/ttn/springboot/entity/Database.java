package com.ttn.springboot.entity;

import org.springframework.beans.factory.annotation.Value;

public class Database {
    @Value("${server.port}")
    Integer Port;
    @Value("${server.name}")
    String Name;

    public Database() {

    }

    public Database(Integer port) {
        Port = port;
    }


    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "Port=" + Port +
                ", Name='" + Name + '\'' +
                '}';
    }
}
