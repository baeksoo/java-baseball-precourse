package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BaseBallNumbers {
    private final List<Integer> numbers;

    public BaseBallNumbers(Set<Integer> generatedNumbers) {
        this.numbers = new ArrayList<>(generatedNumbers);
    }

    public List<Integer> getThreeDigits() {
        return numbers;
    }
}
