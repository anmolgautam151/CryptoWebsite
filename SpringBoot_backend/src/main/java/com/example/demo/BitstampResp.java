package com.example.demo;

public class BitstampResp {
    private String high;
    private String last;
    private String timestamp;
    private String bid;
    private String vwap;
    private String volume;
    private String low;
    private Double ask;
    private String open;

    public BitstampResp(){}

    public BitstampResp(String high, String last, String timestamp, String bid, String vwap, String volume, String low, Double ask, String open) {
        this.high = high;
        this.last = last;
        this.timestamp = timestamp;
        this.bid = bid;
        this.vwap = vwap;
        this.volume = volume;
        this.low = low;
        this.ask = ask;
        this.open = open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public void setVwap(String vwap) {
        this.vwap = vwap;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public String getLast() {
        return last;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getBid() {
        return bid;
    }

    public String getVwap() {
        return vwap;
    }

    public String getVolume() {
        return volume;
    }

    public String getLow() {
        return low;
    }

    public Double getAsk() {
        return ask;
    }

    public String getOpen() {
        return open;
    }
}
