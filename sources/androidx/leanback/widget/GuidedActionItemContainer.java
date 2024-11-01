package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
class GuidedActionItemContainer extends NonOverlappingLinearLayoutWithForeground {
    private boolean mFocusOutAllowed;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        if (!this.mFocusOutAllowed && Util.isDescendant(this, view)) {
            View focusSearch = super.focusSearch(view, i8);
            if (Util.isDescendant(this, focusSearch)) {
                return focusSearch;
            }
            return null;
        }
        return super.focusSearch(view, i8);
    }

    public void setFocusOutAllowed(boolean z8) {
        this.mFocusOutAllowed = z8;
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mFocusOutAllowed = true;
    }
}
