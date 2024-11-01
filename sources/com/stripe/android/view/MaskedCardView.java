package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MaskedCardView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2906e f28675a;

    /* renamed from: b, reason: collision with root package name */
    private String f28676b;

    /* renamed from: c, reason: collision with root package name */
    private final L2.n f28677c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f28678d;

    /* renamed from: e, reason: collision with root package name */
    private final C2681z f28679e;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28680a;

        static {
            int[] iArr = new int[EnumC2906e.values().length];
            try {
                iArr[EnumC2906e.f32119q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2906e.f32120r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2906e.f32121s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2906e.f32122t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2906e.f32117o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2906e.f32118p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2906e.f32123u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2906e.f32124v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2906e.f32125w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f28680a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void a(ImageView imageView) {
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.f28678d.d(true)));
    }

    private final void b() {
        int i8;
        AppCompatImageView appCompatImageView = this.f28677c.f5345b;
        Context context = getContext();
        switch (a.f28680a[this.f28675a.ordinal()]) {
            case 1:
                i8 = n2.z.f35488c;
                break;
            case 2:
                i8 = n2.z.f35480P;
                break;
            case 3:
                i8 = n2.z.f35481Q;
                break;
            case 4:
                i8 = n2.z.f35479O;
                break;
            case 5:
                i8 = n2.z.f35485U;
                break;
            case 6:
                i8 = n2.z.f35482R;
                break;
            case 7:
                i8 = n2.z.f35484T;
                break;
            case 8:
                i8 = n2.z.f35476L;
                break;
            case 9:
                i8 = D4.a.f1337r;
                break;
            default:
                throw new Q5.p();
        }
        appCompatImageView.setImageDrawable(ContextCompat.getDrawable(context, i8));
    }

    private final void c() {
        int i8;
        AppCompatImageView appCompatImageView = this.f28677c.f5346c;
        if (isSelected()) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        appCompatImageView.setVisibility(i8);
    }

    private final void d() {
        b();
        this.f28677c.f5347d.setText(this.f28679e.a(this.f28675a, this.f28676b, isSelected()));
    }

    public final EnumC2906e getCardBrand() {
        return this.f28675a;
    }

    @VisibleForTesting
    public final String getLast4() {
        return this.f28676b;
    }

    public final L2.n getViewBinding$payments_core_release() {
        return this.f28677c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:            if (r0 == null) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPaymentMethod(com.stripe.android.model.o r4) {
        /*
            r3 = this;
            java.lang.String r0 = "paymentMethod"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            com.stripe.android.model.o$g r4 = r4.f25638h
            g3.e$a r0 = g3.EnumC2906e.f32115m
            r1 = 0
            if (r4 == 0) goto Lf
            java.lang.String r2 = r4.f25709l
            goto L10
        Lf:
            r2 = r1
        L10:
            g3.e r0 = r0.b(r2)
            g3.e r2 = g3.EnumC2906e.f32125w
            if (r0 == r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L25
            if (r4 == 0) goto L21
            g3.e r0 = r4.f25698a
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L25
            goto L26
        L25:
            r2 = r0
        L26:
            r3.f28675a = r2
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.f25705h
        L2c:
            r3.f28676b = r1
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.MaskedCardView.setPaymentMethod(com.stripe.android.model.o):void");
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        super.setSelected(z8);
        c();
        d();
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28675a = EnumC2906e.f32125w;
        L2.n b9 = L2.n.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        this.f28677c = b9;
        S0 s02 = new S0(context);
        this.f28678d = s02;
        Resources resources = getResources();
        AbstractC3292y.h(resources, "getResources(...)");
        this.f28679e = new C2681z(resources, s02);
        AppCompatImageView brandIcon = b9.f5345b;
        AbstractC3292y.h(brandIcon, "brandIcon");
        a(brandIcon);
        AppCompatImageView checkIcon = b9.f5346c;
        AbstractC3292y.h(checkIcon, "checkIcon");
        a(checkIcon);
    }
}
