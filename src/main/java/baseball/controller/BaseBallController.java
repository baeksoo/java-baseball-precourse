package baseball.controller;

import baseball.domain.BaseBallNumbers;
import baseball.domain.BaseBallNumbersGenerator;

public class BaseBallController {

    private final BaseBallNumbersGenerator baseBallNumberGenerator;

    public BaseBallController(BaseBallNumbersGenerator baseBallNumberGenerator) {
        this.baseBallNumberGenerator = baseBallNumberGenerator;
    }

    public void start() {
        BaseBallNumbers computer = baseBallNumberGenerator.createRandomBaseBallNumbers();
    }
}
