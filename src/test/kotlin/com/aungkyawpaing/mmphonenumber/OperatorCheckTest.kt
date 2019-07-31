package com.aungkyawpaing.mmphonenumber

import org.junit.Assert
import org.junit.Test

class OperatorCheckTest {

  @Test
  fun testOoredooNumber() {
    val input = "09958412345"

    val expected = Operator.OOREDOO

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testOoredooNumberWithCountryCode() {
    val input = "+959958412345"

    val expected = Operator.OOREDOO

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testTelenorNumber() {
    val input = "09754123456"

    val expected = Operator.TELENOR

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testTelenorNumberWithCountryCode() {
    val input = "+959784123456"

    val expected = Operator.TELENOR

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMptNumber() {
    val input = "09420012345"

    val expected = Operator.MPT

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMptNumberWithCountryCode() {
    val input = "+959420012345"

    val expected = Operator.MPT

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMecTelNumber() {
    val input = "0939454234"

    val expected = Operator.MECTEL

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMecTelNumberWithCountryCode() {
    val input = "+959354542314"

    val expected = Operator.MECTEL

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMyTelNumber() {
    val input = "09690000966"

    val expected = Operator.MYTEL

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testMyTelNumberWithCountryCode() {
    val input = "+959690000966"

    val expected = Operator.MYTEL

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testUnknown() {
    val input = "0912345678"

    val expected = Operator.UNKNOWN

    val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

    Assert.assertEquals(expected, actual)
  }


}


