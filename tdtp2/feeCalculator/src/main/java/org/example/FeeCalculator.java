package org.example;

public class FeeCalculator {

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // calculate price for adults
        if (visitor.age > 14) {
            AdultStrategy stratAdult = new AdultStrategy();
            fee = stratAdult.calculate(ticketType);
        }

        // calculate price for children
        if (visitor.age <= 14) {
            ChildStrategy stratChild = new ChildStrategy();
            fee = stratChild.calculate(ticketType);
        }
        return fee;
    }

}
