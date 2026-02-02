package com.ext.datetimeformatter.core

import com.ext.datetimeformatter.model.DatePattern


object TimeFormatter {

    fun to12Hour(time24: String): String {
        return DateFormatter.format(
            time24,
            DatePattern.TIME_24_HOUR,
            DatePattern.TIME_12_HOUR
        )
    }

    fun to24Hour(time12: String): String {
        return DateFormatter.format(
            time12,
            DatePattern.TIME_12_HOUR,
            DatePattern.TIME_24_HOUR
        )
    }
}
