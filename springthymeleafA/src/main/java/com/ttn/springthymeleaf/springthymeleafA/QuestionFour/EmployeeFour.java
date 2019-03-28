package com.ttn.springthymeleaf.springthymeleafA.QuestionFour;

public class EmployeeFour {
    private String name;
    private String password;
    private String competency;
    private int salary;
    private String mentor;

    public EmployeeFour(String name, String password, String competency, int salary, String mentor) {
        this.name = name;
        this.password = password;
        this.competency = competency;
        this.salary = salary;
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "EmployeeFour{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", competency='" + competency + '\'' +
                ", salary=" + salary +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}
