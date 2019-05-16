package com.aungkyawpaing.mmphonenumber.normalizer

import org.junit.Assert
import org.junit.Test


class MyanmarPhoneNumberNormalizerTest {

  val normalizer = MyanmarPhoneNumberNormalizer()

  @Test
  fun testCustomRule() {
    val builder = MyanmarPhoneNumberNormalizer.Builder()

    builder.addRule(object : Rule {
      override fun convert(input: String): String {
        return input.replace("a", "b")
      }

    })

    val input = "aa"

    val expected = "bb"

    val actual = builder.build().normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testPlusNineFiveNine() {

    val input = "+959784123456"

    val expected = "09784123456"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseNumber() {
    val input = "၀၉၇၈၄၁၂၃၄၅၆"

    val expected = "09784123456"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testBurmeseNumberWithSpace() {
    val input = " ၀၉ ၇၈၄၁၂၃၄၅၆"

    val expected = "09784123456"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testPlusNineFiveNineInBurmese() {

    val input = "+၉၅၉၇၈၄၁၂၃၄၅၆"

    val expected = "09784123456"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseNumberWithDecimal() {

    val input = "၀၉.၅၁၁၂၃၄၅"

    val expected = "095112345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testStrippingWhiteSpace() {

    val input = " 09978412345"

    val expected = "09978412345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testRemoveWhiteSpace() {
    val input = " 09 978 412 345"

    val expected = "09978412345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testRemoveDashes() {
    val input = "09-978-412-34-5"

    val expected = "09978412345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testDoubleCountryCode() {
    val input = "+95959978412345"

    val expected = "09978412345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testZeroBeforeCountryCode() {
    val input = "+9509978412345"

    val expected = "09978412345"

    val actual = normalizer.normalize(input)

    Assert.assertEquals(expected, actual)
  }
}