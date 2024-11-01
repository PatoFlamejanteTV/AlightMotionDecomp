package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    @Override // com.stripe.android.stripe3ds2.views.ThreeDS2TextView
    public void a(String str, Y3.d dVar) {
        setText(str);
        if (dVar != null) {
            String l8 = dVar.l();
            if (l8 != null) {
                setTextColor(Color.parseColor(l8));
            }
            Integer valueOf = Integer.valueOf(dVar.x());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
            String w8 = dVar.w();
            if (w8 != null) {
                setTypeface(Typeface.create(w8, 0));
            }
        }
    }

    public /* synthetic */ ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
    }
}
