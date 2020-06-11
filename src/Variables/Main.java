package Variables;

import java.awt.*;
import java.util.Date;
import java.util.Calendar;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        out.println(String.format("%d", 42)); //decimal
        System.out.println(String.format("%,.3f", 4252314f)); //floating point
        System.out.println(String.format("%x", 4252314)); //hexadecimal
        System.out.println(String.format("%c", 1000)); //character
        System.out.println(String.format("%tc", new Date())); //Date formatting: чт июн. 11 07:35:06 MSK 2020
        System.out.println(String.format("%tr", new Date())); //Date formatting: 07:35:47 AM
        Date date = new Date();
        System.out.println(String.format("%tA, %tB, %td", date, date, date)); //Date formatting: четверг, июня, 11
        System.out.println(String.format("%tA, %<tB, %<td", date)); //Date formatting without duplicating arguments: четверг, июня, 11

        Calendar calendar = Calendar.getInstance();
        calendar.set(2004,0,7,15,40);
        long day1 = calendar.getTimeInMillis();
        day1 += 1000*60*60; // 1 hour is added

        calendar.setTimeInMillis(day1); //1 hour is added to current calendar
        System.out.println("new hour "+calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("Current date:  "+calendar.getTime());

        calendar.add(calendar.DATE, 35);
        System.out.println("added 35 days:  "+calendar.getTime());

        calendar.roll(calendar.DATE, 35);
        System.out.println("roll 35 days:  "+calendar.getTime());

        calendar.set(calendar.DATE, 1);
        System.out.println("Day set to 1:  "+calendar.getTime());

        Boolean bool1 = new Boolean(true);
    }
}
