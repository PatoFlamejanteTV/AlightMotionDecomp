package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {"12", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", CampaignEx.CLICKMODE_ON, "6", "7", "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", CampaignEx.CLICKMODE_ON, "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", CampaignEx.CLICKMODE_ON, "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    private String[] getHourClockValues() {
        if (this.time.format == 1) {
            return HOUR_CLOCK_24_VALUES;
        }
        return HOUR_CLOCK_VALUES;
    }

    private int getHourRotation() {
        return (this.time.getHourForDisplay() * 30) % 360;
    }

    private void performHapticFeedback(int i8, int i9) {
        TimeModel timeModel = this.time;
        if (timeModel.minute != i9 || timeModel.hour != i8) {
            this.timePickerView.performHapticFeedback(4);
        }
    }

    private void updateCurrentLevel() {
        TimeModel timeModel = this.time;
        int i8 = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            i8 = 2;
        }
        this.timePickerView.setCurrentLevel(i8);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f8, boolean z8) {
        this.broadcasting = true;
        TimeModel timeModel = this.time;
        int i8 = timeModel.minute;
        int i9 = timeModel.hour;
        if (timeModel.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.timePickerView.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                setSelection(12, true);
            }
        } else {
            int round = Math.round(f8);
            if (!z8) {
                this.time.setMinute(((round + 15) / 30) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z8);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i9, i8);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i8) {
        this.time.setPeriod(i8);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f8, boolean z8) {
        if (this.broadcasting) {
            return;
        }
        TimeModel timeModel = this.time;
        int i8 = timeModel.hour;
        int i9 = timeModel.minute;
        int round = Math.round(f8);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            timeModel2.setMinute((round + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            int i10 = (round + 15) / 30;
            if (timeModel2.format == 1) {
                i10 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    i10 += 12;
                }
            }
            this.time.setHour(i10);
            this.hourRotation = getHourRotation();
        }
        if (!z8) {
            updateTime();
            performHapticFeedback(i8, i9);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i8) {
        setSelection(i8, true);
    }

    void setSelection(int i8, boolean z8) {
        boolean z9;
        String[] hourClockValues;
        int hourContentDescriptionResId;
        float f8;
        if (i8 == 12) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.timePickerView.setAnimateOnTouchUp(z9);
        this.time.selection = i8;
        TimePickerView timePickerView = this.timePickerView;
        if (z9) {
            hourClockValues = MINUTE_CLOCK_VALUES;
        } else {
            hourClockValues = getHourClockValues();
        }
        if (z9) {
            hourContentDescriptionResId = R.string.material_minute_suffix;
        } else {
            hourContentDescriptionResId = this.time.getHourContentDescriptionResId();
        }
        timePickerView.setValues(hourClockValues, hourContentDescriptionResId);
        updateCurrentLevel();
        TimePickerView timePickerView2 = this.timePickerView;
        if (z9) {
            f8 = this.minuteRotation;
        } else {
            f8 = this.hourRotation;
        }
        timePickerView2.setHandRotation(f8, z8);
        this.timePickerView.setActiveSelection(i8);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(TimePickerClockPresenter.this.time.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    private void updateValues(String[] strArr, String str) {
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr[i8] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i8], str);
        }
    }
}
