package com.findbestmoment.findbestmoment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.findbestmoment.findbestmoment.pojos.auto_complete.Auto_example;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Example;
import com.findbestmoment.findbestmoment.pojos.chart.Chart;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Result;
import com.findbestmoment.findbestmoment.pojos.chart.Chart_example;
import com.findbestmoment.findbestmoment.pojos.getAnalysis.SummaryExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@AllArgsConstructor
@Service
public class YahooApiConnection {

    public Chart getChart(final String symbol,String interval)  {
        try {
            HttpRequest request = null;
            switch(interval)
            {
                case "1day":
                     request = HttpRequest.newBuilder()
                            .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=2m&symbol="+symbol+"&range=1d&region=US"))
                            .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                            .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                            .method("GET", HttpRequest.BodyPublishers.noBody())
                            .build(); break;
                case "5days":
                    request = HttpRequest.newBuilder()
                            .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=2m&symbol="+symbol+"&range=5d&region=US"))
                            .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                            .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                            .method("GET", HttpRequest.BodyPublishers.noBody())
                            .build(); break;
                case "month":
                    request = HttpRequest.newBuilder()
                            .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=15m&symbol="+symbol+"&range=1mo&region=US"))
                            .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                            .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                            .method("GET", HttpRequest.BodyPublishers.noBody())
                            .build(); break;
                case "year":
                    request = HttpRequest.newBuilder()
                            .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=1d&symbol="+symbol+"&range=1y&region=US"))
                            .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                            .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                            .method("GET", HttpRequest.BodyPublishers.noBody())
                            .build(); break;
                case "5years":
                    request = HttpRequest.newBuilder()
                            .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=1d&symbol="+symbol+"&range=5y&region=US"))
                            .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                            .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                            .method("GET", HttpRequest.BodyPublishers.noBody())
                            .build(); break;
            }

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            HttpResponse.BodyHandlers.ofString();
            ObjectMapper objectMapper = new ObjectMapper();
            Chart_example myPojo = objectMapper.readValue(response.body(), Chart_example.class);
            Chart chart = myPojo.getChart();
            return chart;
        }
        catch (IOException | InterruptedException x)
        {
            System.out.println("api error");
        }
        return null;
    }

    public List<Result> getMovers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-movers?region=US&lang=en-US&start=0&count=6"))
                .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse.BodyHandlers.ofString();
        ObjectMapper objectMapper = new ObjectMapper();
        Example example = objectMapper.readValue(response.body(), Example.class);
        return example.getFinance().getResult();
    }

    public SummaryExample getSummary(String symbol) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-summary?symbol="+symbol+"&region=US"))
                .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse.BodyHandlers.ofString();
        ObjectMapper objectMapper = new ObjectMapper();
        SummaryExample example = objectMapper.readValue(response.body(), SummaryExample.class);
        return example;
    }

    public Auto_example auto_complete(String symbol) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/auto-complete?q="+symbol+"&region=US"))
                .header("x-rapidapi-key", "cd43a4d11dmsh2d02fa34a4f646ap1d3a88jsn5fdf7b4f7ae9")
                .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse.BodyHandlers.ofString();
        ObjectMapper objectMapper = new ObjectMapper();
        Auto_example auto_example = objectMapper.readValue(response.body(),Auto_example.class);
        return auto_example;
    }
}
