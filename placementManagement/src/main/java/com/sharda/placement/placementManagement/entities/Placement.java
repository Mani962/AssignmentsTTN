package com.sharda.placement.placementManagement.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Placement_id;

    private String PlacementOfficerName;
    private String username;
    private String password;
    private String email;
    private int mobilenumber;

    public Placement(String placementOfficerName, String username, String password, String email, int mobilenumber) {
        PlacementOfficerName = placementOfficerName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobilenumber = mobilenumber;
    }

    public int getPlacement_id() {
        return Placement_id;
    }

    public Placement setPlacement_id(int placement_id) {
        Placement_id = placement_id;
        return this;
    }

    public String getPlacementOfficerName() {
        return PlacementOfficerName;
    }

    public Placement setPlacementOfficerName(String placementOfficerName) {
        PlacementOfficerName = placementOfficerName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Placement setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Placement setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Placement setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public Placement setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
        return this;
    }

    @Override
    public String toString() {
        return "Placement{" +
                "Placement_id=" + Placement_id +
                ", PlacementOfficerName='" + PlacementOfficerName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobilenumber=" + mobilenumber +
                '}';
    }
}
