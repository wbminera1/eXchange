package org.wbm.eXchange;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.btce.v3.BTCEExchange;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.dto.meta.CurrencyMetaData;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Created by wbminera1 on 24.11.2015.
 */
class ChartData_BTCE extends ChartData {
  public static final String SERIES_NAME = "BTCE";

  @Override
  public String getName() {
    return SERIES_NAME;
  }

  @Override
  public void Initialize() {
    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(BTCEExchange.class.getName());
    try {
      exchange.remoteInit();
    } catch (IOException e) {
      e.printStackTrace();
    }
    Map<Currency, CurrencyMetaData> meta = exchange.getExchangeMetaData().getCurrencies();
    Set<Currency> set = meta.keySet();
    for(Currency s:set) {
      CurrencyMetaData data = meta.get(s);
    };
    /*
    Map<CurrencyPair, MarketMetaData> pairs = exchange.ge getMarketDataService(). getMetaData().getMarketMetaDataMap();
    Set<CurrencyPair> pairSet = pairs.keySet();
    for(CurrencyPair p:pairSet) {
      MarketMetaData data = pairs.get(p);
      data.toString();
    }

    marketDataService = exchange.getPollingMarketDataService();
    yData.add(320.0);
    */
  }

}
