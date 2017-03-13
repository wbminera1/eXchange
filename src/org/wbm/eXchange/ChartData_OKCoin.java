package org.wbm.eXchange;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.okcoin.OkCoinExchange;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wbminera1 on 24.11.2015.
 */
class ChartData_OKCoin extends ChartData {
  public static final String SERIES_NAME = "OkCoin";

  @Override
  public String getName() {
    return SERIES_NAME;
  }

  @Override
  public void Initialize() {
    ExchangeSpecification exchangeSpecification = new ExchangeSpecification(OkCoinExchange.class.getName());
    exchangeSpecification.setExchangeSpecificParametersItem("Use_Intl", true);
    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(exchangeSpecification);
    //marketDataService = exchange.getPollingMarketDataService();
    yData = new CopyOnWriteArrayList<>();
    yData.add(320.0);
  }

}
