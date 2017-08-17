package com.ticket.system;

import com.ticket.system.model.MovieShow;

/**
 * Created by Dark Coder on 17/08/2017.
 */
public class Main {


    public static void main(String ...arg) {

    }

    private static MovieShow createMovie(Integer movieId, String movieName, String description, Integer numberOfShowPerDay, Integer movieLengthInHour, Boolean movieIsActive) {
        MovieShow movie = new MovieShow(movieId, movieName, description, numberOfShowPerDay, movieLengthInHour, movieIsActive);
        return movie;
    }

    private static void scheduleMovieShow() {

    }
}
