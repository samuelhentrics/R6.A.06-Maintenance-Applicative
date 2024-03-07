public class Application {
    public static void main(String[] args) {
        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.demarrerVoiture(maCar);
        maCar.accelerer();
        moi.changerVitesse(maCar, 80);
        maCar.ralentir();
        moi.changerVitesse(maCar,30);
        moi.arreterVoiture(maCar);
        System.out.println("fini");
    }
}
