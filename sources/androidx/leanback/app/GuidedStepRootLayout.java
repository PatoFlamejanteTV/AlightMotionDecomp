package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.widget.Util;

/* loaded from: classes3.dex */
class GuidedStepRootLayout extends LinearLayout {
    private boolean mFocusOutEnd;
    private boolean mFocusOutStart;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFocusOutStart = false;
        this.mFocusOutEnd = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        View focusSearch = super.focusSearch(view, i8);
        if (i8 == 17 || i8 == 66) {
            if (Util.isDescendant(this, focusSearch)) {
                return focusSearch;
            }
            if (getLayoutDirection() != 0 ? i8 == 66 : i8 == 17) {
                if (!this.mFocusOutStart) {
                    return view;
                }
            } else if (!this.mFocusOutEnd) {
                return view;
            }
        }
        return focusSearch;
    }

    public void setFocusOutEnd(boolean z8) {
        this.mFocusOutEnd = z8;
    }

    public void setFocusOutStart(boolean z8) {
        this.mFocusOutStart = z8;
    }

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mFocusOutStart = false;
        this.mFocusOutEnd = false;
    }
}
