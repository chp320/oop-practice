package org.example4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {

    @DisplayName("메뉴 이름에 해당하는 메뉴를 반환한다.")
    @Test
    void chooseTest() {
        // 메뉴에는 여러 항목이 존재함
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));

        MenuItem menuItem = menu.choose("돈까스");

        // 객체 비교는 equals and hashCode() 추가!!
        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));
    }
}
