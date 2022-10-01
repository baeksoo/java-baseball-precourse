package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class BaseBallNumberGeneratorTest {

    @Test
    public void 서로_다른_3자리_숫자_생성() {

        // given
        BaseBallNumbersGenerator baseBallNumberGenerator = new BaseBallNumbersGenerator();

        // when
        BaseBallNumbers baseBallNumbers = baseBallNumberGenerator.createRandomBaseBallNumbers();

        // then
        Set<Integer> nonDuplicates = new HashSet<>(baseBallNumbers.getThreeDigits());
        assertThat(new HashSet<>(nonDuplicates)).hasSize(3);
    }

}