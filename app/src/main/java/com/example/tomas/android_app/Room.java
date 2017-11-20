package com.example.tomas.android_app;

public class Room {

    private String id;
    private String name;
    private String meta;

    public Room(String id, String name, String meta) {
        this.id = id;
        this.name = name;
        this.meta = meta;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMeta() {
        return meta;
    }
}
