import java.util.*;
import java.text.SimpleDateFormat;

public class YearCalendar {
    static String getDaysNames(int weekStartDay) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_WEEK, weekStartDay);
        StringBuilder names = new StringBuilder("");
        for (int i = 0; i < 7; i += 1) {
            names.append(new SimpleDateFormat("E").format(calendar.getTime())).append(" ");
            calendar.add(Calendar.DATE, 1);
        }
        return names.toString();
    }

    static int checkInputDay(int day) {
        if (day >= 7 && day <= 1) {
            day = 2;
        }
        return day;
    }

    public static void main(String[] args) {
        int weekStartDay = 2;
        if (args.length == 1) {
            weekStartDay = checkInputDay(Integer.parseInt(args[0]));
        }
        int currentYear = new GregorianCalendar().get(Calendar.YEAR);
        String daysNames = getDaysNames(weekStartDay);
        int dateStringLength = daysNames.length() / 7;
        Calendar calendar = new GregorianCalendar(currentYear, 0, 1);
        while (calendar.get(Calendar.YEAR) == currentYear) {
            if (calendar.get(Calendar.DATE) == 1) {
                System.out.println();
                System.out.println(new SimpleDateFormat("MMM").format(calendar.getTime()));
                System.out.println(daysNames);
            }
            StringBuilder dates = new StringBuilder();
            int countAdded = 0;
            do {
                String tempDateString = String.valueOf(calendar.get(Calendar.DATE));
                dates.append(tempDateString);
                dates.append(" ".repeat(dateStringLength - tempDateString.length()));
                countAdded += 1;
                calendar.add(Calendar.DATE, 1);
            } while (calendar.get(Calendar.DAY_OF_WEEK) != weekStartDay && calendar.get(Calendar.DATE) != 1);
            if (countAdded != 7 && calendar.get(Calendar.DAY_OF_WEEK) == weekStartDay) {
                dates.insert(0, " ".repeat(dateStringLength * (7 - countAdded)));
            }
            System.out.println(dates.toString());
        }
    }
}