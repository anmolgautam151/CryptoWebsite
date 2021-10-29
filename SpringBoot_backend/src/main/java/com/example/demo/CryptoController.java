package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Locale;

@RestController
public class CryptoController {

    @Autowired
    private RestTemplate restTemplate;

    @CrossOrigin()
    @GetMapping("/info")
    HashMap<String, String> crypto(@RequestParam(defaultValue = "BTC") String currency){
        System.out.println("https://api.blockchain.com/v3/exchange/tickers/" + currency);
        BitstampResp response = restTemplate.getForObject(
                "https://www.bitstamp.net/api/v2/ticker/"+currency.toLowerCase(Locale.ROOT)+"usd/", BitstampResp.class
        );
        CoinResponse coinresp = restTemplate.getForObject(
                "http://api.coinlayer.com/api/live?access_key=d57a479b3f67d11ab38660384d64ae49&symbols="+currency,CoinResponse.class
        );
        System.out.println(response.getAsk()+ " " + currency);
        HashMap<String, String> maps= new HashMap<String, String>();
        maps.put("BitStamp", String.valueOf(response.getAsk()));

        maps.put("CoinLayer",String.valueOf(coinresp.getRate(currency)));
        if (response.getAsk() < coinresp.getRate(currency))
        {
            maps.put("Recommended", "BitStamp");
        }
        else
        {
            maps.put("Recommended", "CoinLayer");
        }
        return maps;
    }
}
