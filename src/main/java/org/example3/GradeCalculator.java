package org.example3;

import java.util.List;

public class GradeCalculator {

    private final List<Course> courses; // 이수한 과목

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 요구 사항
     * 평균학점 계산 방법 = (학점수 x 교과목 평점)의 합계 / 수강신청 총학점 수
     * 일급 컬렉션 사용
     */
    public double calculateGrade() {
        // (학점수 x 교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = 0;
        // 학점수 x 교과목 평점. 을 구하기 위해 반복문 수행
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(course -> course.getCredit())         // 람다식으로 Course::getCredit 로 표현 가능
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
