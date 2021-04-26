package com.locations;

public class Location {

    private String name;
    private Timezone timeZone;

    public Location(String nameArgs, Timezone timeZoneArgs) {
        name = nameArgs;
        timeZone = timeZoneArgs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
