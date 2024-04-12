package org.example4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook = cooking.makeCook(menuItem);

        // 객체(cook) 간 비교를 하려면 equals() and hashCode() 를 추가해야 함
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
