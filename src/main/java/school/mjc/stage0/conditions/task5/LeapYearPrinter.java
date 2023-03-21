package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean res = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int result = res == true ? 1 : 0;
        switch (result) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
        }
    }
}
