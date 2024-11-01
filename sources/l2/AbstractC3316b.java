package l2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3316b extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3316b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i8) * 9) / 16, 1073741824));
        } else {
            super.onMeasure(i8, i9);
        }
    }
}
