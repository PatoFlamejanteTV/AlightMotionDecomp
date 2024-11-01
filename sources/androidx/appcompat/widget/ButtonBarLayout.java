package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        int[] iArr = R.styleable.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.mAllowStacking);
        }
    }

    private int getNextVisibleChildIndex(int i8) {
        int childCount = getChildCount();
        while (i8 < childCount) {
            if (getChildAt(i8).getVisibility() == 0) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private boolean isStacked() {
        return this.mStacked;
    }

    private void setStacked(boolean z8) {
        int i8;
        int i9;
        if (this.mStacked != z8) {
            if (!z8 || this.mAllowStacking) {
                this.mStacked = z8;
                setOrientation(z8 ? 1 : 0);
                if (z8) {
                    i8 = GravityCompat.END;
                } else {
                    i8 = 80;
                }
                setGravity(i8);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z8) {
                        i9 = 8;
                    } else {
                        i9 = 4;
                    }
                    findViewById.setVisibility(i9);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        boolean z8;
        int size = View.MeasureSpec.getSize(i8);
        int i11 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (!isStacked() && View.MeasureSpec.getMode(i8) == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        } else {
            i10 = i8;
            z8 = false;
        }
        super.onMeasure(i10, i9);
        if (this.mAllowStacking && !isStacked() && (getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i8, i9);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    paddingTop += getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i11 = paddingTop;
            } else {
                i11 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i11) {
            setMinimumHeight(i11);
            if (i9 == 0) {
                super.onMeasure(i8, i9);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.mAllowStacking != z8) {
            this.mAllowStacking = z8;
            if (!z8 && isStacked()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
