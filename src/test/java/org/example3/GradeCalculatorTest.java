package org.example3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구 사항
 * 평균학점 계산 방법 = (학점수 x 교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    /*
     * 학점계산기 도메인에는 뭐가 있을까? - 이수한 과목(객체지향프로그래밍, 자료구조, 중국어회화), 학점 계산기
     * 객체지향프로그래밍, 자료구조, 중국어회화 -------> 과목(코스) 클래스 로 표현 (동적인 객체를 정적인 타입으로 추상화)
     *
     * 이수한 과목을 전달하여 평균학점 계산 요청 ----> 학점 계산기 ----> (학점수 * 교과목 평점)의 합계 ----> 과목(코스)
     *                                               ----> 수강신청 총학점 수          ----> 과목(코스)
     */

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        // 학점계산기(GradeCalculator)에게 이수한 내역을 전달
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        // 전달받은 정보로 성적을 계산
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
