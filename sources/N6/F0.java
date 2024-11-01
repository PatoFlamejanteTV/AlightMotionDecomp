package n6;

import Q5.AbstractC1410e;
import U5.g;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC3257i;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import s6.AbstractC3996p;
import s6.C3980F;
import s6.C3997q;

/* loaded from: classes5.dex */
public class F0 implements InterfaceC3488x0, InterfaceC3485w, O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35630a = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35631b = AtomicReferenceFieldUpdater.newUpdater(F0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a extends C3472p {

        /* renamed from: i, reason: collision with root package name */
        private final F0 f35632i;

        public a(U5.d dVar, F0 f02) {
            super(dVar, 1);
            this.f35632i = f02;
        }

        @Override // n6.C3472p
        protected String I() {
            return "AwaitContinuation";
        }

        @Override // n6.C3472p
        public Throwable w(InterfaceC3488x0 interfaceC3488x0) {
            Throwable e8;
            Object d02 = this.f35632i.d0();
            if ((d02 instanceof c) && (e8 = ((c) d02).e()) != null) {
                return e8;
            }
            if (d02 instanceof C3437C) {
                return ((C3437C) d02).f35626a;
            }
            return interfaceC3488x0.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends E0 {

        /* renamed from: e, reason: collision with root package name */
        private final F0 f35633e;

        /* renamed from: f, reason: collision with root package name */
        private final c f35634f;

        /* renamed from: g, reason: collision with root package name */
        private final C3483v f35635g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f35636h;

        public b(F0 f02, c cVar, C3483v c3483v, Object obj) {
            this.f35633e = f02;
            this.f35634f = cVar;
            this.f35635g = c3483v;
            this.f35636h = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return Q5.I.f8786a;
        }

        @Override // n6.AbstractC3439E
        public void r(Throwable th) {
            this.f35633e.S(this.f35634f, this.f35635g, this.f35636h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC3478s0 {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f35637b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f35638c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f35639d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a, reason: collision with root package name */
        private final K0 f35640a;

        public c(K0 k02, boolean z8, Throwable th) {
            this.f35640a = k02;
            this._isCompleting = z8 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f35639d.get(this);
        }

        private final void k(Object obj) {
            f35639d.set(this, obj);
        }

        @Override // n6.InterfaceC3478s0
        public K0 a() {
            return this.f35640a;
        }

        public final void b(Throwable th) {
            Throwable e8 = e();
            if (e8 == null) {
                l(th);
                return;
            }
            if (th == e8) {
                return;
            }
            Object d8 = d();
            if (d8 == null) {
                k(th);
                return;
            }
            if (d8 instanceof Throwable) {
                if (th == d8) {
                    return;
                }
                ArrayList c8 = c();
                c8.add(d8);
                c8.add(th);
                k(c8);
                return;
            }
            if (d8 instanceof ArrayList) {
                ((ArrayList) d8).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d8).toString());
        }

        public final Throwable e() {
            return (Throwable) f35638c.get(this);
        }

        public final boolean f() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            if (f35637b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            C3980F c3980f;
            Object d8 = d();
            c3980f = G0.f35652e;
            if (d8 == c3980f) {
                return true;
            }
            return false;
        }

        public final List i(Throwable th) {
            ArrayList arrayList;
            C3980F c3980f;
            Object d8 = d();
            if (d8 == null) {
                arrayList = c();
            } else if (d8 instanceof Throwable) {
                ArrayList c8 = c();
                c8.add(d8);
                arrayList = c8;
            } else if (d8 instanceof ArrayList) {
                arrayList = (ArrayList) d8;
            } else {
                throw new IllegalStateException(("State is " + d8).toString());
            }
            Throwable e8 = e();
            if (e8 != null) {
                arrayList.add(0, e8);
            }
            if (th != null && !AbstractC3292y.d(th, e8)) {
                arrayList.add(th);
            }
            c3980f = G0.f35652e;
            k(c3980f);
            return arrayList;
        }

        @Override // n6.InterfaceC3478s0
        public boolean isActive() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final void j(boolean z8) {
            f35637b.set(this, z8 ? 1 : 0);
        }

        public final void l(Throwable th) {
            f35638c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends C3997q.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0 f35641d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f35642e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3997q c3997q, F0 f02, Object obj) {
            super(c3997q);
            this.f35641d = f02;
            this.f35642e = obj;
        }

        @Override // s6.AbstractC3982b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(C3997q c3997q) {
            if (this.f35641d.d0() == this.f35642e) {
                return null;
            }
            return AbstractC3996p.a();
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f35643a;

        /* renamed from: b, reason: collision with root package name */
        Object f35644b;

        /* renamed from: c, reason: collision with root package name */
        int f35645c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35646d;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            e eVar = new e(dVar);
            eVar.f35646d = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r6.f35645c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f35644b
                s6.q r1 = (s6.C3997q) r1
                java.lang.Object r3 = r6.f35643a
                s6.o r3 = (s6.AbstractC3995o) r3
                java.lang.Object r4 = r6.f35646d
                k6.i r4 = (k6.AbstractC3257i) r4
                Q5.t.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                Q5.t.b(r7)
                goto L86
            L2a:
                Q5.t.b(r7)
                java.lang.Object r7 = r6.f35646d
                k6.i r7 = (k6.AbstractC3257i) r7
                n6.F0 r1 = n6.F0.this
                java.lang.Object r1 = r1.d0()
                boolean r4 = r1 instanceof n6.C3483v
                if (r4 == 0) goto L48
                n6.v r1 = (n6.C3483v) r1
                n6.w r1 = r1.f35753e
                r6.f35645c = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof n6.InterfaceC3478s0
                if (r3 == 0) goto L86
                n6.s0 r1 = (n6.InterfaceC3478s0) r1
                n6.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.AbstractC3292y.g(r3, r4)
                s6.q r3 = (s6.C3997q) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.AbstractC3292y.d(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof n6.C3483v
                if (r7 == 0) goto L81
                r7 = r1
                n6.v r7 = (n6.C3483v) r7
                n6.w r7 = r7.f35753e
                r6.f35646d = r4
                r6.f35643a = r3
                r6.f35644b = r1
                r6.f35645c = r2
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                s6.q r1 = r1.k()
                goto L63
            L86:
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n6.F0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AbstractC3257i abstractC3257i, U5.d dVar) {
            return ((e) create(abstractC3257i, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public F0(boolean z8) {
        this._state = z8 ? G0.f35654g : G0.f35653f;
    }

    private final String A0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (!cVar.g()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof InterfaceC3478s0) {
            if (((InterfaceC3478s0) obj).isActive()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C3437C) {
            return "Cancelled";
        }
        return "Completed";
    }

    public static /* synthetic */ CancellationException C0(F0 f02, Throwable th, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                str = null;
            }
            return f02.B0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean E0(InterfaceC3478s0 interfaceC3478s0, Object obj) {
        if (!androidx.concurrent.futures.a.a(f35630a, this, interfaceC3478s0, G0.g(obj))) {
            return false;
        }
        s0(null);
        t0(obj);
        R(interfaceC3478s0, obj);
        return true;
    }

    private final boolean F(Object obj, K0 k02, E0 e02) {
        int q8;
        d dVar = new d(e02, this, obj);
        do {
            q8 = k02.l().q(e02, k02, dVar);
            if (q8 == 1) {
                return true;
            }
        } while (q8 != 2);
        return false;
    }

    private final boolean F0(InterfaceC3478s0 interfaceC3478s0, Throwable th) {
        K0 b02 = b0(interfaceC3478s0);
        if (b02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f35630a, this, interfaceC3478s0, new c(b02, false, th))) {
            return false;
        }
        q0(b02, th);
        return true;
    }

    private final void G(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC1410e.a(th, th2);
            }
        }
    }

    private final Object G0(Object obj, Object obj2) {
        C3980F c3980f;
        C3980F c3980f2;
        if (!(obj instanceof InterfaceC3478s0)) {
            c3980f2 = G0.f35648a;
            return c3980f2;
        }
        if (((obj instanceof C3455g0) || (obj instanceof E0)) && !(obj instanceof C3483v) && !(obj2 instanceof C3437C)) {
            if (!E0((InterfaceC3478s0) obj, obj2)) {
                c3980f = G0.f35650c;
                return c3980f;
            }
            return obj2;
        }
        return H0((InterfaceC3478s0) obj, obj2);
    }

    private final Object H0(InterfaceC3478s0 interfaceC3478s0, Object obj) {
        c cVar;
        C3437C c3437c;
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        K0 b02 = b0(interfaceC3478s0);
        if (b02 == null) {
            c3980f3 = G0.f35650c;
            return c3980f3;
        }
        Throwable th = null;
        if (interfaceC3478s0 instanceof c) {
            cVar = (c) interfaceC3478s0;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(b02, false, null);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        synchronized (cVar) {
            if (cVar.g()) {
                c3980f2 = G0.f35648a;
                return c3980f2;
            }
            cVar.j(true);
            if (cVar != interfaceC3478s0 && !androidx.concurrent.futures.a.a(f35630a, this, interfaceC3478s0, cVar)) {
                c3980f = G0.f35650c;
                return c3980f;
            }
            boolean f8 = cVar.f();
            if (obj instanceof C3437C) {
                c3437c = (C3437C) obj;
            } else {
                c3437c = null;
            }
            if (c3437c != null) {
                cVar.b(c3437c.f35626a);
            }
            Throwable e8 = cVar.e();
            if (true ^ f8) {
                th = e8;
            }
            t8.f34573a = th;
            Q5.I i8 = Q5.I.f8786a;
            if (th != null) {
                q0(b02, th);
            }
            C3483v V8 = V(interfaceC3478s0);
            if (V8 != null && I0(cVar, V8, obj)) {
                return G0.f35649b;
            }
            return U(cVar, obj);
        }
    }

    private final boolean I0(c cVar, C3483v c3483v, Object obj) {
        while (InterfaceC3488x0.a.d(c3483v.f35753e, false, false, new b(this, cVar, c3483v, obj), 1, null) == M0.f35666a) {
            c3483v = p0(c3483v);
            if (c3483v == null) {
                return false;
            }
        }
        return true;
    }

    private final Object J(U5.d dVar) {
        a aVar = new a(V5.b.c(dVar), this);
        aVar.B();
        r.a(aVar, u(new P0(aVar)));
        Object y8 = aVar.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    private final Object N(Object obj) {
        C3980F c3980f;
        Object G02;
        C3980F c3980f2;
        do {
            Object d02 = d0();
            if (!(d02 instanceof InterfaceC3478s0) || ((d02 instanceof c) && ((c) d02).g())) {
                c3980f = G0.f35648a;
                return c3980f;
            }
            G02 = G0(d02, new C3437C(T(obj), false, 2, null));
            c3980f2 = G0.f35650c;
        } while (G02 == c3980f2);
        return G02;
    }

    private final boolean O(Throwable th) {
        if (h0()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC3481u c02 = c0();
        if (c02 != null && c02 != M0.f35666a) {
            if (c02.b(th) || z8) {
                return true;
            }
            return false;
        }
        return z8;
    }

    private final void R(InterfaceC3478s0 interfaceC3478s0, Object obj) {
        C3437C c3437c;
        InterfaceC3481u c02 = c0();
        if (c02 != null) {
            c02.dispose();
            y0(M0.f35666a);
        }
        Throwable th = null;
        if (obj instanceof C3437C) {
            c3437c = (C3437C) obj;
        } else {
            c3437c = null;
        }
        if (c3437c != null) {
            th = c3437c.f35626a;
        }
        if (interfaceC3478s0 instanceof E0) {
            try {
                ((E0) interfaceC3478s0).r(th);
                return;
            } catch (Throwable th2) {
                f0(new C3440F("Exception in completion handler " + interfaceC3478s0 + " for " + this, th2));
                return;
            }
        }
        K0 a9 = interfaceC3478s0.a();
        if (a9 != null) {
            r0(a9, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(c cVar, C3483v c3483v, Object obj) {
        C3483v p02 = p0(c3483v);
        if (p02 != null && I0(cVar, p02, obj)) {
            return;
        }
        H(U(cVar, obj));
    }

    private final Throwable T(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof Throwable;
        }
        if (z8) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C3490y0(P(), null, this);
            }
            return th;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((O0) obj).z();
    }

    private final Object U(c cVar, Object obj) {
        C3437C c3437c;
        Throwable th;
        boolean f8;
        Throwable Y8;
        if (obj instanceof C3437C) {
            c3437c = (C3437C) obj;
        } else {
            c3437c = null;
        }
        if (c3437c != null) {
            th = c3437c.f35626a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            f8 = cVar.f();
            List i8 = cVar.i(th);
            Y8 = Y(cVar, i8);
            if (Y8 != null) {
                G(Y8, i8);
            }
        }
        if (Y8 != null && Y8 != th) {
            obj = new C3437C(Y8, false, 2, null);
        }
        if (Y8 != null && (O(Y8) || e0(Y8))) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C3437C) obj).b();
        }
        if (!f8) {
            s0(Y8);
        }
        t0(obj);
        androidx.concurrent.futures.a.a(f35630a, this, cVar, G0.g(obj));
        R(cVar, obj);
        return obj;
    }

    private final C3483v V(InterfaceC3478s0 interfaceC3478s0) {
        C3483v c3483v;
        if (interfaceC3478s0 instanceof C3483v) {
            c3483v = (C3483v) interfaceC3478s0;
        } else {
            c3483v = null;
        }
        if (c3483v == null) {
            K0 a9 = interfaceC3478s0.a();
            if (a9 == null) {
                return null;
            }
            return p0(a9);
        }
        return c3483v;
    }

    private final Throwable X(Object obj) {
        C3437C c3437c;
        if (obj instanceof C3437C) {
            c3437c = (C3437C) obj;
        } else {
            c3437c = null;
        }
        if (c3437c == null) {
            return null;
        }
        return c3437c.f35626a;
    }

    private final Throwable Y(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.f()) {
                return null;
            }
            return new C3490y0(P(), null, this);
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof Y0) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof Y0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final K0 b0(InterfaceC3478s0 interfaceC3478s0) {
        K0 a9 = interfaceC3478s0.a();
        if (a9 == null) {
            if (interfaceC3478s0 instanceof C3455g0) {
                return new K0();
            }
            if (interfaceC3478s0 instanceof E0) {
                w0((E0) interfaceC3478s0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC3478s0).toString());
        }
        return a9;
    }

    private final boolean i0() {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC3478s0)) {
                return false;
            }
        } while (z0(d02) < 0);
        return true;
    }

    private final Object j0(U5.d dVar) {
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        r.a(c3472p, u(new Q0(c3472p)));
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return Q5.I.f8786a;
    }

    private final Object k0(Object obj) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3980F c3980f6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object d02 = d0();
            if (d02 instanceof c) {
                synchronized (d02) {
                    if (((c) d02).h()) {
                        c3980f2 = G0.f35651d;
                        return c3980f2;
                    }
                    boolean f8 = ((c) d02).f();
                    if (obj != null || !f8) {
                        if (th2 == null) {
                            th2 = T(obj);
                        }
                        ((c) d02).b(th2);
                    }
                    Throwable e8 = ((c) d02).e();
                    if (!f8) {
                        th = e8;
                    }
                    if (th != null) {
                        q0(((c) d02).a(), th);
                    }
                    c3980f = G0.f35648a;
                    return c3980f;
                }
            }
            if (!(d02 instanceof InterfaceC3478s0)) {
                c3980f3 = G0.f35651d;
                return c3980f3;
            }
            if (th2 == null) {
                th2 = T(obj);
            }
            InterfaceC3478s0 interfaceC3478s0 = (InterfaceC3478s0) d02;
            if (interfaceC3478s0.isActive()) {
                if (F0(interfaceC3478s0, th2)) {
                    c3980f4 = G0.f35648a;
                    return c3980f4;
                }
            } else {
                Object G02 = G0(d02, new C3437C(th2, false, 2, null));
                c3980f5 = G0.f35648a;
                if (G02 != c3980f5) {
                    c3980f6 = G0.f35650c;
                    if (G02 != c3980f6) {
                        return G02;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + d02).toString());
                }
            }
        }
    }

    private final E0 n0(Function1 function1, boolean z8) {
        E0 e02 = null;
        if (z8) {
            if (function1 instanceof AbstractC3492z0) {
                e02 = (AbstractC3492z0) function1;
            }
            if (e02 == null) {
                e02 = new C3484v0(function1);
            }
        } else {
            if (function1 instanceof E0) {
                e02 = (E0) function1;
            }
            if (e02 == null) {
                e02 = new C3486w0(function1);
            }
        }
        e02.t(this);
        return e02;
    }

    private final C3483v p0(C3997q c3997q) {
        while (c3997q.m()) {
            c3997q = c3997q.l();
        }
        while (true) {
            c3997q = c3997q.k();
            if (!c3997q.m()) {
                if (c3997q instanceof C3483v) {
                    return (C3483v) c3997q;
                }
                if (c3997q instanceof K0) {
                    return null;
                }
            }
        }
    }

    private final void q0(K0 k02, Throwable th) {
        s0(th);
        Object j8 = k02.j();
        AbstractC3292y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3440F c3440f = null;
        for (C3997q c3997q = (C3997q) j8; !AbstractC3292y.d(c3997q, k02); c3997q = c3997q.k()) {
            if (c3997q instanceof AbstractC3492z0) {
                E0 e02 = (E0) c3997q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c3440f != null) {
                        AbstractC1410e.a(c3440f, th2);
                    } else {
                        c3440f = new C3440F("Exception in completion handler " + e02 + " for " + this, th2);
                        Q5.I i8 = Q5.I.f8786a;
                    }
                }
            }
        }
        if (c3440f != null) {
            f0(c3440f);
        }
        O(th);
    }

    private final void r0(K0 k02, Throwable th) {
        Object j8 = k02.j();
        AbstractC3292y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C3440F c3440f = null;
        for (C3997q c3997q = (C3997q) j8; !AbstractC3292y.d(c3997q, k02); c3997q = c3997q.k()) {
            if (c3997q instanceof E0) {
                E0 e02 = (E0) c3997q;
                try {
                    e02.r(th);
                } catch (Throwable th2) {
                    if (c3440f != null) {
                        AbstractC1410e.a(c3440f, th2);
                    } else {
                        c3440f = new C3440F("Exception in completion handler " + e02 + " for " + this, th2);
                        Q5.I i8 = Q5.I.f8786a;
                    }
                }
            }
        }
        if (c3440f != null) {
            f0(c3440f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [n6.r0] */
    private final void v0(C3455g0 c3455g0) {
        K0 k02 = new K0();
        if (!c3455g0.isActive()) {
            k02 = new C3476r0(k02);
        }
        androidx.concurrent.futures.a.a(f35630a, this, c3455g0, k02);
    }

    private final void w0(E0 e02) {
        e02.e(new K0());
        androidx.concurrent.futures.a.a(f35630a, this, e02, e02.k());
    }

    private final int z0(Object obj) {
        C3455g0 c3455g0;
        if (obj instanceof C3455g0) {
            if (((C3455g0) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35630a;
            c3455g0 = G0.f35654g;
            if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, c3455g0)) {
                return -1;
            }
            u0();
            return 1;
        }
        if (!(obj instanceof C3476r0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f35630a, this, obj, ((C3476r0) obj).a())) {
            return -1;
        }
        u0();
        return 1;
    }

    @Override // n6.InterfaceC3488x0
    public final InterfaceC3481u B(InterfaceC3485w interfaceC3485w) {
        InterfaceC3449d0 d8 = InterfaceC3488x0.a.d(this, true, false, new C3483v(interfaceC3485w), 2, null);
        AbstractC3292y.g(d8, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC3481u) d8;
    }

    protected final CancellationException B0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = P();
            }
            cancellationException = new C3490y0(str, th, this);
        }
        return cancellationException;
    }

    public final String D0() {
        return o0() + '{' + A0(d0()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object I(U5.d dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof InterfaceC3478s0)) {
                if (!(d02 instanceof C3437C)) {
                    return G0.h(d02);
                }
                throw ((C3437C) d02).f35626a;
            }
        } while (z0(d02) < 0);
        return J(dVar);
    }

    public final boolean K(Throwable th) {
        return L(th);
    }

    public final boolean L(Object obj) {
        Object obj2;
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        obj2 = G0.f35648a;
        if (!a0() || (obj2 = N(obj)) != G0.f35649b) {
            c3980f = G0.f35648a;
            if (obj2 == c3980f) {
                obj2 = k0(obj);
            }
            c3980f2 = G0.f35648a;
            if (obj2 != c3980f2 && obj2 != G0.f35649b) {
                c3980f3 = G0.f35651d;
                if (obj2 == c3980f3) {
                    return false;
                }
                H(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    public void M(Throwable th) {
        L(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String P() {
        return "Job was cancelled";
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (L(th) && Z()) {
            return true;
        }
        return false;
    }

    public final Object W() {
        Object d02 = d0();
        if (!(d02 instanceof InterfaceC3478s0)) {
            if (!(d02 instanceof C3437C)) {
                return G0.h(d02);
            }
            throw ((C3437C) d02).f35626a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean Z() {
        return true;
    }

    public boolean a0() {
        return false;
    }

    @Override // n6.InterfaceC3488x0
    public final boolean b() {
        return !(d0() instanceof InterfaceC3478s0);
    }

    public final InterfaceC3481u c0() {
        return (InterfaceC3481u) f35631b.get(this);
    }

    @Override // n6.InterfaceC3488x0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C3490y0(P(), null, this);
        }
        M(cancellationException);
    }

    public final Object d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35630a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof s6.y)) {
                return obj;
            }
            ((s6.y) obj).a(this);
        }
    }

    protected boolean e0(Throwable th) {
        return false;
    }

    @Override // U5.g.b, U5.g
    public Object fold(Object obj, InterfaceC2072n interfaceC2072n) {
        return InterfaceC3488x0.a.b(this, obj, interfaceC2072n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g0(InterfaceC3488x0 interfaceC3488x0) {
        if (interfaceC3488x0 == null) {
            y0(M0.f35666a);
            return;
        }
        interfaceC3488x0.start();
        InterfaceC3481u B8 = interfaceC3488x0.B(this);
        y0(B8);
        if (b()) {
            B8.dispose();
            y0(M0.f35666a);
        }
    }

    @Override // U5.g.b, U5.g
    public g.b get(g.c cVar) {
        return InterfaceC3488x0.a.c(this, cVar);
    }

    @Override // U5.g.b
    public final g.c getKey() {
        return InterfaceC3488x0.f35757n0;
    }

    @Override // n6.InterfaceC3488x0
    public InterfaceC3488x0 getParent() {
        InterfaceC3481u c02 = c0();
        if (c02 != null) {
            return c02.getParent();
        }
        return null;
    }

    protected boolean h0() {
        return false;
    }

    @Override // n6.InterfaceC3488x0
    public boolean isActive() {
        Object d02 = d0();
        if ((d02 instanceof InterfaceC3478s0) && ((InterfaceC3478s0) d02).isActive()) {
            return true;
        }
        return false;
    }

    @Override // n6.InterfaceC3488x0
    public final boolean isCancelled() {
        Object d02 = d0();
        if (!(d02 instanceof C3437C) && (!(d02 instanceof c) || !((c) d02).f())) {
            return false;
        }
        return true;
    }

    @Override // n6.InterfaceC3488x0
    public final InterfaceC3255g j() {
        return AbstractC3258j.b(new e(null));
    }

    @Override // n6.InterfaceC3488x0
    public final Object k(U5.d dVar) {
        if (!i0()) {
            B0.j(dVar.getContext());
            return Q5.I.f8786a;
        }
        Object j02 = j0(dVar);
        if (j02 == V5.b.e()) {
            return j02;
        }
        return Q5.I.f8786a;
    }

    public final boolean l0(Object obj) {
        Object G02;
        C3980F c3980f;
        C3980F c3980f2;
        do {
            G02 = G0(d0(), obj);
            c3980f = G0.f35648a;
            if (G02 == c3980f) {
                return false;
            }
            if (G02 != G0.f35649b) {
                c3980f2 = G0.f35650c;
            } else {
                return true;
            }
        } while (G02 == c3980f2);
        H(G02);
        return true;
    }

    public final Object m0(Object obj) {
        Object G02;
        C3980F c3980f;
        C3980F c3980f2;
        do {
            G02 = G0(d0(), obj);
            c3980f = G0.f35648a;
            if (G02 != c3980f) {
                c3980f2 = G0.f35650c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (G02 == c3980f2);
        return G02;
    }

    @Override // U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return InterfaceC3488x0.a.e(this, cVar);
    }

    public String o0() {
        return Q.a(this);
    }

    @Override // n6.InterfaceC3488x0
    public final InterfaceC3449d0 p(boolean z8, boolean z9, Function1 function1) {
        C3437C c3437c;
        E0 n02 = n0(function1, z8);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof C3455g0) {
                C3455g0 c3455g0 = (C3455g0) d02;
                if (c3455g0.isActive()) {
                    if (androidx.concurrent.futures.a.a(f35630a, this, d02, n02)) {
                        return n02;
                    }
                } else {
                    v0(c3455g0);
                }
            } else {
                Throwable th = null;
                if (d02 instanceof InterfaceC3478s0) {
                    K0 a9 = ((InterfaceC3478s0) d02).a();
                    if (a9 == null) {
                        AbstractC3292y.g(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        w0((E0) d02);
                    } else {
                        InterfaceC3449d0 interfaceC3449d0 = M0.f35666a;
                        if (z8 && (d02 instanceof c)) {
                            synchronized (d02) {
                                try {
                                    th = ((c) d02).e();
                                    if (th != null) {
                                        if ((function1 instanceof C3483v) && !((c) d02).g()) {
                                        }
                                        Q5.I i8 = Q5.I.f8786a;
                                    }
                                    if (F(d02, a9, n02)) {
                                        if (th == null) {
                                            return n02;
                                        }
                                        interfaceC3449d0 = n02;
                                        Q5.I i82 = Q5.I.f8786a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z9) {
                                function1.invoke(th);
                            }
                            return interfaceC3449d0;
                        }
                        if (F(d02, a9, n02)) {
                            return n02;
                        }
                    }
                } else {
                    if (z9) {
                        if (d02 instanceof C3437C) {
                            c3437c = (C3437C) d02;
                        } else {
                            c3437c = null;
                        }
                        if (c3437c != null) {
                            th = c3437c.f35626a;
                        }
                        function1.invoke(th);
                    }
                    return M0.f35666a;
                }
            }
        }
    }

    @Override // U5.g
    public U5.g plus(U5.g gVar) {
        return InterfaceC3488x0.a.f(this, gVar);
    }

    @Override // n6.InterfaceC3488x0
    public final CancellationException q() {
        Object d02 = d0();
        if (d02 instanceof c) {
            Throwable e8 = ((c) d02).e();
            if (e8 != null) {
                CancellationException B02 = B0(e8, Q.a(this) + " is cancelling");
                if (B02 != null) {
                    return B02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(d02 instanceof InterfaceC3478s0)) {
            if (d02 instanceof C3437C) {
                return C0(this, ((C3437C) d02).f35626a, null, 1, null);
            }
            return new C3490y0(Q.a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // n6.InterfaceC3485w
    public final void r(O0 o02) {
        L(o02);
    }

    @Override // n6.InterfaceC3488x0
    public final boolean start() {
        int z02;
        do {
            z02 = z0(d0());
            if (z02 == 0) {
                return false;
            }
        } while (z02 != 1);
        return true;
    }

    public String toString() {
        return D0() + '@' + Q.b(this);
    }

    @Override // n6.InterfaceC3488x0
    public final InterfaceC3449d0 u(Function1 function1) {
        return p(false, true, function1);
    }

    public final void x0(E0 e02) {
        Object d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3455g0 c3455g0;
        do {
            d02 = d0();
            if (d02 instanceof E0) {
                if (d02 != e02) {
                    return;
                }
                atomicReferenceFieldUpdater = f35630a;
                c3455g0 = G0.f35654g;
            } else {
                if ((d02 instanceof InterfaceC3478s0) && ((InterfaceC3478s0) d02).a() != null) {
                    e02.n();
                    return;
                }
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d02, c3455g0));
    }

    public final void y0(InterfaceC3481u interfaceC3481u) {
        f35631b.set(this, interfaceC3481u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // n6.O0
    public CancellationException z() {
        CancellationException cancellationException;
        Object d02 = d0();
        CancellationException cancellationException2 = null;
        if (d02 instanceof c) {
            cancellationException = ((c) d02).e();
        } else if (d02 instanceof C3437C) {
            cancellationException = ((C3437C) d02).f35626a;
        } else if (!(d02 instanceof InterfaceC3478s0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new C3490y0("Parent job is " + A0(d02), cancellationException, this);
        }
        return cancellationException2;
    }

    protected void u0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void H(Object obj) {
    }

    public void f0(Throwable th) {
        throw th;
    }

    protected void s0(Throwable th) {
    }

    protected void t0(Object obj) {
    }
}
