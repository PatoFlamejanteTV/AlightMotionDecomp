package com.stripe.android.paymentsheet.ui;

import O3.J;
import O3.L;
import Q5.I;
import R5.AbstractC1435t;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3539m;
import o4.C3529c;
import o4.C3538l;
import v3.s;
import v3.w;
import y4.AbstractC4246a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PrimaryButton extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ColorStateList f27677a;

    /* renamed from: b, reason: collision with root package name */
    private a f27678b;

    /* renamed from: c, reason: collision with root package name */
    private final J f27679c;

    /* renamed from: d, reason: collision with root package name */
    private C2.c f27680d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f27681e;

    /* renamed from: f, reason: collision with root package name */
    private C2.c f27682f;

    /* renamed from: g, reason: collision with root package name */
    private final A3.b f27683g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27684h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f27685i;

    /* renamed from: j, reason: collision with root package name */
    private float f27686j;

    /* renamed from: k, reason: collision with root package name */
    private float f27687k;

    /* renamed from: l, reason: collision with root package name */
    private int f27688l;

    /* renamed from: m, reason: collision with root package name */
    private int f27689m;

    /* renamed from: n, reason: collision with root package name */
    private int f27690n;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f27691a;

        /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButton$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0646a extends a {

            /* renamed from: b, reason: collision with root package name */
            private final Function0 f27692b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0646a(Function0 onComplete) {
                super(true, null);
                AbstractC3292y.i(onComplete, "onComplete");
                this.f27692b = onComplete;
            }

            public final Function0 a() {
                return this.f27692b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0646a) && AbstractC3292y.d(this.f27692b, ((C0646a) obj).f27692b);
            }

            public int hashCode() {
                return this.f27692b.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.f27692b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final b f27693b = new b();

            private b() {
                super(false, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -745924076;
            }

            public String toString() {
                return "Ready";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final c f27694b = new c();

            private c() {
                super(true, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -198876090;
            }

            public String toString() {
                return "StartProcessing";
            }
        }

        public /* synthetic */ a(boolean z8, AbstractC3284p abstractC3284p) {
            this(z8);
        }

        private a(boolean z8) {
            this.f27691a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f27695a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f27696b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27697c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27698d;

        public b(C2.c label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3292y.i(label, "label");
            AbstractC3292y.i(onClick, "onClick");
            this.f27695a = label;
            this.f27696b = onClick;
            this.f27697c = z8;
            this.f27698d = z9;
        }

        public static /* synthetic */ b b(b bVar, C2.c cVar, Function0 function0, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                cVar = bVar.f27695a;
            }
            if ((i8 & 2) != 0) {
                function0 = bVar.f27696b;
            }
            if ((i8 & 4) != 0) {
                z8 = bVar.f27697c;
            }
            if ((i8 & 8) != 0) {
                z9 = bVar.f27698d;
            }
            return bVar.a(cVar, function0, z8, z9);
        }

        public final b a(C2.c label, Function0 onClick, boolean z8, boolean z9) {
            AbstractC3292y.i(label, "label");
            AbstractC3292y.i(onClick, "onClick");
            return new b(label, onClick, z8, z9);
        }

        public final boolean c() {
            return this.f27697c;
        }

        public final C2.c d() {
            return this.f27695a;
        }

        public final boolean e() {
            return this.f27698d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27695a, bVar.f27695a) && AbstractC3292y.d(this.f27696b, bVar.f27696b) && this.f27697c == bVar.f27697c && this.f27698d == bVar.f27698d;
        }

        public final Function0 f() {
            return this.f27696b;
        }

        public int hashCode() {
            return (((((this.f27695a.hashCode() * 31) + this.f27696b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27697c)) * 31) + androidx.compose.foundation.a.a(this.f27698d);
        }

        public String toString() {
            return "UIState(label=" + this.f27695a + ", onClick=" + this.f27696b + ", enabled=" + this.f27697c + ", lockVisible=" + this.f27698d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f27699a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5516invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5516invoke() {
            this.f27699a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2.c f27700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton f27701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2.c cVar, PrimaryButton primaryButton) {
            super(2);
            this.f27700a = cVar;
            this.f27701b = primaryButton;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-47128405, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:162)");
            }
            L.a(AbstractC4246a.a(this.f27700a, composer, 8), this.f27701b.f27681e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final CharSequence c(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3292y.h(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1435t.V0(AbstractC1435t.e(Integer.valueOf(R.attr.text))), 0, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    private final void d(Function0 function0) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(this.f27689m));
        this.f27685i.setImageTintList(ColorStateList.valueOf(this.f27690n));
        J j8 = this.f27679c;
        ComposeView label = this.f27683g.f157d;
        AbstractC3292y.h(label, "label");
        j8.e(label);
        J j9 = this.f27679c;
        CircularProgressIndicator confirmingIcon = this.f27683g.f156c;
        AbstractC3292y.h(confirmingIcon, "confirmingIcon");
        j9.e(confirmingIcon);
        this.f27679c.d(this.f27685i, getWidth(), new c(function0));
    }

    private final void e() {
        int i8;
        setClickable(true);
        C2.c cVar = this.f27680d;
        if (cVar != null) {
            setLabel(cVar);
        }
        ColorStateList colorStateList = this.f27677a;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView lockIcon = this.f27683g.f158e;
        AbstractC3292y.h(lockIcon, "lockIcon");
        if (this.f27684h) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        lockIcon.setVisibility(i8);
        CircularProgressIndicator confirmingIcon = this.f27683g.f156c;
        AbstractC3292y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(8);
    }

    private final void f() {
        ImageView lockIcon = this.f27683g.f158e;
        AbstractC3292y.h(lockIcon, "lockIcon");
        lockIcon.setVisibility(8);
        CircularProgressIndicator confirmingIcon = this.f27683g.f156c;
        AbstractC3292y.h(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(0);
        setClickable(false);
        setLabel(C2.d.a(w.f40598V));
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    private final void h() {
        float f8;
        ComposeView label = this.f27683g.f157d;
        AbstractC3292y.h(label, "label");
        ImageView lockIcon = this.f27683g.f158e;
        AbstractC3292y.h(lockIcon, "lockIcon");
        for (View view : AbstractC1435t.p(label, lockIcon)) {
            a aVar = this.f27678b;
            if ((aVar == null || (aVar instanceof a.b)) && !isEnabled()) {
                f8 = 0.5f;
            } else {
                f8 = 1.0f;
            }
            view.setAlpha(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(b bVar, View view) {
        bVar.f().invoke();
    }

    private final void setLabel(C2.c cVar) {
        this.f27682f = cVar;
        if (cVar != null) {
            if (!(this.f27678b instanceof a.c)) {
                this.f27680d = cVar;
            }
            this.f27683g.f157d.setContent(ComposableLambdaKt.composableLambdaInstance(-47128405, true, new d(cVar, this)));
        }
    }

    public final void g(C3529c primaryButtonStyle, ColorStateList colorStateList) {
        AbstractC3292y.i(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        AbstractC3292y.h(context, "getContext(...)");
        this.f27686j = AbstractC3539m.c(context, Dp.m5155constructorimpl(primaryButtonStyle.d().b()));
        Context context2 = getContext();
        AbstractC3292y.h(context2, "getContext(...)");
        this.f27687k = AbstractC3539m.c(context2, Dp.m5155constructorimpl(primaryButtonStyle.d().a()));
        Context context3 = getContext();
        AbstractC3292y.h(context3, "getContext(...)");
        this.f27688l = AbstractC3539m.f(primaryButtonStyle, context3);
        ImageView imageView = this.f27683g.f158e;
        Context context4 = getContext();
        AbstractC3292y.h(context4, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC3539m.k(primaryButtonStyle, context4)));
        this.f27677a = colorStateList;
        setBackgroundTintList(colorStateList);
        Context context5 = getContext();
        AbstractC3292y.h(context5, "getContext(...)");
        this.f27689m = AbstractC3539m.q(primaryButtonStyle, context5);
        Context context6 = getContext();
        AbstractC3292y.h(context6, "getContext(...)");
        this.f27690n = AbstractC3539m.l(primaryButtonStyle, context6);
    }

    public final ColorStateList getDefaultTintList$paymentsheet_release() {
        return this.f27677a;
    }

    public final C2.c getExternalLabel$paymentsheet_release() {
        return this.f27682f;
    }

    public final boolean getLockVisible$paymentsheet_release() {
        return this.f27684h;
    }

    public final A3.b getViewBinding$paymentsheet_release() {
        return this.f27683g;
    }

    public final void i(a aVar) {
        this.f27678b = aVar;
        h();
        if (aVar instanceof a.b) {
            e();
        } else if (AbstractC3292y.d(aVar, a.c.f27694b)) {
            f();
        } else if (aVar instanceof a.C0646a) {
            d(((a.C0646a) aVar).a());
        }
    }

    public final void j(final b bVar) {
        boolean z8;
        int i8;
        int i9 = 0;
        if (bVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        setVisibility(i8);
        if (bVar != null) {
            a aVar = this.f27678b;
            if (!(aVar instanceof a.c) && !(aVar instanceof a.C0646a)) {
                setLabel(bVar.d());
            }
            setEnabled(bVar.c());
            this.f27684h = bVar.e();
            ImageView lockIcon = this.f27683g.f158e;
            AbstractC3292y.h(lockIcon, "lockIcon");
            if (!this.f27684h) {
                i9 = 8;
            }
            lockIcon.setVisibility(i9);
            setOnClickListener(new View.OnClickListener() { // from class: O3.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrimaryButton.k(PrimaryButton.b.this, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f27686j);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke((int) this.f27687k, this.f27688l);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(s.f40545h);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setConfirmedIconDrawable(@DrawableRes int i8) {
        this.f27683g.f155b.setImageResource(i8);
    }

    public final void setDefaultLabelColor(@ColorInt int i8) {
        this.f27681e = Integer.valueOf(i8);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.f27677a = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        h();
    }

    public final void setExternalLabel$paymentsheet_release(C2.c cVar) {
        this.f27682f = cVar;
    }

    public final void setIndicatorColor(@ColorInt int i8) {
        this.f27683g.f156c.setIndicatorColor(i8);
    }

    public final void setLockIconDrawable(@DrawableRes int i8) {
        this.f27683g.f158e.setImageResource(i8);
    }

    public final void setLockVisible$paymentsheet_release(boolean z8) {
        this.f27684h = z8;
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f27679c = new J(context);
        A3.b b9 = A3.b.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        this.f27683g = b9;
        this.f27684h = true;
        ImageView confirmedIcon = b9.f155b;
        AbstractC3292y.h(confirmedIcon, "confirmedIcon");
        this.f27685i = confirmedIcon;
        C3538l c3538l = C3538l.f36005a;
        this.f27686j = AbstractC3539m.c(context, Dp.m5155constructorimpl(c3538l.d().d().b()));
        this.f27687k = AbstractC3539m.c(context, Dp.m5155constructorimpl(c3538l.d().d().a()));
        this.f27688l = AbstractC3539m.f(c3538l.d(), context);
        this.f27689m = AbstractC3539m.q(c3538l.d(), context);
        this.f27690n = AbstractC3539m.l(c3538l.d(), context);
        b9.f157d.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        CharSequence c8 = c(attributeSet);
        if (c8 != null) {
            setLabel(C2.d.b(c8.toString()));
        }
        setClickable(true);
        setEnabled(false);
    }
}
