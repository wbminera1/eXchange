package org.wbm.eXchange;

/**
 * Created by wbminera1 on 24.11.2015.
 */
class ChartData_BTCC extends ChartData {
  public static final String SERIES_NAME = "BTCC";

  @Override
  public String getName() {
    return SERIES_NAME;
  }

  @Override
  public void Initialize() {
    //eXchange exchange = ExchangeFactory.INSTANCE.createExchange(BTCChinaExchange.class.getName());
    //marketDataService = exchange.getPollingMarketDataService();
    //yData = new CopyOnWriteArrayList<>();
    //yData.add(320.0);
  }

}
