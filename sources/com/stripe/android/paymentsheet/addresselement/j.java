package com.stripe.android.paymentsheet.addresselement;

import C3.G;
import Q5.C1413h;
import Q5.I;
import Q5.r;
import Q5.t;
import R5.AbstractC1435t;
import R5.Q;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.b;
import com.stripe.android.paymentsheet.addresselement.d;
import com.stripe.android.paymentsheet.addresselement.h;
import com.stripe.android.paymentsheet.w;
import j4.C3201q0;
import j6.InterfaceC3214c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import q6.w;
import r4.G;
import w3.AbstractC4155b;
import w3.C4154a;
import w4.C4156a;
import x3.InterfaceC4215b;

/* loaded from: classes4.dex */
public final class j extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f27003a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f27004b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4215b f27005c;

    /* renamed from: d, reason: collision with root package name */
    private final w f27006d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f27007e;

    /* renamed from: f, reason: collision with root package name */
    private final w f27008f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3813L f27009g;

    /* renamed from: h, reason: collision with root package name */
    private final w f27010h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3813L f27011i;

    /* renamed from: j, reason: collision with root package name */
    private final w f27012j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3813L f27013k;

    /* renamed from: l, reason: collision with root package name */
    private final w f27014l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3813L f27015m;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27016a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0599a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f27018a;

            C0599a(j jVar) {
                this.f27018a = jVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C4154a c4154a, U5.d dVar) {
                String str;
                w.a aVar;
                String str2;
                Boolean h8;
                C4154a c4154a2 = (C4154a) this.f27018a.f27006d.getValue();
                Boolean bool = null;
                if (c4154a2 == null || (str = c4154a2.b()) == null) {
                    if (c4154a != null) {
                        str = c4154a.b();
                    } else {
                        str = null;
                    }
                }
                if (c4154a == null || (aVar = c4154a.a()) == null) {
                    if (c4154a2 != null) {
                        aVar = c4154a2.a();
                    } else {
                        aVar = null;
                    }
                }
                if (c4154a2 == null || (str2 = c4154a2.f()) == null) {
                    if (c4154a != null) {
                        str2 = c4154a.f();
                    } else {
                        str2 = null;
                    }
                }
                if (c4154a2 != null && (h8 = c4154a2.h()) != null) {
                    bool = h8;
                } else if (c4154a != null) {
                    bool = c4154a.h();
                }
                Object emit = this.f27018a.f27006d.emit(new C4154a(str, aVar, str2, bool), dVar);
                if (emit == V5.b.e()) {
                    return emit;
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
            int i8 = this.f27016a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f c8 = j.this.r().c("AddressDetails");
                if (c8 != null) {
                    C0599a c0599a = new C0599a(j.this);
                    this.f27016a = 1;
                    if (c8.collect(c0599a, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27019a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f27021a;

            a(j jVar) {
                this.f27021a = jVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, U5.d dVar) {
                Object emit = this.f27021a.f27008f.emit(bool, dVar);
                if (emit == V5.b.e()) {
                    return emit;
                }
                return I.f8786a;
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
            int i8 = this.f27019a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f c8 = j.this.r().c("force_expanded_form");
                if (c8 != null) {
                    a aVar = new a(j.this);
                    this.f27019a = 1;
                    if (c8.collect(aVar, this) == e8) {
                        return e8;
                    }
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
    static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27022a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N5.a f27024c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27025a = new a();

            a() {
                super(2);
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(C4154a c4154a, Boolean bool) {
                return new r(c4154a, bool);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f27026a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N5.a f27027b;

            b(j jVar, N5.a aVar) {
                this.f27026a = jVar;
                this.f27027b = aVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(r rVar, U5.d dVar) {
                boolean z8;
                Map h8;
                w.a a9;
                C4154a c4154a = (C4154a) rVar.a();
                Boolean bool = (Boolean) rVar.b();
                boolean z9 = false;
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    z8 = false;
                }
                String str = null;
                if (c4154a == null || (h8 = AbstractC4155b.c(c4154a, null, 1, null)) == null) {
                    h8 = Q.h();
                }
                q6.w wVar = this.f27026a.f27010h;
                h.a e8 = ((h.a) this.f27027b.get()).d(ViewModelKt.getViewModelScope(this.f27026a)).f(null).c("").e(null);
                j jVar = this.f27026a;
                if (!z8) {
                    if (c4154a != null && (a9 = c4154a.a()) != null) {
                        str = a9.f();
                    }
                    if (str == null) {
                        z9 = true;
                    }
                }
                wVar.setValue(e8.a(jVar.h(z9)).b(h8).build().a());
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N5.a aVar, U5.d dVar) {
            super(2, dVar);
            this.f27024c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f27024c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27022a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L d8 = A4.g.d(j.this.n(), j.this.f27009g, a.f27025a);
                b bVar = new b(j.this, this.f27024c);
                this.f27022a = 1;
                if (d8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final N5.a f27028a;

        public d(N5.a inputAddressViewModelSubcomponentBuilderProvider) {
            AbstractC3292y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
            this.f27028a = inputAddressViewModelSubcomponentBuilderProvider;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            j a9 = ((G.a) this.f27028a.get()).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return a9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3289v implements Function0 {
        e(Object obj) {
            super(0, obj, j.class, "navigateToAutocompleteScreen", "navigateToAutocompleteScreen()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5503invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5503invoke() {
            ((j) this.receiver).s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f27029a;

        /* renamed from: b, reason: collision with root package name */
        int f27030b;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4154a o8;
            C4154a c4154a;
            w.a a9;
            String b9;
            Object e8 = V5.b.e();
            int i8 = this.f27030b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c4154a = (C4154a) this.f27029a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o8 = j.this.o();
                if (o8 != null) {
                    q6.w wVar = j.this.f27006d;
                    this.f27029a = o8;
                    this.f27030b = 1;
                    if (wVar.emit(o8, this) == e8) {
                        return e8;
                    }
                    c4154a = o8;
                }
                if (o8 != null && (a9 = o8.a()) != null && (b9 = a9.b()) != null) {
                    j.this.r().d(new b.a(b9));
                }
                return I.f8786a;
            }
            o8 = c4154a;
            if (o8 != null) {
                j.this.r().d(new b.a(b9));
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public j(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC4215b eventReporter, N5.a formControllerProvider) {
        C4154a c4154a;
        C4154a b9;
        Boolean h8;
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(navigator, "navigator");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(formControllerProvider, "formControllerProvider");
        this.f27003a = args;
        this.f27004b = navigator;
        this.f27005c = eventReporter;
        w3.e a9 = args.a();
        if (a9 != null) {
            c4154a = a9.b();
        } else {
            c4154a = null;
        }
        q6.w a10 = AbstractC3815N.a(c4154a);
        this.f27006d = a10;
        this.f27007e = a10;
        Boolean bool = Boolean.FALSE;
        q6.w a11 = AbstractC3815N.a(bool);
        this.f27008f = a11;
        this.f27009g = a11;
        q6.w a12 = AbstractC3815N.a(null);
        this.f27010h = a12;
        this.f27011i = a12;
        q6.w a13 = AbstractC3815N.a(Boolean.TRUE);
        this.f27012j = a13;
        this.f27013k = a13;
        q6.w a14 = AbstractC3815N.a(bool);
        this.f27014l = a14;
        this.f27015m = a14;
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new c(formControllerProvider, null), 3, null);
        w3.e a15 = args.a();
        if (a15 != null && (b9 = a15.b()) != null && (h8 = b9.h()) != null) {
            a14.setValue(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3201q0 h(boolean z8) {
        return new C3201q0(AbstractC1435t.e(w3.f.f40702a.a(z8, this.f27003a.a(), new e(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4154a o() {
        InterfaceC3813L c8;
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        w3.i iVar = (w3.i) this.f27011i.getValue();
        String str8 = null;
        if (iVar == null || (c8 = iVar.c()) == null || (map = (Map) c8.getValue()) == null) {
            return null;
        }
        G.b bVar = r4.G.Companion;
        C4156a c4156a = (C4156a) map.get(bVar.r());
        if (c4156a != null) {
            str = c4156a.c();
        } else {
            str = null;
        }
        C4156a c4156a2 = (C4156a) map.get(bVar.k());
        if (c4156a2 != null) {
            str2 = c4156a2.c();
        } else {
            str2 = null;
        }
        C4156a c4156a3 = (C4156a) map.get(bVar.l());
        if (c4156a3 != null) {
            str3 = c4156a3.c();
        } else {
            str3 = null;
        }
        C4156a c4156a4 = (C4156a) map.get(bVar.p());
        if (c4156a4 != null) {
            str4 = c4156a4.c();
        } else {
            str4 = null;
        }
        C4156a c4156a5 = (C4156a) map.get(bVar.q());
        if (c4156a5 != null) {
            str5 = c4156a5.c();
        } else {
            str5 = null;
        }
        C4156a c4156a6 = (C4156a) map.get(bVar.u());
        if (c4156a6 != null) {
            str6 = c4156a6.c();
        } else {
            str6 = null;
        }
        C4156a c4156a7 = (C4156a) map.get(bVar.z());
        if (c4156a7 != null) {
            str7 = c4156a7.c();
        } else {
            str7 = null;
        }
        w.a aVar = new w.a(str2, str3, str4, str5, str6, str7);
        C4156a c4156a8 = (C4156a) map.get(bVar.t());
        if (c4156a8 != null) {
            str8 = c4156a8.c();
        }
        return new C4154a(str, aVar, str8, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    public final void i(boolean z8) {
        this.f27014l.setValue(Boolean.valueOf(z8));
    }

    public final void j(Map map, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C4156a c4156a;
        C4156a c4156a2;
        C4156a c4156a3;
        C4156a c4156a4;
        C4156a c4156a5;
        C4156a c4156a6;
        C4156a c4156a7;
        C4156a c4156a8;
        this.f27012j.setValue(Boolean.FALSE);
        String str8 = null;
        if (map != null && (c4156a8 = (C4156a) map.get(r4.G.Companion.r())) != null) {
            str = c4156a8.c();
        } else {
            str = null;
        }
        if (map != null && (c4156a7 = (C4156a) map.get(r4.G.Companion.k())) != null) {
            str2 = c4156a7.c();
        } else {
            str2 = null;
        }
        if (map != null && (c4156a6 = (C4156a) map.get(r4.G.Companion.l())) != null) {
            str3 = c4156a6.c();
        } else {
            str3 = null;
        }
        if (map != null && (c4156a5 = (C4156a) map.get(r4.G.Companion.p())) != null) {
            str4 = c4156a5.c();
        } else {
            str4 = null;
        }
        if (map != null && (c4156a4 = (C4156a) map.get(r4.G.Companion.q())) != null) {
            str5 = c4156a4.c();
        } else {
            str5 = null;
        }
        if (map != null && (c4156a3 = (C4156a) map.get(r4.G.Companion.u())) != null) {
            str6 = c4156a3.c();
        } else {
            str6 = null;
        }
        if (map != null && (c4156a2 = (C4156a) map.get(r4.G.Companion.z())) != null) {
            str7 = c4156a2.c();
        } else {
            str7 = null;
        }
        w.a aVar = new w.a(str2, str3, str4, str5, str6, str7);
        if (map != null && (c4156a = (C4156a) map.get(r4.G.Companion.t())) != null) {
            str8 = c4156a.c();
        }
        k(new C4154a(str, aVar, str8, Boolean.valueOf(z8)));
    }

    public final void k(C4154a addressDetails) {
        String b9;
        String str;
        boolean z8;
        w.a a9;
        AbstractC3292y.i(addressDetails, "addressDetails");
        w.a a10 = addressDetails.a();
        if (a10 != null && (b9 = a10.b()) != null) {
            InterfaceC4215b interfaceC4215b = this.f27005c;
            C4154a c4154a = (C4154a) this.f27007e.getValue();
            if (c4154a != null && (a9 = c4154a.a()) != null) {
                str = a9.f();
            } else {
                str = null;
            }
            if (str != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            interfaceC4215b.b(b9, z8, Integer.valueOf(w3.g.b(addressDetails, (C4154a) this.f27007e.getValue())));
        }
        this.f27004b.a(new d.b(addressDetails));
    }

    public final AddressElementActivityContract.a l() {
        return this.f27003a;
    }

    public final InterfaceC3813L m() {
        return this.f27015m;
    }

    public final InterfaceC3813L n() {
        return this.f27007e;
    }

    public final InterfaceC3813L p() {
        return this.f27011i;
    }

    public final InterfaceC3813L q() {
        return this.f27013k;
    }

    public final com.stripe.android.paymentsheet.addresselement.a r() {
        return this.f27004b;
    }
}
