package com.aungkyawpaing.mmphonenumber

import org.junit.Assert
import org.junit.Test

class NetworkTypeCheckTest {

  @Test
  fun testOoredooNumberGSM() {
    val input = "09978412345"

    val expected = NetworkType.GSM

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testTelenorNumberGSM() {
    val input = "09767123456"

    val expected = NetworkType.GSM

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMptNumberGSM() {
    val input = "09420012345"

    val expected = NetworkType.GSM

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testWCDMA() {
    val input = "09451212123"

    val expected = NetworkType.WCDMA

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testCDMA450() {
    val input = "096355555"

    val expected = NetworkType.CDMA_450

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testCDMA800() {
    val input = "0973123456"

    val expected = NetworkType.CDMA_800

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testUnknown() {
    val input = "0912345678"

    val expected = NetworkType.UNKNOWN

    val actual = MyanmarPhoneNumberUtils.getNetworkType(input)

    Assert.assertEquals(expected, actual)
  }


}

