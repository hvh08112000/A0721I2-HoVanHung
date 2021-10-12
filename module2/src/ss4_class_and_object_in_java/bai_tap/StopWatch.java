package ss4_class_and_object_in_java.bai_tap;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
       this.starTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long elapsed = starTime - endTime;
        return elapsed;
    }
}
