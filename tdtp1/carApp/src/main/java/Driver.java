
public class Driver {
    private static final int ADULT_AGE = 18;

    private String name;

    private int age;

    /**
     * Constructor of the class Driver
     * @param driverName The name of the driver
     * @param driverAge The age of the driver
     */
    public Driver(final String driverName, final int driverAge) {
        this.name = driverName;
        this.age = driverAge;
    }

    /**
     * Check if the driver is an adult
     * @return true if the driver is an adult, false otherwise
     */
    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

    /**
     * Start the car
     * @param car The car to start
     */
    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Stop the car
     * @param car The car to stop
     */
    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
        this.changeSpeed(car, 0);
    }

    /**
     * Change the speed of the car
     * @param car The car to change the speed
     * @param newSpeed The new speed of the car
     */
    @SuppressWarnings({"checkstyle:RightCurly", "checkstyle:FinalParameters"})
    public void changeSpeed(Car car, final int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        car.changeSpeed(newSpeed);
    }

}
