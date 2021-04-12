package com.findbestmoment.findbestmoment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
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
                    .header("x-rapidapi-key", "621db74435msh4f1b5da8691db90p1450a3jsnbd3d5031f898")
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
                .header("x-rapidapi-key", "621db74435msh4f1b5da8691db90p1450a3jsnbd3d5031f898")
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
                .header("x-rapidapi-key", "621db74435msh4f1b5da8691db90p1450a3jsnbd3d5031f898")
                .header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse.BodyHandlers.ofString();
        ObjectMapper objectMapper = new ObjectMapper();
        SummaryExample example = objectMapper.readValue(response.body(), SummaryExample.class);
        return example;
    }

}
