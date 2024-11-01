package com.stripe.android.stripe3ds2.views;

import V3.j;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class InformationZoneView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j f28234a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f28235b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2TextView f28236c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f28237d;

    /* renamed from: e, reason: collision with root package name */
    private final AppCompatImageView f28238e;

    /* renamed from: f, reason: collision with root package name */
    private final ThreeDS2TextView f28239f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreeDS2TextView f28240g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f28241h;

    /* renamed from: i, reason: collision with root package name */
    private final AppCompatImageView f28242i;

    /* renamed from: j, reason: collision with root package name */
    private int f28243j;

    /* renamed from: k, reason: collision with root package name */
    private int f28244k;

    /* renamed from: l, reason: collision with root package name */
    private final int f28245l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InformationZoneView this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.h(this$0.f28238e, this$0.f28235b, this$0.f28236c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InformationZoneView this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.h(this$0.f28242i, this$0.f28239f, this$0.f28240g);
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    private final void h(View view, TextView textView, final View view2) {
        boolean z8;
        int i8;
        int i9;
        int i10 = 0;
        if (view2.getVisibility() == 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = SubsamplingScaleImageView.ORIENTATION_180;
        } else {
            i8 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, i8);
        ofFloat.setDuration(this.f28245l);
        ofFloat.start();
        textView.setEnabled(z8);
        view.setEnabled(z8);
        if (this.f28243j != 0) {
            if (this.f28244k == 0) {
                this.f28244k = textView.getTextColors().getDefaultColor();
            }
            if (z8) {
                i9 = this.f28243j;
            } else {
                i9 = this.f28244k;
            }
            textView.setTextColor(i9);
        }
        if (!z8) {
            i10 = 8;
        }
        view2.setVisibility(i10);
        if (z8) {
            view2.postDelayed(new Runnable() { // from class: f4.q
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.i(view2);
                }
            }, this.f28245l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View detailsView) {
        AbstractC3292y.i(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public final void f(String str, String str2, Y3.d dVar) {
        if (str != null && !n.T(str)) {
            this.f28239f.a(str, dVar);
            this.f28241h.setVisibility(0);
            this.f28240g.a(str2, dVar);
        }
    }

    public final void g(String str, String str2, Y3.d dVar) {
        if (str != null && !n.T(str)) {
            this.f28235b.a(str, dVar);
            this.f28237d.setVisibility(0);
            this.f28236c.a(str2, dVar);
        }
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.f28242i;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.f28241h;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.f28239f;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.f28240g;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.f28243j;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.f28238e;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.f28237d;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.f28235b;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.f28236c;
    }

    public final void setToggleColor$3ds2sdk_release(int i8) {
        this.f28243j = i8;
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        j c8 = j.c(LayoutInflater.from(context), this, true);
        AbstractC3292y.h(c8, "inflate(...)");
        this.f28234a = c8;
        ThreeDS2TextView whyLabel = c8.f10587h;
        AbstractC3292y.h(whyLabel, "whyLabel");
        this.f28235b = whyLabel;
        ThreeDS2TextView whyText = c8.f10588i;
        AbstractC3292y.h(whyText, "whyText");
        this.f28236c = whyText;
        LinearLayout whyContainer = c8.f10586g;
        AbstractC3292y.h(whyContainer, "whyContainer");
        this.f28237d = whyContainer;
        AppCompatImageView whyArrow = c8.f10585f;
        AbstractC3292y.h(whyArrow, "whyArrow");
        this.f28238e = whyArrow;
        ThreeDS2TextView expandLabel = c8.f10583d;
        AbstractC3292y.h(expandLabel, "expandLabel");
        this.f28239f = expandLabel;
        ThreeDS2TextView expandText = c8.f10584e;
        AbstractC3292y.h(expandText, "expandText");
        this.f28240g = expandText;
        LinearLayout expandContainer = c8.f10582c;
        AbstractC3292y.h(expandContainer, "expandContainer");
        this.f28241h = expandContainer;
        AppCompatImageView expandArrow = c8.f10581b;
        AbstractC3292y.h(expandArrow, "expandArrow");
        this.f28242i = expandArrow;
        this.f28245l = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: f4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.d(InformationZoneView.this, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: f4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.e(InformationZoneView.this, view);
            }
        });
    }
}
