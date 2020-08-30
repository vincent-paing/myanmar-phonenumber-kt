package com.aungkyawpaing.mmphonenumber.extract

import org.junit.Assert
import org.junit.Test
import kotlin.math.exp

class MyanmarPhoneNumberExtractorTest {

  private val extractor = MyanmarPhoneNumberExtractor()

  @Test
  fun inputNoNumberReturnNull() {
    val input = "နံပါတ်မပါ"
    val expected = emptyList<String>()
    val actual = extractor.extract(input)
    Assert.assertEquals(expected, actual)
  }

  @Test
  fun inputNumberReturnNumber() {
    val input = "၀၉၁၂၃၄၅၆၇ (မောင်မောင်)"
    val expected = listOf("091234567")
    val actual = extractor.extract(input)
    Assert.assertEquals(expected, actual)
  }

  @Test
  fun inputMultipleNumberReturnNumber() {
    val input = "၀၉၁၂၃၄၅၆၇ (မောင်မောင်)၊ ၀၉၁၂၃၄၅၆၆ (အောင်အောင်)"
    val expected = listOf("091234567", "091234566")
    val actual = extractor.extract(input)
    Assert.assertEquals(expected, actual)
  }

  @Test
  fun inputDirtyNumberReturnNumber() {
    val input = "၀၉-၁၂၃၄၅၆၇ (မောင်မောင်)"
    val expected = listOf("091234567")
    val actual = extractor.extract(input)
    Assert.assertEquals(expected, actual)
  }


}