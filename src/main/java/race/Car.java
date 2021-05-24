package race;

public class Car {
    final String carName;
    int position = 0;

    public Car(final String carName) {
        validateCarNameLength(carName);
        this.carName = carName;
    }

    private void validateCarNameLength(final String carName) {
        if (4 < carName.length()) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    private void move () {
        this.position++;
    }

    private void stop() {
    }
}
