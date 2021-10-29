package com.example.demo;

import java.util.HashMap;

public class CoinResponse {
    private String success;
    private String terms;
    private String privacy;
    private String timestamp;
    private String target;
    private HashMap<String, Double> rates;

    public CoinResponse(){

    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setRates(HashMap<String, Double> rates) {
        this.rates = rates;
    }

    public String getSuccess() {
        return success;
    }

    public String getTerms() {
        return terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTarget() {
        return target;
    }

    public Double getRate(String coin){
        return rates.get(coin);
    }
    public HashMap<String, Double> getRates() {
        return rates;
    }


    public CoinResponse(String success, String terms, String privacy, String timestamp, String target, HashMap<String, Double> rates) {
        this.success = success;
        this.terms = terms;
        this.privacy = privacy;
        this.timestamp = timestamp;
        this.target = target;
        this.rates = rates;
    }
}
