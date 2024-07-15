package org.java.course.lesson2.homeTask_2_progress;

public class Fence implements Obstacle {

    private double height;

    public Fence(double height) {
        this.height = height;
    }

    @Override
    public boolean participation(Participant participant) {
        if (participant.jamp(height)) {
            return true;
        } else {
            return false;
        }
    }
}