package org.example3;

import java.util.List;

/** 일급 컬렉션이란?
 *  - 단 하나의 컬렉션 형태만 인스턴스로 가지는 클래스. 해당 컬렉션에 대한 처리 '책임'을 가진다.
 */
public class Courses {

    private final List<Course> courses; // 이수한 과목

    public Courses(List<Course> courses) {
        this.courses = courses;
    }


    public double multiplyCreditAndCourseGrade() {
        // 아래 코드를 간단하게 표현
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

        // '아래'
//        double multipliedCreditAndCourseGrade = 0;
//        // 학점수 x 교과목 평점. 을 구하기 위해 반복문 수행
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//
//        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(course -> course.getCredit())         // 람다식으로 Course::getCredit 로 표현 가능
                .sum();
    }
}
