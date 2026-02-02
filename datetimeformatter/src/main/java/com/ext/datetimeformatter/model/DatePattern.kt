package com.ext.datetimeformatter.model

enum class DatePattern(val pattern: String) {

    // API formats
    API_DATE("yyyy-MM-dd"),
    API_DATE_TIME("yyyy-MM-dd HH:mm:ss"),

    // Readable formats
    READABLE_DATE("dd MMM yyyy"),
    READABLE_DATE_TIME("dd MMM yyyy, hh:mm a"),

    // ⏰ Time-only formats (FIX)
    TIME_12_HOUR("hh:mm a"),
    TIME_24_HOUR("HH:mm"),

    // java.time / ISO formats
    ISO_DATE("yyyy-MM-dd"),
    ISO_DATE_TIME("yyyy-MM-dd'T'HH:mm:ss"),
    ISO_ZONED_DATE_TIME("yyyy-MM-dd'T'HH:mm:ssXXX")
}
