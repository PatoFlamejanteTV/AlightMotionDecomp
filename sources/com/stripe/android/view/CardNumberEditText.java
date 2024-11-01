package com.stripe.android.view;

import B2.InterfaceC0951c;
import Q5.C1413h;
import R5.AbstractC1435t;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelStoreOwner;
import c6.InterfaceC2072n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import g3.C2902a;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import p2.AbstractC3564f;
import p2.C3561c;
import p2.C3568j;
import p2.C3569k;
import p2.InterfaceC3560b;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardNumberEditText extends StripeEditText {

    /* renamed from: A, reason: collision with root package name */
    private /* synthetic */ Function0 f28512A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f28513B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f28514C;

    /* renamed from: D, reason: collision with root package name */
    private final C3561c f28515D;

    /* renamed from: E, reason: collision with root package name */
    private /* synthetic */ Function1 f28516E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC3488x0 f28517F;

    /* renamed from: p, reason: collision with root package name */
    private U5.g f28518p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3560b f28519q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC0951c f28520r;

    /* renamed from: s, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f28521s;

    /* renamed from: t, reason: collision with root package name */
    private ViewModelStoreOwner f28522t;

    /* renamed from: u, reason: collision with root package name */
    private EnumC2906e f28523u;

    /* renamed from: v, reason: collision with root package name */
    private /* synthetic */ Function1 f28524v;

    /* renamed from: w, reason: collision with root package name */
    private EnumC2906e f28525w;

    /* renamed from: x, reason: collision with root package name */
    private Function1 f28526x;

    /* renamed from: y, reason: collision with root package name */
    private List f28527y;

    /* renamed from: z, reason: collision with root package name */
    private /* synthetic */ Function1 f28528z;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f28529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f28529a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return n2.r.f35413c.a(this.f28529a).f();
        }
    }

    /* loaded from: classes4.dex */
    private final class b extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f28530a;

        /* renamed from: b, reason: collision with root package name */
        private int f28531b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f28532c;

        /* renamed from: d, reason: collision with root package name */
        private String f28533d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC3564f.b f28534e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28535f;

        public b() {
            this.f28534e = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        private final boolean a() {
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() > this.f28534e.f()) {
                return true;
            }
            return false;
        }

        private final boolean b() {
            if ((a() || !CardNumberEditText.this.f()) && this.f28533d != null) {
                return true;
            }
            return false;
        }

        private final boolean c(boolean z8) {
            if (!z8 && (CardNumberEditText.this.getUnvalidatedCardNumber().h() || (CardNumberEditText.this.y() && CardNumberEditText.this.getAccountRangeService().d() != null))) {
                return true;
            }
            return false;
        }

        private final boolean d(int i8, int i9, int i10, AbstractC3564f.b bVar) {
            if (i10 > i9 && i8 == 0 && bVar.g().length() >= 14) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (b()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.f28533d);
                Integer num = this.f28532c;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(i6.m.k(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.f28533d = null;
            this.f28532c = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().f() == CardNumberEditText.this.getPanLength$payments_core_release()) {
                boolean w8 = CardNumberEditText.this.w();
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                cardNumberEditText2.f28513B = cardNumberEditText2.y();
                CardNumberEditText.this.setShouldShowError(!r0.y());
                if (CardNumberEditText.this.getAccountRangeService().d() == null && CardNumberEditText.this.getUnvalidatedCardNumber().k()) {
                    CardNumberEditText.this.z();
                }
                if (c(w8)) {
                    CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
                    return;
                }
                return;
            }
            if (CardNumberEditText.this.getUnvalidatedCardNumber().i(CardNumberEditText.this.getPanLength$payments_core_release()) && !CardNumberEditText.this.getUnvalidatedCardNumber().j()) {
                CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                cardNumberEditText3.f28513B = cardNumberEditText3.y();
                CardNumberEditText.this.setShouldShowError(true);
            } else {
                CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
                cardNumberEditText4.f28513B = cardNumberEditText4.y();
                CardNumberEditText.this.setShouldShowError(false);
            }
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f28535f = false;
            this.f28534e = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.f28530a = i8;
            this.f28531b = i10;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            String str;
            int panLength$payments_core_release;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            AbstractC3564f.b bVar = new AbstractC3564f.b(str);
            CardNumberEditText.this.getAccountRangeService().h(bVar);
            boolean d8 = d(i8, i9, i10, bVar);
            this.f28535f = d8;
            if (d8) {
                CardNumberEditText.this.A(bVar.e(bVar.f()).length());
            }
            if (this.f28535f) {
                panLength$payments_core_release = bVar.f();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String e8 = bVar.e(panLength$payments_core_release);
            this.f28532c = Integer.valueOf(cardNumberEditText.v(e8.length(), this.f28530a, this.f28531b, panLength$payments_core_release));
            this.f28533d = e8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f28537a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f28538b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(Parcelable parcelable, boolean z8) {
            super(parcelable);
            this.f28537a = parcelable;
            this.f28538b = z8;
        }

        public final boolean a() {
            return this.f28538b;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f28537a, cVar.f28537a) && this.f28538b == cVar.f28538b;
        }

        public int hashCode() {
            Parcelable parcelable = this.f28537a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f28538b);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f28537a + ", isCbcEligible=" + this.f28538b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f28537a, i8);
            out.writeInt(this.f28538b ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements C3561c.a {
        d() {
        }

        @Override // p2.C3561c.a
        public void a(List accountRanges) {
            AbstractC3292y.i(accountRanges, "accountRanges");
            CardNumberEditText.B(CardNumberEditText.this, 0, 1, null);
            List list = accountRanges;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2902a) it.next()).b());
            }
            List<? extends EnumC2906e> e02 = AbstractC1435t.e0(arrayList);
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.M0(e02);
            if (enumC2906e == null) {
                enumC2906e = EnumC2906e.f32125w;
            }
            cardNumberEditText.setCardBrand$payments_core_release(enumC2906e);
            if (CardNumberEditText.this.f28514C) {
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                EnumC2906e enumC2906e2 = (EnumC2906e) AbstractC1435t.o0(e02);
                if (enumC2906e2 == null) {
                    enumC2906e2 = EnumC2906e.f32125w;
                }
                cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(enumC2906e2);
                CardNumberEditText.this.setPossibleCardBrands$payments_core_release(e02);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(CardNumberEditText.this.f28514C);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f28541a = new f();

        f() {
            super(1);
        }

        public final void a(EnumC2906e it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2906e) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f28542a = new g();

        g() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5531invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5531invoke();
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f28543a = new h();

        h() {
            super(1);
        }

        public final void a(EnumC2906e it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC2906e) obj);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f28544a = new i();

        i() {
            super(1);
        }

        public final void invoke(boolean z8) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28545a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f28547a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.view.CardNumberEditText$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0685a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f28548a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f28549b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f28550c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0685a(CardNumberEditText cardNumberEditText, boolean z8, U5.d dVar) {
                    super(2, dVar);
                    this.f28549b = cardNumberEditText;
                    this.f28550c = z8;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0685a(this.f28549b, this.f28550c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f28548a == 0) {
                        Q5.t.b(obj);
                        this.f28549b.x().invoke(kotlin.coroutines.jvm.internal.b.a(this.f28550c));
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0685a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            a(CardNumberEditText cardNumberEditText) {
                this.f28547a = cardNumberEditText;
            }

            public final Object b(boolean z8, U5.d dVar) {
                Object g8 = AbstractC3458i.g(C3445b0.c(), new C0685a(this.f28547a, z8, null), dVar);
                if (g8 == V5.b.e()) {
                    return g8;
                }
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28545a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L a9 = CardNumberEditText.this.f28519q.a();
                a aVar = new a(CardNumberEditText.this);
                this.f28545a = 1;
                if (a9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3293z implements InterfaceC2072n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f28552a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f28553b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f28554c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f f28555d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardNumberEditText f28556e;

            /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0686a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f28557a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3821f f28558b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardNumberEditText f28559c;

                /* renamed from: com.stripe.android.view.CardNumberEditText$k$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0687a implements InterfaceC3822g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardNumberEditText f28560a;

                    public C0687a(CardNumberEditText cardNumberEditText) {
                        this.f28560a = cardNumberEditText;
                    }

                    @Override // q6.InterfaceC3822g
                    public final Object emit(Object obj, U5.d dVar) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        this.f28560a.f28514C = booleanValue;
                        List e8 = this.f28560a.getAccountRangeService().e();
                        ArrayList arrayList = new ArrayList(AbstractC1435t.x(e8, 10));
                        Iterator it = e8.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C2902a) it.next()).b());
                        }
                        List<? extends EnumC2906e> e02 = AbstractC1435t.e0(arrayList);
                        if (booleanValue) {
                            CardNumberEditText cardNumberEditText = this.f28560a;
                            EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.o0(e02);
                            if (enumC2906e == null) {
                                enumC2906e = EnumC2906e.f32125w;
                            }
                            cardNumberEditText.setImplicitCardBrandForCbc$payments_core_release(enumC2906e);
                            this.f28560a.setPossibleCardBrands$payments_core_release(e02);
                        } else {
                            CardNumberEditText cardNumberEditText2 = this.f28560a;
                            EnumC2906e enumC2906e2 = (EnumC2906e) AbstractC1435t.M0(e02);
                            if (enumC2906e2 == null) {
                                enumC2906e2 = EnumC2906e.f32125w;
                            }
                            cardNumberEditText2.setCardBrand$payments_core_release(enumC2906e2);
                        }
                        return Q5.I.f8786a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0686a(InterfaceC3821f interfaceC3821f, U5.d dVar, CardNumberEditText cardNumberEditText) {
                    super(2, dVar);
                    this.f28558b = interfaceC3821f;
                    this.f28559c = cardNumberEditText;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0686a(this.f28558b, dVar, this.f28559c);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f28557a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3821f interfaceC3821f = this.f28558b;
                        C0687a c0687a = new C0687a(this.f28559c);
                        this.f28557a = 1;
                        if (interfaceC3821f.collect(c0687a, this) == e8) {
                            return e8;
                        }
                    }
                    return Q5.I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, U5.d dVar) {
                    return ((C0686a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3821f interfaceC3821f, U5.d dVar, CardNumberEditText cardNumberEditText) {
                super(2, dVar);
                this.f28554c = state;
                this.f28555d = interfaceC3821f;
                this.f28556e = cardNumberEditText;
                this.f28553b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f28553b, this.f28554c, this.f28555d, dVar, this.f28556e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f28552a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f28553b;
                    Lifecycle.State state = this.f28554c;
                    C0686a c0686a = new C0686a(this.f28555d, null, this.f28556e);
                    this.f28552a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0686a, this) == e8) {
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

        k() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3292y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3292y.i(viewModel, "viewModel");
            InterfaceC3813L f8 = viewModel.f();
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardNumberEditText), 3, null);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f28561a = new l();

        l() {
            super(1);
        }

        public final void invoke(List it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Q5.I.f8786a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public static /* synthetic */ void B(CardNumberEditText cardNumberEditText, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.A(i8);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getCardBrand$annotations() {
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + AbstractC3564f.f36121a.a(getPanLength$payments_core_release()).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3564f.b getUnvalidatedCardNumber() {
        return new AbstractC3564f.b(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(Function0 tmp0) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CardNumberEditText this$0, View view, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (!z8 && this$0.getUnvalidatedCardNumber().i(this$0.getPanLength$payments_core_release())) {
            this$0.setShouldShowError(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        if (getValidatedCardNumber$payments_core_release() != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void A(int i8) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i8)});
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3394E.f35222b, getText());
        AbstractC3292y.h(string, "getString(...)");
        return string;
    }

    public final C3561c getAccountRangeService() {
        return this.f28515D;
    }

    public final Function1 getBrandChangeCallback$payments_core_release() {
        return this.f28524v;
    }

    public final EnumC2906e getCardBrand() {
        return this.f28523u;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f28512A;
    }

    public final Function1 getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.f28526x;
    }

    public final EnumC2906e getImplicitCardBrandForCbc$payments_core_release() {
        return this.f28525w;
    }

    public final int getPanLength$payments_core_release() {
        C2902a d8 = this.f28515D.d();
        if (d8 != null) {
            return d8.f();
        }
        C2902a b9 = this.f28515D.f().b(getUnvalidatedCardNumber());
        if (b9 != null) {
            return b9.f();
        }
        return 16;
    }

    public final List<EnumC2906e> getPossibleCardBrands$payments_core_release() {
        return this.f28527y;
    }

    public final Function1 getPossibleCardBrandsCallback$payments_core_release() {
        return this.f28528z;
    }

    public final AbstractC3564f.c getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().l(getPanLength$payments_core_release());
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f28522t;
    }

    @VisibleForTesting
    public final U5.g getWorkContext() {
        return this.f28518p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        InterfaceC3488x0 d8;
        super.onAttachedToWindow();
        d8 = AbstractC3462k.d(n6.N.a(this.f28518p), null, null, new j(null), 3, null);
        this.f28517F = d8;
        P.a(this, this.f28522t, new k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC3488x0 interfaceC3488x0 = this.f28517F;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        this.f28517F = null;
        this.f28515D.c();
        super.onDetachedFromWindow();
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        c cVar;
        boolean z8;
        Parcelable superState;
        if (parcelable instanceof c) {
            cVar = (c) parcelable;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            z8 = cVar.a();
        } else {
            z8 = false;
        }
        this.f28514C = z8;
        if (cVar != null && (superState = cVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f28514C);
    }

    public final void setBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3292y.i(callback, "callback");
        this.f28524v = callback;
        callback.invoke(this.f28523u);
    }

    public final void setCardBrand$payments_core_release(EnumC2906e value) {
        AbstractC3292y.i(value, "value");
        EnumC2906e enumC2906e = this.f28523u;
        this.f28523u = value;
        if (value != enumC2906e) {
            this.f28524v.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3292y.i(function0, "<set-?>");
        this.f28512A = function0;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC3292y.i(callback, "callback");
        this.f28526x = callback;
        callback.invoke(this.f28525w);
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(EnumC2906e value) {
        AbstractC3292y.i(value, "value");
        EnumC2906e enumC2906e = this.f28525w;
        this.f28525w = value;
        if (value != enumC2906e) {
            this.f28526x.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setLoadingCallback$payments_core_release(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.f28516E = function1;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends EnumC2906e> value) {
        AbstractC3292y.i(value, "value");
        List list = this.f28527y;
        this.f28527y = value;
        if (!AbstractC3292y.d(value, list)) {
            this.f28528z.invoke(value);
            B(this, 0, 1, null);
        }
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1 callback) {
        AbstractC3292y.i(callback, "callback");
        this.f28528z = callback;
        callback.invoke(this.f28527y);
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f28522t = viewModelStoreOwner;
    }

    public final void setWorkContext(U5.g gVar) {
        AbstractC3292y.i(gVar, "<set-?>");
        this.f28518p = gVar;
    }

    public final /* synthetic */ int v(int i8, int i9, int i10, int i11) {
        int i12;
        Set a9 = AbstractC3564f.f36121a.a(i11);
        boolean z8 = a9 instanceof Collection;
        boolean z9 = false;
        if (z8 && a9.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it = a9.iterator();
            i12 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (i9 <= intValue && i9 + i10 >= intValue && (i12 = i12 + 1) < 0) {
                    AbstractC1435t.v();
                }
            }
        }
        if (!z8 || !a9.isEmpty()) {
            Iterator it2 = a9.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int intValue2 = ((Number) it2.next()).intValue();
                if (i10 == 0 && i9 == intValue2 + 1) {
                    z9 = true;
                    break;
                }
            }
        }
        int i13 = i9 + i10 + i12;
        if (z9 && i13 > 0) {
            i13--;
        }
        if (i13 <= i8) {
            return i13;
        }
        return i8;
    }

    public final boolean w() {
        return this.f28513B;
    }

    public final Function1 x() {
        return this.f28516E;
    }

    public final /* synthetic */ void z() {
        this.f28520r.a(PaymentAnalyticsRequestFactory.v(this.f28521s, PaymentAnalyticsEvent.f26032B0, null, null, null, null, null, 62, null));
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, U5.g gVar, U5.g gVar2, InterfaceC3560b interfaceC3560b, p2.p pVar, InterfaceC0951c interfaceC0951c, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8, gVar, gVar2, interfaceC3560b, (i9 & 64) != 0 ? new C3569k() : pVar, interfaceC0951c, paymentAnalyticsRequestFactory, (i9 & 512) != 0 ? null : viewModelStoreOwner);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8, U5.g uiContext, U5.g workContext, InterfaceC3560b cardAccountRangeRepository, p2.p staticCardAccountRanges, InterfaceC0951c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(uiContext, "uiContext");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3292y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.f28518p = workContext;
        this.f28519q = cardAccountRangeRepository;
        this.f28520r = analyticsRequestExecutor;
        this.f28521s = paymentAnalyticsRequestFactory;
        this.f28522t = viewModelStoreOwner;
        EnumC2906e enumC2906e = EnumC2906e.f32125w;
        this.f28523u = enumC2906e;
        this.f28524v = f.f28541a;
        this.f28525w = enumC2906e;
        this.f28526x = h.f28543a;
        this.f28527y = AbstractC1435t.m();
        this.f28528z = l.f28561a;
        this.f28512A = g.f28542a;
        this.f28515D = new C3561c(cardAccountRangeRepository, uiContext, this.f28518p, staticCardAccountRanges, new d(), new e());
        this.f28516E = i.f28544a;
        j();
        setErrorMessage(getResources().getString(AbstractC3394E.f35261u0));
        addTextChangedListener(new b());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.K
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardNumberEditText.o(CardNumberEditText.this, view, z8);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER});
        }
        B(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, C3445b0.c(), C3445b0.b(), new a(context));
        AbstractC3292y.i(context, "context");
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i8, U5.g gVar, U5.g gVar2, final Function0 function0) {
        this(context, attributeSet, i8, gVar, gVar2, new C3568j(context).a(), new C3569k(), new B2.m(), new PaymentAnalyticsRequestFactory(context, new N5.a() { // from class: com.stripe.android.view.J
            @Override // N5.a
            public final Object get() {
                String n8;
                n8 = CardNumberEditText.n(Function0.this);
                return n8;
            }
        }), null, 512, null);
    }
}
