public class Car {
    public static final int VITESSE_MAX = 120;
    public static final int VITESSE_MIN = 0;
    private String modele;
    private String couleur;
    private int vitesse;

    public Car(String modele, String couleur) {
        this.modele = modele;
        this.couleur = couleur;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + 10 <= VITESSE_MAX) {
            vitesse += 10;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - 10 >= VITESSE_MIN) {
            vitesse -= 10;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

