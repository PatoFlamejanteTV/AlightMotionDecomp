package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NonOverlappingLinearLayout extends LinearLayout {
    boolean mDeferFocusableViewAvailableInLayout;
    boolean mFocusableViewAvailableFixEnabled;
    final ArrayList<ArrayList<View>> mSortedAvailableViews;

    public NonOverlappingLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int i8;
        if (this.mDeferFocusableViewAvailableInLayout) {
            for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
                if (view2.getParent() == this) {
                    i8 = indexOfChild(view2);
                    break;
                }
            }
            i8 = -1;
            if (i8 != -1) {
                this.mSortedAvailableViews.get(i8).add(view);
                return;
            }
            return;
        }
        super.focusableViewAvailable(view);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean z9;
        int i12 = 0;
        try {
            if (this.mFocusableViewAvailableFixEnabled && getOrientation() == 0 && getLayoutDirection() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.mDeferFocusableViewAvailableInLayout = z9;
            if (z9) {
                while (this.mSortedAvailableViews.size() > getChildCount()) {
                    ArrayList<ArrayList<View>> arrayList = this.mSortedAvailableViews;
                    arrayList.remove(arrayList.size() - 1);
                }
                while (this.mSortedAvailableViews.size() < getChildCount()) {
                    this.mSortedAvailableViews.add(new ArrayList<>());
                }
            }
            super.onLayout(z8, i8, i9, i10, i11);
            if (this.mDeferFocusableViewAvailableInLayout) {
                for (int i13 = 0; i13 < this.mSortedAvailableViews.size(); i13++) {
                    for (int i14 = 0; i14 < this.mSortedAvailableViews.get(i13).size(); i14++) {
                        super.focusableViewAvailable(this.mSortedAvailableViews.get(i13).get(i14));
                    }
                }
            }
            if (this.mDeferFocusableViewAvailableInLayout) {
                this.mDeferFocusableViewAvailableInLayout = false;
                while (i12 < this.mSortedAvailableViews.size()) {
                    this.mSortedAvailableViews.get(i12).clear();
                    i12++;
                }
            }
        } catch (Throwable th) {
            if (this.mDeferFocusableViewAvailableInLayout) {
                this.mDeferFocusableViewAvailableInLayout = false;
                while (i12 < this.mSortedAvailableViews.size()) {
                    this.mSortedAvailableViews.get(i12).clear();
                    i12++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z8) {
        this.mFocusableViewAvailableFixEnabled = z8;
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mFocusableViewAvailableFixEnabled = false;
        this.mSortedAvailableViews = new ArrayList<>();
    }
}
