package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class DateStrings {
    private DateStrings() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<String, String> getDateRangeString(@Nullable Long l8, @Nullable Long l9) {
        return getDateRangeString(l8, l9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getDateString(long j8) {
        return getDateString(j8, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getDayContentDescription(Context context, long j8, boolean z8, boolean z9, boolean z10) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j8);
        if (z8) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z9) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        if (z10) {
            return String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay);
        }
        return optionalYearMonthDayOfWeekDay;
    }

    static String getMonthDay(long j8) {
        return getMonthDay(j8, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j8) {
        return getMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    static String getOptionalYearMonthDayOfWeekDay(long j8) {
        if (isDateWithinCurrentYear(j8)) {
            return getMonthDayOfWeekDay(j8);
        }
        return getYearMonthDayOfWeekDay(j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearContentDescription(Context context, int i8) {
        if (UtcDates.getTodayCalendar().get(1) == i8) {
            return String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i8));
        }
        return String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonth(long j8) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j8));
            return format;
        }
        return DateUtils.formatDateTime(null, j8, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonthDay(long j8) {
        return getYearMonthDay(j8, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j8) {
        return getYearMonthDayOfWeekDay(j8, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j8) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j8);
        if (todayCalendar.get(1) == utcCalendar.get(1)) {
            return true;
        }
        return false;
    }

    static Pair<String, String> getDateRangeString(@Nullable Long l8, @Nullable Long l9, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l8 == null && l9 == null) {
            return Pair.create(null, null);
        }
        if (l8 == null) {
            return Pair.create(null, getDateString(l9.longValue(), simpleDateFormat));
        }
        if (l9 == null) {
            return Pair.create(getDateString(l8.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l8.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l9.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l8.longValue())), simpleDateFormat.format(new Date(l9.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return Pair.create(getMonthDay(l8.longValue(), Locale.getDefault()), getMonthDay(l9.longValue(), Locale.getDefault()));
            }
            return Pair.create(getMonthDay(l8.longValue(), Locale.getDefault()), getYearMonthDay(l9.longValue(), Locale.getDefault()));
        }
        return Pair.create(getYearMonthDay(l8.longValue(), Locale.getDefault()), getYearMonthDay(l9.longValue(), Locale.getDefault()));
    }

    static String getDateString(long j8, @Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j8));
        }
        if (isDateWithinCurrentYear(j8)) {
            return getMonthDay(j8);
        }
        return getYearMonthDay(j8);
    }

    static String getMonthDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j8));
            return format;
        }
        return UtcDates.getMediumNoYear(locale).format(new Date(j8));
    }

    static String getMonthDayOfWeekDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j8));
            return format;
        }
        return UtcDates.getFullFormat(locale).format(new Date(j8));
    }

    static String getYearMonthDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j8));
            return format;
        }
        return UtcDates.getMediumFormat(locale).format(new Date(j8));
    }

    static String getYearMonthDayOfWeekDay(long j8, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j8));
            return format;
        }
        return UtcDates.getFullFormat(locale).format(new Date(j8));
    }
}
