package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
class NonOverlappingFrameLayout extends FrameLayout {
    public NonOverlappingFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public NonOverlappingFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
