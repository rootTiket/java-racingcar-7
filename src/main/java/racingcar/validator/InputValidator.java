package racingcar.validator;

import static racingcar.View.constant.ErrorMessage.TOO_LONG_VALUE;

import racingcar.global.exception.RacingcarException;

public class InputValidator {
    public void check(String input) {
        checkStringLength(input);
    }

    public void checkStringLength(String input) {
        if (input.length() > 5) {
            throw new RacingcarException(TOO_LONG_VALUE);
        }
    }
}
