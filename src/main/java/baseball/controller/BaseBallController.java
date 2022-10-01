package baseball.controller;

import baseball.domain.BaseBallNumbers;
import baseball.domain.BaseBallNumbersGenerator;
import baseball.view.BaseBallConsole;
import camp.nextstep.edu.missionutils.Console;

public class BaseBallController {

    private final BaseBallNumbersGenerator baseBallNumberGenerator;
    private final BaseBallConsole baseBallConsole;

    public BaseBallController(BaseBallNumbersGenerator baseBallNumberGenerator, BaseBallConsole baseBallConsole) {
        this.baseBallNumberGenerator = baseBallNumberGenerator;
        this.baseBallConsole = baseBallConsole;
    }

    public void start() {
        BaseBallNumbers computer = baseBallNumberGenerator.createRandomBaseBallNumbers();
        baseBallConsole.startBaseball();
        BaseBallNumbers user = baseBallNumberGenerator.createBaseBallNumbers(Console.readLine());
    }
}
