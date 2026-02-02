## DateTimeFormatter
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green)](LICENSE)
[![API](https://img.shields.io/badge/API-24%2B-orange)](#)
---

A lightweight, Kotlin-first Android library for date & time formatting, timezone handling, and human-friendly relative time, with modern java.time support and backward compatibility.

---

### Why DateTimeFormatter?

Android date handling is messy:

- SimpleDateFormat is error-prone 
- Timezone conversions are painful
- Relative time logic is repeated everywhere

DateTimeFormatter solves this with:
-  Clean APIs
-  Kotlin extensions
-  java.time (modern & thread-safe)
-  Works on API 21+

### Features

- Convert dates between formats
- 12-hour ↔ 24-hour time conversion
- Timezone-aware formatting
- Thread-safe java.time support
- Kotlin extension functions
- Lightweight & dependency-safe

---

## Installation (JitPack)

### 1️⃣ Add JitPack to your **root `settings.gradle` or `build.gradle`**

```gradle
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
### Add Dependency
```
dependencies {
	        implementation 'com.github.Excelsior-Technologies-Community:Android_DateTimeFormatters:1.0.0'
	}
```

---

### Usage Examples

```kotlin
val formattedDate = DateFormatter.format(
    "2026-02-02",
    DatePattern.API_DATE,
    DatePattern.READABLE_DATE
)
// Output: 02 Feb 2026
```

```kotlinn
val date = "2026-02-02".formatDate(
    DatePattern.API_DATE,
    DatePattern.READABLE_DATE
)
```

Time Conversion
```kotlin
TimeFormatter.to12Hour("18:45")
// Output: 06:45 PM

TimeFormatter.to24Hour("06:45 PM")
// Output: 18:45
```

Modern java.time Formatting
```kotlin
val result = "2026-02-02T18:30:00".formatWithJavaTime(
    from = DatePattern.ISO_DATE_TIME,
    to = DatePattern.READABLE_DATE_TIME
)
// Output: 02 Feb 2026, 06:30 PM
```

Timezone-Aware Formatting
```kotlin
val indiaTime = "2026-02-02T12:00:00".formatWithJavaTime(
    from = DatePattern.ISO_DATE_TIME,
    to = DatePattern.READABLE_DATE_TIME,
    zoneId = ZoneId.of("Asia/Kolkata")
)
```

---

### Supported Date Patterns

```kotlin
API_DATE               → yyyy-MM-dd
API_DATE_TIME          → yyyy-MM-dd HH:mm:ss

READABLE_DATE          → dd MMM yyyy
READABLE_DATE_TIME     → dd MMM yyyy, hh:mm a

TIME_12_HOUR           → hh:mm a
TIME_24_HOUR           → HH:mm

ISO_DATE               → yyyy-MM-dd
ISO_DATE_TIME          → yyyy-MM-dd'T'HH:mm:ss
ISO_ZONED_DATE_TIME    → yyyy-MM-dd'T'HH:mm:ssXXX
```

---

### License

```
MIT License

Copyright (c) 2025 Excelsior Technologies 

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
