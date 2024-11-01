package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* loaded from: classes4.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams.leftMargin + paddingLeft + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > i10 - i8) {
                paddingLeft = getPaddingLeft();
                paddingTop += i12;
                i12 = getChildAt(i13).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i12 = Math.max(i12, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i14 = marginLayoutParams.leftMargin + paddingLeft;
            int i15 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i14, i15, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + i15);
            paddingLeft += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        measureChildren(i8, i9);
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i16 = i14 + measuredWidth;
            if (getPaddingLeft() + i16 + getPaddingRight() > size) {
                int max = Math.max(i14, i11);
                i12 += i13;
                i13 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + i12 + "---maxWidth:" + max);
                i10 = max;
                i14 = measuredWidth;
            } else {
                i13 = Math.max(i13, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i10 = i11;
                i14 = i16;
            }
            if (i15 == childCount - 1) {
                i12 += i13;
                i11 = Math.max(i14, i11);
            } else {
                i11 = i10;
            }
        }
        int paddingLeft = i11 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i12 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
