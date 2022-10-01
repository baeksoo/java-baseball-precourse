package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedHashSet;
import java.util.Set;

public class BaseBallNumbersGenerator {

    public BaseBallNumbers createRandomBaseBallNumbers() {
        Set<Integer> generatedNumbers = new LinkedHashSet<>();
        while (generatedNumbers.size() < 3) {
            generatedNumbers.add(Randoms.pickNumberInRange(1, 9));
        }
        return new BaseBallNumbers(generatedNumbers);
    }
}
