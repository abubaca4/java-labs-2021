import java.util.*;
import java.text.SimpleDateFormat;

public class YearCalendar {
    static String getDaysNames(int weekStartDay) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_WEEK, weekStartDay);
        String names = "";
        for (int i = 0; i < 7; i += 1) {
            names += new SimpleDateFormat("E").format(calendar.getTime()) + " ";
            calendar.add(Calendar.DATE, 1);
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
        int currentYear = new GregorianCalendar().get(Calendar.YEAR);
        String daysNames = getDaysNames(weekStartDay);
        Calendar calendar = new GregorianCalendar(currentYear, 0, 1);
        while (calendar.get(Calendar.YEAR) == currentYear) {
            if (calendar.get(Calendar.DATE) == 1) {
                System.out.println();
                System.out.println(new SimpleDateFormat("MMM").format(calendar.getTime()));
                System.out.println(daysNames);
            }
            String dates = "";
            int countAdded = 0;
            do {
                String tempDateString = String.valueOf(calendar.get(Calendar.DATE));
                if (tempDateString.length() < 2) {
                    tempDateString += " ";
                }
                dates += tempDateString + " ";
                countAdded += 1;
                calendar.add(Calendar.DATE, 1);
            } while (calendar.get(Calendar.DAY_OF_WEEK) != weekStartDay && calendar.get(Calendar.DATE) != 1);
            if (countAdded != 7 && calendar.get(Calendar.DAY_OF_WEEK) == weekStartDay) {
                for (int i = 0; i < (7 - countAdded); i += 1)
                    dates = "   " + dates;
            }
            System.out.println(dates);
        }
    }
}