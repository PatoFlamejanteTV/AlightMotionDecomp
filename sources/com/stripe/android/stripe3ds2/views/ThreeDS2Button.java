package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public class ThreeDS2Button extends MaterialButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final int a(String hexColor) {
        AbstractC3292y.i(hexColor, "hexColor");
        return Color.parseColor(hexColor);
    }

    public final void setButtonCustomization(Y3.b bVar) {
        if (bVar == null) {
            return;
        }
        String p8 = bVar.p();
        if (p8 != null) {
            setTextColor(a(p8));
        }
        String f8 = bVar.f();
        if (f8 != null) {
            setBackgroundTintList(ColorStateList.valueOf(a(f8)));
        }
        Integer valueOf = Integer.valueOf(bVar.b());
        Integer num = null;
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            setCornerRadius(valueOf.intValue());
        }
        Integer valueOf2 = Integer.valueOf(bVar.u());
        if (valueOf2.intValue() > 0) {
            num = valueOf2;
        }
        if (num != null) {
            setTextSize(2, num.intValue());
        }
        String y8 = bVar.y();
        if (y8 != null) {
            setTypeface(Typeface.create(y8, 0));
        }
    }

    public /* synthetic */ ThreeDS2Button(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
    }
}
