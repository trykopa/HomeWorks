package com.google.ssadm.homework.w34;

// Написать программу которая вернет количество миллисекунд
// прошедших от такого же числа, но в прошлом месяце до
// сегодняшней даты. Например если сегодня 3 августа,
// то узнать сколько миллисекунд прошло с 3 июля.

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        Date currentDate = new Date();
        cl.setTime(currentDate);
        cl.add(Calendar.MONTH, -1);
        System.out.println(currentDate.getTime() - cl.getTimeInMillis());

        //deprecated methods
        Date monthBefore = new Date();
        monthBefore.setMonth(monthBefore.getMonth()-1);
        System.out.println(currentDate.getTime() - monthBefore.getTime());

        //use joda-time https://github.com/JodaOrg
        DateTime date = new DateTime();
        DateTime dateMinusMonth = date.minusMonths(1);
        System.out.println(date.getMillis()-dateMinusMonth.getMillis());

    }
}
