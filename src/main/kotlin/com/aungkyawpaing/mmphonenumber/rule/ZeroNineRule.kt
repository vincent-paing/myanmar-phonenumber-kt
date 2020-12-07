package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.normalizer.Rule

/**
 * Rule to convert to 09-XXXXXXXXX format.
 * This accept only English numerals
 */
class ZeroNineRule : Rule {

  private val possibleCases = Regex("^((09-)|(\\+959)|(09\\s)|(959)|(09\\.))\\d{7,9}\$")

  override fun convert(input: String): String {

    val matchResult = possibleCases.matchEntire(input)
    val prefixGroupValue = matchResult?.groupValues?.getOrNull(1)

    if (prefixGroupValue != null) {
      return input.replaceFirst(prefixGroupValue, "09")
    }

    return input
  }

}