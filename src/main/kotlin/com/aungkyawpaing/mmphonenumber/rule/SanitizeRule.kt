package com.aungkyawpaing.mmphonenumber.rule

import com.aungkyawpaing.mmphonenumber.normalizer.Rule


/**
 * Removes trailing spaces, dashes and double country codes
 */
class SanitizeRule : Rule {

  private val myanmarCountryCodeRegex = Regex("^\\+?950?9\\d+\$")
  private val doubleMyanmarCountryCodeRegex = Regex("^\\+?95950?9\\d{7,9}\$")
  private val zeroBeforeAreaCodeRegex = Regex("^\\+?9509\\d{7,9}\$")

  override fun convert(input: String): String {
    var tempPhoneNumber = input.trim()

    tempPhoneNumber = tempPhoneNumber.replace(Regex("[- )(]"), "")


    if (myanmarCountryCodeRegex.matches(tempPhoneNumber)) {

      if (doubleMyanmarCountryCodeRegex.matches(tempPhoneNumber)) {
        tempPhoneNumber = tempPhoneNumber.replace(Regex("9595"), "95")
      }

      if (zeroBeforeAreaCodeRegex.matches(tempPhoneNumber)) {
        tempPhoneNumber = tempPhoneNumber.replace(Regex("9509"), "959")
      }


    }

    return tempPhoneNumber
  }

}