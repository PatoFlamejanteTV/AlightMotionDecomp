package com.uptodown.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class FullHeightImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullHeightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
