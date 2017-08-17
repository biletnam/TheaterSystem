package com.ticket.system.util;

/**
 * Created by Dark Coder on 17/08/2017.
 */
public class TheaterUtil {

    public enum WEEKDAY {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int value;
        private WEEKDAY(int value) {
            this.value = value;
        }
    }

    public enum Ticket {
        STANDARD(10),
        OAP(7),
        STUDENT(8),
        CHILD(5);

        private int value;
        private Ticket(int value){
            this.value=value;
        }
    }

    public enum DiscountOfferDay {
        WEDNESDAY(3);
        private int value;
        private DiscountOfferDay(int value) {
            this.value = value;
        }
    }

    public enum ShowTime {
        MORNING,NOON,EVENING,NIGHT
    }



}
