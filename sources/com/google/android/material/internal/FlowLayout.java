package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i8, int i9, int i10) {
        if (i9 != Integer.MIN_VALUE) {
            if (i9 != 1073741824) {
                return i10;
            }
            return i8;
        }
        return Math.min(i10, i8);
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    protected int getItemSpacing() {
        return this.itemSpacing;
    }

    protected int getLineSpacing() {
        return this.lineSpacing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean z9;
        int paddingLeft;
        int paddingRight;
        int i12;
        int i13;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z9) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i14 = (i10 - i8) - paddingRight;
        int i15 = paddingLeft;
        int i16 = paddingTop;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    i12 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int measuredWidth = i15 + i13 + childAt.getMeasuredWidth();
                if (!this.singleLine && measuredWidth > i14) {
                    i16 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    i15 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i18 = i15 + i13;
                int measuredWidth2 = childAt.getMeasuredWidth() + i18;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z9) {
                    childAt.layout(i14 - measuredWidth2, i16, (i14 - i15) - i13, measuredHeight);
                } else {
                    childAt.layout(i18, i16, measuredWidth2, measuredHeight);
                }
                i15 += i13 + i12 + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i10 - getPaddingRight();
        int i14 = paddingTop;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i8, i9);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i17 = paddingLeft;
                if (paddingLeft + i11 + childAt.getMeasuredWidth() > paddingRight && !isSingleLine()) {
                    i13 = getPaddingLeft();
                    i14 = this.lineSpacing + paddingTop;
                } else {
                    i13 = i17;
                }
                int measuredWidth = i13 + i11 + childAt.getMeasuredWidth();
                int measuredHeight = i14 + childAt.getMeasuredHeight();
                if (measuredWidth > i15) {
                    i15 = measuredWidth;
                }
                paddingLeft = i13 + i11 + i12 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i16 == getChildCount() - 1) {
                    i15 += i12;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i15 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i8) {
        this.itemSpacing = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i8) {
        this.lineSpacing = i8;
    }

    public void setSingleLine(boolean z8) {
        this.singleLine = z8;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
