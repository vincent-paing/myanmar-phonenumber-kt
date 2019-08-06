package com.aungkyawpaing.mmphonenumber.opeator

import com.aungkyawpaing.mmphonenumber.MyanmarPhoneNumberUtils
import com.aungkyawpaing.mmphonenumber.Operator
import org.junit.Assert
import org.junit.Test

class MectelOperatorCheckTest {

    @Test
    fun testMecTelNumberStartingWith30() {
        val input = "0930454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith31() {
        val input = "0931454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith32() {
        val input = "0932454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith33() {
        val input = "0933454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith34() {
        val input = "09344542349"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith35() {
        val input = "09354542347"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith36() {
        val input = "0936454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith37() {
        val input = "0937454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith38() {
        val input = "0938454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith39() {
        val input = "0939454234"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberWithCountryCode() {
        val input = "+959354542314"

        val expected = Operator.MECTEL

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    //Mectel number starting require 34, 35 to be on 11 length
    //Other numbers are capped at 10 length

    @Test
    fun testMecTelNumberStartingWith34LessThan11Length() {
        val input = "093445423" //9 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith34MoreThan11Length() {
        val input = "09344542302954" //14 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith35LessThan11Length() {
        val input = "093545423" //9 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith35MoreThan11Length() {
        val input = "09354542302954" //14 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testMecTelNumberStartingWith30MoreThan10Length() {
        val input = "09304542302" //11 Length

        val expected = Operator.UNKNOWN

        val actual = MyanmarPhoneNumberUtils.getTelecomOperator(input)

        Assert.assertEquals(expected, actual)
    }

}