package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.normalizer.Rule

/**
 * Rule to convert to 09-XXXXXXXXX format.
 * This accept only English numerals
 */
class ZeroNineRule : Rule {

  private val possibleCases = Regex("(09-)|(\\+959)|(09\\s)|(959)|(09\\.)")

  override fun convert(input: String): String {

    if (possibleCases.containsMatchIn(input)) {
      return input.replaceFirst(possibleCases, "09")
    }

    return input
  }

}