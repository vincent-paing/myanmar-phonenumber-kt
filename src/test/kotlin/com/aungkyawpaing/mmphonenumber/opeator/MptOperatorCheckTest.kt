package com.aungkyawpaing.mmphonenumber.opeator

import com.aungkyawpaing.mmphonenumber.MyanmarPhoneNumberUtils
import com.aungkyawpaing.mmphonenumber.Operator
import org.junit.Assert
import org.junit.Test

class MptOperatorCheckTest {

    @Test
    fun testMptNumberStartingWith42() {
        val input = "09420012345"

        val expected = Operator.MPT

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMptNumberWithCountryCode() {
        val input = "+959420012345"

        val expected = Operator.MPT

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }


}