package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelStoreOwner;
import c6.InterfaceC2072n;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.view.A;
import com.stripe.android.view.L;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import f6.AbstractC2869b;
import f6.C2868a;
import f6.InterfaceC2872e;
import g3.C2909h;
import g3.EnumC2906e;
import g3.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3390A;
import n2.AbstractC3394E;
import n2.AbstractC3396G;
import n6.AbstractC3462k;
import p2.AbstractC3564f;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardMultilineWidget extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC2872e f28457A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC2872e f28458B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC2872e f28459C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC2872e f28460D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f28461a;

    /* renamed from: b, reason: collision with root package name */
    private final L2.j f28462b;

    /* renamed from: c, reason: collision with root package name */
    private final CardNumberEditText f28463c;

    /* renamed from: d, reason: collision with root package name */
    private final CardBrandView f28464d;

    /* renamed from: e, reason: collision with root package name */
    private final ExpiryDateEditText f28465e;

    /* renamed from: f, reason: collision with root package name */
    private final CvcEditText f28466f;

    /* renamed from: g, reason: collision with root package name */
    private final PostalCodeEditText f28467g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f28468h;

    /* renamed from: i, reason: collision with root package name */
    private final CardNumberTextInputLayout f28469i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f28470j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f28471k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f28472l;

    /* renamed from: m, reason: collision with root package name */
    private final C2655i0 f28473m;

    /* renamed from: n, reason: collision with root package name */
    private final List f28474n;

    /* renamed from: o, reason: collision with root package name */
    private A f28475o;

    /* renamed from: p, reason: collision with root package name */
    private final i f28476p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28477q;

    /* renamed from: r, reason: collision with root package name */
    private String f28478r;

    /* renamed from: s, reason: collision with root package name */
    private String f28479s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28480t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC2872e f28481u;

    /* renamed from: v, reason: collision with root package name */
    private ViewModelStoreOwner f28482v;

    /* renamed from: w, reason: collision with root package name */
    private String f28483w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f28484x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC2872e f28485y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f28486z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ j6.i[] f28455F = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};

    /* renamed from: E, reason: collision with root package name */
    private static final g f28454E = new g(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f28456G = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Q5.I.f8786a;
        }

        public final void invoke(boolean z8) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5529invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5529invoke() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            A a9 = CardMultilineWidget.this.f28475o;
            if (a9 != null) {
                a9.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        public final void a(EnumC2906e brand) {
            AbstractC3292y.i(brand, "brand");
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(brand);
            CardMultilineWidget.this.z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2906e) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function1 {
        d() {
            super(1);
        }

        public final void a(EnumC2906e brand) {
            AbstractC3292y.i(brand, "brand");
            CardMultilineWidget.this.A(brand);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2906e) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(List brands) {
            AbstractC3292y.i(brands, "brands");
            EnumC2906e brand = CardMultilineWidget.this.getCardBrandView$payments_core_release().getBrand();
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setPossibleBrands(brands);
            if (!brands.contains(brand)) {
                CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(EnumC2906e.f32125w);
            }
            EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.o0(brands);
            if (enumC2906e == null) {
                enumC2906e = EnumC2906e.f32125w;
            }
            CardMultilineWidget.this.A(enumC2906e);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5530invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5530invoke() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            A a9 = CardMultilineWidget.this.f28475o;
            if (a9 != null) {
                a9.a();
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class g {
        private g() {
        }

        public /* synthetic */ g(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends Q0 {
        i() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            CardMultilineWidget.l(CardMultilineWidget.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f28496a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f28497b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f28498c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f f28499d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardMultilineWidget f28500e;

            /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0683a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f28501a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f f28502b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardMultilineWidget f28503c;

                /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0684a implements InterfaceC3822g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardMultilineWidget f28504a;

                    public C0684a(CardMultilineWidget cardMultilineWidget) {
                        this.f28504a = cardMultilineWidget;
                    }

                    @Override // q6.InterfaceC3822g
                    public final Object emit(Object obj, U5.d dVar) {
                        this.f28504a.getCardBrandView$payments_core_release().setCbcEligible(((Boolean) obj).booleanValue());
                        return Q5.I.f8786a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0683a(InterfaceC3821f interfaceC3821f, U5.d dVar, CardMultilineWidget cardMultilineWidget) {
                    super(2, dVar);
                    this.f28502b = interfaceC3821f;
                    this.f28503c = cardMultilineWidget;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0683a(this.f28502b, dVar, this.f28503c);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f28501a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3821f interfaceC3821f = this.f28502b;
                        C0684a c0684a = new C0684a(this.f28503c);
                        this.f28501a = 1;
                        if (interfaceC3821f.collect(c0684a, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0683a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3821f interfaceC3821f, U5.d dVar, CardMultilineWidget cardMultilineWidget) {
                super(2, dVar);
                this.f28498c = state;
                this.f28499d = interfaceC3821f;
                this.f28500e = cardMultilineWidget;
                this.f28497b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f28497b, this.f28498c, this.f28499d, dVar, this.f28500e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f28496a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f28497b;
                    Lifecycle.State state = this.f28498c;
                    C0683a c0683a = new C0683a(this.f28499d, null, this.f28500e);
                    this.f28496a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0683a, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        j() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3292y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3292y.i(viewModel, "viewModel");
            if (CardMultilineWidget.this.getOnBehalfOf() != null && !AbstractC3292y.d(viewModel.e(), CardMultilineWidget.this.getOnBehalfOf())) {
                viewModel.g(CardMultilineWidget.this.getOnBehalfOf());
            }
            InterfaceC3813L f8 = viewModel.f();
            CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardMultilineWidget), 3, null);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(2);
            this.f28505a = str;
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3292y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3292y.i(viewModel, "viewModel");
            viewModel.g(this.f28505a);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28506b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f28506b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f28808b);
            } else {
                this.f28506b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f28807a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28507b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            String str;
            AbstractC3292y.i(property, "property");
            Integer num = (Integer) obj2;
            TextInputLayout expiryTextInputLayout = this.f28507b.getExpiryTextInputLayout();
            if (num != null) {
                str = this.f28507b.getResources().getString(num.intValue());
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            expiryTextInputLayout.setPlaceholderText(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28508b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f28508b.getCardNumberEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28509b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28509b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f28509b.getExpiryDateEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28510b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f28510b.getCvcEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC2869b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f28511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f28511b = cardMultilineWidget;
        }

        @Override // f6.AbstractC2869b
        protected void a(j6.i property, Object obj, Object obj2) {
            AbstractC3292y.i(property, "property");
            this.f28511b.getPostalCodeEditText$payments_core_release().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        AbstractC3292y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(EnumC2906e enumC2906e) {
        this.f28466f.q(enumC2906e, this.f28478r, this.f28479s, this.f28471k);
    }

    static /* synthetic */ void B(CardMultilineWidget cardMultilineWidget, EnumC2906e enumC2906e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            enumC2906e = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.A(enumC2906e);
    }

    private final void C(StripeEditText stripeEditText, int i8) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i8);
        if (drawable != null) {
            stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final Collection<StripeEditText> getAllFields() {
        return R5.a0.i(this.f28463c, this.f28465e, this.f28466f, this.f28467g);
    }

    private final w.b getExpirationDate() {
        return this.f28465e.getValidatedDate();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardMultilineWidget this$0, String text) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(text, "text");
        EnumC2906e implicitCardBrandForCbc$payments_core_release = this$0.f28463c.getImplicitCardBrandForCbc$payments_core_release();
        if (implicitCardBrandForCbc$payments_core_release == EnumC2906e.f32125w) {
            implicitCardBrandForCbc$payments_core_release = null;
        }
        if (implicitCardBrandForCbc$payments_core_release == null) {
            implicitCardBrandForCbc$payments_core_release = this$0.f28463c.getCardBrand();
        }
        if (implicitCardBrandForCbc$payments_core_release.p(text)) {
            this$0.z();
            if (this$0.f28461a) {
                this$0.f28467g.requestFocus();
            }
            A a9 = this$0.f28475o;
            if (a9 != null) {
                a9.b();
            }
        } else if (!this$0.f28486z) {
            this$0.q();
        }
        this$0.f28466f.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardMultilineWidget this$0, String it) {
        A a9;
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(it, "it");
        if (this$0.y() && this$0.f28467g.p() && (a9 = this$0.f28475o) != null) {
            a9.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i8, CardMultilineWidget this$0, View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        AbstractC3292y.i(this$0, "this$0");
        int width = view.getWidth() + i8;
        CardNumberEditText cardNumberEditText = this$0.f28463c;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    public static final /* synthetic */ L l(CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.getClass();
        return null;
    }

    private final void o(boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (z8) {
            i8 = AbstractC3394E.f35243l0;
        } else {
            i8 = AbstractC3394E.f35226d;
        }
        this.f28470j.setHint(getResources().getString(i8));
        if (z8) {
            i9 = AbstractC3390A.f35150y;
        } else {
            i9 = -1;
        }
        this.f28466f.setNextFocusForwardId(i9);
        this.f28466f.setNextFocusDownId(i9);
        int i12 = 0;
        if (z8) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f28472l.setVisibility(i10);
        CvcEditText cvcEditText = this.f28466f;
        if (i10 == 8) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        cvcEditText.setImeOptions(i11);
        TextInputLayout textInputLayout = this.f28471k;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z8) {
                i12 = getResources().getDimensionPixelSize(n2.y.f35459a);
            }
            layoutParams2.setMarginEnd(i12);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void p(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3292y.h(context, "getContext(...)");
        int[] CardElement = AbstractC3396G.f35274b;
        AbstractC3292y.h(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        this.f28461a = obtainStyledAttributes.getBoolean(AbstractC3396G.f35277e, this.f28461a);
        this.f28480t = obtainStyledAttributes.getBoolean(AbstractC3396G.f35275c, this.f28480t);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(AbstractC3396G.f35276d, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final void q() {
        if (getBrand().p(this.f28466f.getFieldText$payments_core_release())) {
            return;
        }
        this.f28464d.setShouldShowErrorIcon(this.f28484x);
    }

    private final void r() {
        this.f28465e.setDeleteEmptyListener(new C2670q(this.f28463c));
        this.f28466f.setDeleteEmptyListener(new C2670q(this.f28465e));
        this.f28467g.setDeleteEmptyListener(new C2670q(this.f28466f));
    }

    private final void s() {
        this.f28463c.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.t(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28465e.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.F
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.u(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28466f.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.G
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.v(CardMultilineWidget.this, view, z8);
            }
        });
        this.f28467g.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.w(CardMultilineWidget.this, view, z8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CardMultilineWidget this$0, View view, boolean z8) {
        A a9;
        AbstractC3292y.i(this$0, "this$0");
        if (z8 && (a9 = this$0.f28475o) != null) {
            a9.d(A.a.f28355a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardMultilineWidget this$0, View view, boolean z8) {
        A a9;
        AbstractC3292y.i(this$0, "this$0");
        if (z8 && (a9 = this$0.f28475o) != null) {
            a9.d(A.a.f28356b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardMultilineWidget this$0, View view, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            if (!this$0.f28486z) {
                this$0.q();
            }
            A a9 = this$0.f28475o;
            if (a9 != null) {
                a9.d(A.a.f28357c);
                return;
            }
            return;
        }
        this$0.f28464d.setShouldShowErrorIcon(this$0.f28484x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardMultilineWidget this$0, View view, boolean z8) {
        A a9;
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.f28461a && z8 && (a9 = this$0.f28475o) != null) {
            a9.d(A.a.f28358d);
        }
    }

    private final void x() {
        this.f28463c.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.f28465e.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.f28466f.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.f28467g.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final boolean y() {
        if ((this.f28480t || getUsZipCodeRequired()) && this.f28461a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        B(this, null, 1, null);
        this.f28464d.setShouldShowErrorIcon(this.f28484x);
    }

    public final boolean D() {
        boolean z8;
        boolean z9;
        boolean z10;
        String postalCode$payments_core_release;
        boolean z11;
        Object obj;
        if (getValidatedCardNumber$payments_core_release() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getExpirationDate() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f28466f.getCvc$payments_core_release() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28463c.setShouldShowError(!z8);
        this.f28465e.setShouldShowError(!z9);
        this.f28466f.setShouldShowError(!z10);
        PostalCodeEditText postalCodeEditText = this.f28467g;
        if ((!this.f28480t && !getUsZipCodeRequired()) || ((postalCode$payments_core_release = this.f28467g.getPostalCode$payments_core_release()) != null && !l6.n.T(postalCode$payments_core_release))) {
            z11 = false;
        } else {
            z11 = true;
        }
        postalCodeEditText.setShouldShowError(z11);
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((StripeEditText) obj).getShouldShowError()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StripeEditText stripeEditText = (StripeEditText) obj;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        if (!z8 || !z9 || !z10 || this.f28467g.getShouldShowError()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ EnumC2906e getBrand() {
        return this.f28464d.getBrand();
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.f28464d;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.f28463c;
    }

    public final StripeEditText.c getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28457A.getValue(this, f28455F[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.f28469i;
    }

    public C2909h getCardParams() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!D()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        w.b validatedDate = this.f28465e.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.f28466f.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            Editable text2 = this.f28467g.getText();
            if (text2 != null) {
                str2 = text2.toString();
            } else {
                str2 = null;
            }
            if (!this.f28461a) {
                str2 = null;
            }
            EnumC2906e brand = getBrand();
            Set d8 = R5.a0.d("CardMultilineView");
            AbstractC3564f.c validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
            if (validatedCardNumber$payments_core_release != null) {
                str3 = validatedCardNumber$payments_core_release.c();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str5 = str3;
            int a9 = validatedDate.a();
            int b9 = validatedDate.b();
            a.C0496a c0496a = new a.C0496a();
            if (str2 != null && !l6.n.T(str2)) {
                str4 = str2;
            }
            return new C2909h(brand, d8, str5, a9, b9, str, null, c0496a.g(str4).a(), null, this.f28464d.e(), null, 1344, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.f28466f;
    }

    public final StripeEditText.c getCvcErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28459C.getValue(this, f28455F[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.f28471k;
    }

    public final StripeEditText.c getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28458B.getValue(this, f28455F[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.f28485y.getValue(this, f28455F[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.f28465e;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.f28470j;
    }

    public final Set<L.a> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        L.a aVar = L.a.f28649a;
        L.a aVar2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            aVar = null;
        }
        L.a aVar3 = L.a.f28650b;
        if (getExpirationDate() != null) {
            aVar3 = null;
        }
        L.a aVar4 = L.a.f28651c;
        if (this.f28466f.getCvc$payments_core_release() != null) {
            aVar4 = null;
        }
        L.a aVar5 = L.a.f28652d;
        if (y() && ((postalCode$payments_core_release = this.f28467g.getPostalCode$payments_core_release()) == null || l6.n.T(postalCode$payments_core_release))) {
            aVar2 = aVar5;
        }
        return AbstractC1435t.b1(AbstractC1435t.r(aVar, aVar3, aVar4, aVar2));
    }

    public final String getOnBehalfOf() {
        return this.f28483w;
    }

    public final o.e getPaymentMethodBillingDetails() {
        o.e.a paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.a();
        }
        return null;
    }

    public final o.e.a getPaymentMethodBillingDetailsBuilder() {
        if (this.f28461a && D()) {
            return new o.e.a().b(new a.C0496a().g(this.f28467g.getPostalCode$payments_core_release()).a());
        }
        return null;
    }

    public p.c getPaymentMethodCard() {
        C2909h cardParams = getCardParams();
        if (cardParams != null) {
            String i8 = cardParams.i();
            String b9 = cardParams.b();
            int f8 = cardParams.f();
            int h8 = cardParams.h();
            return new p.c(i8, Integer.valueOf(f8), Integer.valueOf(h8), b9, null, cardParams.a(), this.f28464d.l(), 16, null);
        }
        return null;
    }

    public com.stripe.android.model.p getPaymentMethodCreateParams() {
        p.c paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return p.e.e(com.stripe.android.model.p.f25804u, paymentMethodCard, getPaymentMethodBillingDetails(), null, null, 12, null);
        }
        return null;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.f28467g;
    }

    public final StripeEditText.c getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f28460D.getValue(this, f28455F[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.f28480t;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.f28472l;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.f28468h;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.f28484x;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.f28481u.getValue(this, f28455F[0])).booleanValue();
    }

    public final AbstractC3564f.c getValidatedCardNumber$payments_core_release() {
        return this.f28463c.getValidatedCardNumber$payments_core_release();
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f28482v;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f28477q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28466f.setHint((CharSequence) null);
        this.f28473m.c(this);
        P.a(this, this.f28482v, new j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28473m.b(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3292y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setOnBehalfOf(bundle.getString("state_on_behalf_of"));
            super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return BundleKt.bundleOf(Q5.x.a("state_remaining_state", super.onSaveInstanceState()), Q5.x.a("state_on_behalf_of", this.f28483w));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            z();
        }
    }

    public void setCardHint(String cardHint) {
        AbstractC3292y.i(cardHint, "cardHint");
        this.f28469i.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(A a9) {
        this.f28475o = a9;
    }

    public void setCardNumber(String str) {
        this.f28463c.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCardNumberErrorListener(StripeEditText.c listener) {
        AbstractC3292y.i(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3292y.i(cVar, "<set-?>");
        this.f28457A.setValue(this, f28455F[2], cVar);
    }

    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.f28463c.addTextChangedListener(textWatcher);
    }

    public void setCardValidCallback(L l8) {
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.f28476p);
        }
        if (l8 != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.f28476p);
            }
        }
    }

    public void setCvcCode(String str) {
        this.f28466f.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcErrorListener(StripeEditText.c listener) {
        AbstractC3292y.i(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3292y.i(cVar, "<set-?>");
        this.f28459C.setValue(this, f28455F[4], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final /* synthetic */ void setCvcIcon(Integer num) {
        boolean z8;
        if (num != null) {
            C(this.f28466f, num.intValue());
        }
        if (num != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f28486z = z8;
    }

    public final void setCvcLabel(String str) {
        this.f28478r = str;
        B(this, null, 1, null);
    }

    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.f28466f.addTextChangedListener(textWatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcPlaceholderText(String str) {
        this.f28479s = str;
        B(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        Iterator it = this.f28474n.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z8);
        }
        this.f28477q = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDateErrorListener(StripeEditText.c listener) {
        AbstractC3292y.i(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3292y.i(cVar, "<set-?>");
        this.f28458B.setValue(this, f28455F[3], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDatePlaceholderRes(@StringRes Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.f28485y.setValue(this, f28455F[1], num);
    }

    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.f28465e.addTextChangedListener(textWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (!AbstractC3292y.d(this.f28483w, str)) {
            if (isAttachedToWindow()) {
                P.a(this, this.f28482v, new k(str));
            }
            this.f28483w = str;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPostalCodeErrorListener(StripeEditText.c cVar) {
        setPostalCodeErrorListener$payments_core_release(cVar);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.c cVar) {
        this.f28460D.setValue(this, f28455F[5], cVar);
    }

    public final void setPostalCodeRequired(boolean z8) {
        this.f28480t = z8;
    }

    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.f28467g.addTextChangedListener(textWatcher);
    }

    public final void setPreferredNetworks(List<? extends EnumC2906e> preferredNetworks) {
        AbstractC3292y.i(preferredNetworks, "preferredNetworks");
        this.f28464d.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z8) {
        boolean z9;
        if (this.f28484x != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f28484x = z8;
        if (z9) {
            z();
        }
    }

    public final void setShouldShowPostalCode(boolean z8) {
        this.f28461a = z8;
        o(z8);
    }

    public final void setUsZipCodeRequired(boolean z8) {
        this.f28481u.setValue(this, f28455F[0], Boolean.valueOf(z8));
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f28482v = viewModelStoreOwner;
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? true : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28461a = z8;
        L2.j b9 = L2.j.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        this.f28462b = b9;
        CardNumberEditText etCardNumber = b9.f5328d;
        AbstractC3292y.h(etCardNumber, "etCardNumber");
        this.f28463c = etCardNumber;
        CardBrandView cardBrandView = b9.f5326b;
        AbstractC3292y.h(cardBrandView, "cardBrandView");
        this.f28464d = cardBrandView;
        ExpiryDateEditText etExpiry = b9.f5330f;
        AbstractC3292y.h(etExpiry, "etExpiry");
        this.f28465e = etExpiry;
        CvcEditText etCvc = b9.f5329e;
        AbstractC3292y.h(etCvc, "etCvc");
        this.f28466f = etCvc;
        PostalCodeEditText etPostalCode = b9.f5331g;
        AbstractC3292y.h(etPostalCode, "etPostalCode");
        this.f28467g = etPostalCode;
        LinearLayout secondRowLayout = b9.f5332h;
        AbstractC3292y.h(secondRowLayout, "secondRowLayout");
        this.f28468h = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = b9.f5333i;
        AbstractC3292y.h(tlCardNumber, "tlCardNumber");
        this.f28469i = tlCardNumber;
        TextInputLayout tlExpiry = b9.f5335k;
        AbstractC3292y.h(tlExpiry, "tlExpiry");
        this.f28470j = tlExpiry;
        TextInputLayout tlCvc = b9.f5334j;
        AbstractC3292y.h(tlCvc, "tlCvc");
        this.f28471k = tlCvc;
        TextInputLayout tlPostalCode = b9.f5336l;
        AbstractC3292y.h(tlPostalCode, "tlPostalCode");
        this.f28472l = tlPostalCode;
        this.f28473m = new C2655i0();
        List p8 = AbstractC1435t.p(tlCardNumber, tlExpiry, tlCvc, tlPostalCode);
        this.f28474n = p8;
        this.f28476p = new i();
        C2868a c2868a = C2868a.f31918a;
        this.f28481u = new l(Boolean.FALSE, this);
        this.f28485y = new m(Integer.valueOf(AbstractC3394E.f35241k0), this);
        this.f28457A = new n(new C2643c0(tlCardNumber), this);
        this.f28458B = new o(new C2643c0(tlExpiry), this);
        this.f28459C = new p(new C2643c0(tlCvc), this);
        this.f28460D = new q(new C2643c0(tlPostalCode), this);
        setOrientation(1);
        Iterator it = p8.iterator();
        while (true) {
            ColorStateList colorStateList = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                colorStateList = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
        p(attributeSet);
        x();
        s();
        r();
        this.f28464d.setTintColorInt$payments_core_release(this.f28463c.getHintTextColors().getDefaultColor());
        this.f28463c.setCompletionCallback$payments_core_release(new b());
        this.f28463c.setBrandChangeCallback$payments_core_release(new c());
        this.f28463c.setImplicitCardBrandChangeCallback$payments_core_release(new d());
        this.f28463c.setPossibleCardBrandsCallback$payments_core_release(new e());
        this.f28465e.setCompletionCallback$payments_core_release(new f());
        this.f28466f.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.B
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.h(CardMultilineWidget.this, str);
            }
        });
        this.f28467g.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.C
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.i(CardMultilineWidget.this, str);
            }
        });
        o(this.f28461a);
        CardNumberEditText.B(this.f28463c, 0, 1, null);
        z();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new h());
        }
        this.f28463c.setLoadingCallback$payments_core_release(new a());
        this.f28467g.setConfig$payments_core_release(PostalCodeEditText.b.f28807a);
        this.f28477q = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(n2.y.f35460b);
        this.f28464d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.D
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CardMultilineWidget.j(dimensionPixelSize, this, view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        });
    }
}
