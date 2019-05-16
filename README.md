[ ![Download](https://api.bintray.com/packages/vincent-paing/maven/mmphonenumber/images/download.svg) ](https://bintray.com/vincent-paing/maven/mmphonenumber/_latestVersion)
[![Build Status](https://travis-ci.com/vincent-paing/myanmar-phonenumber-kt.svg?branch=master)](https://travis-ci.com/vincent-paing/myanmar-phonenumber-kt)

Kotlin port of [myanmar-phonenumber](https://github.com/kaungmyatlwin/myanmar-phonenumber) to check valid myanmar mobile numbers, get mobile operator's name, sanitize mobile numbers and get mobile network types.

### Features

#### Phone Number Normalization

An extensible normalizier allows you to normalize the phone number into a standardized format you want. The default out of the box provides

- Trimming whit spaces, dashes, and decimals
- Converting to English numbers
- Replacing and standardizing to 09

```kotlin
val input = "+၉၅၉၇၈၄၁၂၃၄၅၆"
val normalizer = MyanmarPhoneNumberNormalizer()
val result = normalizer.normalize(input)
print(result) //: 09784123456
```

##### Custom Rules

You can also use the builder provided to add custom rules. This allows you to create your own standardized format such as using "+959" instead of "09", or converting other languages to English numerals etc.

```kotlin
class NineFiveNineRule : Rule {
  private val possibleCases = Regex("(09-)|(\\+959)|(09\\s)|(959)|(09\\.)")
  
  override fun convert(input: String): String {
    if (possibleCases.containsMatchIn(input)) {
      return input.replaceFirst(possibleCases, "+959")
    }
    return input
  }
  
}

val builder = MyanmarPhoneNumberNormalizer.Builder()
builder.addRule(NineFiveNineRule())

val input = "09784123456"

val output = builder.build().normalize(input)

print(output) //+959784123456
```

#### Phone number Validaiton

Check whether a phone number is a valid Myanmar phone number 

```kotlin
MyanmarPhoneNumberUtils.isValidMyanmarPhoneNumber("09978412345") //true
MyanmarPhoneNumberUtils.isValidMyanmarPhoneNumber("14155552671") //false
```

#### Opreator Checking

Check which opreator the number is from

```kotlin
MyanmarPhoneNumberUtils.getTelecomOperator("09958412345") //Ooredoo
MyanmarPhoneNumberUtils.getTelecomOperator("09784123456") //Telenor
MyanmarPhoneNumberUtils.getTelecomOperator("09420012345") //MPT
MyanmarPhoneNumberUtils.getTelecomOperator("09690000966") //MyTel
```

#### Network Type Checking

Check which network the numer belongs to 

```kotlin
MyanmarPhoneNumberUtils.getNetworkType("09978412345") //GSM
MyanmarPhoneNumberUtils.getNetworkType("09451212123") //WCDMA
MyanmarPhoneNumberUtils.getNetworkType("096355555") //CDMA 450Hz
MyanmarPhoneNumberUtils.getNetworkType("0973123456") //CDMA 800Hz
```

### Usage

If you use gradle, include

```
repositories {
    jcenter()
}

implementation 'com.aungkyawpaing.mmphonenumber:mmphonenumber:1.0.1'
```

### Credit

- [myanmar-phonenumber.js](https://github.com/kaungmyatlwin/myanmar-phonenumber)
- [Kaung Myat Lwin](https://github.com/kaungmyatlwin) for giving me some pointers in porting	

### License
```
Copyright 2019 Aung Kyaw Paing

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
```
