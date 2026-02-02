package com.ext.datetimeformatter.core

import com.ext.datetimeformatter.model.DatePattern
import java.text.SimpleDateFormat
import java.util.*

object DateFormatter {

    fun format(
        date: String,
        from: DatePattern,
        to: DatePattern,
        locale: Locale = Locale.getDefault(),
        timeZone: TimeZone = TimeZone.getDefault()
    ): String {
        return try {
            val inputFormat = SimpleDateFormat(from.pattern, locale)
            inputFormat.timeZone = timeZone

            val outputFormat = SimpleDateFormat(to.pattern, locale)
            outputFormat.timeZone = timeZone

            val parsedDate = inputFormat.parse(date)
            outputFormat.format(parsedDate!!)
        } catch (e: Exception) {
            ""
        }
    }
}
