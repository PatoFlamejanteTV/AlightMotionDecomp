package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* renamed from: com.stripe.android.view.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2675t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29203a;

    public C2675t(Context context) {
        AbstractC3292y.i(context, "context");
        this.f29203a = context;
    }

    public final CharSequence a(String companyName) {
        Spanned fromHtml;
        AbstractC3292y.i(companyName, "companyName");
        String string = this.f29203a.getString(AbstractC3394E.f35204M, companyName);
        AbstractC3292y.h(string, "getString(...)");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(string, 0);
            AbstractC3292y.f(fromHtml);
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(string);
        AbstractC3292y.f(fromHtml2);
        return fromHtml2;
    }
}
