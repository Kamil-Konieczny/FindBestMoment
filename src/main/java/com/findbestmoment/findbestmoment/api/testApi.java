package com.findbestmoment.findbestmoment.api;

import com.findbestmoment.findbestmoment.pojos.auto_complete.Auto_example;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Quote;
import com.findbestmoment.findbestmoment.pojos.chart.Chart;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Result;
import com.findbestmoment.findbestmoment.pojos.chart.Chart_Result;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.SummaryExample;
import com.findbestmoment.findbestmoment.service.ChartAnalysis;
import com.findbestmoment.findbestmoment.service.YahooApiConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class testApi {
    @Autowired
   private YahooApiConnection yahooApiConnection;
    List<SummaryExample> movers_summary_list = new ArrayList<>();


    @RequestMapping("/chart/{stock_symbol}/{interval}")
    public String getPrice(@PathVariable("stock_symbol")String stock_symbol,@PathVariable("interval")String interval,Model model)  {

        Chart chart = yahooApiConnection.getChart(stock_symbol,interval);
        List<Chart_Result> results = chart.getResult();
        Chart_Result result= null;
        List<com.findbestmoment.findbestmoment.pojos.chart.Quote> quote =null;
        List<Double> highs =null;
        List<Integer> timestamps =null;
        String symbol =null;
        SummaryExample summaryExample = null;
        try {
            result = results.get(0);
            quote = result.getIndicators().getQuote();
            highs = quote.get(0).getHigh();
            System.out.println(highs.size());
            timestamps = result.getTimestamp();
            symbol = result.getMeta().getSymbol();
        }
        catch (NullPointerException x)
        {}
        for(SummaryExample ex : movers_summary_list)
        {
            if(ex.getSymbol().equals(symbol))
            {
                summaryExample = ex;
            }
        }

        ChartAnalysis chartAnalysis = new ChartAnalysis(summaryExample,result);
        model.addAttribute("chartAnalysis",chartAnalysis);
        model.addAttribute("timestamps",timestamps);
        model.addAttribute("highs",highs);
        model.addAttribute("summaryexample",summaryExample);
        model.addAttribute("symbol",summaryExample.getPrice().getShortName());
        model.addAttribute("short_symbol",symbol);
        model.addAttribute("low",quote.get(0).getLow());
        model.addAttribute("volume",quote.get(0).getVolume());
        model.addAttribute("close",quote.get(0).getClose());
        model.addAttribute("open",quote.get(0).getOpen());

        return "chart";
    }

    @GetMapping("/findbestmoment")
    public String findBestMoment(Model model) throws IOException, InterruptedException {
            List<Result> result = yahooApiConnection.getMovers();
            movers_summary_list.clear();
            List<Quote> movers_list = result.get(2).getQuotes();
            List<Quote> gainers_list = result.get(0).getQuotes();
            for(int i=0;i<6;i++)
            {
                String symbol = movers_list.get(i).getSymbol();
                SummaryExample ex = yahooApiConnection.getSummary(symbol);
                movers_summary_list.add(ex);
            }
        for(int i=0;i<6;i++)
        {
            String symbol = gainers_list.get(i).getSymbol();
            SummaryExample ex = yahooApiConnection.getSummary(symbol);
            movers_summary_list.add(ex);
        }
        model.addAttribute("hot_stocks",movers_summary_list);

        return "search";
    }
    @GetMapping("/search")
    public String search_method(@RequestParam("symbol")String symbol,Model model) throws IOException, InterruptedException {
        Auto_example example = yahooApiConnection.auto_complete(symbol);
        List<com.findbestmoment.findbestmoment.pojos.auto_complete.Quote> auto_complete_list = example.getQuotes();
        if(auto_complete_list.size()>0)
        {
            movers_summary_list.clear();
            for(int i=0;i<1;i++)
            {
                String str = auto_complete_list.get(i).getSymbol();
                SummaryExample ex = yahooApiConnection.getSummary(str);
                movers_summary_list.add(ex);
            }
            model.addAttribute("hot_stocks",movers_summary_list);
        }

        return "search";
    }
}
