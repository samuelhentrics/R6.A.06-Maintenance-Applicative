public class Application {
    public static void main(String[] args) {
        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", 20);

        moi.startCar(maCar);
        maCar.accelerate();
        moi.changeSpeed(maCar, 80);
        maCar.slow();
        moi.changeSpeed(maCar,30);
        moi.stopCar(maCar);
        System.out.println("fini");
    }
}
