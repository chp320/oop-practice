package org.example3;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;


    // List 형식으로 받은 데이터를 일급 컬렉션으로 변경
    public GradeCalculator(List<Course> courses) {
         this.courses = new Courses(courses);
    }

    /**
     * 요구 사항
     * 평균학점 계산 방법 = (학점수 x 교과목 평점)의 합계 / 수강신청 총학점 수
     * 일급 컬렉션 사용
     */
    public double calculateGrade() {

        // (학점수 x 교과목 평점)의 합계
        // 기존에 수행하던 계산 로직을 다른 클래스로 위임
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
