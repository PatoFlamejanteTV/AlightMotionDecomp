package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class M extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Animation f28660a;

    /* renamed from: b, reason: collision with root package name */
    private final Animation f28661b;

    /* loaded from: classes4.dex */
    public static final class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            M.this.setVisibility(0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            M.this.setVisibility(4);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            M.this.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, n2.w.f35448a);
        loadAnimation.setAnimationListener(new a());
        this.f28660a = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, n2.w.f35449b);
        loadAnimation2.setAnimationListener(new b());
        this.f28661b = loadAnimation2;
        L2.k.b(LayoutInflater.from(context), this);
        setBackgroundResource(n2.z.f35486a);
        setClipToOutline(true);
        setVisibility(4);
    }

    public final void a() {
        startAnimation(this.f28661b);
    }

    public final void b() {
        startAnimation(this.f28660a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(n2.y.f35463e);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
