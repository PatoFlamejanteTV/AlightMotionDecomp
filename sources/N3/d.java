package N3;

import Q5.I;
import Q5.s;
import Q5.t;
import R5.AbstractC1435t;
import c3.C2024d;
import c3.C2027g;
import c6.InterfaceC2072n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import g3.y;
import j4.C3171b0;
import j4.C3173c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import n6.M;
import n6.U;
import p3.i;
import q6.AbstractC3823h;
import v3.q;
import z3.InterfaceC4267a;

/* loaded from: classes4.dex */
public final class d implements N3.h {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f6454a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f6455b;

    /* renamed from: c, reason: collision with root package name */
    private final M3.e f6456c;

    /* renamed from: d, reason: collision with root package name */
    private final M3.c f6457d;

    /* renamed from: e, reason: collision with root package name */
    private final C2024d f6458e;

    /* renamed from: f, reason: collision with root package name */
    private final v2.d f6459f;

    /* renamed from: g, reason: collision with root package name */
    private final EventReporter f6460g;

    /* renamed from: h, reason: collision with root package name */
    private final p3.i f6461h;

    /* renamed from: i, reason: collision with root package name */
    private final U5.g f6462i;

    /* renamed from: j, reason: collision with root package name */
    private final N3.f f6463j;

    /* renamed from: k, reason: collision with root package name */
    private final Q2.d f6464k;

    /* renamed from: l, reason: collision with root package name */
    private final C3173c0 f6465l;

    /* renamed from: m, reason: collision with root package name */
    private final E2.h f6466m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC4267a f6467n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: N3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0120a implements a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f6468d = j.d.f25503d;

            /* renamed from: a, reason: collision with root package name */
            private final j.d f6469a;

            /* renamed from: b, reason: collision with root package name */
            private final String f6470b;

            /* renamed from: c, reason: collision with root package name */
            private final String f6471c;

            public C0120a(j.d elementsSessionCustomer) {
                AbstractC3292y.i(elementsSessionCustomer, "elementsSessionCustomer");
                this.f6469a = elementsSessionCustomer;
                this.f6470b = elementsSessionCustomer.b().f();
                this.f6471c = elementsSessionCustomer.b().a();
            }

            @Override // N3.d.a
            public String a() {
                return this.f6471c;
            }

