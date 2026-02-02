package com.ext.datetimeformatter.extensions

import com.ext.datetimeformatter.core.DateFormatter
import com.ext.datetimeformatter.model.DatePattern


fun String.formatDate(
    from: DatePattern,
    to: DatePattern
): String {
    return DateFormatter.format(
        this,
        from,
        to
    )
}
