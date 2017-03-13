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

import org.knowm.xchart.Chart;
import org.knowm.xchart.ChartBuilder;
import org.knowm.xchart.StyleManager;
import org.knowm.xchart.internal.style.Theme;


/**
 * Realtime
 * <p>
 * Demonstrates the following:
 * <ul>
 * <li>real-time chart updates
 * <li>fixed window
 */
public class RealtimeChartTest extends Chart {

  /**
   * Constructor
   *
   * @param width
   * @param height
   */
  public RealtimeChartTest(int width, int height) {
    super(width, height);
  }

  /**
   * Constructor
   *
   * @param width
   * @param height
   * @param chartTheme
   */
  public RealtimeChartTest(int width, int height, StyleManager.ChartTheme chartTheme) {
    super(width, height, chartTheme);
  }

  /**
   * Constructor
   *
   * @param width
   * @param height
   * @param theme  instance of Theme class
   */
  public RealtimeChartTest(int width, int height, Theme theme) {
    super(width, height, theme);
  }

  /**
   * Constructor
   *
   * @param chartBuilder
   */
  public RealtimeChartTest(ChartBuilder chartBuilder) {
    super(chartBuilder);
  }

  void Initialize() {

    setChartTitle("Chart");
    setXAxisTitle("X");
    setYAxisTitle("Y");

  }

}
