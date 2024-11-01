package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;
import androidx.leanback.widget.picker.PickerUtility;
import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class DatePicker extends Picker {
    private static final int[] DATE_FIELDS = {5, 2, 1};
    static final String DATE_FORMAT = "MM/dd/yyyy";
    static final String LOG_TAG = "DatePicker";
    int mColDayIndex;
    int mColMonthIndex;
    int mColYearIndex;
    PickerUtility.DateConstant mConstant;
    Calendar mCurrentDate;
    final DateFormat mDateFormat;
    private String mDatePickerFormat;
    PickerColumn mDayColumn;
    Calendar mMaxDate;
    Calendar mMinDate;
    PickerColumn mMonthColumn;
    Calendar mTempDate;
    PickerColumn mYearColumn;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean isAnyOf(char c8, char[] cArr) {
        for (char c9 : cArr) {
            if (c8 == c9) {
                return true;
            }
        }
        return false;
    }

    private boolean isNewDate(int i8, int i9, int i10) {
        if (this.mCurrentDate.get(1) != i8 || this.mCurrentDate.get(2) != i10 || this.mCurrentDate.get(5) != i9) {
            return true;
        }
        return false;
    }

    private boolean parseDate(String str, Calendar calendar) {
        try {
            calendar.setTime(this.mDateFormat.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w(LOG_TAG, "Date: " + str + " not in format: " + DATE_FORMAT);
            return false;
        }
    }

    private void setDate(int i8, int i9, int i10) {
        this.mCurrentDate.set(i8, i9, i10);
        if (this.mCurrentDate.before(this.mMinDate)) {
            this.mCurrentDate.setTimeInMillis(this.mMinDate.getTimeInMillis());
        } else if (this.mCurrentDate.after(this.mMaxDate)) {
            this.mCurrentDate.setTimeInMillis(this.mMaxDate.getTimeInMillis());
        }
    }

    private void updateCurrentLocale() {
        PickerUtility.DateConstant dateConstantInstance = PickerUtility.getDateConstantInstance(Locale.getDefault(), getContext().getResources());
        this.mConstant = dateConstantInstance;
        this.mTempDate = PickerUtility.getCalendarForLocale(this.mTempDate, dateConstantInstance.locale);
        this.mMinDate = PickerUtility.getCalendarForLocale(this.mMinDate, this.mConstant.locale);
        this.mMaxDate = PickerUtility.getCalendarForLocale(this.mMaxDate, this.mConstant.locale);
        this.mCurrentDate = PickerUtility.getCalendarForLocale(this.mCurrentDate, this.mConstant.locale);
        PickerColumn pickerColumn = this.mMonthColumn;
        if (pickerColumn != null) {
            pickerColumn.setStaticLabels(this.mConstant.months);
            setColumnAt(this.mColMonthIndex, this.mMonthColumn);
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

    private void updateSpinners(final boolean z8) {
        post(new Runnable() { // from class: androidx.leanback.widget.picker.DatePicker.1
            @Override // java.lang.Runnable
            public void run() {
                DatePicker.this.updateSpinnersImpl(z8);
            }
        });
    }

    List<CharSequence> extractSeparators() {
        String bestYearMonthDayPattern = getBestYearMonthDayPattern(this.mDatePickerFormat);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z8 = false;
        char c8 = 0;
        for (int i8 = 0; i8 < bestYearMonthDayPattern.length(); i8++) {
            char charAt = bestYearMonthDayPattern.charAt(i8);
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

    String getBestYearMonthDayPattern(String str) {
        String str2;
        if (PickerUtility.SUPPORTS_BEST_DATE_TIME_PATTERN) {
            str2 = android.text.format.DateFormat.getBestDateTimePattern(this.mConstant.locale, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            if (dateFormat instanceof SimpleDateFormat) {
                str2 = ((SimpleDateFormat) dateFormat).toLocalizedPattern();
            } else {
                str2 = DATE_FORMAT;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return DATE_FORMAT;
        }
        return str2;
    }

    public long getDate() {
        return this.mCurrentDate.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.mDatePickerFormat;
    }

    public long getMaxDate() {
        return this.mMaxDate.getTimeInMillis();
    }

    public long getMinDate() {
        return this.mMinDate.getTimeInMillis();
    }

    @Override // androidx.leanback.widget.picker.Picker
    public final void onColumnValueChanged(int i8, int i9) {
        this.mTempDate.setTimeInMillis(this.mCurrentDate.getTimeInMillis());
        int currentValue = getColumnAt(i8).getCurrentValue();
        if (i8 == this.mColDayIndex) {
            this.mTempDate.add(5, i9 - currentValue);
        } else if (i8 == this.mColMonthIndex) {
            this.mTempDate.add(2, i9 - currentValue);
        } else if (i8 == this.mColYearIndex) {
            this.mTempDate.add(1, i9 - currentValue);
        } else {
            throw new IllegalArgumentException();
        }
        setDate(this.mTempDate.get(1), this.mTempDate.get(2), this.mTempDate.get(5));
        updateSpinners(false);
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.mDatePickerFormat, str)) {
            return;
        }
        this.mDatePickerFormat = str;
        List<CharSequence> extractSeparators = extractSeparators();
        if (extractSeparators.size() == str.length() + 1) {
            setSeparators(extractSeparators);
            this.mDayColumn = null;
            this.mMonthColumn = null;
            this.mYearColumn = null;
            this.mColMonthIndex = -1;
            this.mColDayIndex = -1;
            this.mColYearIndex = -1;
            String upperCase = str.toUpperCase();
            ArrayList arrayList = new ArrayList(3);
            for (int i8 = 0; i8 < upperCase.length(); i8++) {
                char charAt = upperCase.charAt(i8);
                if (charAt != 'D') {
                    if (charAt != 'M') {
                        if (charAt == 'Y') {
                            if (this.mYearColumn == null) {
                                PickerColumn pickerColumn = new PickerColumn();
                                this.mYearColumn = pickerColumn;
                                arrayList.add(pickerColumn);
                                this.mColYearIndex = i8;
                                this.mYearColumn.setLabelFormat(TimeModel.NUMBER_FORMAT);
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    } else if (this.mMonthColumn == null) {
                        PickerColumn pickerColumn2 = new PickerColumn();
                        this.mMonthColumn = pickerColumn2;
                        arrayList.add(pickerColumn2);
                        this.mMonthColumn.setStaticLabels(this.mConstant.months);
                        this.mColMonthIndex = i8;
                    } else {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                } else if (this.mDayColumn == null) {
                    PickerColumn pickerColumn3 = new PickerColumn();
                    this.mDayColumn = pickerColumn3;
                    arrayList.add(pickerColumn3);
                    this.mDayColumn.setLabelFormat(TimeModel.ZERO_LEADING_NUMBER_FORMAT);
                    this.mColDayIndex = i8;
                } else {
                    throw new IllegalArgumentException("datePicker format error");
                }
            }
            setColumns(arrayList);
            updateSpinners(false);
            return;
        }
        throw new IllegalStateException("Separators size: " + extractSeparators.size() + " must equal the size of datePickerFormat: " + str.length() + " + 1");
    }

    public void setMaxDate(long j8) {
        this.mTempDate.setTimeInMillis(j8);
        if (this.mTempDate.get(1) == this.mMaxDate.get(1) && this.mTempDate.get(6) != this.mMaxDate.get(6)) {
            return;
        }
        this.mMaxDate.setTimeInMillis(j8);
        if (this.mCurrentDate.after(this.mMaxDate)) {
            this.mCurrentDate.setTimeInMillis(this.mMaxDate.getTimeInMillis());
        }
        updateSpinners(false);
    }

    public void setMinDate(long j8) {
        this.mTempDate.setTimeInMillis(j8);
        if (this.mTempDate.get(1) == this.mMinDate.get(1) && this.mTempDate.get(6) != this.mMinDate.get(6)) {
            return;
        }
        this.mMinDate.setTimeInMillis(j8);
        if (this.mCurrentDate.before(this.mMinDate)) {
            this.mCurrentDate.setTimeInMillis(this.mMinDate.getTimeInMillis());
        }
        updateSpinners(false);
    }

    public void updateDate(int i8, int i9, int i10, boolean z8) {
        if (!isNewDate(i8, i9, i10)) {
            return;
        }
        setDate(i8, i9, i10);
        updateSpinners(z8);
    }

    void updateSpinnersImpl(boolean z8) {
        boolean updateMin;
        boolean updateMax;
        boolean z9;
        int[] iArr = {this.mColDayIndex, this.mColMonthIndex, this.mColYearIndex};
        boolean z10 = true;
        boolean z11 = true;
        for (int length = DATE_FIELDS.length - 1; length >= 0; length--) {
            int i8 = iArr[length];
            if (i8 >= 0) {
                int i9 = DATE_FIELDS[length];
                PickerColumn columnAt = getColumnAt(i8);
                if (z10) {
                    updateMin = updateMin(columnAt, this.mMinDate.get(i9));
                } else {
                    updateMin = updateMin(columnAt, this.mCurrentDate.getActualMinimum(i9));
                }
                if (z11) {
                    updateMax = updateMax(columnAt, this.mMaxDate.get(i9));
                } else {
                    updateMax = updateMax(columnAt, this.mCurrentDate.getActualMaximum(i9));
                }
                boolean z12 = updateMin | updateMax;
                boolean z13 = false;
                if (this.mCurrentDate.get(i9) == this.mMinDate.get(i9)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 &= z9;
                if (this.mCurrentDate.get(i9) == this.mMaxDate.get(i9)) {
                    z13 = true;
                }
                z11 &= z13;
                if (z12) {
                    setColumnAt(iArr[length], columnAt);
                }
                setColumnValue(iArr[length], this.mCurrentDate.get(i9), z8);
            }
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mDateFormat = new SimpleDateFormat(DATE_FORMAT);
        updateCurrentLocale();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbDatePicker);
        String string = obtainStyledAttributes.getString(R.styleable.lbDatePicker_android_minDate);
        String string2 = obtainStyledAttributes.getString(R.styleable.lbDatePicker_android_maxDate);
        this.mTempDate.clear();
        if (!TextUtils.isEmpty(string)) {
            if (!parseDate(string, this.mTempDate)) {
                this.mTempDate.set(1900, 0, 1);
            }
        } else {
            this.mTempDate.set(1900, 0, 1);
        }
        this.mMinDate.setTimeInMillis(this.mTempDate.getTimeInMillis());
        this.mTempDate.clear();
        if (!TextUtils.isEmpty(string2)) {
            if (!parseDate(string2, this.mTempDate)) {
                this.mTempDate.set(2100, 0, 1);
            }
        } else {
            this.mTempDate.set(2100, 0, 1);
        }
        this.mMaxDate.setTimeInMillis(this.mTempDate.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(R.styleable.lbDatePicker_datePickerFormat);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }
}
