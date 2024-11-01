package androidx.leanback.widget.picker;

import android.content.res.Resources;
import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
class PickerUtility {
    static final boolean SUPPORTS_BEST_DATE_TIME_PATTERN = true;

    /* loaded from: classes3.dex */
    public static class DateConstant {
        public final String[] days;
        public final Locale locale;
        public final String[] months;

        DateConstant(Locale locale, Resources resources) {
            this.locale = locale;
            this.months = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            this.days = PickerUtility.createStringIntArrays(calendar.getMinimum(5), calendar.getMaximum(5), TimeModel.ZERO_LEADING_NUMBER_FORMAT);
        }
    }

    /* loaded from: classes3.dex */
    public static class TimeConstant {
        public final String[] ampm;
        public final String[] hours12;
        public final String[] hours24;
        public final Locale locale;
        public final String[] minutes;

        TimeConstant(Locale locale, Resources resources) {
            this.locale = locale;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            this.hours12 = PickerUtility.createStringIntArrays(1, 12, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
            this.hours24 = PickerUtility.createStringIntArrays(0, 23, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
            this.minutes = PickerUtility.createStringIntArrays(0, 59, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
            this.ampm = dateFormatSymbols.getAmPmStrings();
        }
    }

    private PickerUtility() {
    }

    public static String[] createStringIntArrays(int i8, int i9, String str) {
        String[] strArr = new String[(i9 - i8) + 1];
        for (int i10 = i8; i10 <= i9; i10++) {
            if (str != null) {
                strArr[i10 - i8] = String.format(str, Integer.valueOf(i10));
            } else {
                strArr[i10 - i8] = String.valueOf(i10);
            }
        }
        return strArr;
    }

    public static Calendar getCalendarForLocale(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static DateConstant getDateConstantInstance(Locale locale, Resources resources) {
        return new DateConstant(locale, resources);
    }

    public static TimeConstant getTimeConstantInstance(Locale locale, Resources resources) {
        return new TimeConstant(locale, resources);
    }
}
