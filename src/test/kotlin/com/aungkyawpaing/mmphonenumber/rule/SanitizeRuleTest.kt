package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.rule.SanitizeRule
import org.junit.Assert
import org.junit.Test

class SanitizeRuleTest {

  val sanitizeRule = SanitizeRule()

  @Test
  fun testWhiteSpace() {
    val input = " 09791234565"

    val expected = "09791234565"

    val actual = sanitizeRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testDash() {
    val input = "09-791-234-565"

    val expected = "09791234565"

    val actual = sanitizeRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testParenthesis() {
    val input = "(09791234565)"

    val expected = "09791234565"

    val actual = sanitizeRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testDoubleCountryCode() {
    val input = "+959509791234565"

    val expected = "+959791234565"

    val actual = sanitizeRule.convert(input)

    Assert.assertEquals(expected, actual)
  }

}