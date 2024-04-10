package org.example3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {
    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A++"))
                .doesNotThrowAnyException();    // Course가 정상 생성되었다면 어떤 exception도 발생하지 않음. 을 의미
    }
}
