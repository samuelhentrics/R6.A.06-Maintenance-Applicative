public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", 20);

        me.startCar(myCar);
        myCar.accelerate();
        me.changeSpeed(myCar, 80);
        myCar.slow();
        me.changeSpeed(myCar,30);
        me.stopCar(myCar);
        System.out.println("fini");
    }
}
