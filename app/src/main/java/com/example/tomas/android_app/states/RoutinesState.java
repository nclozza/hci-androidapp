package com.example.tomas.android_app.states;

import java.util.LinkedList;
import java.util.List;

public class RoutinesState {

    private List<Routine> routines;

    public RoutinesState() {
        this.routines = new LinkedList<>();
    }

    public RoutinesState(List<Routine> routines) {
        this.routines = routines;
    }

    public List<Routine> getRoutines() {
        return routines;
    }

    public class Routine {

        private String id;
        private String name;
        private transient String actions;
        private String meta;

        public Routine(String id, String name, String actions, String meta) {
            this.id = id;
            this.name = name;
            this.actions = actions;
            this.meta = meta;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getActions() {
            return actions;
        }

        public String getMeta() {
            return meta;
        }
    }
}
