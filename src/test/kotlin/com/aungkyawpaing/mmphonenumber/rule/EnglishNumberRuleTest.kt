package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.rule.EnglishNumberRule
import org.junit.Assert
import org.junit.Test

class EnglishNumberRuleTest {

  val englishNumberRule = EnglishNumberRule()

  @Test
  fun testBurmeseNumber() {
    val input = "၀၁၂၃၄၅၆၇၈၉"

    val expected = "0123456789"

    val actual = englishNumberRule.convert(input)

    Assert.assertEquals(expected, actual)
  }
}