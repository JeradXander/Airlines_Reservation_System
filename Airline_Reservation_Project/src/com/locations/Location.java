package com.locations;

public class Location {

    //fields
    private String name;
    private Timezone timeZone;

    //constructor
    public Location(String nameArgs, Timezone timeZoneArgs) {
        name = nameArgs;
        timeZone = timeZoneArgs;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public Timezone getTimeZone() {
        return timeZone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
