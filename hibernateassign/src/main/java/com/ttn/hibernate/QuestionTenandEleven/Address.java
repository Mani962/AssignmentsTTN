package com.ttn.hibernate.QuestionTenandEleven;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private Integer StreetNumber;
    private String  Location;
    private  String State;

    public Integer getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
