package Java8PartTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class DateProgram{
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("  ---- ");

        LocalDate ld1 = LocalDate.of(23 , 2 , 2024);
        System.out.println(ld1);
    }
}