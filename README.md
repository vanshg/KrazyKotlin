# ![](logo.png)

KrazyKotlin is a collection of useful Kotlin Extension - inspired by [SwifterSwift](https://github.com/SwifterSwift/SwifterSwift).

More extensions are on the way. If you have any requests, create an issue or submit a PR

## Download

Download via Gradle:

```groovy
compile 'com.vanshgandhi:krazykotlin:1.0.0'
```

or Maven:

```xml
<dependency>
  <groupId>com.vanshgandhi</groupId>
  <artifactId>krazykotlin</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## Contributing
There is a list of outstanding work that needs to be done in [TODO.md](https://github.com/vanshg/KrazyKotlin/blob/master/TODO.md). All contributions are welcome

## List of Extensions
- [String](https://github.com/vanshg/KrazyKotlin/blob/master/src/main/kotlin/com/vanshgandhi/krazykotlin/StringExtensions.kt)
    - base64Decoded
    - base64Encoded
    - camelCased
    - containsLetters
    - containsNumbers
    - isAlphanumeric
    - isAlphabetic
    - isNumeric
    - isEmail
    - isUrl
    - mostCommonCharacter
- [Date](https://github.com/vanshg/KrazyKotlin/blob/master/src/main/kotlin/com/vanshgandhi/krazykotlin/DateExtensions.kt)
    - calendar
    - isInFuture
    - isInPast
    - isToday
    - isTomorrow
    - isWeekend
    - isWeekday
    - iso8601
    - roundToMinute
    - roundToFiveMinutes
    - roundToTenMinutes
    - roundToFifteenMinutes
    - roundToHalfHour
    - roundToHour
    - millisecondsSince
    - secondsSince
    - minutesSince
    - hoursSince
    - daysSince
    - weeksSince
    - monthsSince
    - yearsSince
    - plus
    - minus
- [Int](https://github.com/vanshg/KrazyKotlin/blob/master/src/main/kotlin/com/vanshgandhi/krazykotlin/IntExtensions.kt)
    - random
- [Boolean](https://github.com/vanshg/KrazyKotlin/blob/master/src/main/kotlin/com/vanshgandhi/krazykotlin/BooleanExtensions.kt)
    - intValue

## License
```
MIT License

Copyright (c) 2017 Vansh Gandhi

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
