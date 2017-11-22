package com.example.tomas.android_app.states;

public class BlindsState {

    private Result result;

    public BlindsState(String status, int level) {
        this.result = new Result(status, level);
    }

    public Result getResult() {
        return result;
    }


    public static class Result {

        private String status;
        private int level;

        public Result(String status, int level) {
            this.level = level;
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public int getLevel() {
            return level;
        }

    }
}
