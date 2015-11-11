package com.pillar.battle

class TrendUtils {

  def static findTrend(input) {


    if (input) {
      if (input.size() == 3) {
        return 1.0
      }

      return 0
    }

    null
  }

}
