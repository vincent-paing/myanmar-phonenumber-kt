package com.aungkyawpaing.mmphonenumber

import org.junit.Assert
import org.junit.Test

class ValidPhoneNumberTest {

  @Test
  fun testValidNumber() {
    val input = "09767123456"

    val expected = true

    val actual = MyanmarPhoneNumberUtils.isValidMyanmarPhoneNumber(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testNineFiveNine() {
    val input = "+959767123456"

    val expected = true

    val actual = MyanmarPhoneNumberUtils.isValidMyanmarPhoneNumber(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testInValidNumber() {
      val input = "+14155552671"

    val expected = false

    val actual = MyanmarPhoneNumberUtils.isValidMyanmarPhoneNumber(input)

    Assert.assertEquals(expected, actual)
  }
}


