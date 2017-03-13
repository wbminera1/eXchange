/**
 * Copyright 2015 Knowm Inc. (http://knowm.org) and contributors.
 * Copyright 2011-2015 Xeiam LLC (http://xeiam.com) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wbm.eXchange;

import org.knowm.xchart.XChartPanel;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

/**
 * Class containing all XChart example charts
 *
 * @author timmolter
 */
public class XChartTest1 extends JPanel/* implements TreeSelectionListener*/ {

  private XChartPanel chartPanel;
  final RealtimeChartTest realtimeChart = new RealtimeChartTest(1000,700);
  Timer timer = new Timer();

  private ChartData_BTCE mBTCEData = new ChartData_BTCE();
  private ChartData_OKCoin mOKCointData = new ChartData_OKCoin();
  private ChartData_BTCC mBTCCData = new ChartData_BTCC();
  private ChartData_Bitfinex mBitfinexData = new ChartData_Bitfinex();


  /**
   * Constructor
   */
  public XChartTest1() {
    realtimeChart.Initialize();
    realtimeChart.addSeries(mBTCEData);
    realtimeChart.addSeries(mOKCointData);
    //realtimeChart.addSeries(mBTCCData);
    realtimeChart.addSeries(mBitfinexData);


    chartPanel = new XChartPanel(realtimeChart);

    TimerTask chartUpdaterTask = new TimerTask() {

      @Override
      public void run() {
        chartPanel.updateSeries(mBTCEData);
        chartPanel.updateSeries(mOKCointData);
        //chartPanel.updateSeries(mBTCCData);
        chartPanel.updateSeries(mBitfinexData);
      }
    };
    timer = new Timer();
    timer.scheduleAtFixedRate(chartUpdaterTask, 0, 2000);
    chartPanel.setPreferredSize(new Dimension(700, 700));
    add(chartPanel);

  }
}
