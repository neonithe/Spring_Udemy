package org.example;

import org.example.modul.Coach;
import org.example.modul.TrackCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create the object
        Coach coach = new TrackCoach();
        // Use the object
        System.out.println(coach.getDailyWorkout());
    }

}
