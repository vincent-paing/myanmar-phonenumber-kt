package com.aungkyawpaing.mmphonenumber.opeator

import com.aungkyawpaing.mmphonenumber.MyanmarPhoneNumberUtils
import com.aungkyawpaing.mmphonenumber.Operator
import org.junit.Assert
import org.junit.Test

class MytelOperatorCheckTest {

    @Test
    fun testMyTelNumberStartingWith67() {
        val input = "09671234567"

        val expected = Operator.MYTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMyTelNumberStartingWith68() {
        val input = "09681234567"

        val expected = Operator.MYTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMyTelNumberStartingWith69() { //Nice
        val input = "09691234567"

        val expected = Operator.MYTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMyTelNumberWithCountryCode() {
        val input = "+959690000966"

        val expected = Operator.MYTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMyTelNumberMoreThan11Length() {
        val input = "096912345678" //12 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMyTelNumberLessThan11Length() {
        val input = "0969123456" //10 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

}