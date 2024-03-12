package org.example;

public class ChildStrategy {
    static final double CHILD_PRICE_BASE = 100;

    static double calculateChildFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        throw (new IllegalArgumentException("TicketType not supported"));
    }
}