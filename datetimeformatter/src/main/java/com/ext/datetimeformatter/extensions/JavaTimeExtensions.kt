package com.ext.datetimeformatter.extensions

import com.ext.datetimeformatter.core.JavaTimeFormatter
import com.ext.datetimeformatter.model.DatePattern
import java.time.ZoneId

fun String.formatWithJavaTime(
    from: DatePattern,
    to: DatePattern,
    zoneId: ZoneId = ZoneId.systemDefault()
): String {
    return JavaTimeFormatter.format(this, from, to, zoneId)
}
