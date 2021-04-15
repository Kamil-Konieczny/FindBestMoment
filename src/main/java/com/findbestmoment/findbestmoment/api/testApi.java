package com.findbestmoment.findbestmoment.api;

import com.findbestmoment.findbestmoment.pojos.auto_complete.Auto_example;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Quote;
import com.findbestmoment.findbestmoment.pojos.chart.Chart;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Result;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.SummaryExample;
import com.findbestmoment.findbestmoment.service.StockService;
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
   private StockService stockService;
    List<SummaryExample> movers_summary_list = new ArrayList<>();


       @RequestMapping("/chart/{stock_symbol}")
    public String getPrice(@PathVariable("stock_symbol")String stock_symbol,Model model)  {
        Chart chart = stockService.getChart(stock_symbol);
        model.addAttribute(chart);
           System.out.println(stock_symbol);
        return "chart";
    }

    @GetMapping("/findbestmoment")
    public String findBestMoment(Model model) throws IOException, InterruptedException {
            List<Result> result = stockService.getMovers();
            movers_summary_list.clear();

            List<Quote> movers_list = result.get(2).getQuotes();

for(int i=0;i<1;i++)
           // for(Quote ele:movers_list)
            {
                String symbol = movers_list.get(i).getSymbol();
             //   String symbol = ele.getSymbol();
                SummaryExample ex = stockService.getSummary(symbol);
                movers_summary_list.add(ex);
            }

//        List<Quote> gainers_list = result.get(0).getQuotes();
//
//        for(Quote ele:gainers_list)
//        {
//            String symbol = ele.getSymbol();
//            SummaryExample ex = stockService.getSummary(symbol);
//            movers_summary_list.add(ex);
//        }
        model.addAttribute("hot_stocks",movers_summary_list);

        return "search";
    }
    @GetMapping("/search")
    public String search_method(@RequestParam("symbol")String symbol,Model model) throws IOException, InterruptedException {
        Auto_example example = stockService.auto_complete(symbol);
        List<com.findbestmoment.findbestmoment.pojos.auto_complete.Quote> auto_complete_list = example.getQuotes();
        if(auto_complete_list.size()>0)
        {
            movers_summary_list.clear();
            for(int i=0;i<1;i++)
            {
                String str = auto_complete_list.get(i).getSymbol();
                SummaryExample ex = stockService.getSummary(str);
                movers_summary_list.add(ex);
                System.out.println(movers_summary_list.get(i).getSymbol());
            }
            model.addAttribute("hot_stocks",movers_summary_list);
        }

        return "search";
    }
}
