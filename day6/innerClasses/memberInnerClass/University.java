package oop.day6.innerClasses.memberInnerClass;

public class University {
    static class Admission {
        static boolean isEligible(int marks) {
            return marks >= 60;
        }
    }

    public static void main(String[] args) {
        boolean result = University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2 = University.Admission.isEligible(63);
        System.out.println(result2);

    }
}
