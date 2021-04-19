package com.findbestmoment.findbestmoment.service;

import com.findbestmoment.findbestmoment.pojos.chart.Chart_Result;
import com.findbestmoment.findbestmoment.pojos.chart.BiggestDip;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.SummaryExample;
import java.text.DecimalFormat;
import java.util.List;

public class ChartAnalysis {
    SummaryExample example;
    Chart_Result result;

    public ChartAnalysis(SummaryExample example, Chart_Result result) {
        this.example=example;
        this.result = result;
    }

    public String percentage_change()
    {
        List<Double> highs = result.getIndicators().getQuote().get(0).getHigh();
        Double change = highs.get(highs.size()-1)-highs.get(0);
        Double percentage = (change*100)/highs.get(0);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        String str = numberFormat.format(percentage)+"%";
        if(str.startsWith(","))
        {
            str = "0"+str;
        }
        else if(str.startsWith("-,"))
        {
            StringBuilder myName = new StringBuilder(str);
            myName.setCharAt(0, '0');
            str = "-"+str;
        }
        return str ;
    }
    public double change()
    {
        List<Double> highs = result.getIndicators().getQuote().get(0).getHigh();
        Double change = highs.get(highs.size()-1)-highs.get(0);
        return change;
    }
    public String getHighest()
    {
        Double temp = null;
        try {
             temp = result.getIndicators().getQuote().get(0).getHigh().get(0);
            for (Double ele : result.getIndicators().getQuote().get(0).getHigh()) {
                if (ele > temp) {
                    temp = ele;
                }
            }
        }
        catch (NullPointerException x)
        {}
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        return numberFormat.format(temp)+"$";
    }
    public String getLowest()
    {Double temp=null;
        try {
             temp = result.getIndicators().getQuote().get(0).getHigh().get(0);
            for (Double ele : result.getIndicators().getQuote().get(0).getHigh()) {
                if (ele < temp) {
                    temp = ele;
                }
            }
        }
        catch (NullPointerException x)
        {}
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return numberFormat.format(temp)+"$";
    }
    public BiggestDip biggestDip()
    {
        List<Double> highs= result.getIndicators().getQuote().get(0).getHigh();
        List<Integer> timestamps= result.getTimestamp();
        double biggest_dip=result.getIndicators().getQuote().get(0).getHigh().get(1)-result.getIndicators().getQuote().get(0).getHigh().get(0);
        String percentage_dip= null;
        Integer timestamp1 = timestamps.get(0);
        Integer timestamp2 = timestamps.get(1);
        for(int i=0;i<highs.size()-1;i++)
        {
             if(highs.get(i+1)-highs.get(i)>biggest_dip)
             {
                 timestamp1 =timestamps.get(i);
                 timestamp2 = timestamps.get(i+1);
                 DecimalFormat numberFormat = new DecimalFormat("#.00");

                 biggest_dip = highs.get(i+1)-highs.get(i);
                 percentage_dip = numberFormat.format((biggest_dip*100)/highs.get(i))+"%";
             }
        }

        return new BiggestDip(percentage_dip,timestamp1,timestamp2);
    }
}
