package com.findbestmoment.findbestmoment.api;

import com.findbestmoment.findbestmoment.pojos.biggestMovers.Quote;
import com.findbestmoment.findbestmoment.pojos.chart.Chart;
import com.findbestmoment.findbestmoment.pojos.chart.Indicators;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Result;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.SummaryExample;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.Trend;
import com.findbestmoment.findbestmoment.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@Controller
public class testApi {
    @Autowired
   private StockService stockService;


        @GetMapping("/chart")
    public String getPrice() throws IOException {
        Chart chart = stockService.getChart("AAPL");
        chart.getAdditionalProperties();
        return "chart";
    }

    @GetMapping("/findbestmoment")
    public String findBestMoment(Model model) throws IOException, InterruptedException {
            List<Result> result = stockService.getMovers();


            List<Quote> movers_list = result.get(2).getQuotes();

            List<SummaryExample> movers_summary_list = new ArrayList<>();

            for(Quote ele:movers_list)
            {
                String symbol = ele.getSymbol();
                SummaryExample ex = stockService.getSummary(symbol);
                movers_summary_list.add(ex);
            }

        List<Quote> gainers_list = result.get(0).getQuotes();

        for(Quote ele:gainers_list)
        {
            String symbol = ele.getSymbol();
            SummaryExample ex = stockService.getSummary(symbol);
            movers_summary_list.add(ex);
        }
        model.addAttribute("hot_stocks",movers_summary_list);

        return "search";
    }
}
