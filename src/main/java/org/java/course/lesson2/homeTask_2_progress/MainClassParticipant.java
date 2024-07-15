package org.java.course.lesson2.homeTask_2_progress;

import java.util.ArrayList;
import java.util.List;

public class MainClassParticipant {

    public static void main(String[] args) {
        List<Participant> participantes = new ArrayList<>();
        participantes.add(new Human("Pasha"));
        participantes.add(new Robot("Misha"));
        participantes.add(new Cat("Musya"));
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Fence(1.0));
        obstacles.add(new RunningTrack(450));
        for (Participant p : participantes) {
            for (Obstacle o : obstacles) {
                if (!o.participation(p)) break;
            }
        }
    }
}