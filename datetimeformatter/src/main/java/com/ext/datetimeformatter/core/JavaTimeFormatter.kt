package com.ext.datetimeformatter.core

import com.ext.datetimeformatter.model.DatePattern
import java.time.*
import java.time.format.DateTimeFormatter
import java.util.*

object JavaTimeFormatter {

    fun format(
        date: String,
        from: DatePattern,
        to: DatePattern,
        zoneId: ZoneId = ZoneId.systemDefault(),
        locale: Locale = Locale.getDefault()
    ): String {
        return try {
            val inputFormatter = DateTimeFormatter
                .ofPattern(from.pattern)
                .withLocale(locale)

            val outputFormatter = DateTimeFormatter
                .ofPattern(to.pattern)
                .withLocale(locale)

            val localDateTime = LocalDateTime.parse(date, inputFormatter)

            localDateTime
                .atZone(zoneId)
                .format(outputFormatter)

        } catch (e: Exception) {
            ""
        }
    }
}
