package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class ControlBar extends LinearLayout {
    private int mChildMarginFromCenter;
    boolean mDefaultFocusToMiddle;
    int mLastFocusIndex;
    private OnChildFocusedListener mOnChildFocusedListener;

    /* loaded from: classes3.dex */
    public interface OnChildFocusedListener {
        void onChildFocusedListener(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastFocusIndex = -1;
        this.mDefaultFocusToMiddle = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        if (i8 != 33 && i8 != 130) {
            super.addFocusables(arrayList, i8, i9);
            return;
        }
        int i10 = this.mLastFocusIndex;
        if (i10 >= 0 && i10 < getChildCount()) {
            arrayList.add(getChildAt(this.mLastFocusIndex));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(getDefaultFocusIndex()));
        }
    }

    int getDefaultFocusIndex() {
        if (this.mDefaultFocusToMiddle) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.mChildMarginFromCenter <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < getChildCount() - 1) {
            View childAt = getChildAt(i10);
            i10++;
            View childAt2 = getChildAt(i10);
            int measuredWidth = this.mChildMarginFromCenter - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = measuredWidth - layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i11 += marginStart;
        }
        setMeasuredDimension(getMeasuredWidth() + i11, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int defaultFocusIndex;
        if (getChildCount() > 0) {
            int i9 = this.mLastFocusIndex;
            if (i9 >= 0 && i9 < getChildCount()) {
                defaultFocusIndex = this.mLastFocusIndex;
            } else {
                defaultFocusIndex = getDefaultFocusIndex();
            }
            if (getChildAt(defaultFocusIndex).requestFocus(i8, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.mLastFocusIndex = indexOfChild(view);
        OnChildFocusedListener onChildFocusedListener = this.mOnChildFocusedListener;
        if (onChildFocusedListener != null) {
            onChildFocusedListener.onChildFocusedListener(view, view2);
        }
    }

    public void setChildMarginFromCenter(int i8) {
        this.mChildMarginFromCenter = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultFocusToMiddle(boolean z8) {
        this.mDefaultFocusToMiddle = z8;
    }

    public void setOnChildFocusedListener(OnChildFocusedListener onChildFocusedListener) {
        this.mOnChildFocusedListener = onChildFocusedListener;
    }

    public ControlBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mLastFocusIndex = -1;
        this.mDefaultFocusToMiddle = true;
    }
}
