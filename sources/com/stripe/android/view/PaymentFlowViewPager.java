package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentFlowViewPager extends ViewPager {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28758a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4, null);
        AbstractC3292y.i(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28758a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28758a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public /* synthetic */ PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? false : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z8) {
        super(context, attributeSet);
        AbstractC3292y.i(context, "context");
        this.f28758a = z8;
    }
}
