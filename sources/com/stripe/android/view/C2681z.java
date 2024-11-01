package com.stripe.android.view;

import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.stripe.android.model.o;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* renamed from: com.stripe.android.view.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2681z {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f29245a;

    /* renamed from: b, reason: collision with root package name */
    private final S0 f29246b;

    public C2681z(Resources resources, S0 themeConfig) {
        AbstractC3292y.i(resources, "resources");
        AbstractC3292y.i(themeConfig, "themeConfig");
        this.f29245a = resources;
        this.f29246b = themeConfig;
    }

    private final void c(SpannableString spannableString, ParcelableSpan parcelableSpan, int i8, int i9) {
        spannableString.setSpan(parcelableSpan, i8, i9, 33);
    }

    public final /* synthetic */ SpannableString a(EnumC2906e brand, String str, boolean z8) {
        AbstractC3292y.i(brand, "brand");
        String h8 = brand.h();
        int length = h8.length();
        if (str != null && !l6.n.T(str)) {
            String string = this.f29245a.getString(AbstractC3394E.f35219Z, h8, str);
            AbstractC3292y.h(string, "getString(...)");
            int length2 = string.length();
            int R8 = l6.n.R(string, str, 0, false, 6, null);
            int length3 = str.length() + R8;
            int R9 = l6.n.R(string, h8, 0, false, 6, null);
            int length4 = h8.length() + R9;
            int c8 = this.f29246b.c(z8);
            int b9 = this.f29246b.b(z8);
            SpannableString spannableString = new SpannableString(string);
            c(spannableString, new ForegroundColorSpan(b9), 0, length2);
            c(spannableString, new TypefaceSpan("sans-serif-medium"), R9, length4);
            c(spannableString, new ForegroundColorSpan(c8), R9, length4);
            c(spannableString, new TypefaceSpan("sans-serif-medium"), R8, length3);
            c(spannableString, new ForegroundColorSpan(c8), R8, length3);
            return spannableString;
        }
        SpannableString spannableString2 = new SpannableString(h8);
        c(spannableString2, new TypefaceSpan("sans-serif-medium"), 0, length);
        return spannableString2;
    }

    public final /* synthetic */ String b(o.g card) {
        AbstractC3292y.i(card, "card");
        String string = this.f29245a.getString(AbstractC3394E.f35219Z, card.f25698a.h(), card.f25705h);
        AbstractC3292y.h(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2681z(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            com.stripe.android.view.S0 r1 = new com.stripe.android.view.S0
            r1.<init>(r3)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2681z.<init>(android.content.Context):void");
    }
}
