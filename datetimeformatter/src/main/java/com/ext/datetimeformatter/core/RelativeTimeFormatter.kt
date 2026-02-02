package com.ext.datetimeformatter.core

import java.util.concurrent.TimeUnit

object RelativeTimeFormatter {

    fun from(timestamp: Long): String {
        val now = System.currentTimeMillis()
        val diff = now - timestamp

        return when {
            diff < TimeUnit.MINUTES.toMillis(1) -> "Just now"
            diff < TimeUnit.HOURS.toMillis(1) ->
                "${TimeUnit.MILLISECONDS.toMinutes(diff)} minutes ago"
            diff < TimeUnit.DAYS.toMillis(1) ->
                "${TimeUnit.MILLISECONDS.toHours(diff)} hours ago"
            else ->
                "${TimeUnit.MILLISECONDS.toDays(diff)} days ago"
        }
    }
}
