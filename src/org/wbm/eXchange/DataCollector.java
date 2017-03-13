package org.wbm.eXchange;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
//import org.knowm.xchange.dto.meta.MarketMetaData;
//import org.knowm.xchange.service.polling.marketdata.PollingMarketDataService;

import java.io.IOException;
import java.util.*;

/**
 * Created by wbminera1 on 26.11.2015.
 */
public class DataCollector {
    protected Exchange mExchange;
    protected Map<CurrencyPair,Map<Date, Ticker>> mTickers;
    protected String mExchangeName;


    public DataCollector(String exchangeName) {
        mExchangeName = exchangeName;
        //new HashMap<String, Collection<String>>();
        mTickers = new HashMap<>();

    }
    public void Initialize() {
        mExchange = ExchangeFactory.INSTANCE.createExchange(mExchangeName);
        try {
            mExchange.remoteInit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Map<Currency, CurrencyMetaData> meta = mExchange.getMetaData().getCurrencyMetaDataMap();
        Set<Currency> set = meta.keySet();
        for (Currency s : set) {
            CurrencyMetaData data = meta.get(s);
        }
        ;
        Map<CurrencyPair, MarketMetaData> pairs = mExchange.getMetaData().getMarketMetaDataMap();
        Set<CurrencyPair> pairSet = pairs.keySet();
        for (CurrencyPair p : pairSet) {
            //MarketMetaData data = pairs.get(p);
            //data.toString();
            mTickers.put(p, new HashMap<>());
        }
        */
    }

    public void Update() {
        /*
      try {
        PollingMarketDataService marketDataService = mExchange.getPollingMarketDataService();
          Map<CurrencyPair, MarketMetaData> pairs = mExchange.getMetaData().getMarketMetaDataMap();
          for (CurrencyPair p : pairs.keySet()) {
              Ticker ticker = marketDataService.getTicker(p);
              Date stamp = ticker.getTimestamp();
              mTickers.get(p).putIfAbsent(stamp, ticker);
              Manager.Instance.Console().Put(ticker.toString());
          }
      } catch (IOException e) {
        e.printStackTrace();
      }
      */
    }
}
