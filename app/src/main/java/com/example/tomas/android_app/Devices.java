package com.example.tomas.android_app;

import java.util.LinkedList;
import java.util.List;

public class Devices {

    List<Device> devices;

    public Devices() {
        this.devices = new LinkedList<>();
    }

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }


    public static class Device {

        private String id;
        private String name;
        private String typeId;
        private String meta;

        public Device(String id, String name, String typeId, String meta) {
            this.id = id;
            this.name = name;
            this.typeId = typeId;
            this.meta = meta;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getTypeId() {
            return typeId;
        }

        public String getMeta() {
            return meta;
        }
    }

}
