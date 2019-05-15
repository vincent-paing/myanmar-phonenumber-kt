package com.aungkyawpaing.mmphonenumber


enum class NetworkType(val regex: Regex) {
  WCDMA(Regex("^(09|\\+?959)(55\\d{5}|25[2-4]\\d{6}|26\\d{7}|4(4|5|6)\\d{7})\$")),
  CDMA_450(Regex("^(09|\\+?959)(8\\d{6}|6\\d{6}|49\\d{6})\$")),
  CDMA_800(Regex("^(09|\\+?959)(3\\d{7}|73\\d{6}|91\\d{6})\$")),
  GSM(Regex("")),
  UNKNOWN(Regex("")),
}
