package com.example.yarnfullstackdemo;

public class Spaceship {
    private String name;
    private String shipClass;
    private int crewCapacity;

    public Spaceship(String name, String shipClass, int crewCapacity) {
        this.name = name;
        this.shipClass = shipClass;
        this.crewCapacity = crewCapacity;
    }

    public String getName() {
        return name;
    }

    public String getShipClass() {
        return shipClass;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
}
