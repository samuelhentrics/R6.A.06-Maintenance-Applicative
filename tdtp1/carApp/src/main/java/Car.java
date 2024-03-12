public class Car {
    /**
     * Constantes maximum speed
     */
    private static final int MAX_SPEED = 120;

    /**
     * Constantes minimum speed
     */
    private static final int MIN_SPEED = 0;

    /**
     * Model is the car model
     */
    private String model;

    /**
     * Color is the car color
     */
    private String color;

    /**
     * Speed is the car speed
     */
    private int speed;

    /**
     * Constructor of the class Car
     * @param model Model of the car
     * @param color Color of the car
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = MIN_SPEED;
    }

    public void changeSpeed(int newSpeed) {
        if (this.getSpeed() >= newSpeed) {
            while (this.getSpeed() > newSpeed) {
                this.slow();
            }
        }
        else  {
            while (this.getSpeed() < newSpeed) {
                this.accelerate();
            }
        }
    }

    /**
     * Get the speed of the car
     * @return the speed of the car
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Display the details of the car
     */
    protected void carDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    /**
     * Accelerate the car
     */
    public void accelerate() {
        if (speed + 10 <= MAX_SPEED) {
            speed += 10;
            // afficher détails
            carDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * Slow down the car
     */
    public void slow() {
        if (speed - 10 >= MIN_SPEED) {
            speed -= 10;
            // afficher détails
            carDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

