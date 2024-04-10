package org.example2;

import org.example2.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * [요구사항]
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */
public class CalculatorTest {

    // 2개의 피연산자, 1개의 연산자를 Calculator 에게 전달 & 작업 위임
    // 피연산자 + 피연산자 ------------> Calculater
    //     결과        <------------
    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")   // 지정된 항목을 소스로 사용할꺼임
    void calculateTest(int operand1, String operator, int operand2, int result) {
        int calculateResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }

    // PositiveNum 이 무조건 '양수'임을 보장하기 때문에 아래 테스트 코드는 불필요
//    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalException 예외를 발생시킨다.")
//    @Test
//    void calculateExceptionTest() {
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class);
//    }
}
