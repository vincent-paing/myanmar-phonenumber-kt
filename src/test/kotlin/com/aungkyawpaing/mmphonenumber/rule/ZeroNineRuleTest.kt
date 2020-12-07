package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.rule.ZeroNineRule
import org.junit.Assert
import org.junit.Test

public class ZeroNineRuleTest {

  val zeroNineRule = ZeroNineRule()

  @Test
  fun testPlusNineFiveNine() {

    val input = "+959784123456"

    val expected = "09784123456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testNineFiveNine() {

    val input = "959784123456"

    val expected = "09784123456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testZeroNineWithDash() {

    val input = "09-784123456"

    val expected = "09784123456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testZeroNineWithSpace() {

    val input = "09 784123456"

    val expected = "09784123456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testZeroNineWithDecimal() {

    val input = "09.784123456"

    val expected = "09784123456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testRepeatingNineFiveNine() {

    val input = "959784959456"

    val expected = "09784959456"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testNineFiveNineInMiddle() {

    val input = "09428195994"

    val expected = "09428195994"

    val actual = zeroNineRule.convert(input)

    Assert.assertEquals(expected, actual)
  }


}