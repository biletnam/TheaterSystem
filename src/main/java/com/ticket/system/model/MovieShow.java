package com.ticket.system.model;

/**
 * Created by Dark Coder on 17/08/2017.
 */
public class MovieShow {

    private Integer movieId;
    private String movieName;
    private String description;
    private Integer numberOfShowPerDay;
    private Integer movieLengthInHour;
    private Boolean movieIsActive;

    public MovieShow(){}

    public MovieShow(Integer movieId, String movieName, String description, Integer numberOfShowPerDay, Integer movieLengthInHour, Boolean movieIsActive) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.description = description;
        this.numberOfShowPerDay = numberOfShowPerDay;
        this.movieLengthInHour = movieLengthInHour;
        this.movieIsActive = movieIsActive;
    }

    public MovieShow(String movieName, String description, Integer numberOfShowPerDay, Integer movieLengthInHour, Boolean movieIsActive) {
        this.movieName = movieName;
        this.description = description;
        this.numberOfShowPerDay = numberOfShowPerDay;
        this.movieLengthInHour = movieLengthInHour;
        this.movieIsActive = movieIsActive;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfShowPerDay() {
        return numberOfShowPerDay;
    }

    public void setNumberOfShowPerDay(Integer numberOfShowPerDay) {
        this.numberOfShowPerDay = numberOfShowPerDay;
    }

    public Integer getMovieLengthInHour() {
        return movieLengthInHour;
    }

    public void setMovieLengthInHour(Integer movieLengthInHour) {
        this.movieLengthInHour = movieLengthInHour;
    }

    public Boolean getMovieIsActive() {
        return movieIsActive;
    }

    public void setMovieIsActive(Boolean movieIsActive) {
        this.movieIsActive = movieIsActive;
    }

    @Override
    public String toString() {
        return "MovieShow{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", description='" + description + '\'' +
                ", numberOfShowPerDay=" + numberOfShowPerDay +
                ", movieLengthInHour=" + movieLengthInHour +
                ", movieIsActive=" + movieIsActive +
                '}';
    }
}
