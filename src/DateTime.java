import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;

public class DateTime {
    public static void getLocalDate() {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Today's Date " + today);
        System.out.println("Yesterday's Date " + yesterday);
        System.out.println("Tomorrow's  Date " + tomorrow);
        System.out.println(" ");
    }

    public static void manipulateHrsMin() {
        LocalTime time = LocalTime.of(11, 44, 32);
        LocalTime minusHrs = time.plusHours(1);
        LocalTime minusMin = time.minusMinutes(10);
        System.out.println("Actual time :" + time);
        System.out.println("After minus Hours now time is :" + minusHrs);
        System.out.println("After minus minutes now time is :" + minusMin);
        System.out.println(" ");
    }

    public static void addDays() {
        LocalDateTime dateTime1 = LocalDateTime.of(2022, Month.NOVEMBER, 19, 8, 12);
        LocalDateTime dateTime2 = dateTime1.plusDays(5);
        System.out.println("Date and Time  " + dateTime1);
        System.out.println("After adding days :" + dateTime2);
        System.out.println(" ");
    }

    public static void getMonthDay() {
        MonthDay month = MonthDay.now();
        System.out.println("Month and Day of month " + month);
        ValueRange yearRange = month.range(ChronoField.MONTH_OF_YEAR);
        ValueRange monthRange = month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(yearRange);
        System.out.println(monthRange);
    }

    public static void getZoneInfo() {
        LocalDateTime ldt = LocalDateTime.of(2023, Month.NOVEMBER, 9, 3, 23);
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoDateTime = ZonedDateTime.of(ldt, tokyo);
        System.out.println("Set the Date and Time of Tokyo " + tokyoDateTime);
        System.out.println(" ");
    }

    public static void getoffsetTime() {
        OffsetTime offTime = OffsetTime.now();
        System.out.println("Offset time :" + offTime);
        System.out.println("Hours " + offTime.getHour());
        System.out.println(" ");
    }

    public static void getoffsetDateTime() {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println("Offset date and time : " + offsetDT);
        System.out.println("Get the day of this month : " + offsetDT.getDayOfMonth());
        System.out.println(" ");
    }

    public static void getZone() {
        Clock c = Clock.systemDefaultZone();
        System.out.println("Get the zone " + c.getZone());
        System.out.println(" ");
    }

    public static void setHours() {
        ZoneOffset zone = ZoneOffset.ofHours(5);
        System.out.println("Set the Hours" + zone);
        System.out.println(" ");
    }

    public static void getLengthOfYear() {
        Year year = Year.of(2017);
        System.out.println("Total Days in Year :" + year.length());
        System.out.println(" ");
    }

    public static void getYearMonth() {
        YearMonth ym = YearMonth.now();
        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println("After Formatting Month and Year is : " + s);
        System.out.println(" ");
    }

    public static void getMonthDifference() {
        Period period1 = Period.ofMonths(4);
        Period period2 = period1.minus(Period.ofMonths(2));
        System.out.println("Difference of two month's : " + period2);
        System.out.println(" ");
    }

    public static void getSecondDuration() {
        Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println("Total Duration : " + duration.get(ChronoUnit.SECONDS));
        System.out.println(" ");
    }

    public static void getInstant() {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(" ");
    }

    public static void getNameOfWeek() {
        LocalDate localDate = LocalDate.of(2023, Month.APRIL, 13);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println("Day of the Week on" + " 13th April 2023 - " + dayOfWeek.name());
        System.out.println(" ");
    }

    public static void getNameOfMonth() {
        Month curMonth = Month.from(LocalDate.now());
        System.out.println("Current Month value : " + curMonth.getValue());
        System.out.println("Current Month name : " + curMonth.name());
    }
}

