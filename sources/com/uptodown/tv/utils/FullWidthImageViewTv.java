package com.uptodown.tv.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC3292y;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public final class FullWidthImageViewTv extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullWidthImageViewTv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3292y.i(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (getDrawable() != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i8), (int) Math.ceil((r3 * getDrawable().getIntrinsicHeight()) / getDrawable().getIntrinsicWidth()));
        } else {
            super.onMeasure(i8, i9);
        }
    }
}
