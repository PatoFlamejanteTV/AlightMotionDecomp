package G3;

import D3.f;
import G3.f;
import H3.j;
import Q5.C1413h;
import Q5.I;
import Q5.r;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import R5.a0;
import android.app.Application;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.r;
import com.stripe.android.payments.bankaccount.navigation.a;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.w;
import g4.C2918b;
import j4.C0;
import j6.InterfaceC3214c;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import l3.C3325d;
import l3.InterfaceC3322a;
import l3.InterfaceC3326e;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.v;
import q6.w;
import r4.C3901b;
import r4.G;
import r4.Q;
import r4.e0;
import r4.w0;
import w3.C4154a;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class h extends ViewModel {

    /* renamed from: K, reason: collision with root package name */
    private static final d f2979K = new d(null);

    /* renamed from: L, reason: collision with root package name */
    public static final int f2980L = 8;

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC3821f f2981A;

    /* renamed from: B, reason: collision with root package name */
    private final v f2982B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3821f f2983C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f2984D;

    /* renamed from: E, reason: collision with root package name */
    private final C0 f2985E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3813L f2986F;

    /* renamed from: G, reason: collision with root package name */
    private final w f2987G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3813L f2988H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3813L f2989I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC3326e f2990J;

    /* renamed from: a, reason: collision with root package name */
    private final c f2991a;

    /* renamed from: b, reason: collision with root package name */
    private final Application f2992b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f2993c;

    /* renamed from: d, reason: collision with root package name */
    private final SavedStateHandle f2994d;

    /* renamed from: e, reason: collision with root package name */
    private final w.c f2995e;

    /* renamed from: f, reason: collision with root package name */
    private final w.d f2996f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2997g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2998h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2999i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f3000j;

    /* renamed from: k, reason: collision with root package name */
    private final String f3001k;

    /* renamed from: l, reason: collision with root package name */
    private final w0 f3002l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f3003m;

    /* renamed from: n, reason: collision with root package name */
    private final String f3004n;

    /* renamed from: o, reason: collision with root package name */
    private final w0 f3005o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f3006p;

    /* renamed from: q, reason: collision with root package name */
    private final String f3007q;

    /* renamed from: r, reason: collision with root package name */
    private final String f3008r;

    /* renamed from: s, reason: collision with root package name */
    private final Q f3009s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f3010t;

    /* renamed from: u, reason: collision with root package name */
    private final com.stripe.android.model.a f3011u;

    /* renamed from: v, reason: collision with root package name */
    private final e0 f3012v;

    /* renamed from: w, reason: collision with root package name */
    private final C3901b f3013w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3813L f3014x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3813L f3015y;

    /* renamed from: z, reason: collision with root package name */
    private final v f3016z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f3017a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0058a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f3019a;

            C0058a(h hVar) {
                this.f3019a = hVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, U5.d dVar) {
                if (str != null) {
                    this.f3019a.u().y().q(str);
                }
                return I.f8786a;
            }
        }

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f3017a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L y8 = h.this.n().t().i().y();
                C0058a c0058a = new C0058a(h.this);
                this.f3017a = 1;
                if (y8.collect(c0058a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f3020a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f3022a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f3023b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f3024c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, U5.d dVar) {
                super(2, dVar);
                this.f3024c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(this.f3024c, dVar);
                aVar.f3023b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (U5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f3022a == 0) {
                    t.b(obj);
                    this.f3024c.O(this.f3023b);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(boolean z8, U5.d dVar) {
                return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f3020a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f G8 = AbstractC3823h.G(h.this.y(), new a(h.this, null));
                this.f3020a = 1;
                if (AbstractC3823h.i(G8, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f3025a;

        /* renamed from: b, reason: collision with root package name */
        private final F3.a f3026b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3027c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3028d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f3029e;

        /* renamed from: f, reason: collision with root package name */
        private final String f3030f;

        /* renamed from: g, reason: collision with root package name */
        private final String f3031g;

        /* renamed from: h, reason: collision with root package name */
        private final String f3032h;

        /* renamed from: i, reason: collision with root package name */
        private final f.e.d f3033i;

        /* renamed from: j, reason: collision with root package name */
        private final C4154a f3034j;

        /* renamed from: k, reason: collision with root package name */
        private final String f3035k;

        public c(boolean z8, F3.a formArgs, boolean z9, boolean z10, boolean z11, String str, String str2, String str3, f.e.d dVar, C4154a c4154a, String hostedSurface) {
            AbstractC3292y.i(formArgs, "formArgs");
            AbstractC3292y.i(hostedSurface, "hostedSurface");
            this.f3025a = z8;
            this.f3026b = formArgs;
            this.f3027c = z9;
            this.f3028d = z10;
            this.f3029e = z11;
            this.f3030f = str;
            this.f3031g = str2;
            this.f3032h = str3;
            this.f3033i = dVar;
            this.f3034j = c4154a;
            this.f3035k = hostedSurface;
        }

        public final String a() {
            return this.f3031g;
        }

        public final F3.a b() {
            return this.f3026b;
        }

        public final String c() {
            return this.f3035k;
        }

        public final boolean d() {
            return this.f3025a;
        }

        public final String e() {
            return this.f3032h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f3025a == cVar.f3025a && AbstractC3292y.d(this.f3026b, cVar.f3026b) && this.f3027c == cVar.f3027c && this.f3028d == cVar.f3028d && this.f3029e == cVar.f3029e && AbstractC3292y.d(this.f3030f, cVar.f3030f) && AbstractC3292y.d(this.f3031g, cVar.f3031g) && AbstractC3292y.d(this.f3032h, cVar.f3032h) && AbstractC3292y.d(this.f3033i, cVar.f3033i) && AbstractC3292y.d(this.f3034j, cVar.f3034j) && AbstractC3292y.d(this.f3035k, cVar.f3035k)) {
                return true;
            }
            return false;
        }

        public final f.e.d f() {
            return this.f3033i;
        }

        public final boolean g() {
            return this.f3027c;
        }

        public final String h() {
            return this.f3030f;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a9 = ((((((((androidx.compose.foundation.a.a(this.f3025a) * 31) + this.f3026b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f3027c)) * 31) + androidx.compose.foundation.a.a(this.f3028d)) * 31) + androidx.compose.foundation.a.a(this.f3029e)) * 31;
            String str = this.f3030f;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (a9 + hashCode) * 31;
            String str2 = this.f3031g;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f3032h;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            f.e.d dVar = this.f3033i;
            if (dVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = dVar.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            C4154a c4154a = this.f3034j;
            if (c4154a != null) {
                i8 = c4154a.hashCode();
            }
            return ((i12 + i8) * 31) + this.f3035k.hashCode();
        }

        public final boolean i() {
            return this.f3028d;
        }

        public final boolean j() {
            return this.f3029e;
        }

        public String toString() {
            return "Args(instantDebits=" + this.f3025a + ", formArgs=" + this.f3026b + ", showCheckbox=" + this.f3027c + ", isCompleteFlow=" + this.f3028d + ", isPaymentFlow=" + this.f3029e + ", stripeIntentId=" + this.f3030f + ", clientSecret=" + this.f3031g + ", onBehalfOf=" + this.f3032h + ", savedPaymentMethod=" + this.f3033i + ", shippingDetails=" + this.f3034j + ", hostedSurface=" + this.f3035k + ")";
        }
    }

    /* loaded from: classes4.dex */
    private static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f3036a;

        public e(Function0 argsSupplier) {
            AbstractC3292y.i(argsSupplier, "argsSupplier");
            this.f3036a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            h a9 = ((j.a) H3.b.a().b(E2.b.a(extras)).build().a().get()).b((c) this.f3036a.invoke()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f3037a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.a invoke(List formFieldValues) {
            AbstractC3292y.i(formFieldValues, "formFieldValues");
            List<r> list = formFieldValues;
            LinkedHashMap linkedHashMap = new LinkedHashMap(i6.m.d(R5.Q.d(AbstractC1435t.x(list, 10)), 16));
            for (r rVar : list) {
                r a9 = x.a(rVar.c(), ((C4156a) rVar.d()).c());
                linkedHashMap.put(a9.c(), a9.d());
            }
            return G3.i.d(com.stripe.android.model.a.f25419g, linkedHashMap);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f3038a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a formFieldEntry) {
            AbstractC3292y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null) {
                return null;
            }
            return formFieldEntry.c();
        }
    }

    /* renamed from: G3.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0059h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0059h f3039a = new C0059h();

        C0059h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(List it) {
            AbstractC3292y.i(it, "it");
            return (G) AbstractC1435t.y0(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f3040a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a formFieldEntry) {
            String c8;
            AbstractC3292y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null || (c8 = formFieldEntry.c()) == null) {
                return "";
            }
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f3041a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4156a formFieldEntry) {
            AbstractC3292y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null) {
                return null;
            }
            return formFieldEntry.c();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class k extends C3289v implements Function1 {
        k(Object obj) {
            super(1, obj, h.class, "handleInstantDebitsResult", "handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.a p02) {
            AbstractC3292y.i(p02, "p0");
            ((h) this.receiver).E(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.a) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class l extends C3289v implements Function1 {
        l(Object obj) {
            super(1, obj, h.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.d p02) {
            AbstractC3292y.i(p02, "p0");
            ((h) this.receiver).B(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f3042a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f3043a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f3044a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f3045a = new p();

        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List formFieldValues) {
            AbstractC3292y.i(formFieldValues, "formFieldValues");
            List list = formFieldValues;
            boolean z8 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((C4156a) ((r) it.next()).d()).d()) {
                        z8 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3293z implements InterfaceC2074p {
        q() {
            super(4);
        }

        public final Boolean a(boolean z8, boolean z9, boolean z10, boolean z11) {
            boolean z12;
            boolean z13 = false;
            if (!h.this.f2991a.d()) {
                if (z8 && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if ((!z10 && h.this.f2996f.u() == w.d.b.f27918c) || (!z11 && h.this.f2996f.a() == w.d.a.f27913c)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z9 && z12) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }

        @Override // c6.InterfaceC2074p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(G3.h.c r29, android.app.Application r30, N5.a r31, androidx.lifecycle.SavedStateHandle r32) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.h.<init>(G3.h$c, android.app.Application, N5.a, androidx.lifecycle.SavedStateHandle):void");
    }

    private final boolean A() {
        return AbstractC3292y.d(this.f2994d.get("should_reset"), Boolean.TRUE);
    }

    private final void C(d.b bVar) {
        String str;
        StripeIntent b9 = bVar.a().b();
        if (b9 != null) {
            str = b9.getId();
        } else {
            str = null;
        }
        c.C0542c f8 = bVar.a().f();
        if (f8 != null) {
            G(f8, str);
        } else {
            J(C2.d.a(v3.w.f40623k));
        }
    }

    private final void D(a.b bVar) {
        Object value;
        q6.w wVar = this.f2987G;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, new f.b(new f.c.a(bVar.h()), bVar.a(), bVar.f(), bVar.b().getId(), g(), f(this, false, false, 2, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(com.stripe.android.payments.bankaccount.navigation.a aVar) {
        L(false);
        if (aVar instanceof a.b) {
            D((a.b) aVar);
        } else if (aVar instanceof a.c) {
            J(C2.d.a(v3.w.f40623k));
        } else if (aVar instanceof a.C0538a) {
            K(this, null, 1, null);
        }
    }

    private final void G(c.C0542c c0542c, String str) {
        Object value;
        FinancialConnectionsAccount financialConnectionsAccount;
        Object value2;
        BankAccount paymentAccount = c0542c.a().getPaymentAccount();
        if (paymentAccount instanceof BankAccount) {
            q6.w wVar = this.f2987G;
            do {
                value2 = wVar.getValue();
            } while (!wVar.a(value2, new f.e(paymentAccount, c0542c.a().getId(), str, g(), f(this, true, false, 2, null))));
            return;
        }
        if (paymentAccount instanceof FinancialConnectionsAccount) {
            q6.w wVar2 = this.f2987G;
            do {
                value = wVar2.getValue();
                financialConnectionsAccount = (FinancialConnectionsAccount) paymentAccount;
            } while (!wVar2.a(value, new f.b(new f.c.b(c0542c.a().getId()), financialConnectionsAccount.getInstitutionName(), financialConnectionsAccount.getLast4(), str, g(), f(this, false, false, 2, null))));
            return;
        }
        if (paymentAccount == null) {
            J(C2.d.a(v3.w.f40623k));
        }
    }

    public static /* synthetic */ void K(h hVar, C2.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = null;
        }
        hVar.J(cVar);
    }

    private final void L(boolean z8) {
        this.f2994d.set("has_launched", Boolean.valueOf(z8));
    }

    private final void M(boolean z8) {
        this.f2994d.set("should_reset", Boolean.valueOf(z8));
    }

    private final void N(f.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            this.f3016z.d(k(cVar, str2, str));
            M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(boolean z8) {
        Object value;
        G3.f fVar;
        q6.w wVar = this.f2987G;
        do {
            value = wVar.getValue();
            fVar = (G3.f) value;
        } while (!wVar.a(value, G3.g.a(fVar, e(fVar instanceof f.e, z8))));
    }

    private final C2.c e(boolean z8, boolean z9) {
        return G3.j.f3047a.a(m(), z8, z9, this.f2991a.d(), !this.f2991a.j());
    }

    static /* synthetic */ C2.c f(h hVar, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z9 = ((Boolean) hVar.f2986F.getValue()).booleanValue();
        }
        return hVar.e(z8, z9);
    }

    private final C2.c g() {
        if (this.f2991a.i()) {
            if (this.f2991a.j()) {
                C2918b a9 = this.f2991a.b().a();
                AbstractC3292y.f(a9);
                return a9.a();
            }
            return C2.d.a(g4.n.f32365C0);
        }
        return C2.d.a(g4.n.f32418o);
    }

    private final void h(String str) {
        if (r()) {
            return;
        }
        L(true);
        if (str != null) {
            j(str);
        } else {
            i();
        }
    }

    private final void i() {
        Integer num;
        String str;
        String h8 = this.f2991a.h();
        if (h8 == null) {
            return;
        }
        if (this.f2991a.j()) {
            InterfaceC3326e interfaceC3326e = this.f2990J;
            if (interfaceC3326e != null) {
                String f8 = ((n2.r) this.f2993c.get()).f();
                String h9 = ((n2.r) this.f2993c.get()).h();
                InterfaceC3322a.b bVar = new InterfaceC3322a.b((String) this.f3003m.getValue(), (String) this.f3006p.getValue());
                String e8 = this.f2991a.e();
                C2918b a9 = this.f2991a.b().a();
                if (a9 != null) {
                    num = Integer.valueOf((int) a9.f());
                } else {
                    num = null;
                }
                C2918b a10 = this.f2991a.b().a();
                if (a10 != null) {
                    str = a10.b();
                } else {
                    str = null;
                }
                interfaceC3326e.c(f8, h9, bVar, h8, null, e8, num, str);
                return;
            }
            return;
        }
        InterfaceC3326e interfaceC3326e2 = this.f2990J;
        if (interfaceC3326e2 != null) {
            interfaceC3326e2.b(((n2.r) this.f2993c.get()).f(), ((n2.r) this.f2993c.get()).h(), new InterfaceC3322a.b((String) this.f3003m.getValue(), (String) this.f3006p.getValue()), h8, null, this.f2991a.e());
        }
    }

    private final void j(String str) {
        InterfaceC3322a bVar;
        if (this.f2991a.d()) {
            bVar = new InterfaceC3322a.C0793a((String) this.f3006p.getValue());
        } else {
            bVar = new InterfaceC3322a.b((String) this.f3003m.getValue(), (String) this.f3006p.getValue());
        }
        if (this.f2991a.j()) {
            InterfaceC3326e interfaceC3326e = this.f2990J;
            if (interfaceC3326e != null) {
                interfaceC3326e.d(((n2.r) this.f2993c.get()).f(), ((n2.r) this.f2993c.get()).h(), str, bVar);
                return;
            }
            return;
        }
        InterfaceC3326e interfaceC3326e2 = this.f2990J;
        if (interfaceC3326e2 != null) {
            interfaceC3326e2.a(((n2.r) this.f2993c.get()).f(), ((n2.r) this.f2993c.get()).h(), str, bVar);
        }
    }

    private final f.e.d k(f.c cVar, String str, String str2) {
        com.stripe.android.model.p h8;
        f.c.a aVar;
        f.e.d.c cVar2;
        r.d dVar;
        f.a c8 = G3.i.c(this.f2991a.g(), ((Boolean) this.f2986F.getValue()).booleanValue());
        boolean z8 = cVar instanceof f.c.a;
        if (z8) {
            h8 = com.stripe.android.model.p.f25804u.k(((f.c.a) cVar).getId(), true, a0.d("PaymentSheet"));
        } else if (cVar instanceof f.c.b) {
            h8 = p.e.h(com.stripe.android.model.p.f25804u, new p.n(((f.c.b) cVar).getId()), new o.e((com.stripe.android.model.a) this.f3014x.getValue(), (String) this.f3006p.getValue(), (String) this.f3003m.getValue(), (String) this.f3010t.getValue()), null, null, 12, null);
        } else {
            throw new Q5.p();
        }
        com.stripe.android.model.p pVar = h8;
        if (z8) {
            aVar = (f.c.a) cVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            cVar2 = new f.e.d.c(aVar.getId());
        } else {
            cVar2 = null;
        }
        if (cVar instanceof f.c.b) {
            dVar = new r.d(c8.b());
        } else {
            dVar = null;
        }
        String string = this.f2992b.getString(v3.w.f40597U, str);
        int a9 = G3.b.f2829a.a(str2);
        G3.f fVar = (G3.f) this.f2988H.getValue();
        f.e.d.b bVar = new f.e.d.b((String) this.f3003m.getValue(), (String) this.f3006p.getValue(), (String) this.f3010t.getValue(), (com.stripe.android.model.a) this.f3014x.getValue(), ((Boolean) this.f2986F.getValue()).booleanValue());
        AbstractC3292y.f(string);
        return new f.e.d(string, a9, bVar, fVar, cVar2, pVar, c8, dVar, null, 256, null);
    }

    private final G3.f l() {
        if (this.f2991a.f() != null) {
            return this.f2991a.f().u();
        }
        return new f.a(null, C2.d.a(g4.n.f32418o), false, 1, null);
    }

    private final boolean r() {
        return AbstractC3292y.d(this.f2994d.get("has_launched"), Boolean.TRUE);
    }

    public final void B(com.stripe.android.payments.bankaccount.navigation.d result) {
        AbstractC3292y.i(result, "result");
        L(false);
        this.f2982B.d(result);
        if (result instanceof d.b) {
            C((d.b) result);
        } else if (result instanceof d.c) {
            J(C2.d.a(v3.w.f40623k));
        } else if (result instanceof d.a) {
            K(this, null, 1, null);
        }
    }

    public final void F(G3.f screenState) {
        f.d dVar;
        String s8;
        Object value;
        AbstractC3292y.i(screenState, "screenState");
        if (screenState instanceof f.a) {
            q6.w wVar = this.f2987G;
            do {
                value = wVar.getValue();
            } while (!wVar.a(value, f.a.l((f.a) screenState, null, null, true, 3, null)));
            h(this.f2991a.a());
            return;
        }
        if (screenState instanceof f.b) {
            f.b bVar = (f.b) screenState;
            N(bVar.u(), bVar.p(), bVar.s());
        } else if (screenState instanceof f.e) {
            f.e eVar = (f.e) screenState;
            N(new f.c.b(eVar.p()), eVar.s().getBankName(), eVar.s().getLast4());
        } else if ((screenState instanceof f.d) && (s8 = (dVar = (f.d) screenState).s()) != null) {
            N(new f.c.b(s8), dVar.p(), dVar.u());
        }
    }

    public final void H() {
        if (A()) {
            K(this, null, 1, null);
        }
        this.f3016z.d(null);
        this.f2982B.d(null);
        InterfaceC3326e interfaceC3326e = this.f2990J;
        if (interfaceC3326e != null) {
            interfaceC3326e.unregister();
        }
        this.f2990J = null;
    }

    public final void I(ActivityResultRegistryOwner activityResultRegistryOwner) {
        InterfaceC3326e a9;
        AbstractC3292y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
        if (this.f2991a.d()) {
            a9 = C3325d.f34666d.b(this.f2991a.c(), activityResultRegistryOwner, new k(this));
        } else {
            a9 = InterfaceC3326e.f34670a.a(this.f2991a.c(), activityResultRegistryOwner, new l(this));
        }
        this.f2990J = a9;
    }

    public final void J(C2.c cVar) {
        Object value;
        L(false);
        M(false);
        this.f2985E.f().x(true);
        this.f2982B.d(null);
        q6.w wVar = this.f2987G;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, new f.a(cVar, C2.d.a(g4.n.f32418o), false)));
    }

    public final String m() {
        CharSequence charSequence;
        String d8 = this.f2991a.b().d();
        int length = d8.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (d8.charAt(length) == '.') {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    charSequence = d8.subSequence(0, length + 1);
                    break;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public final C3901b n() {
        return this.f3013w;
    }

    public final InterfaceC3821f o() {
        return this.f2983C;
    }

    public final InterfaceC3813L p() {
        return this.f2988H;
    }

    public final w0 q() {
        return this.f3005o;
    }

    public final InterfaceC3813L s() {
        return this.f3015y;
    }

    public final w0 t() {
        return this.f3002l;
    }

    public final Q u() {
        return this.f3009s;
    }

    public final InterfaceC3813L v() {
        return this.f2989I;
    }

    public final InterfaceC3821f w() {
        return this.f2981A;
    }

    public final e0 x() {
        return this.f3012v;
    }

    public final InterfaceC3813L y() {
        return this.f2986F;
    }

    public final C0 z() {
        return this.f2985E;
    }
}
