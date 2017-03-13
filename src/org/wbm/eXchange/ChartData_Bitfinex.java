package org.wbm.eXchange;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.bitfinex.v1.BitfinexExchange;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wbminera1 on 24.11.2015.
 */
class ChartData_Bitfinex extends ChartData {
  public static final String SERIES_NAME = "Bitfinex";

  @Override
  public String getName() {
    return SERIES_NAME;
  }

  @Override
  public void Initialize() {
    ExchangeSpecification exchangeSpecification = new ExchangeSpecification(BitfinexExchange.class.getName());
    //exchangeSpecification.setExchangeSpecificParametersItem("Use_Intl", true);
    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(exchangeSpecification);
    marketDataService = exchange.getMarketDataService();
    yData = new CopyOnWriteArrayList<>();
    yData.add(320.0);
  }

}
