package com.example.tomas.android_app.states;

public class LampState {

    private Result result;

    public LampState(String status, String color, int brightness) {
        this.result = new Result(status, color, brightness);
    }

    public Result getResult() {
        return result;
    }

    public static class Result {

        private String status;
        private String color;
        private int brightness;

        private Result(String status, String color, int brightness) {
            this.status = status;
            this.color = color;
            this.brightness = brightness;
        }

        public String getStatus() {
            return status;
        }

        public String getColor() {
            return color;
        }

        public int getBrightness() {
            return brightness;
        }
    }
}
