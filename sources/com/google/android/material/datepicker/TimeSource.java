package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);

    @Nullable
    private final Long fixedTimeMs;

    @Nullable
    private final TimeZone fixedTimeZone;

    private TimeSource(@Nullable Long l8, @Nullable TimeZone timeZone) {
        this.fixedTimeMs = l8;
        this.fixedTimeZone = timeZone;
    }

    static TimeSource fixed(long j8, @Nullable TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j8), timeZone);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    static TimeSource fixed(long j8) {
        return new TimeSource(Long.valueOf(j8), null);
    }

    Calendar now(@Nullable TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l8 = this.fixedTimeMs;
        if (l8 != null) {
            calendar.setTimeInMillis(l8.longValue());
        }
        return calendar;
    }
}
