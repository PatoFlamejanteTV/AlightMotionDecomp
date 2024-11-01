package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(5) + UtcDates.getUtcCalendar().getMaximum(7)) - 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j8) {
        return DateStrings.getDayContentDescription(context, j8, isToday(j8), isStartOfRange(j8), isEndOfRange(j8));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j8) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j8) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j8) {
        if (UtcDates.getTodayCalendar().getTimeInMillis() == j8) {
            return true;
        }
        return false;
    }

    private void updateSelectedState(@Nullable TextView textView, long j8, int i8) {
        CalendarItemStyle calendarItemStyle;
        boolean z8;
        CalendarItemStyle calendarItemStyle2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j8);
        textView.setContentDescription(dayContentDescription);
        boolean isValid = this.calendarConstraints.getDateValidator().isValid(j8);
        if (isValid) {
            textView.setEnabled(true);
            boolean isSelected = isSelected(j8);
            textView.setSelected(isSelected);
            if (isSelected) {
                calendarItemStyle2 = this.calendarStyle.selectedDay;
            } else if (isToday(j8)) {
                calendarItemStyle2 = this.calendarStyle.todayDay;
            } else {
                calendarItemStyle2 = this.calendarStyle.day;
            }
            calendarItemStyle = calendarItemStyle2;
            z8 = isSelected;
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
            z8 = false;
        }
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator != null && i8 != -1) {
            Month month = this.month;
            int i9 = month.year;
            int i10 = month.month;
            ColorStateList backgroundColor = dayViewDecorator.getBackgroundColor(context, i9, i10, i8, isValid, z8);
            boolean z9 = z8;
            calendarItemStyle.styleItem(textView, backgroundColor, this.dayViewDecorator.getTextColor(context, i9, i10, i8, isValid, z9));
            Drawable compoundDrawableLeft = this.dayViewDecorator.getCompoundDrawableLeft(context, i9, i10, i8, isValid, z9);
            Drawable compoundDrawableTop = this.dayViewDecorator.getCompoundDrawableTop(context, i9, i10, i8, isValid, z9);
            Drawable compoundDrawableRight = this.dayViewDecorator.getCompoundDrawableRight(context, i9, i10, i8, isValid, z9);
            boolean z10 = z8;
            textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.dayViewDecorator.getCompoundDrawableBottom(context, i9, i10, i8, isValid, z10));
            textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i9, i10, i8, isValid, z10, dayContentDescription));
            return;
        }
        calendarItemStyle.styleItem(textView);
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j8) {
        if (Month.create(j8).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j8);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j8, dayOfMonth);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int dayToPosition(int i8) {
        return firstPositionInMonth() + (i8 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8 / this.month.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @VisibleForTesting
    boolean isEndOfRange(long j8) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l8 = it.next().second;
            if (l8 != null && l8.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFirstInRow(int i8) {
        if (i8 % this.month.daysInWeek == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLastInRow(int i8) {
        if ((i8 + 1) % this.month.daysInWeek == 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    boolean isStartOfRange(long j8) {
        Iterator<Pair<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l8 = it.next().first;
            if (l8 != null && l8.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    int positionToDay(int i8) {
        return (i8 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean withinMonth(int i8) {
        if (i8 >= firstPositionInMonth() && i8 <= lastPositionInMonth()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i8) {
        if (i8 < firstPositionInMonth() || i8 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.initializeStyles(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.firstPositionInMonth()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.month
            int r3 = r8.daysInMonth
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.updateSelectedState(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
