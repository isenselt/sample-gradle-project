package lt.veriffy.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordStrengthValidatorTest {

    @Test
    void fakeTest() {
        PasswordStrengthValidator sut = new PasswordStrengthValidator();
        sut.validate("");
        assertFalse(sut.validate("password"));
    }
}
