package org.wbm.eXchange;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.marketdata.MarketDataService;
import org.knowm.xchart.SeriesData;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wbminera1 on 26.11.2015.
 */
public abstract class ChartData extends SeriesData {
    protected MarketDataService marketDataService;
    protected List<Ticker> mTickers;
    protected List<Double> yData;

    ChartData() {
        yData = new CopyOnWriteArrayList<>();
        mTickers = new CopyOnWriteArrayList<>();

    }

    @Override
    public List<?> getxData() {
      return null;
    }

    @Override
    public List<? extends Number> getyData() {
      return yData;
    }

    @Override
    public List<? extends Number> getErrorBars() {
      return null;
    }

    @Override
    public void Update() {
      try {
        org.knowm.xchange.dto.marketdata.Ticker ticker = marketDataService.getTicker(new CurrencyPair("BTC", "USD"));
        yData.add(ticker.getAsk().doubleValue());
      } catch (IOException e) {
        e.printStackTrace();
      }

      while (yData.size() > 100) {
        yData.remove(0);
      }
    }
}
