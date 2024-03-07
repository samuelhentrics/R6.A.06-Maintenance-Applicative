import java.time.LocalDate;

public class ASimpleClass {

    public ASimpleClass() {
    }

    /**
     * Additionne firstParameter et b
     * @param firstParameter - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int firstParameter, int b) {
        return firstParameter + b ;
    }

    public static void main(String[] args) {
        new ASimpleClass().add(1,2);

        System.out.println("Hello world");
        LocalDate today = LocalDate.now();
        if(DateUtils.isNowBetween(LocalDate.of(2024, 01, 01), LocalDate.of(2024, 12, 31))){
            System.out.println("Oui");
        }
        else{
            System.out.println("Non");
        }
    }

}


