package com.findbestmoment.findbestmoment.pojos.chart;
public class ChartPoint {
    private Integer timestamp;
    private Double open;

    public ChartPoint(int timestamp, double open) {
        this.timestamp = timestamp;
        this.open = open;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }
}
