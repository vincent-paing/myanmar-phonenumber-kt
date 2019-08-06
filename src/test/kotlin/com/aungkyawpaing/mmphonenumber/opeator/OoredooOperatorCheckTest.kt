package com.aungkyawpaing.mmphonenumber.opeator

import com.aungkyawpaing.mmphonenumber.MyanmarPhoneNumberUtils
import com.aungkyawpaing.mmphonenumber.Operator
import org.junit.Assert
import org.junit.Test

class OoredooOperatorCheckTest {

    @Test
    fun testOoredooNumber() {
        val input = "09958412345"

        val expected = Operator.OOREDOO

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testOoredooNumberWithCountryCode() {
        val input = "+959958412345"

        val expected = Operator.OOREDOO

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

}