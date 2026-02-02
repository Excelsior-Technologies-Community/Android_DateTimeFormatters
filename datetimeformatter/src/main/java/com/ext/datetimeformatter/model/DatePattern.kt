package com.ext.datetimeformatter.model

enum class DatePattern(val pattern: String) {

    API_DATE("yyyy-MM-dd"),
    API_DATE_TIME("yyyy-MM-dd HH:mm:ss"),

    READABLE_DATE("dd MMM yyyy"),
    READABLE_DATE_TIME("dd MMM yyyy, hh:mm a"),

    TIME_12_HOUR("hh:mm a"),
    TIME_24_HOUR("HH:mm")
}