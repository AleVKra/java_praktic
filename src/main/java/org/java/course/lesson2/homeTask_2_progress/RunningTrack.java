package org.java.course.lesson2.homeTask_2_progress;


public class RunningTrack implements Obstacle {
    final double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    @Override
    public boolean participation(Participant participant) {

        if (participant.running(length)) {
//            System.out.println(participant.toString() +
//                    " справился с дистанцией " +
//                    length);
            return true;
        } else {
            return false;
        }
    }
}
