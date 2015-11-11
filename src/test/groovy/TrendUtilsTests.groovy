package com.pillar.battle

import org.junit.Test

class TrendUtilsTests {

  @Test
  void shouldReturnNullWhenListIsEmpty() {
    def l = []

    assert null == TrendUtils.findTrend(l)
  }

  @Test
  void shouldReturnNullWhenNothingReturned() {
    assert null == TrendUtils.findTrend(null)
  }

  @Test
  void shouldReturnZeroForSingleValue() {
    def tempList = [1]

    assert 0 == TrendUtils.findTrend(tempList)
  }

}
