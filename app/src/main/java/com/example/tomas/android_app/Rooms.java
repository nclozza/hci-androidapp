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

    public static class Room {

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
}
