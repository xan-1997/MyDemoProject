package com.xanlarisayev.ResumeApp.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Utility {

    public static String convertDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("dd MMM. yyyy", Locale.ENGLISH);
        String sDate = format.format(date);
        return sDate;
    }

    public Date convertDate2(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        date = format.format(date);
        Date result = Date.valueOf(date);
        return result;
    }
}
