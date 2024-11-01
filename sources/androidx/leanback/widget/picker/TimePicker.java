package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.leanback.R;
import androidx.leanback.widget.picker.PickerUtility;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class TimePicker extends Picker {
    private static final int AM_INDEX = 0;
    private static final int HOURS_IN_HALF_DAY = 12;
    private static final int PM_INDEX = 1;
    static final String TAG = "TimePicker";
    PickerColumn mAmPmColumn;
    int mColAmPmIndex;
    int mColHourIndex;
    int mColMinuteIndex;
    private final PickerUtility.TimeConstant mConstant;
    private int mCurrentAmPmIndex;
    private int mCurrentHour;
    private int mCurrentMinute;
    PickerColumn mHourColumn;
    private boolean mIs24hFormat;
    PickerColumn mMinuteColumn;
    private String mTimePickerFormat;

    public TimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String extractTimeFields() {
        boolean z8;
        String str;
        StringBuilder sb;
        String bestHourMinutePattern = getBestHourMinutePattern();
        boolean z9 = false;
        if (TextUtils.getLayoutDirectionFromLocale(this.mConstant.locale) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (bestHourMinutePattern.indexOf(97) < 0 || bestHourMinutePattern.indexOf("a") > bestHourMinutePattern.indexOf("m")) {
            z9 = true;
        }
        if (z8) {
            str = "mh";
        } else {
            str = "hm";
        }
        if (is24Hour()) {
            return str;
        }
        if (z9) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("a");
        } else {
            sb = new StringBuilder();
            sb.append("a");
            sb.append(str);
        }
        return sb.toString();
    }

    private static boolean isAnyOf(char c8, char[] cArr) {
        for (char c9 : cArr) {
            if (c8 == c9) {
                return true;
            }
        }
        return false;
    }

    private void setAmPmValue() {
        if (!is24Hour()) {
            setColumnValue(this.mColAmPmIndex, this.mCurrentAmPmIndex, false);
        }
    }

    private void updateColumns() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        if (TextUtils.equals(bestHourMinutePattern, this.mTimePickerFormat)) {
            return;
        }
        this.mTimePickerFormat = bestHourMinutePattern;
        String extractTimeFields = extractTimeFields();
        List<CharSequence> extractSeparators = extractSeparators();
        if (extractSeparators.size() == extractTimeFields.length() + 1) {
            setSeparators(extractSeparators);
            String upperCase = extractTimeFields.toUpperCase();
            this.mAmPmColumn = null;
            this.mMinuteColumn = null;
            this.mHourColumn = null;
            this.mColAmPmIndex = -1;
            this.mColMinuteIndex = -1;
            this.mColHourIndex = -1;
            ArrayList arrayList = new ArrayList(3);
            for (int i8 = 0; i8 < upperCase.length(); i8++) {
                char charAt = upperCase.charAt(i8);
                if (charAt != 'A') {
                    if (charAt != 'H') {
                        if (charAt == 'M') {
                            PickerColumn pickerColumn = new PickerColumn();
                            this.mMinuteColumn = pickerColumn;
                            arrayList.add(pickerColumn);
                            this.mMinuteColumn.setStaticLabels(this.mConstant.minutes);
                            this.mColMinuteIndex = i8;
                        } else {
                            throw new IllegalArgumentException("Invalid time picker format.");
                        }
                    } else {
                        PickerColumn pickerColumn2 = new PickerColumn();
                        this.mHourColumn = pickerColumn2;
                        arrayList.add(pickerColumn2);
                        this.mHourColumn.setStaticLabels(this.mConstant.hours24);
                        this.mColHourIndex = i8;
                    }
                } else {
                    PickerColumn pickerColumn3 = new PickerColumn();
                    this.mAmPmColumn = pickerColumn3;
                    arrayList.add(pickerColumn3);
                    this.mAmPmColumn.setStaticLabels(this.mConstant.ampm);
                    this.mColAmPmIndex = i8;
                    updateMin(this.mAmPmColumn, 0);
                    updateMax(this.mAmPmColumn, 1);
                }
            }
            setColumns(arrayList);
            return;
        }
        throw new IllegalStateException("Separators size: " + extractSeparators.size() + " must equal the size of timeFieldsPattern: " + extractTimeFields.length() + " + 1");
    }

    private void updateColumnsRange() {
        int i8;
        updateMin(this.mHourColumn, !this.mIs24hFormat ? 1 : 0);
        PickerColumn pickerColumn = this.mHourColumn;
        if (this.mIs24hFormat) {
            i8 = 23;
        } else {
            i8 = 12;
        }
        updateMax(pickerColumn, i8);
        updateMin(this.mMinuteColumn, 0);
        updateMax(this.mMinuteColumn, 59);
        PickerColumn pickerColumn2 = this.mAmPmColumn;
        if (pickerColumn2 != null) {
            updateMin(pickerColumn2, 0);
            updateMax(this.mAmPmColumn, 1);
        }
    }

    private static boolean updateMax(PickerColumn pickerColumn, int i8) {
        if (i8 != pickerColumn.getMaxValue()) {
            pickerColumn.setMaxValue(i8);
            return true;
        }
        return false;
    }

    private static boolean updateMin(PickerColumn pickerColumn, int i8) {
        if (i8 != pickerColumn.getMinValue()) {
            pickerColumn.setMinValue(i8);
            return true;
        }
        return false;
    }

    List<CharSequence> extractSeparators() {
        String bestHourMinutePattern = getBestHourMinutePattern();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'H', 'h', 'K', 'k', 'm', 'M', 'a'};
        boolean z8 = false;
        char c8 = 0;
        for (int i8 = 0; i8 < bestHourMinutePattern.length(); i8++) {
            char charAt = bestHourMinutePattern.charAt(i8);
            if (charAt != ' ') {
                if (charAt == '\'') {
                    if (!z8) {
                        sb.setLength(0);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } else {
                    if (z8) {
                        sb.append(charAt);
                    } else if (isAnyOf(charAt, cArr)) {
                        if (charAt != c8) {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        }
                    } else {
                        sb.append(charAt);
                    }
                    c8 = charAt;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    String getBestHourMinutePattern() {
        String str;
        String str2;
        if (PickerUtility.SUPPORTS_BEST_DATE_TIME_PATTERN) {
            Locale locale = this.mConstant.locale;
            if (this.mIs24hFormat) {
                str2 = "Hma";
            } else {
                str2 = "hma";
            }
            str = DateFormat.getBestDateTimePattern(locale, str2);
        } else {
            java.text.DateFormat timeInstance = java.text.DateFormat.getTimeInstance(3, this.mConstant.locale);
            if (timeInstance instanceof SimpleDateFormat) {
                str = ((SimpleDateFormat) timeInstance).toPattern().replace("s", "");
                if (this.mIs24hFormat) {
                    str = str.replace('h', 'H').replace("a", "");
                }
            } else if (!this.mIs24hFormat) {
                str = "h:mma";
            } else {
                str = "H:mma";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "h:mma";
        }
        return str;
    }

    public int getHour() {
        if (this.mIs24hFormat) {
            return this.mCurrentHour;
        }
        if (this.mCurrentAmPmIndex == 0) {
            return this.mCurrentHour % 12;
        }
        return (this.mCurrentHour % 12) + 12;
    }

    public int getMinute() {
        return this.mCurrentMinute;
    }

    public boolean is24Hour() {
        return this.mIs24hFormat;
    }

    public boolean isPm() {
        if (this.mCurrentAmPmIndex == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.widget.picker.Picker
    public void onColumnValueChanged(int i8, int i9) {
        if (i8 == this.mColHourIndex) {
            this.mCurrentHour = i9;
        } else if (i8 == this.mColMinuteIndex) {
            this.mCurrentMinute = i9;
        } else {
            if (i8 == this.mColAmPmIndex) {
                this.mCurrentAmPmIndex = i9;
                return;
            }
            throw new IllegalArgumentException("Invalid column index.");
        }
    }

    public void setHour(@IntRange(from = 0, to = 23) int i8) {
        if (i8 >= 0 && i8 <= 23) {
            this.mCurrentHour = i8;
            if (!is24Hour()) {
                int i9 = this.mCurrentHour;
                if (i9 >= 12) {
                    this.mCurrentAmPmIndex = 1;
                    if (i9 > 12) {
                        this.mCurrentHour = i9 - 12;
                    }
                } else {
                    this.mCurrentAmPmIndex = 0;
                    if (i9 == 0) {
                        this.mCurrentHour = 12;
                    }
                }
                setAmPmValue();
            }
            setColumnValue(this.mColHourIndex, this.mCurrentHour, false);
            return;
        }
        throw new IllegalArgumentException("hour: " + i8 + " is not in [0-23] range in");
    }

    public void setIs24Hour(boolean z8) {
        if (this.mIs24hFormat == z8) {
            return;
        }
        int hour = getHour();
        int minute = getMinute();
        this.mIs24hFormat = z8;
        updateColumns();
        updateColumnsRange();
        setHour(hour);
        setMinute(minute);
        setAmPmValue();
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i8) {
        if (i8 >= 0 && i8 <= 59) {
            this.mCurrentMinute = i8;
            setColumnValue(this.mColMinuteIndex, i8, false);
        } else {
            throw new IllegalArgumentException("minute: " + i8 + " is not in [0-59] range.");
        }
    }

    public TimePicker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        PickerUtility.TimeConstant timeConstantInstance = PickerUtility.getTimeConstantInstance(Locale.getDefault(), context.getResources());
        this.mConstant = timeConstantInstance;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbTimePicker);
        this.mIs24hFormat = obtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_is24HourFormat, DateFormat.is24HourFormat(context));
        boolean z8 = obtainStyledAttributes.getBoolean(R.styleable.lbTimePicker_useCurrentTime, true);
        updateColumns();
        updateColumnsRange();
        if (z8) {
            Calendar calendarForLocale = PickerUtility.getCalendarForLocale(null, timeConstantInstance.locale);
            setHour(calendarForLocale.get(11));
            setMinute(calendarForLocale.get(12));
            setAmPmValue();
        }
    }
}
