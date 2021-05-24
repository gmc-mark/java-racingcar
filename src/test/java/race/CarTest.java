package race;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void TestConstructor() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Car("TestCar"));
    }

    @Test
    void TestGetPosition() {
        final Car test = new Car("Test");
    }
}