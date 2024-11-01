package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g3.C2896F;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SelectShippingMethodWidget extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final K0 f28831a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final C2896F getSelectedShippingMethod() {
        return this.f28831a.b();
    }

    public final void setSelectedShippingMethod(C2896F shippingMethod) {
        AbstractC3292y.i(shippingMethod, "shippingMethod");
        this.f28831a.g(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(Function1 callback) {
        AbstractC3292y.i(callback, "callback");
        this.f28831a.f(callback);
    }

    public final void setShippingMethods(List<C2896F> shippingMethods) {
        AbstractC3292y.i(shippingMethods, "shippingMethods");
        this.f28831a.i(shippingMethods);
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        K0 k02 = new K0();
        this.f28831a = k02;
        L2.u b9 = L2.u.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        RecyclerView recyclerView = b9.f5371b;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(k02);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