            public final j.d b() {
                return this.f6469a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0120a) && AbstractC3292y.d(this.f6469a, ((C0120a) obj).f6469a)) {
                    return true;
                }
                return false;
            }

            @Override // N3.d.a
            public String getId() {
                return this.f6470b;
            }

            public int hashCode() {
                return this.f6469a.hashCode();
            }

            public String toString() {
                return "CustomerSession(elementsSessionCustomer=" + this.f6469a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final w.i f6472a;

            /* renamed from: b, reason: collision with root package name */
            private final w.h.b f6473b;

            /* renamed from: c, reason: collision with root package name */
            private final String f6474c;

            /* renamed from: d, reason: collision with root package name */
            private final String f6475d;

            public b(w.i customerConfig, w.h.b accessType) {
                AbstractC3292y.i(customerConfig, "customerConfig");
                AbstractC3292y.i(accessType, "accessType");
                this.f6472a = customerConfig;
                this.f6473b = accessType;
                this.f6474c = customerConfig.getId();
                this.f6475d = accessType.a();
            }

            @Override // N3.d.a
            public String a() {
                return this.f6475d;
            }

            public final w.h.b b() {
                return this.f6473b;
            }

            public final w.i c() {
                return this.f6472a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (AbstractC3292y.d(this.f6472a, bVar.f6472a) && AbstractC3292y.d(this.f6473b, bVar.f6473b)) {
                    return true;
                }
                return false;
            }

            @Override // N3.d.a
            public String getId() {
                return this.f6474c;
            }

            public int hashCode() {
                return (this.f6472a.hashCode() * 31) + this.f6473b.hashCode();
            }

            public String toString() {
                return "Legacy(customerConfig=" + this.f6472a + ", accessType=" + this.f6473b + ")";
            }
        }

        String a();

        String getId();
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6476a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6477b;

        static {
            int[] iArr = new int[T2.a.values().length];
            try {
                iArr[T2.a.f9960a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T2.a.f9961b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T2.a.f9962c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[T2.a.f9963d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[T2.a.f9964e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6476a = iArr;
            int[] iArr2 = new int[w.k.c.values().length];
            try {
                iArr2[w.k.c.f27982a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w.k.c.f27983b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f6477b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6478a;

        /* renamed from: b, reason: collision with root package name */
        Object f6479b;

        /* renamed from: c, reason: collision with root package name */
        Object f6480c;

        /* renamed from: d, reason: collision with root package name */
        Object f6481d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f6482e;

        /* renamed from: g, reason: collision with root package name */
        int f6484g;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6482e = obj;
            this.f6484g |= Integer.MIN_VALUE;
            return d.this.v(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0121d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6485a;

        /* renamed from: b, reason: collision with root package name */
        Object f6486b;

        /* renamed from: c, reason: collision with root package name */
        Object f6487c;

        /* renamed from: d, reason: collision with root package name */
        Object f6488d;

        /* renamed from: e, reason: collision with root package name */
        Object f6489e;

        /* renamed from: f, reason: collision with root package name */
        Object f6490f;

        /* renamed from: g, reason: collision with root package name */
        boolean f6491g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f6492h;

        /* renamed from: j, reason: collision with root package name */
        int f6494j;

        C0121d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6492h = obj;
            this.f6494j |= Integer.MIN_VALUE;
            return d.this.w(null, null, null, null, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6495a;

        /* renamed from: c, reason: collision with root package name */
        int f6497c;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6495a = obj;
            this.f6497c |= Integer.MIN_VALUE;
            return d.this.A(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6498a;

        /* renamed from: c, reason: collision with root package name */
        int f6500c;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6498a = obj;
            this.f6500c |= Integer.MIN_VALUE;
            Object a9 = d.this.a(null, null, false, false, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3289v implements Function1 {
        g(Object obj) {
            super(1, obj, d.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable p02) {
            AbstractC3292y.i(p02, "p0");
            ((d) this.receiver).F(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f6501a;

        /* renamed from: b, reason: collision with root package name */
        Object f6502b;

        /* renamed from: c, reason: collision with root package name */
        Object f6503c;

        /* renamed from: d, reason: collision with root package name */
        Object f6504d;

        /* renamed from: e, reason: collision with root package name */
        Object f6505e;

        /* renamed from: f, reason: collision with root package name */
        boolean f6506f;

        /* renamed from: g, reason: collision with root package name */
        int f6507g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f6508h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f6510j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ w.g f6511k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w.l f6512l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f6513m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            Object f6514a;

            /* renamed from: b, reason: collision with root package name */
            Object f6515b;

            /* renamed from: c, reason: collision with root package name */
            int f6516c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f6517d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f6518e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ U f6519f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ U f6520g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, a aVar, U u8, U u9, U5.d dVar2) {
                super(2, dVar2);
                this.f6517d = dVar;
                this.f6518e = aVar;
                this.f6519f = u8;
                this.f6520g = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f6517d, this.f6518e, this.f6519f, this.f6520g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                d dVar;
                Object e8 = V5.b.e();
                int i8 = this.f6516c;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.f6515b;
                    dVar = (d) this.f6514a;
                    t.b(obj);
                } else {
                    t.b(obj);
                    d dVar2 = this.f6517d;
                    aVar = this.f6518e;
                    U u8 = this.f6519f;
                    this.f6514a = dVar2;
                    this.f6515b = aVar;
                    this.f6516c = 1;
                    Object h8 = u8.h(this);
                    if (h8 == e8) {
                        return e8;
                    }
                    dVar = dVar2;
                    obj = h8;
                }
                U u9 = this.f6520g;
                this.f6514a = null;
                this.f6515b = null;
                this.f6516c = 2;
                obj = dVar.v(aVar, (C2752d) obj, u9, this);
                if (obj == e8) {
                    return e8;
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6521a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f6522b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f6523c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f6524d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, U u8, U u9, U5.d dVar2) {
                super(2, dVar2);
                this.f6522b = dVar;
                this.f6523c = u8;
                this.f6524d = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f6522b, this.f6523c, this.f6524d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f6521a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f6522b;
                    U u8 = this.f6523c;
                    U u9 = this.f6524d;
                    this.f6521a = 1;
                    obj = dVar.J(u8, u9, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6525a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f6526b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f6527c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w.g f6528d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f6529e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, com.stripe.android.model.j jVar, w.g gVar, a aVar, U5.d dVar2) {
                super(2, dVar2);
                this.f6526b = dVar;
                this.f6527c = jVar;
                this.f6528d = gVar;
                this.f6529e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f6526b, this.f6527c, this.f6528d, this.f6529e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f6525a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f6526b;
                    com.stripe.android.model.j jVar = this.f6527c;
                    w.g gVar = this.f6528d;
                    a aVar = this.f6529e;
                    this.f6525a = 1;
                    obj = dVar.y(jVar, gVar, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N3.d$h$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0122d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U f6531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f6532c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w.g f6533d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f6534e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f6535f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0122d(U u8, d dVar, w.g gVar, com.stripe.android.model.j jVar, boolean z8, U5.d dVar2) {
                super(2, dVar2);
                this.f6531b = u8;
                this.f6532c = dVar;
                this.f6533d = gVar;
                this.f6534e = jVar;
                this.f6535f = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0122d(this.f6531b, this.f6532c, this.f6533d, this.f6534e, this.f6535f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f6530a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    U u8 = this.f6531b;
                    this.f6530a = 1;
                    obj = u8.h(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return this.f6532c.z(this.f6533d, this.f6534e, (N3.g) obj, this.f6535f);
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0122d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6536a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f6537b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w.g f6538c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f6539d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f6540e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(d dVar, w.g gVar, boolean z8, com.stripe.android.model.j jVar, U5.d dVar2) {
                super(2, dVar2);
                this.f6537b = dVar;
                this.f6538c = gVar;
                this.f6539d = z8;
                this.f6540e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f6537b, this.f6538c, this.f6539d, this.f6540e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f6536a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f6537b;
                    w.g gVar = this.f6538c;
                    boolean z8 = this.f6539d;
                    com.stripe.android.model.j jVar = this.f6540e;
                    this.f6536a = 1;
                    obj = dVar.L(gVar, z8, jVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, w.g gVar, w.l lVar, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f6510j = z8;
            this.f6511k = gVar;
            this.f6512l = lVar;
            this.f6513m = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            h hVar = new h(this.f6510j, this.f6511k, this.f6512l, this.f6513m, dVar);
            hVar.f6508h = obj;
            return hVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x027e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x024e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x022c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x013b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 704
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N3.d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6541a;

        /* renamed from: b, reason: collision with root package name */
        Object f6542b;

        /* renamed from: c, reason: collision with root package name */
        Object f6543c;

        /* renamed from: d, reason: collision with root package name */
        Object f6544d;

        /* renamed from: e, reason: collision with root package name */
        boolean f6545e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6546f;

        /* renamed from: h, reason: collision with root package name */
        int f6548h;

        i(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6546f = obj;
            this.f6548h |= Integer.MIN_VALUE;
            return d.this.D(null, null, null, null, false, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6549a;

        /* renamed from: c, reason: collision with root package name */
        int f6551c;

        j(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6549a = obj;
            this.f6551c |= Integer.MIN_VALUE;
            return d.this.H(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6552a;

        /* renamed from: c, reason: collision with root package name */
        int f6554c;

        k(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6552a = obj;
            this.f6554c |= Integer.MIN_VALUE;
            Object I8 = d.this.I(null, null, null, null, this);
            if (I8 == V5.b.e()) {
                return I8;
            }
            return s.a(I8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6555a;

        /* renamed from: b, reason: collision with root package name */
        Object f6556b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6557c;

        /* renamed from: e, reason: collision with root package name */
        int f6559e;

        l(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6557c = obj;
            this.f6559e |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6560a;

        /* renamed from: c, reason: collision with root package name */
        int f6562c;

        m(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6560a = obj;
            this.f6562c |= Integer.MIN_VALUE;
            return d.this.K(null, this);
        }
    }

    public d(Function1 prefsRepositoryFactory, Function1 googlePayRepositoryFactory, M3.e elementsSessionRepository, M3.c customerRepository, C2024d lpmRepository, v2.d logger, EventReporter eventReporter, p3.i errorReporter, U5.g workContext, N3.f accountStatusProvider, Q2.d linkStore, C3173c0 externalPaymentMethodsRepository, E2.h userFacingLogger, InterfaceC4267a cvcRecollectionHandler) {
        AbstractC3292y.i(prefsRepositoryFactory, "prefsRepositoryFactory");
        AbstractC3292y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3292y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3292y.i(customerRepository, "customerRepository");
        AbstractC3292y.i(lpmRepository, "lpmRepository");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(accountStatusProvider, "accountStatusProvider");
        AbstractC3292y.i(linkStore, "linkStore");
        AbstractC3292y.i(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        AbstractC3292y.i(userFacingLogger, "userFacingLogger");
        AbstractC3292y.i(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.f6454a = prefsRepositoryFactory;
        this.f6455b = googlePayRepositoryFactory;
        this.f6456c = elementsSessionRepository;
        this.f6457d = customerRepository;
        this.f6458e = lpmRepository;
        this.f6459f = logger;
        this.f6460g = eventReporter;
        this.f6461h = errorReporter;
        this.f6462i = workContext;
        this.f6463j = accountStatusProvider;
        this.f6464k = linkStore;
        this.f6465l = externalPaymentMethodsRepository;
        this.f6466m = userFacingLogger;
        this.f6467n = cvcRecollectionHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(com.stripe.android.paymentsheet.w.g r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof N3.d.e
            if (r0 == 0) goto L13
            r0 = r7
            N3.d$e r0 = (N3.d.e) r0
            int r1 = r0.f6497c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6497c = r1
            goto L18
        L13:
            N3.d$e r0 = new N3.d$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6495a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6497c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            Q5.t.b(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Q5.t.b(r7)
            com.stripe.android.paymentsheet.w$k r6 = r6.u()
            if (r6 == 0) goto L7b
            com.stripe.android.paymentsheet.w$k$c r6 = r6.h()
            if (r6 == 0) goto L7b
            kotlin.jvm.functions.Function1 r7 = r5.f6455b
            int[] r2 = N3.d.b.f6477b
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L59
            r2 = 2
            if (r6 != r2) goto L53
            N2.d r6 = N2.d.f6436c
            goto L5b
        L53:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        L59:
            N2.d r6 = N2.d.f6435b
        L5b:
            java.lang.Object r6 = r7.invoke(r6)
            com.stripe.android.googlepaylauncher.n r6 = (com.stripe.android.googlepaylauncher.n) r6
            if (r6 == 0) goto L7b
            q6.f r6 = r6.isReady()
            if (r6 == 0) goto L7b
            r0.f6497c = r4
            java.lang.Object r7 = q6.AbstractC3823h.w(r6, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L7b
            r3 = 1
        L7b:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.A(com.stripe.android.paymentsheet.w$g, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(w.g gVar, com.stripe.android.model.j jVar, U5.d dVar) {
        if (jVar.x()) {
            return A(gVar, dVar);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(U5.d dVar) {
        return AbstractC3823h.w(((com.stripe.android.googlepaylauncher.n) this.f6455b.invoke(N2.d.f6435b)).isReady(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(com.stripe.android.paymentsheet.w.g r17, N3.d.a r18, com.stripe.android.model.j r19, java.lang.String r20, boolean r21, boolean r22, java.util.Map r23, U5.d r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.D(com.stripe.android.paymentsheet.w$g, N3.d$a, com.stripe.android.model.j, java.lang.String, boolean, boolean, java.util.Map, U5.d):java.lang.Object");
    }

    private final void E(List list, List list2) {
        ArrayList arrayList;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            if (list2 != null) {
                List list4 = list2;
                arrayList = new ArrayList(AbstractC1435t.x(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3171b0) it.next()).getType());
                }
            } else {
                arrayList = null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (arrayList == null || !arrayList.contains(str)) {
                    this.f6466m.a("Requested external payment method " + str + " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Throwable th) {
        this.f6459f.a("Failure loading PaymentSheetState", th);
        this.f6460g.p(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(com.stripe.android.model.j jVar, N3.l lVar, boolean z8, boolean z9, w.l lVar2) {
        boolean z10;
        y yVar;
        Throwable v8 = jVar.v();
        if (v8 != null) {
            this.f6460g.m(v8);
        }
        if (lVar.p().K() && !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (lVar.s() != null && z10) {
            this.f6460g.p(lVar.s());
            return;
        }
        EventReporter eventReporter = this.f6460g;
        j.e p8 = jVar.p();
        if (p8 != null) {
            yVar = p8.f();
        } else {
            yVar = null;
        }
        y yVar2 = yVar;
        String a9 = D3.c.a(jVar.w());
        D3.f i8 = lVar.i();
        List e02 = lVar.h().e0();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(e02, 10));
        Iterator it = e02.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2027g) it.next()).d());
        }
        eventReporter.e(i8, yVar2, z9, a9, lVar2, arrayList, this.f6467n.c(lVar.h().W(), lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(d3.C2752d r7, com.stripe.android.paymentsheet.w.i r8, U5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof N3.d.j
            if (r0 == 0) goto L13
            r0 = r9
            N3.d$j r0 = (N3.d.j) r0
            int r1 = r0.f6551c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6551c = r1
            goto L18
        L13:
            N3.d$j r0 = new N3.d$j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6549a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6551c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r7 = r9.j()
            goto L5e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            Q5.t.b(r9)
            java.util.List r9 = r7.i0()
            M3.c r2 = r6.f6457d
            M3.c$a r4 = new M3.c$a
            java.lang.String r5 = r8.getId()
            java.lang.String r8 = r8.b()
            r4.<init>(r5, r8)
            com.stripe.android.model.StripeIntent r7 = r7.W()
            boolean r7 = r7.c()
            r0.f6551c = r3
            java.lang.Object r7 = r2.c(r4, r9, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            Q5.t.b(r7)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L6e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L85
            java.lang.Object r9 = r7.next()
            r0 = r9
            com.stripe.android.model.o r0 = (com.stripe.android.model.o) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L6e
            r8.add(r9)
            goto L6e
        L85:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.H(d3.d, com.stripe.android.paymentsheet.w$i, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(com.stripe.android.paymentsheet.w.l r8, com.stripe.android.paymentsheet.w.i r9, java.util.List r10, java.lang.String r11, U5.d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof N3.d.k
            if (r0 == 0) goto L14
            r0 = r12
            N3.d$k r0 = (N3.d.k) r0
            int r1 = r0.f6554c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6554c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            N3.d$k r0 = new N3.d$k
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f6552a
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.f6554c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            Q5.t.b(r12)
            Q5.s r12 = (Q5.s) r12
            java.lang.Object r8 = r12.j()
            goto L4b
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            Q5.t.b(r12)
            M3.e r1 = r7.f6456c
            r6.f6554c = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.I(com.stripe.android.paymentsheet.w$l, com.stripe.android.paymentsheet.w$i, java.util.List, java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J(n6.U r8, n6.U r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.J(n6.U, n6.U, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(com.stripe.android.paymentsheet.w.g r6, U5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof N3.d.m
            if (r0 == 0) goto L13
            r0 = r7
            N3.d$m r0 = (N3.d.m) r0
            int r1 = r0.f6562c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6562c = r1
            goto L18
        L13:
            N3.d$m r0 = new N3.d$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6560a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6562c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            Q5.t.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Q5.t.b(r7)
            com.stripe.android.paymentsheet.w$i r7 = r6.l()
            if (r7 == 0) goto L40
            com.stripe.android.paymentsheet.w$h r7 = r7.a()
            goto L41
        L40:
            r7 = r4
        L41:
            boolean r2 = r7 instanceof com.stripe.android.paymentsheet.w.h.a
            if (r2 == 0) goto L57
            r0.f6562c = r3
            r7 = 0
            java.lang.Object r7 = r5.M(r6, r7, r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = r7 instanceof D3.i.d
            if (r6 == 0) goto L5e
            r4 = r7
            D3.i$d r4 = (D3.i.d) r4
            goto L5e
        L57:
            boolean r6 = r7 instanceof com.stripe.android.paymentsheet.w.h.b
            if (r6 == 0) goto L5c
            goto L5e
        L5c:
            if (r7 != 0) goto L5f
        L5e:
            return r4
        L5f:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.K(com.stripe.android.paymentsheet.w$g, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(w.g gVar, boolean z8, com.stripe.android.model.j jVar, U5.d dVar) {
        return M(gVar, z8, jVar.y(), dVar);
    }

    private final Object M(w.g gVar, boolean z8, boolean z9, U5.d dVar) {
        return ((q) this.f6454a.invoke(gVar.l())).b(z8, z9, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(C2752d c2752d) {
        return !c2752d.h0().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(StripeIntent stripeIntent) {
        if (stripeIntent.F().isEmpty()) {
            return;
        }
        this.f6459f.c("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + stripeIntent.F() + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a u(w.g gVar, com.stripe.android.model.j jVar) {
        w.h hVar;
        w.i l8 = gVar.l();
        if (l8 != null) {
            hVar = l8.a();
        } else {
            hVar = null;
        }
        if (hVar instanceof w.h.a) {
            j.d b9 = jVar.b();
            if (b9 != null) {
                return new a.C0120a(b9);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
            i.b.a(this.f6461h, i.f.f36243n, x2.k.f40948e.b(illegalStateException), null, 4, null);
            if (jVar.w().c()) {
                return null;
            }
            throw illegalStateException;
        }
        if (!(hVar instanceof w.h.b)) {
            return null;
        }
        return new a.b(l8, (w.h.b) hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(N3.d.a r10, d3.C2752d r11, n6.U r12, U5.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof N3.d.c
            if (r0 == 0) goto L13
            r0 = r13
            N3.d$c r0 = (N3.d.c) r0
            int r1 = r0.f6484g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6484g = r1
            goto L18
        L13:
            N3.d$c r0 = new N3.d$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6482e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f6484g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r10 = r0.f6479b
            N3.a r10 = (N3.a) r10
            java.lang.Object r11 = r0.f6478a
            java.util.List r11 = (java.util.List) r11
            Q5.t.b(r13)
        L34:
            r2 = r10
            goto Lb5
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            java.lang.Object r10 = r0.f6481d
            com.stripe.android.paymentsheet.w$h$b r10 = (com.stripe.android.paymentsheet.w.h.b) r10
            java.lang.Object r11 = r0.f6480c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f6479b
            N3.a$a r12 = (N3.a.C0118a) r12
            java.lang.Object r2 = r0.f6478a
            n6.U r2 = (n6.U) r2
            Q5.t.b(r13)
            goto L95
        L53:
            Q5.t.b(r13)
            boolean r13 = r10 instanceof N3.d.a.C0120a
            if (r13 == 0) goto L6b
            N3.a$a r13 = N3.a.f6444e
            N3.d$a$a r10 = (N3.d.a.C0120a) r10
            com.stripe.android.model.j$d r10 = r10.b()
            java.util.List r11 = r11.i0()
            N3.a r10 = r13.a(r10, r11)
            goto L9e
        L6b:
            boolean r13 = r10 instanceof N3.d.a.b
            if (r13 == 0) goto L9d
            N3.a$a r13 = N3.a.f6444e
            N3.d$a$b r10 = (N3.d.a.b) r10
            java.lang.String r2 = r10.getId()
            com.stripe.android.paymentsheet.w$h$b r6 = r10.b()
            com.stripe.android.paymentsheet.w$i r10 = r10.c()
            r0.f6478a = r12
            r0.f6479b = r13
            r0.f6480c = r2
            r0.f6481d = r6
            r0.f6484g = r4
            java.lang.Object r10 = r9.H(r11, r10, r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            r11 = r2
            r2 = r12
            r12 = r13
            r13 = r10
            r10 = r6
        L95:
            java.util.List r13 = (java.util.List) r13
            N3.a r10 = r12.b(r11, r10, r13)
            r12 = r2
            goto L9e
        L9d:
            r10 = r5
        L9e:
            if (r10 == 0) goto Lc5
            java.util.List r11 = r10.h()
            r0.f6478a = r11
            r0.f6479b = r10
            r0.f6480c = r5
            r0.f6481d = r5
            r0.f6484g = r3
            java.lang.Object r13 = r12.h(r0)
            if (r13 != r1) goto L34
            return r1
        Lb5:
            D3.i r13 = (D3.i) r13
            java.util.List r5 = N3.i.b(r11, r13)
            r7 = 11
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            N3.a r5 = N3.a.b(r2, r3, r4, r5, r6, r7, r8)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.v(N3.d$a, d3.d, n6.U, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(com.stripe.android.paymentsheet.w.g r21, N3.d.a r22, com.stripe.android.model.j r23, java.lang.String r24, boolean r25, java.util.Map r26, U5.d r27) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.w(com.stripe.android.paymentsheet.w$g, N3.d$a, com.stripe.android.model.j, java.lang.String, boolean, java.util.Map, U5.d):java.lang.Object");
    }

    private final f3.b x(N3.g gVar) {
        Y2.k b9;
        if (gVar == null || (b9 = gVar.b()) == null) {
            return null;
        }
        return new f3.b(b9, gVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(com.stripe.android.model.j jVar, w.g gVar, a aVar, U5.d dVar) {
        if (jVar.y() && !gVar.i().f()) {
            Object D8 = D(gVar, aVar, jVar, jVar.s(), jVar.l(), jVar.f(), jVar.i(), dVar);
            if (D8 == V5.b.e()) {
                return D8;
            }
            return (N3.g) D8;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2752d z(w.g gVar, com.stripe.android.model.j jVar, N3.g gVar2, boolean z8) {
        C2024d.a b9 = this.f6458e.b(jVar.w(), jVar.u());
        if (b9.b()) {
            this.f6460g.r(b9.a());
        }
        List a9 = this.f6465l.a(jVar.h());
        E(gVar.s(), a9);
        return C2752d.f31307q.b(jVar, gVar, b9.c(), a9, z8, x(gVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // N3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.w.l r15, com.stripe.android.paymentsheet.w.g r16, boolean r17, boolean r18, U5.d r19) {
        /*
            r14 = this;
            r7 = r14
            r0 = r19
            boolean r1 = r0 instanceof N3.d.f
            if (r1 == 0) goto L17
            r1 = r0
            N3.d$f r1 = (N3.d.f) r1
            int r2 = r1.f6500c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f6500c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            N3.d$f r1 = new N3.d$f
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f6498a
            java.lang.Object r9 = V5.b.e()
            int r1 = r8.f6500c
            r10 = 1
            if (r1 == 0) goto L3c
            if (r1 != r10) goto L34
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto L5e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            Q5.t.b(r0)
            U5.g r11 = r7.f6462i
            N3.d$g r12 = new N3.d$g
            r12.<init>(r14)
            N3.d$h r13 = new N3.d$h
            r6 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r16
            r4 = r15
            r5 = r17
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f6500c = r10
            java.lang.Object r0 = s2.AbstractC3945a.a(r11, r12, r13, r8)
            if (r0 != r9) goto L5e
            return r9
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.d.a(com.stripe.android.paymentsheet.w$l, com.stripe.android.paymentsheet.w$g, boolean, boolean, U5.d):java.lang.Object");
    }
}
