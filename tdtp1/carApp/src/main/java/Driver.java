public class Driver {
    private static final int ADULT_AGE = 18;
    private String name;
    private int age;

    public Driver(String driverName, int driverAge) {
        this.name = driverName;
        this.age = driverAge;
    }

    private boolean isAdult() {
        return age >= ADULT_AGE;
    }

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slow();
            }
        }
        else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }
}
