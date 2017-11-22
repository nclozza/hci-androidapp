package com.example.tomas.android_app.states;

public class DoorState {

    private Result result;

    public DoorState(String status, String lock) {
        this.result = new Result(status, lock);
    }

    public Result getResult() {
        return result;
    }

    public static class Result {

        private String status;
        private String lock;


        public Result(String status, String lock) {
            this.status = status;
            this.lock = lock;
        }

        public String getStatus() {
            return status;
        }

        public String getLock() {
            return lock;
        }
    }
}
