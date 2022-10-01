package baseball;

import baseball.controller.BaseBallController;
import baseball.domain.BaseBallNumbersGenerator;

public class Application {
    public static void main(String[] args) {

        BaseBallController baseBallGameController = new BaseBallController(new BaseBallNumbersGenerator());
        baseBallGameController.start();
    }
}
