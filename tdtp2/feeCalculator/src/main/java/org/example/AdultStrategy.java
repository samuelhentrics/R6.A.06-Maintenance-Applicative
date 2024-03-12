package org.example;

public class AdultStrategy {
    static final double ADULT_PRICE_BASE = 100;

    static double calculateAdultFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return ADULT_PRICE_BASE * 0.6;
        } else if (TicketType.FULL_DAY == ticketType) {
            return ADULT_PRICE_BASE * 1.2;
        }
        throw (new IllegalArgumentException("TicketType not supported"));
    }
}