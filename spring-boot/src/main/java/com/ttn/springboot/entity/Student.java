package com.ttn.springboot.entity;

public class Student {
    private Integer id;
    private String Name;
    private String Competency;

    public Student(Integer id, String name, String competency) {
        this.id = id;
        Name = name;
        Competency = competency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompetency() {
        return Competency;
    }

    public void setCompetency(String competency) {
        Competency = competency;
    }

}
