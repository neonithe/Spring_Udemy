package org.example.modul;

import org.example.modul.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

}
