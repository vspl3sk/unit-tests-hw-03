import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.assertThat;

public class TestHW {
    @Test
    void evenOddNumberTest() {
        Assertions.assertThat(MainHW.evenOddNumber(1)).isEqualTo(false);
        assertThat(MainHW.evenOddNumber(2)).isEqualTo(true);
    }

    @ParameterizedTest
    @CsvSource({
            "-100, false",
            "-1, false",
            "0, false",
            "24, false",
            "25, true",
            "55, true",
            "100, true",
            "101, false",
            "150, false"
    })
    void numberInIntervalTest(int n, boolean result) {
        assertThat(MainHW.numberInInterval(n))
                .isEqualTo(result);
    }
}
