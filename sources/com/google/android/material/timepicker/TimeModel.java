package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i8) {
            return new TimeModel[i8];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final MaxInputValidator hourInputValidator;
    int minute;
    private final MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    private static int getPeriod(int i8) {
        return i8 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.hour == timeModel.hour && this.minute == timeModel.minute && this.format == timeModel.format && this.selection == timeModel.selection) {
            return true;
        }
        return false;
    }

    @StringRes
    public int getHourContentDescriptionResId() {
        if (this.format == 1) {
            return R.string.material_hour_24h_suffix;
        }
        return R.string.material_hour_suffix;
    }

    public int getHourForDisplay() {
        if (this.format == 1) {
            return this.hour % 24;
        }
        int i8 = this.hour;
        if (i8 % 12 == 0) {
            return 12;
        }
        if (this.period == 1) {
            return i8 - 12;
        }
        return i8;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.format), Integer.valueOf(this.hour), Integer.valueOf(this.minute), Integer.valueOf(this.selection)});
    }

    public void setHour(int i8) {
        if (this.format == 1) {
            this.hour = i8;
            return;
        }
        int i9 = 12;
        int i10 = i8 % 12;
        if (this.period != 1) {
            i9 = 0;
        }
        this.hour = i10 + i9;
    }

    public void setHourOfDay(int i8) {
        this.period = getPeriod(i8);
        this.hour = i8;
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i8) {
        this.minute = i8 % 60;
    }

    public void setPeriod(int i8) {
        if (i8 != this.period) {
            this.period = i8;
            int i9 = this.hour;
            if (i9 < 12 && i8 == 1) {
                this.hour = i9 + 12;
            } else if (i9 >= 12 && i8 == 0) {
                this.hour = i9 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.selection);
        parcel.writeInt(this.format);
    }

    public TimeModel(int i8) {
        this(0, 0, 10, i8);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public TimeModel(int i8, int i9, int i10, int i11) {
        this.hour = i8;
        this.minute = i9;
        this.selection = i10;
        this.format = i11;
        this.period = getPeriod(i8);
        this.minuteInputValidator = new MaxInputValidator(59);
        this.hourInputValidator = new MaxInputValidator(i11 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
