package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
class NonOverlappingRelativeLayout extends RelativeLayout {
    public NonOverlappingRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public NonOverlappingRelativeLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
