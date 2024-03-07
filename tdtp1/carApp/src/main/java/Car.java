public class Car {
    private static final int MAX_SPEED = 120;
    private static final int MIN_SPEED = 0;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    private void carDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    public void accelerate() {
        if (speed + 10 <= MAX_SPEED) {
            speed += 10;
            // afficher détails
            carDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

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

