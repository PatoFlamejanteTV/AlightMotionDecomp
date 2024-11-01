package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3391B;

/* loaded from: classes4.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f28824a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28825b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28826c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28827d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28828e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28829f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f28830g;

    public S0(Context context) {
        AbstractC3292y.i(context, "context");
        N0 n02 = new N0(context);
        this.f28824a = n02;
        int a9 = a(context, n02.a(), n2.x.f35450a);
        this.f28825b = a9;
        this.f28826c = a(context, n02.b(), n2.x.f35454e);
        int a10 = a(context, n02.e(), n2.x.f35451b);
        this.f28827d = a10;
        Resources resources = context.getResources();
        int i8 = AbstractC3391B.f35153b;
        int alphaComponent = ColorUtils.setAlphaComponent(a9, resources.getInteger(i8));
        this.f28828e = alphaComponent;
        int alphaComponent2 = ColorUtils.setAlphaComponent(a10, context.getResources().getInteger(i8));
        this.f28829f = alphaComponent2;
        this.f28830g = new int[]{a9, alphaComponent, a10, alphaComponent2};
    }

    private final int a(Context context, int i8, int i9) {
        if (N0.f28682g.b(i8)) {
            return ContextCompat.getColor(context, i9);
        }
        return i8;
    }

    public final int b(boolean z8) {
        if (z8) {
            return this.f28828e;
        }
        return this.f28829f;
    }

    public final int c(boolean z8) {
        if (z8) {
            return this.f28825b;
        }
        return this.f28827d;
    }

    public final int d(boolean z8) {
        if (z8) {
            return this.f28825b;
        }
        return this.f28826c;
    }
}
