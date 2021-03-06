/*
 *  Copyright 2017 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.chart;

import java.util.ArrayList;
import java.util.List;

public class ListColorConverter {

  public static List<Color> convert(List<Object> colorList) {
    List<Color> colors = new ArrayList<>(colorList.size());
    for (Object c : colorList) {
      if (c instanceof Color) {
        colors.add((Color) c);
      } else if (c instanceof java.awt.Color) {
        colors.add(new Color((java.awt.Color) c));
      } else {
        throw new IllegalArgumentException("setColor takes Color or List of Color");
      }
    }
    return colors;
  }

}
