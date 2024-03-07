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
    public void testAccelerer() {
        car.accelerer();
        assertThat(car.getVitesse()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        car.accelerer();
        car.ralentir();
        assertThat(car.getVitesse()).isEqualTo(0);
    }

    @Test
    public void testAfficherDetails() {
        // How to assert the output using AssertJ for console output?
        // Note: Testing console output is often more complex and depends on additional libraries.
    }
}
