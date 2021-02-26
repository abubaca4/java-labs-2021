import java.util.*;
import java.text.SimpleDateFormat;

public class Calendar {
    static String getDaysNames(int weekStartDay) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(GregorianCalendar.DAY_OF_WEEK, weekStartDay);
        String names = "";
        for (int i = 0; i < 7; i += 1) {
            names += new SimpleDateFormat("E").format(calendar.getTime()) + " ";
            calendar.add(GregorianCalendar.DATE, 1);
        }
        return names;
    }

    public static void main(String[] args) {
        int weekStartDay = 2;
        if (args.length == 1) {
            weekStartDay = Integer.parseUnsignedInt(args[0]) - 1;
            if (weekStartDay > 6) {
                weekStartDay %= 7;
            }
            weekStartDay += 1;
        }
        int currentYear = new GregorianCalendar().get(GregorianCalendar.YEAR);
        String daysNames = getDaysNames(weekStartDay);
        GregorianCalendar calendar = new GregorianCalendar(currentYear, 0, 1);
        while (calendar.get(GregorianCalendar.YEAR) == currentYear) {
            if (calendar.get(GregorianCalendar.DATE) == 1) {
                System.out.println();
                System.out.println(new SimpleDateFormat("MMM").format(calendar.getTime()));
                System.out.println(daysNames);
            }
            String dates = "";
            int countAdded = 0;
            do {
                String tempDateString = String.valueOf(calendar.get(GregorianCalendar.DATE));
                if (tempDateString.length() < 2) {
                    tempDateString += " ";
                }
                dates += tempDateString + " ";
                countAdded += 1;
                calendar.add(GregorianCalendar.DATE, 1);
            } while (calendar.get(GregorianCalendar.DAY_OF_WEEK) != weekStartDay
                    && calendar.get(GregorianCalendar.DATE) != 1);
            if (countAdded != 7 && calendar.get(GregorianCalendar.DAY_OF_WEEK) == weekStartDay) {
                for (int i = 0; i < (7 - countAdded); i += 1)
                    dates = "   " + dates;
            }
            System.out.println(dates);
        }
    }
}