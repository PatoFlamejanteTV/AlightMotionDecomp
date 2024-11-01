package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void gainFocus(int i8, Rect rect) {
        if (i8 == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i8 == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i8, rect);
        }
    }

    private View getChildAtPosition(int i8) {
        return getChildAt(i8 - getFirstVisiblePosition());
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean skipMonth(@Nullable Long l8, @Nullable Long l9, @Nullable Long l10, @Nullable Long l11) {
        if (l8 == null || l9 == null || l10 == null || l11 == null || l10.longValue() > l9.longValue() || l11.longValue() < l8.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(@NonNull Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int i8;
        int i9;
        int i10;
        int i11;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        int max = Math.max(adapter.firstPositionInMonth(), getFirstVisiblePosition());
        int min = Math.min(adapter.lastPositionInMonth(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<Pair<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l8 = next.first;
            if (l8 != null) {
                if (next.second != null) {
                    Long l9 = l8;
                    long longValue = l9.longValue();
                    Long l10 = next.second;
                    long longValue2 = l10.longValue();
                    if (!skipMonth(item, item2, l9, l10)) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            if (adapter.isFirstInRow(max)) {
                                left2 = 0;
                            } else if (!isLayoutRtl) {
                                left2 = materialCalendarGridView.getChildAtPosition(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.getChildAtPosition(max - 1).getLeft();
                            }
                            horizontalMidPoint = left2;
                            dayToPosition = max;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            dayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter.isLastInRow(min)) {
                                left = getWidth();
                            } else if (!isLayoutRtl) {
                                left = materialCalendarGridView.getChildAtPosition(min).getRight();
                            } else {
                                left = materialCalendarGridView.getChildAtPosition(min).getLeft();
                            }
                            horizontalMidPoint2 = left;
                            dayToPosition2 = min;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            dayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition2));
                        }
                        int itemId = (int) adapter.getItemId(dayToPosition);
                        int i12 = max;
                        int i13 = min;
                        int itemId2 = (int) adapter.getItemId(dayToPosition2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            MonthAdapter monthAdapter = adapter;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                            int top = childAtPosition.getTop() + calendarStyle.day.getTopInset();
                            Iterator<Pair<Long, Long>> it2 = it;
                            int bottom = childAtPosition.getBottom() - calendarStyle.day.getBottomInset();
                            if (!isLayoutRtl) {
                                if (numColumns > dayToPosition) {
                                    i10 = 0;
                                } else {
                                    i10 = horizontalMidPoint;
                                }
                                if (dayToPosition2 > numColumns2) {
                                    i11 = getWidth();
                                } else {
                                    i11 = horizontalMidPoint2;
                                }
                            } else {
                                if (dayToPosition2 > numColumns2) {
                                    i8 = 0;
                                } else {
                                    i8 = horizontalMidPoint2;
                                }
                                if (numColumns > dayToPosition) {
                                    i9 = getWidth();
                                } else {
                                    i9 = horizontalMidPoint;
                                }
                                int i14 = i9;
                                i10 = i8;
                                i11 = i14;
                            }
                            canvas.drawRect(i10, top, i11, bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter = monthAdapter;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i12;
                        min = i13;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        if (z8) {
            gainFocus(i8, rect);
        } else {
            super.onFocusChanged(false, i8, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (!super.onKeyDown(i8, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i8) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i8, int i9) {
        if (this.nestedScrollable) {
            super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i8) {
        if (i8 < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i8);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }
}
