package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class BrandZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f28184a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f28185b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final ImageView getIssuerImageView$3ds2sdk_release() {
        return this.f28184a;
    }

    public final ImageView getPaymentSystemImageView$3ds2sdk_release() {
        return this.f28185b;
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        V3.a b9 = V3.a.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        ImageView issuerImage = b9.f10549b;
        AbstractC3292y.h(issuerImage, "issuerImage");
        this.f28184a = issuerImage;
        ImageView paymentSystemImage = b9.f10550c;
        AbstractC3292y.h(paymentSystemImage, "paymentSystemImage");
        this.f28185b = paymentSystemImage;
    }
}
