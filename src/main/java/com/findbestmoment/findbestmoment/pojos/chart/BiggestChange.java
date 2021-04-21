package com.findbestmoment.findbestmoment.pojos.chart;



import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BiggestChange {
    String change;
    long timestamp1;
    long timestamp2;
    public BiggestChange(String change, int timestamp1, int timestamp2) {
        this.timestamp1 = timestamp1;
        this.timestamp2 =timestamp2;
        this.change = change;
        System.out.println(change+" "+timestamp1+" "+timestamp2);
    }
    public String getRange()
    {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Timestamp ts1 = new Timestamp(timestamp1*1000);
        Timestamp ts2 = new Timestamp(timestamp2*1000);
        Date date1 = new Date(ts1.getTime());
        Date date2 = new Date(ts2.getTime());
        System.out.println(date1+" "+date2);
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date1.toInstant(), ZoneId.systemDefault());
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());
        System.out.println(myFormatObj.format(localDateTime1)+" - "+myFormatObj.format(localDateTime2));
        return  myFormatObj.format(localDateTime1)+" - "+myFormatObj.format(localDateTime2);
    }
    public String getChange()
    {
        return " "+change;
    }
}
