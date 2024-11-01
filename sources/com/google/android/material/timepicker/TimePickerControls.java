package com.google.android.material.timepicker;

import androidx.annotation.IntRange;
import androidx.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
interface TimePickerControls {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ActiveSelection {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ClockPeriod {
    }

    void setActiveSelection(int i8);

    void setHandRotation(float f8);

    void setValues(String[] strArr, @StringRes int i8);

    void updateTime(int i8, int i9, @IntRange(from = 0) int i10);
}
