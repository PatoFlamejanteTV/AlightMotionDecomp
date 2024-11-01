package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes3.dex */
class NonOverlappingView extends View {
    public NonOverlappingView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
