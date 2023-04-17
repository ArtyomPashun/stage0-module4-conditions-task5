package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int result = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0) ? 1 : 0;
        switch (result) {
            case (1) -> System.out.println("leap");
            default -> System.out.println("not leap");
        }
    }
}
