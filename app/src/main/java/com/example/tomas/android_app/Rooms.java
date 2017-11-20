package com.example.tomas.android_app;

import java.util.LinkedList;
import java.util.List;

public class Rooms {

    List<Room> rooms;

    public Rooms() {
        this.rooms = new LinkedList<>();
    }

    public Rooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
