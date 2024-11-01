package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.stripe.android.view.N0;
import g3.C2896F;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* loaded from: classes4.dex */
public final class L0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f28655a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28656b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28657c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28658d;

    /* renamed from: e, reason: collision with root package name */
    private final L2.t f28659e;

    public /* synthetic */ L0(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8) {
            this.f28659e.f5367c.setTextColor(this.f28656b);
            this.f28659e.f5366b.setTextColor(this.f28656b);
            this.f28659e.f5368d.setTextColor(this.f28656b);
            this.f28659e.f5369e.setVisibility(0);
            return;
        }
        this.f28659e.f5367c.setTextColor(this.f28658d);
        this.f28659e.f5366b.setTextColor(this.f28657c);
        this.f28659e.f5368d.setTextColor(this.f28658d);
        this.f28659e.f5369e.setVisibility(4);
    }

    public final void setShippingMethod(C2896F shippingMethod) {
        AbstractC3292y.i(shippingMethod, "shippingMethod");
        this.f28659e.f5367c.setText(shippingMethod.h());
        this.f28659e.f5366b.setText(shippingMethod.f());
        TextView textView = this.f28659e.f5368d;
        long a9 = shippingMethod.a();
        Currency b9 = shippingMethod.b();
        String string = getContext().getString(AbstractC3394E.f35187D0);
        AbstractC3292y.h(string, "getString(...)");
        textView.setText(E0.b(a9, b9, string));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        N0 n02 = new N0(context);
        this.f28655a = n02;
        L2.t b9 = L2.t.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        this.f28659e = b9;
        int a9 = n02.a();
        int d8 = n02.d();
        int e8 = n02.e();
        N0.a aVar = N0.f28682g;
        this.f28656b = aVar.b(a9) ? ContextCompat.getColor(context, n2.x.f35450a) : a9;
        this.f28658d = aVar.b(d8) ? ContextCompat.getColor(context, n2.x.f35452c) : d8;
        this.f28657c = aVar.b(e8) ? ContextCompat.getColor(context, n2.x.f35453d) : e8;
    }
}
