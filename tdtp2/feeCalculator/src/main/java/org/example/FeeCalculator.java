package org.example;

import java.util.List;

public class FeeCalculator {

    private static List<FeeStrategy> strategies = List.of(
            new ChildStrategy(),
            new AdultStrategy()
    );

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // je donne la file pour que cette recherche trouve la strategie
        // adaptée au visiteur et calcul le prix correspondant
        /**
        for (FeeStrategy strategy : strategies) {
            if (strategy.accept(visitor)) {
                fee = strategy.calculate(ticketType);
                break;
            }
        }
        **/

        int i = 0;
        int compteurStrategiesOk = 0;
        FeeStrategy strategy;
        while(i < strategies.size()){
            strategy = strategies.get(i);
            if (strategy.accept(visitor)) {
                fee = strategy.calculate(ticketType);
                compteurStrategiesOk++;
            }
            i++;
        }

        if(compteurStrategiesOk != 1){
            throw new IllegalArgumentException("TicketType not supported");
        }

        return fee;
    }

}
