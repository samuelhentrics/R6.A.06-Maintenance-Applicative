package org.example;

public interface FeeStrategy {
    double calculate(TicketType ticketType);
    boolean accept(Visitor visitor);
    // Oui ou non le visitor a l'age de ma strategie
}
