package com.findbestmoment.findbestmoment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.findbestmoment.findbestmoment.pojos.auto_complete.Auto_example;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Example;
import com.findbestmoment.findbestmoment.pojos.chart.Chart;
import com.findbestmoment.findbestmoment.pojos.biggestMovers.Result;
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
public class StockService {

    public Chart getChart(final String symbol) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?interval=5m&symbol=" + symbol + "&range=1d&region=US"))
                    .header("x-rapidapi-key", "bf89918d8dmsh3c14dd2082397a0p11617bjsn9f5f5763c91e")
                    .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            HttpResponse.BodyHandlers.ofString();
            ObjectMapper objectMapper = new ObjectMapper();
            Chart chart = objectMapper.readValue(response.body(), Chart.class);


            return chart;
        } catch (IOException | InterruptedException x) {
        }
        return null;
    }

    public List<Result> getMovers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-movers?region=US&lang=en-US&start=0&count=6"))
                .header("x-rapidapi-key", "bf89918d8dmsh3c14dd2082397a0p11617bjsn9f5f5763c91e")
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
                .header("x-rapidapi-key", "bf89918d8dmsh3c14dd2082397a0p11617bjsn9f5f5763c91e")
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
                .header("x-rapidapi-key", "bf89918d8dmsh3c14dd2082397a0p11617bjsn9f5f5763c91e")
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
