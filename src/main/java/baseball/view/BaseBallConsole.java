package baseball.view;

import baseball.domain.BaseBallUmpire;

public class BaseBallConsole {

    public void startBaseball() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printUmpireResult(BaseBallUmpire umpire) {
        if (umpire.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        System.out.println(getBallsAndStrikesMessage(umpire));
    }

    private String getBallsAndStrikesMessage(BaseBallUmpire umpire) {
        return getBallsMessage(umpire) + getStrikesMessage(umpire);
    }

    private String getBallsMessage(BaseBallUmpire umpire) {
        String message = "";
        if (!umpire.isNoneBall()) {
            message += umpire.getBall() + "볼 ";
        }
        return message;
    }

    private String getStrikesMessage(BaseBallUmpire umpire) {
        String message = "";
        if (!umpire.isNoneStrike()) {
            message += umpire.getStrike() + "스트라이크";
        }
        return message;
    }
}
