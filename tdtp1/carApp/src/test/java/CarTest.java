import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testSpeedUp() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        car.slow();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testShowDetails() {
        car.carDetails();

        /** Modèle : Sedan
        Couleur : Bleu
        Vitesse actuelle : 0
        **/

    }
}
