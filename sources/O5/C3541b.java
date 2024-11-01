package o5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3541b extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3541b(Context context) {
        super(context);
        AbstractC3292y.i(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (getDrawable() != null) {
            setMeasuredDimension((int) Math.ceil((r3 * getDrawable().getIntrinsicWidth()) / getDrawable().getIntrinsicHeight()), View.MeasureSpec.getSize(i9));
        } else {
            super.onMeasure(i8, i9);
        }
    }
}
