package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public class ThreeDS2TextView extends MaterialTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public void a(String str, Y3.d dVar) {
        String y8;
        String p8;
        setText(str);
        if (dVar != null && (p8 = dVar.p()) != null) {
            setTextColor(Color.parseColor(p8));
        }
        if (dVar != null) {
            Integer valueOf = Integer.valueOf(dVar.u());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, valueOf.intValue());
            }
        }
        if (dVar != null && (y8 = dVar.y()) != null) {
            setTypeface(Typeface.create(y8, 0));
        }
    }

    public /* synthetic */ ThreeDS2TextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
    }
}
