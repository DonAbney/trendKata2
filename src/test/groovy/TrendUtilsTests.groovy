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

  @Test
  void shouldReturnZeroForOneMatchingPair() {
    def tempList = [1, 1]

    assert 0 == TrendUtils.findTrend(tempList)
  }

  @Test
  void shouldReturnOnePointZeroForZeroZeroOne() {
    def tempList = [0, 0, 1]

    assert 1.0 == TrendUtils.findTrend(tempList)
  }

}
