package com.example.tomas.android_app.states;

public class TimerState {

    private Result result;

    public TimerState(String status, int interval, int remaining) {
        this.result = new Result(status, interval, remaining);
    }

    public Result getResult() {
        return result;
    }

    public static class Result {

        private String status;
        private int interval;
        private int remaining;

        public Result(String status, int interval, int remaining) {
            this.status = status;
            this.interval = interval;
            this.remaining = remaining;
        }

        public String getStatus() {
            return status;
        }

        public int getInterval() {
            return interval;
        }

        public int getRemaining() {
            return remaining;
        }
    }
}
