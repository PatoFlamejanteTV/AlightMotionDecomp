package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i8) {
            return new Month[i8];
        }
    };
    final int daysInMonth;
    final int daysInWeek;

    @NonNull
    private final Calendar firstOfMonth;

    @Nullable
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month create(long j8) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j8);
        return new Month(utcCalendar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int daysFromStartOfWeekToFirstOfMonth(int i8) {
        int i9 = this.firstOfMonth.get(7);
        if (i8 <= 0) {
            i8 = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i10 = i9 - i8;
        if (i10 < 0) {
            return i10 + this.daysInWeek;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.month == month.month && this.year == month.year) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getDay(int i8) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.set(5, i8);
        return dayCopy.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDayOfMonth(long j8) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.setTimeInMillis(j8);
        return dayCopy.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String getLongName() {
        if (this.longName == null) {
            this.longName = DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Month monthsLater(int i8) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.add(2, i8);
        return new Month(dayCopy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int monthsUntil(@NonNull Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Month create(int i8, int i9) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.set(1, i8);
        utcCalendar.set(2, i9);
        return new Month(utcCalendar);
    }
}
