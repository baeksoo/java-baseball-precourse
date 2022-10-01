package baseball;

import baseball.controller.BaseBallController;
import baseball.domain.BaseBallNumbersGenerator;
import baseball.view.BaseBallConsole;

public class Application {
    public static void main(String[] args) {

        BaseBallController baseBallGameController = new BaseBallController(new BaseBallNumbersGenerator(),
                new BaseBallConsole());
        baseBallGameController.start();
    }
}
