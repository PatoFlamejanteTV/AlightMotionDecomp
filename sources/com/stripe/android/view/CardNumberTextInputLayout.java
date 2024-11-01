package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28562c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f28563d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final M f28564a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2872e f28565b;

    /* loaded from: classes4.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            CardNumberTextInputLayout.this.e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardNumberTextInputLayout f28567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, CardNumberTextInputLayout cardNumberTextInputLayout) {
            super(obj);
            this.f28567b = cardNumberTextInputLayout;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue() != booleanValue) {
                if (booleanValue) {
                    this.f28567b.f28564a.b();
                } else {
                    this.f28567b.f28564a.a();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ViewGroup viewGroup;
        ViewParent parent = this.f28564a.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this.f28564a);
        }
        Object r8 = AbstractC3258j.r(ViewGroupKt.getChildren(this));
        AbstractC3292y.g(r8, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) r8;
        frameLayout.addView(this.f28564a);
        M m8 = this.f28564a;
        ViewGroup.LayoutParams layoutParams = m8.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(n2.y.f35461c));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(n2.y.f35462d);
            m8.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setLoading$payments_core_release(boolean z8) {
        this.f28565b.setValue(this, f28562c[0], Boolean.valueOf(z8));
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textInputStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28564a = new M(context, attributeSet, i8);
        C2868a c2868a = C2868a.f31918a;
        this.f28565b = new b(Boolean.FALSE, this);
        addOnLayoutChangeListener(new a());
        setPlaceholderText(getResources().getString(AbstractC3394E.f35221a0));
    }
}
