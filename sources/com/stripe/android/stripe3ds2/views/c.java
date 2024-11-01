package com.stripe.android.stripe3ds2.views;

import Q5.I;
import Q5.InterfaceC1412g;
import Q5.InterfaceC1416k;
import Q5.r;
import Q5.x;
import R5.Q;
import Y3.q;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c4.v;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.views.b;
import d4.C2757a;
import d4.b;
import f4.C2851c;
import f4.C2858j;
import f4.C2859k;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.InterfaceC3286s;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public final class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public static final a f28299s = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Y3.m f28300a;

    /* renamed from: b, reason: collision with root package name */
    private final v f28301b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f28302c;

    /* renamed from: d, reason: collision with root package name */
    private final Z3.c f28303d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f28304e;

    /* renamed from: f, reason: collision with root package name */
    private final d4.g f28305f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f28306g;

    /* renamed from: h, reason: collision with root package name */
    private final U5.g f28307h;

    /* renamed from: i, reason: collision with root package name */
    private d4.b f28308i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1416k f28309j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f28310k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1416k f28311l;

    /* renamed from: m, reason: collision with root package name */
    private V3.c f28312m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1416k f28313n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1416k f28314o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1416k f28315p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC1416k f28316q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1416k f28317r;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28318a;

        static {
            int[] iArr = new int[d4.g.values().length];
            try {
                iArr[d4.g.f31450d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d4.g.f31451e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d4.g.f31452f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d4.g.f31454h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d4.g.f31453g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f28318a = iArr;
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.views.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0680c extends AbstractC3293z implements Function0 {
        C0680c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandZoneView invoke() {
            BrandZoneView caBrandZone = c.this.H().f10554b;
            AbstractC3292y.h(caBrandZone, "caBrandZone");
            return caBrandZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2851c invoke() {
            FragmentActivity requireActivity = c.this.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            return new C2851c(requireActivity);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2858j invoke() {
            d4.b bVar = c.this.f28308i;
            d4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3292y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() != d4.g.f31451e) {
                d4.b bVar3 = c.this.f28308i;
                if (bVar3 == null) {
                    AbstractC3292y.y("cresData");
                    bVar3 = null;
                }
                if (bVar3.b0() != d4.g.f31452f) {
                    return null;
                }
            }
            C2851c A8 = c.this.A();
            d4.b bVar4 = c.this.f28308i;
            if (bVar4 == null) {
                AbstractC3292y.y("cresData");
            } else {
                bVar2 = bVar4;
            }
            return A8.a(bVar2, c.this.f28300a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2859k invoke() {
            d4.b bVar = c.this.f28308i;
            d4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3292y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == d4.g.f31450d) {
                C2851c A8 = c.this.A();
                d4.b bVar3 = c.this.f28308i;
                if (bVar3 == null) {
                    AbstractC3292y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.b(bVar2, c.this.f28300a);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeZoneView invoke() {
            ChallengeZoneView caChallengeZone = c.this.H().f10555c;
            AbstractC3292y.h(caChallengeZone, "caChallengeZone");
            return caChallengeZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3293z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.e invoke() {
            d4.b bVar = c.this.f28308i;
            d4.b bVar2 = null;
            if (bVar == null) {
                AbstractC3292y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == d4.g.f31454h) {
                C2851c A8 = c.this.A();
                d4.b bVar3 = c.this.f28308i;
                if (bVar3 == null) {
                    AbstractC3292y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.c(bVar2);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8786a;
        }

        public final void invoke(String str) {
            C2859k C8 = c.this.C();
            if (C8 != null) {
                AbstractC3292y.f(str);
                C8.setText(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function1 {
        j() {
            super(1);
        }

        public final void a(I i8) {
            c.this.O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3293z implements Function1 {
        k() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.d dVar) {
            if (dVar != null) {
                c.this.J(dVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.d) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l implements Observer, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f28328a;

        l(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f28328a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f28328a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28328a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f28329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f28329a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f28329a.requireActivity().getViewModelStore();
            AbstractC3292y.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f28331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, Fragment fragment) {
            super(0);
            this.f28330a = function0;
            this.f28331b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28330a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.f28331b.requireActivity().getDefaultViewModelCreationExtras();
            AbstractC3292y.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3293z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            d4.b bVar = c.this.f28308i;
            if (bVar == null) {
                AbstractC3292y.y("cresData");
                bVar = null;
            }
            d4.g b02 = bVar.b0();
            String b9 = b02 != null ? b02.b() : null;
            return b9 == null ? "" : b9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f28333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ImageView imageView) {
            super(1);
            this.f28333a = imageView;
        }

        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f28333a.setVisibility(0);
                this.f28333a.setImageBitmap(bitmap);
            } else {
                this.f28333a.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bitmap) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3293z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.C0679b(c.this.f28304e, c.this.f28301b, c.this.f28303d, c.this.f28307h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, Z3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, d4.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, U5.g workContext) {
        super(U3.e.f10123c);
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        AbstractC3292y.i(transactionTimer, "transactionTimer");
        AbstractC3292y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3292y.i(intentData, "intentData");
        AbstractC3292y.i(workContext, "workContext");
        this.f28300a = uiCustomization;
        this.f28301b = transactionTimer;
        this.f28302c = errorRequestExecutor;
        this.f28303d = errorReporter;
        this.f28304e = challengeActionHandler;
        this.f28305f = gVar;
        this.f28306g = intentData;
        this.f28307h = workContext;
        this.f28309j = Q5.l.b(new o());
        this.f28310k = FragmentViewModelLazyKt.createViewModelLazy(this, U.b(com.stripe.android.stripe3ds2.views.b.class), new m(this), new n(null, this), new q());
        this.f28311l = Q5.l.b(new d());
        this.f28313n = Q5.l.b(new g());
        this.f28314o = Q5.l.b(new C0680c());
        this.f28315p = Q5.l.b(new f());
        this.f28316q = Q5.l.b(new e());
        this.f28317r = Q5.l.b(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2851c A() {
        return (C2851c) this.f28311l.getValue();
    }

    private final ChallengeZoneView D() {
        return (ChallengeZoneView) this.f28313n.getValue();
    }

    private final String F() {
        return (String) this.f28309j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.stripe3ds2.transaction.d dVar) {
        if (dVar instanceof d.C0676d) {
            d.C0676d c0676d = (d.C0676d) dVar;
            M(c0676d.a(), c0676d.b());
        } else if (dVar instanceof d.b) {
            K(((d.b) dVar).a());
        } else if (dVar instanceof d.c) {
            L(((d.c) dVar).a());
        } else if (dVar instanceof d.e) {
            N(((d.e) dVar).a());
        }
    }

    private final void K(d4.d dVar) {
        I().n(new h.d(dVar, this.f28305f, this.f28306g));
        I().t();
        this.f28302c.a(dVar);
    }

    private final void L(Throwable th) {
        I().n(new h.e(th, this.f28305f, this.f28306g));
    }

    private final void M(C2757a c2757a, d4.b bVar) {
        com.stripe.android.stripe3ds2.transaction.h cVar;
        if (bVar.f0()) {
            I().t();
            if (c2757a.h() != null) {
                cVar = new h.a(F(), this.f28305f, this.f28306g);
            } else {
                String a02 = bVar.a0();
                if (a02 == null) {
                    a02 = "";
                }
                if (AbstractC3292y.d("Y", a02)) {
                    cVar = new h.f(F(), this.f28305f, this.f28306g);
                } else {
                    cVar = new h.c(F(), this.f28305f, this.f28306g);
                }
            }
            I().n(cVar);
            return;
        }
        I().p(bVar);
    }

    private final void N(d4.d dVar) {
        I().t();
        this.f28302c.a(dVar);
        I().n(new h.g(F(), this.f28305f, this.f28306g));
    }

    private final void P() {
        BrandZoneView caBrandZone = H().f10554b;
        AbstractC3292y.h(caBrandZone, "caBrandZone");
        ImageView issuerImageView$3ds2sdk_release = caBrandZone.getIssuerImageView$3ds2sdk_release();
        d4.b bVar = this.f28308i;
        d4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        r a9 = x.a(issuerImageView$3ds2sdk_release, bVar.y());
        ImageView paymentSystemImageView$3ds2sdk_release = caBrandZone.getPaymentSystemImageView$3ds2sdk_release();
        d4.b bVar3 = this.f28308i;
        if (bVar3 == null) {
            AbstractC3292y.y("cresData");
        } else {
            bVar2 = bVar3;
        }
        for (Map.Entry entry : Q.k(a9, x.a(paymentSystemImageView$3ds2sdk_release, bVar2.Q())).entrySet()) {
            I().g((b.d) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new l(new p((ImageView) entry.getKey())));
        }
    }

    private final void s(C2859k c2859k, C2858j c2858j, com.stripe.android.stripe3ds2.views.e eVar) {
        d4.b bVar = null;
        if (c2859k != null) {
            D().setChallengeEntryView(c2859k);
            ChallengeZoneView D8 = D();
            d4.b bVar2 = this.f28308i;
            if (bVar2 == null) {
                AbstractC3292y.y("cresData");
                bVar2 = null;
            }
            D8.d(bVar2.Z(), this.f28300a.a(q.a.SUBMIT));
            ChallengeZoneView D9 = D();
            d4.b bVar3 = this.f28308i;
            if (bVar3 == null) {
                AbstractC3292y.y("cresData");
            } else {
                bVar = bVar3;
            }
            D9.c(bVar.U(), this.f28300a.a(q.a.RESEND));
        } else if (c2858j != null) {
            D().setChallengeEntryView(c2858j);
            ChallengeZoneView D10 = D();
            d4.b bVar4 = this.f28308i;
            if (bVar4 == null) {
                AbstractC3292y.y("cresData");
                bVar4 = null;
            }
            D10.d(bVar4.Z(), this.f28300a.a(q.a.NEXT));
            ChallengeZoneView D11 = D();
            d4.b bVar5 = this.f28308i;
            if (bVar5 == null) {
                AbstractC3292y.y("cresData");
            } else {
                bVar = bVar5;
            }
            D11.c(bVar.U(), this.f28300a.a(q.a.RESEND));
        } else if (eVar != null) {
            D().setChallengeEntryView(eVar);
            D().a(null, null);
            D().b(null, null);
            D().d(null, null);
            eVar.setOnClickListener(new View.OnClickListener() { // from class: f4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.stripe.android.stripe3ds2.views.c.t(com.stripe.android.stripe3ds2.views.c.this, view);
                }
            });
            y().setVisibility(8);
        } else {
            d4.b bVar6 = this.f28308i;
            if (bVar6 == null) {
                AbstractC3292y.y("cresData");
                bVar6 = null;
            }
            if (bVar6.b0() == d4.g.f31453g) {
                ChallengeZoneView D12 = D();
                d4.b bVar7 = this.f28308i;
                if (bVar7 == null) {
                    AbstractC3292y.y("cresData");
                } else {
                    bVar = bVar7;
                }
                D12.d(bVar.I(), this.f28300a.a(q.a.CONTINUE));
            }
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(c this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    private final void u() {
        int i8;
        ChallengeZoneView D8 = D();
        d4.b bVar = this.f28308i;
        d4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        D8.a(bVar.p(), this.f28300a.b());
        ChallengeZoneView D9 = D();
        d4.b bVar3 = this.f28308i;
        if (bVar3 == null) {
            AbstractC3292y.y("cresData");
            bVar3 = null;
        }
        D9.b(bVar3.u(), this.f28300a.b());
        ChallengeZoneView D10 = D();
        d4.b bVar4 = this.f28308i;
        if (bVar4 == null) {
            AbstractC3292y.y("cresData");
            bVar4 = null;
        }
        if (bVar4.Y()) {
            i8 = U3.c.f10086d;
        } else {
            i8 = 0;
        }
        D10.setInfoTextIndicator(i8);
        ChallengeZoneView D11 = D();
        d4.b bVar5 = this.f28308i;
        if (bVar5 == null) {
            AbstractC3292y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        D11.e(bVar2.c0(), this.f28300a.b(), this.f28300a.a(q.a.SELECT));
        D().setSubmitButtonClickListener(new View.OnClickListener() { // from class: f4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.v(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
        D().setResendButtonClickListener(new View.OnClickListener() { // from class: f4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.w(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(c this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.I().u(a.e.f28048a);
    }

    private final void x() {
        InformationZoneView caInformationZone = H().f10556d;
        AbstractC3292y.h(caInformationZone, "caInformationZone");
        d4.b bVar = this.f28308i;
        d4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        String d02 = bVar.d0();
        d4.b bVar3 = this.f28308i;
        if (bVar3 == null) {
            AbstractC3292y.y("cresData");
            bVar3 = null;
        }
        caInformationZone.g(d02, bVar3.e0(), this.f28300a.b());
        d4.b bVar4 = this.f28308i;
        if (bVar4 == null) {
            AbstractC3292y.y("cresData");
            bVar4 = null;
        }
        String w8 = bVar4.w();
        d4.b bVar5 = this.f28308i;
        if (bVar5 == null) {
            AbstractC3292y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        caInformationZone.f(w8, bVar2.x(), this.f28300a.b());
        String h8 = this.f28300a.h();
        if (h8 != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(h8));
        }
    }

    private final BrandZoneView y() {
        return (BrandZoneView) this.f28314o.getValue();
    }

    private final com.stripe.android.stripe3ds2.transaction.a z() {
        int i8;
        d4.b bVar = this.f28308i;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        d4.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f28318a[b02.ordinal()];
        }
        if (i8 != 4) {
            if (i8 != 5) {
                return new a.c(G());
            }
            return a.d.f28047a;
        }
        return new a.b(G());
    }

    public final C2858j B() {
        return (C2858j) this.f28316q.getValue();
    }

    public final C2859k C() {
        return (C2859k) this.f28315p.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.e E() {
        return (com.stripe.android.stripe3ds2.views.e) this.f28317r.getValue();
    }

    public final String G() {
        int i8;
        d4.b bVar = this.f28308i;
        String str = null;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        d4.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f28318a[b02.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                if (i8 != 4) {
                    str = "";
                } else {
                    com.stripe.android.stripe3ds2.views.e E8 = E();
                    if (E8 != null) {
                        str = E8.getUserEntry();
                    }
                }
            } else {
                C2858j B8 = B();
                if (B8 != null) {
                    str = B8.getUserEntry();
                }
            }
        } else {
            C2859k C8 = C();
            if (C8 != null) {
                str = C8.getUserEntry();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final V3.c H() {
        V3.c cVar = this.f28312m;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final com.stripe.android.stripe3ds2.views.b I() {
        return (com.stripe.android.stripe3ds2.views.b) this.f28310k.getValue();
    }

    public final void O() {
        d4.b bVar = this.f28308i;
        d4.b bVar2 = null;
        if (bVar == null) {
            AbstractC3292y.y("cresData");
            bVar = null;
        }
        if (bVar.b0() == d4.g.f31454h) {
            d4.b bVar3 = this.f28308i;
            if (bVar3 == null) {
                AbstractC3292y.y("cresData");
                bVar3 = null;
            }
            String h8 = bVar3.h();
            if (h8 != null && !l6.n.T(h8)) {
                com.stripe.android.stripe3ds2.views.e E8 = E();
                if (E8 != null) {
                    d4.b bVar4 = this.f28308i;
                    if (bVar4 == null) {
                        AbstractC3292y.y("cresData");
                    } else {
                        bVar2 = bVar4;
                    }
                    E8.c(bVar2.h());
                    return;
                }
                return;
            }
        }
        d4.b bVar5 = this.f28308i;
        if (bVar5 == null) {
            AbstractC3292y.y("cresData");
            bVar5 = null;
        }
        if (bVar5.b0() == d4.g.f31453g) {
            d4.b bVar6 = this.f28308i;
            if (bVar6 == null) {
                AbstractC3292y.y("cresData");
                bVar6 = null;
            }
            String l8 = bVar6.l();
            if (l8 != null && !l6.n.T(l8)) {
                ChallengeZoneView D8 = D();
                d4.b bVar7 = this.f28308i;
                if (bVar7 == null) {
                    AbstractC3292y.y("cresData");
                } else {
                    bVar2 = bVar7;
                }
                D8.b(bVar2.l(), this.f28300a.b());
                D().setInfoTextIndicator(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28312m = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        d4.b bVar;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bVar = (d4.b) BundleCompat.getParcelable(arguments, "arg_cres", d4.b.class);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            L(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.f28308i = bVar;
        this.f28312m = V3.c.a(view);
        I().f().observe(getViewLifecycleOwner(), new l(new i()));
        I().i().observe(getViewLifecycleOwner(), new l(new j()));
        I().e().observe(getViewLifecycleOwner(), new l(new k()));
        P();
        s(C(), B(), E());
        x();
    }
}
