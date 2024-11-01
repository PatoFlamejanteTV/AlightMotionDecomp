package com.uptodown.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.AbstractC3292y;
import u5.AbstractC4089i;

/* loaded from: classes5.dex */
public final class ScrollableTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3292y.i(context, "context");
        if (getText().toString().length() > 0) {
            AbstractC4089i.d(this);
            AbstractC4089i.b(this);
        }
    }
}
