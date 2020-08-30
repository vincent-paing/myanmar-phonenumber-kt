package com.aungkyawpaing.mmphonenumber.extract

import com.aungkyawpaing.mmphonenumber.normalizer.MyanmarPhoneNumberNormalizer

class MyanmarPhoneNumberExtractor {

  private val normalizer = MyanmarPhoneNumberNormalizer()

  /**
   * Extract list of Burmese phone number from given string
   * @param input: String to be inputted
   * @return empty list if no number is found, list of *normalized* number if it's found.
   */
  fun extract(input: String): List<String> {
    val normalizedInput = normalizer.normalize(input)
    val regex = Regex("(09|\\+?950?9|\\+?95950?9)\\d{7,9}")

    return regex.findAll(normalizedInput).map { it.value }.toList()
  }

}