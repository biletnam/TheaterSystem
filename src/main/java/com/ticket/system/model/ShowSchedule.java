package com.ticket.system.model;

import com.ticket.system.util.TheaterUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by Dark Coder on 17/08/2017.
 */
public class ShowSchedule {

    private Integer showId;
    private List<TheaterUtil.WEEKDAY> runningOnDay;
    private List<TheaterUtil.ShowTime> runningTimePerDay;
    private Integer numberOfSeat;
    private Integer numberOfSeatBooked;
    private Date startFrom;
    private Date endTo;
    private Boolean isShowActive;

    public ShowSchedule() {}

    public ShowSchedule(Integer showId, List<TheaterUtil.WEEKDAY> runningOnDay, List<TheaterUtil.ShowTime> runningTimePerDay, Integer numberOfSeat, Date startFrom, Date endTo, Boolean isShowActive) {
        this.showId = showId;
        this.runningOnDay = runningOnDay;
        this.runningTimePerDay = runningTimePerDay;
        this.numberOfSeat = numberOfSeat;
        this.startFrom = startFrom;
        this.endTo = endTo;
        this.isShowActive = isShowActive;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public List<TheaterUtil.WEEKDAY> getRunningOnDay() {
        return runningOnDay;
    }

    public void setRunningOnDay(List<TheaterUtil.WEEKDAY> runningOnDay) {
        this.runningOnDay = runningOnDay;
    }

    public List<TheaterUtil.ShowTime> getRunningTimePerDay() {
        return runningTimePerDay;
    }

    public void setRunningTimePerDay(List<TheaterUtil.ShowTime> runningTimePerDay) {
        this.runningTimePerDay = runningTimePerDay;
    }

    public Integer getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(Integer numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public Boolean getIsShowActive() {
        return isShowActive;
    }

    public void setIsShowActive(Boolean isShowActive) {
        this.isShowActive = isShowActive;
    }

    public Date getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(Date startFrom) {
        this.startFrom = startFrom;
    }

    public Date getEndTo() {
        return endTo;
    }

    public void setEndTo(Date endTo) {
        this.endTo = endTo;
    }

    public Integer getNumberOfSeatBooked() {
        return numberOfSeatBooked;
    }

    public void setNumberOfSeatBooked(Integer numberOfSeatBooked) {
        this.numberOfSeatBooked = numberOfSeatBooked;
    }

    @Override
    public String toString() {
        return "ShowSchedule{" +
                "showId=" + showId +
                ", runningOnDay=" + runningOnDay +
                ", runningTimePerDay=" + runningTimePerDay +
                ", numberOfSeat=" + numberOfSeat +
                ", numberOfSeatBooked=" + numberOfSeatBooked +
                ", startFrom=" + startFrom +
                ", endTo=" + endTo +
                ", isShowActive=" + isShowActive +
                '}';
    }
}
