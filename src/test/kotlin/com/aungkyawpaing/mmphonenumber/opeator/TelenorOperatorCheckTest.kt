package com.aungkyawpaing.mmphonenumber.opeator

import com.aungkyawpaing.mmphonenumber.MyanmarPhoneNumberUtils
import com.aungkyawpaing.mmphonenumber.Operator
import org.junit.Assert
import org.junit.Test

class TelenorOperatorCheckTest {

    @Test
    fun testTelenorNumberStartingWith75() {
        val input = "09754123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberStartingWith76() {
        val input = "09764123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberStartingWith77() {
        val input = "09774123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberStartingWith78() {
        val input = "09784123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberStartingWith79() {
        val input = "09794123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberWithCountryCode() {
        val input = "+959767123456"

        val expected = Operator.TELENOR

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }


    @Test
    fun testTelenorNumberStartingMoreThan11Length() {
        val input = "097941234568" //12 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testTelenorNumberStartingLessThan11Length() {
        val input = "097941" //6 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }


}