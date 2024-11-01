package p6;

import Q5.AbstractC1410e;
import Q5.I;
import Q5.s;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3472p;
import n6.InterfaceC3470o;
import n6.e1;
import s6.AbstractC3977C;
import s6.AbstractC3978D;
import s6.AbstractC3979E;
import s6.AbstractC3984d;
import s6.AbstractC3985e;
import s6.AbstractC3992l;
import s6.C3980F;
import s6.Q;
import s6.x;
import v6.InterfaceC4136a;

/* loaded from: classes5.dex */
public class b implements p6.d {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f36365d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f36366e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f36367f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f36368g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36369h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36370i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36371j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36372k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36373l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    private final int f36374a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f36375b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2073o f36376c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class a implements f, e1 {

        /* renamed from: a, reason: collision with root package name */
        private Object f36377a;

        /* renamed from: b, reason: collision with root package name */
        private C3472p f36378b;

        public a() {
            C3980F c3980f;
            c3980f = p6.c.f36408p;
            this.f36377a = c3980f;
        }

        private final Object f(j jVar, int i8, long j8, U5.d dVar) {
            C3980F c3980f;
            C3980F c3980f2;
            Boolean a9;
            C3980F c3980f3;
            C3980F c3980f4;
            C3980F c3980f5;
            b bVar = b.this;
            C3472p b9 = n6.r.b(V5.b.c(dVar));
            try {
                this.f36378b = b9;
                Object G02 = bVar.G0(jVar, i8, j8, this);
                c3980f = p6.c.f36405m;
                if (G02 == c3980f) {
                    bVar.p0(this, jVar, i8);
                } else {
                    c3980f2 = p6.c.f36407o;
                    Function1 function1 = null;
                    if (G02 == c3980f2) {
                        if (j8 < bVar.R()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f36370i.get(bVar);
                        while (true) {
                            if (bVar.Y()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f36366e.getAndIncrement(bVar);
                            int i9 = p6.c.f36394b;
                            long j9 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (jVar2.f39163c != j9) {
                                j K8 = bVar.K(j9, jVar2);
                                if (K8 != null) {
                                    jVar2 = K8;
                                }
                            }
                            Object G03 = bVar.G0(jVar2, i10, andIncrement, this);
                            c3980f3 = p6.c.f36405m;
                            if (G03 == c3980f3) {
                                bVar.p0(this, jVar2, i10);
                                break;
                            }
                            c3980f4 = p6.c.f36407o;
                            if (G03 != c3980f4) {
                                c3980f5 = p6.c.f36406n;
                                if (G03 != c3980f5) {
                                    jVar2.b();
                                    this.f36377a = G03;
                                    this.f36378b = null;
                                    a9 = kotlin.coroutines.jvm.internal.b.a(true);
                                    Function1 function12 = bVar.f36375b;
                                    if (function12 != null) {
                                        function1 = x.a(function12, G03, b9.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bVar.R()) {
                                jVar2.b();
                            }
                        }
                    } else {
                        jVar.b();
                        this.f36377a = G02;
                        this.f36378b = null;
                        a9 = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1 function13 = bVar.f36375b;
                        if (function13 != null) {
                            function1 = x.a(function13, G02, b9.getContext());
                        }
                    }
                    b9.o(a9, function1);
                }
                Object y8 = b9.y();
                if (y8 == V5.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return y8;
            } catch (Throwable th) {
                b9.K();
                throw th;
            }
        }

        private final boolean g() {
            this.f36377a = p6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                return false;
            }
            throw AbstractC3979E.a(N8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C3472p c3472p = this.f36378b;
            AbstractC3292y.f(c3472p);
            this.f36378b = null;
            this.f36377a = p6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = Q5.s.f8810b;
                c3472p.resumeWith(Q5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = Q5.s.f8810b;
                c3472p.resumeWith(Q5.s.b(Q5.t.a(N8)));
            }
        }

        @Override // n6.e1
        public void a(AbstractC3977C abstractC3977C, int i8) {
            C3472p c3472p = this.f36378b;
            if (c3472p != null) {
                c3472p.a(abstractC3977C, i8);
            }
        }

        @Override // p6.f
        public Object b(U5.d dVar) {
            j jVar;
            C3980F c3980f;
            C3980F c3980f2;
            C3980F c3980f3;
            b bVar = b.this;
            j jVar2 = (j) b.f36370i.get(bVar);
            while (!bVar.Y()) {
                long andIncrement = b.f36366e.getAndIncrement(bVar);
                int i8 = p6.c.f36394b;
                long j8 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f39163c != j8) {
                    j K8 = bVar.K(j8, jVar2);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                } else {
                    jVar = jVar2;
                }
                Object G02 = bVar.G0(jVar, i9, andIncrement, null);
                c3980f = p6.c.f36405m;
                if (G02 != c3980f) {
                    c3980f2 = p6.c.f36407o;
                    if (G02 != c3980f2) {
                        c3980f3 = p6.c.f36406n;
                        if (G02 == c3980f3) {
                            return f(jVar, i9, andIncrement, dVar);
                        }
                        jVar.b();
                        this.f36377a = G02;
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                    if (andIncrement < bVar.R()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        public final boolean i(Object obj) {
            boolean B8;
            C3472p c3472p = this.f36378b;
            AbstractC3292y.f(c3472p);
            Function1 function1 = null;
            this.f36378b = null;
            this.f36377a = obj;
            Boolean bool = Boolean.TRUE;
            Function1 function12 = b.this.f36375b;
            if (function12 != null) {
                function1 = x.a(function12, obj, c3472p.getContext());
            }
            B8 = p6.c.B(c3472p, bool, function1);
            return B8;
        }

        public final void j() {
            C3472p c3472p = this.f36378b;
            AbstractC3292y.f(c3472p);
            this.f36378b = null;
            this.f36377a = p6.c.z();
            Throwable N8 = b.this.N();
            if (N8 == null) {
                s.a aVar = Q5.s.f8810b;
                c3472p.resumeWith(Q5.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = Q5.s.f8810b;
                c3472p.resumeWith(Q5.s.b(Q5.t.a(N8)));
            }
        }

        @Override // p6.f
        public Object next() {
            C3980F c3980f;
            C3980F c3980f2;
            Object obj = this.f36377a;
            c3980f = p6.c.f36408p;
            if (obj != c3980f) {
                c3980f2 = p6.c.f36408p;
                this.f36377a = c3980f2;
                if (obj != p6.c.z()) {
                    return obj;
                }
                throw AbstractC3979E.a(b.this.O());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: p6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0825b extends AbstractC3293z implements InterfaceC2073o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f36381a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f36382b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b bVar, InterfaceC4136a interfaceC4136a) {
                super(1);
                this.f36381a = obj;
                this.f36382b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8786a;
            }

            public final void invoke(Throwable th) {
                if (this.f36381a == p6.c.z()) {
                    return;
                }
                Function1 function1 = this.f36382b.f36375b;
                throw null;
            }
        }

        C0825b() {
            super(3);
        }

        public final Function1 a(InterfaceC4136a interfaceC4136a, Object obj, Object obj2) {
            return new a(obj2, b.this, interfaceC4136a);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36383a;

        /* renamed from: c, reason: collision with root package name */
        int f36385c;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36383a = obj;
            this.f36385c |= Integer.MIN_VALUE;
            Object s02 = b.s0(b.this, this);
            if (s02 == V5.b.e()) {
                return s02;
            }
            return h.b(s02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36386a;

        /* renamed from: b, reason: collision with root package name */
        Object f36387b;

        /* renamed from: c, reason: collision with root package name */
        int f36388c;

        /* renamed from: d, reason: collision with root package name */
        long f36389d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36390e;

        /* renamed from: g, reason: collision with root package name */
        int f36392g;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36390e = obj;
            this.f36392g |= Integer.MIN_VALUE;
            Object t02 = b.this.t0(null, 0, 0L, this);
            if (t02 == V5.b.e()) {
                return t02;
            }
            return h.b(t02);
        }
    }

    public b(int i8, Function1 function1) {
        long A8;
        C0825b c0825b;
        C3980F c3980f;
        this.f36374a = i8;
        this.f36375b = function1;
        if (i8 >= 0) {
            A8 = p6.c.A(i8);
            this.bufferEnd = A8;
            this.completedExpandBuffersAndPauseFlag = M();
            j jVar = new j(0L, null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (c0()) {
                jVar = p6.c.f36393a;
                AbstractC3292y.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            if (function1 != null) {
                c0825b = new C0825b();
            } else {
                c0825b = null;
            }
            this.f36376c = c0825b;
            c3980f = p6.c.f36411s;
            this._closeCause = c3980f;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object A0(p6.j r21, int r22, java.lang.Object r23, long r24, U5.d r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.A0(p6.j, int, java.lang.Object, long, U5.d):java.lang.Object");
    }

    private final void B(j jVar, long j8) {
        C3980F c3980f;
        Object b9 = AbstractC3992l.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i8 = p6.c.f36394b - 1; -1 < i8; i8--) {
                if ((jVar.f39163c * p6.c.f36394b) + i8 < j8) {
                    break loop0;
                }
                while (true) {
                    Object w8 = jVar.w(i8);
                    if (w8 != null) {
                        c3980f = p6.c.f36397e;
                        if (w8 != c3980f) {
                            if (w8 instanceof w) {
                                if (jVar.r(i8, w8, p6.c.z())) {
                                    b9 = AbstractC3992l.c(b9, ((w) w8).f36435a);
                                    jVar.x(i8, true);
                                    break;
                                }
                            } else {
                                if (!(w8 instanceof e1)) {
                                    break;
                                }
                                if (jVar.r(i8, w8, p6.c.z())) {
                                    b9 = AbstractC3992l.c(b9, w8);
                                    jVar.x(i8, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (jVar.r(i8, w8, p6.c.z())) {
                        jVar.p();
                        break;
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (b9 != null) {
            if (!(b9 instanceof ArrayList)) {
                w0((e1) b9);
                return;
            }
            AbstractC3292y.g(b9, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b9;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                w0((e1) arrayList.get(size));
            }
        }
    }

    private final boolean B0(long j8) {
        if (a0(j8)) {
            return false;
        }
        return !v(j8 & 1152921504606846975L);
    }

    private final j C() {
        Object obj = f36371j.get(this);
        j jVar = (j) f36369h.get(this);
        if (jVar.f39163c > ((j) obj).f39163c) {
            obj = jVar;
        }
        j jVar2 = (j) f36370i.get(this);
        if (jVar2.f39163c > ((j) obj).f39163c) {
            obj = jVar2;
        }
        return (j) AbstractC3984d.b((AbstractC3985e) obj);
    }

    private final boolean C0(Object obj, Object obj2) {
        boolean B8;
        boolean B9;
        Function1 function1 = null;
        if (obj instanceof t) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            t tVar = (t) obj;
            C3472p c3472p = tVar.f36434a;
            h b9 = h.b(h.f36417b.c(obj2));
            Function1 function12 = this.f36375b;
            if (function12 != null) {
                function1 = x.a(function12, obj2, tVar.f36434a.getContext());
            }
            B9 = p6.c.B(c3472p, b9, function1);
            return B9;
        }
        if (obj instanceof a) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC3470o) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC3470o interfaceC3470o = (InterfaceC3470o) obj;
            Function1 function13 = this.f36375b;
            if (function13 != null) {
                function1 = x.a(function13, obj2, interfaceC3470o.getContext());
            }
            B8 = p6.c.B(interfaceC3470o, obj2, function1);
            return B8;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean D0(Object obj, j jVar, int i8) {
        if (obj instanceof InterfaceC3470o) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return p6.c.C((InterfaceC3470o) obj, I.f8786a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void E(long j8) {
        v0(F(j8));
    }

    private final boolean E0(j jVar, int i8, long j8) {
        C3980F c3980f;
        C3980F c3980f2;
        Object w8 = jVar.w(i8);
        if ((w8 instanceof e1) && j8 >= f36366e.get(this)) {
            c3980f = p6.c.f36399g;
            if (jVar.r(i8, w8, c3980f)) {
                if (!D0(w8, jVar, i8)) {
                    c3980f2 = p6.c.f36402j;
                    jVar.A(i8, c3980f2);
                    jVar.x(i8, false);
                    return false;
                }
                jVar.A(i8, p6.c.f36396d);
                return true;
            }
        }
        return F0(jVar, i8, j8);
    }

    private final j F(long j8) {
        j C8 = C();
        if (b0()) {
            long d02 = d0(C8);
            if (d02 != -1) {
                H(d02);
            }
        }
        B(C8, j8);
        return C8;
    }

    private final boolean F0(j jVar, int i8, long j8) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3980F c3980f6;
        C3980F c3980f7;
        C3980F c3980f8;
        while (true) {
            Object w8 = jVar.w(i8);
            if (!(w8 instanceof e1)) {
                c3980f3 = p6.c.f36402j;
                if (w8 == c3980f3) {
                    return false;
                }
                if (w8 == null) {
                    c3980f4 = p6.c.f36397e;
                    if (jVar.r(i8, w8, c3980f4)) {
                        return true;
                    }
                } else if (w8 != p6.c.f36396d) {
                    c3980f5 = p6.c.f36400h;
                    if (w8 == c3980f5) {
                        break;
                    }
                    c3980f6 = p6.c.f36401i;
                    if (w8 == c3980f6) {
                        break;
                    }
                    c3980f7 = p6.c.f36403k;
                    if (w8 != c3980f7 && w8 != p6.c.z()) {
                        c3980f8 = p6.c.f36398f;
                        if (w8 != c3980f8) {
                            throw new IllegalStateException(("Unexpected cell state: " + w8).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j8 >= f36366e.get(this)) {
                c3980f = p6.c.f36399g;
                if (jVar.r(i8, w8, c3980f)) {
                    if (!D0(w8, jVar, i8)) {
                        c3980f2 = p6.c.f36402j;
                        jVar.A(i8, c3980f2);
                        jVar.x(i8, false);
                        return false;
                    }
                    jVar.A(i8, p6.c.f36396d);
                    return true;
                }
            } else if (jVar.r(i8, w8, new w((e1) w8))) {
                return true;
            }
        }
    }

    private final void G() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G0(j jVar, int i8, long j8, Object obj) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (j8 >= (f36365d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c3980f3 = p6.c.f36406n;
                    return c3980f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3980f2 = p6.c.f36405m;
                    return c3980f2;
                }
            }
        } else if (w8 == p6.c.f36396d) {
            c3980f = p6.c.f36401i;
            if (jVar.r(i8, w8, c3980f)) {
                I();
                return jVar.y(i8);
            }
        }
        return H0(jVar, i8, j8, obj);
    }

    private final Object H0(j jVar, int i8, long j8, Object obj) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3980F c3980f6;
        C3980F c3980f7;
        C3980F c3980f8;
        C3980F c3980f9;
        C3980F c3980f10;
        C3980F c3980f11;
        C3980F c3980f12;
        C3980F c3980f13;
        C3980F c3980f14;
        C3980F c3980f15;
        C3980F c3980f16;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3980f5 = p6.c.f36397e;
                if (w8 != c3980f5) {
                    if (w8 == p6.c.f36396d) {
                        c3980f6 = p6.c.f36401i;
                        if (jVar.r(i8, w8, c3980f6)) {
                            I();
                            return jVar.y(i8);
                        }
                    } else {
                        c3980f7 = p6.c.f36402j;
                        if (w8 == c3980f7) {
                            c3980f8 = p6.c.f36407o;
                            return c3980f8;
                        }
                        c3980f9 = p6.c.f36400h;
                        if (w8 == c3980f9) {
                            c3980f10 = p6.c.f36407o;
                            return c3980f10;
                        }
                        if (w8 != p6.c.z()) {
                            c3980f12 = p6.c.f36399g;
                            if (w8 != c3980f12) {
                                c3980f13 = p6.c.f36398f;
                                if (jVar.r(i8, w8, c3980f13)) {
                                    boolean z8 = w8 instanceof w;
                                    if (z8) {
                                        w8 = ((w) w8).f36435a;
                                    }
                                    if (D0(w8, jVar, i8)) {
                                        c3980f16 = p6.c.f36401i;
                                        jVar.A(i8, c3980f16);
                                        I();
                                        return jVar.y(i8);
                                    }
                                    c3980f14 = p6.c.f36402j;
                                    jVar.A(i8, c3980f14);
                                    jVar.x(i8, false);
                                    if (z8) {
                                        I();
                                    }
                                    c3980f15 = p6.c.f36407o;
                                    return c3980f15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            I();
                            c3980f11 = p6.c.f36407o;
                            return c3980f11;
                        }
                    }
                }
            }
            if (j8 < (f36365d.get(this) & 1152921504606846975L)) {
                c3980f = p6.c.f36400h;
                if (jVar.r(i8, w8, c3980f)) {
                    I();
                    c3980f2 = p6.c.f36407o;
                    return c3980f2;
                }
            } else {
                if (obj == null) {
                    c3980f3 = p6.c.f36406n;
                    return c3980f3;
                }
                if (jVar.r(i8, w8, obj)) {
                    I();
                    c3980f4 = p6.c.f36405m;
                    return c3980f4;
                }
            }
        }
    }

    private final void I() {
        if (c0()) {
            return;
        }
        j jVar = (j) f36371j.get(this);
        while (true) {
            long andIncrement = f36367f.getAndIncrement(this);
            int i8 = p6.c.f36394b;
            long j8 = andIncrement / i8;
            if (R() <= andIncrement) {
                if (jVar.f39163c < j8 && jVar.e() != null) {
                    h0(j8, jVar);
                }
                U(this, 0L, 1, null);
                return;
            }
            if (jVar.f39163c != j8) {
                j J8 = J(j8, jVar, andIncrement);
                if (J8 == null) {
                    continue;
                } else {
                    jVar = J8;
                }
            }
            if (E0(jVar, (int) (andIncrement % i8), andIncrement)) {
                U(this, 0L, 1, null);
                return;
            }
            U(this, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I0(j jVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        jVar.B(i8, obj);
        if (z8) {
            return J0(jVar, i8, obj, j8, obj2, z8);
        }
        Object w8 = jVar.w(i8);
        if (w8 == null) {
            if (v(j8)) {
                if (jVar.r(i8, null, p6.c.f36396d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (w8 instanceof e1) {
            jVar.s(i8);
            if (C0(w8, obj)) {
                c3980f3 = p6.c.f36401i;
                jVar.A(i8, c3980f3);
                n0();
                return 0;
            }
            c3980f = p6.c.f36403k;
            Object t8 = jVar.t(i8, c3980f);
            c3980f2 = p6.c.f36403k;
            if (t8 != c3980f2) {
                jVar.x(i8, true);
            }
            return 5;
        }
        return J0(jVar, i8, obj, j8, obj2, z8);
    }

    private final j J(long j8, j jVar, long j9) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36371j;
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) p6.c.y();
        loop0: while (true) {
            c8 = AbstractC3984d.c(jVar, j8, interfaceC2072n);
            if (!AbstractC3978D.c(c8)) {
                AbstractC3977C b9 = AbstractC3978D.b(c8);
                while (true) {
                    AbstractC3977C abstractC3977C = (AbstractC3977C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3977C.f39163c >= b9.f39163c) {
                        break loop0;
                    }
                    if (!b9.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3977C, b9)) {
                        if (abstractC3977C.m()) {
                            abstractC3977C.k();
                        }
                    } else if (b9.m()) {
                        b9.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3978D.c(c8)) {
            G();
            h0(j8, jVar);
            U(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) AbstractC3978D.b(c8);
        long j10 = jVar2.f39163c;
        if (j10 > j8) {
            int i8 = p6.c.f36394b;
            if (f36367f.compareAndSet(this, j9 + 1, i8 * j10)) {
                T((jVar2.f39163c * i8) - j9);
                return null;
            }
            U(this, 0L, 1, null);
            return null;
        }
        return jVar2;
    }

    private final int J0(j jVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3980F c3980f6;
        C3980F c3980f7;
        while (true) {
            Object w8 = jVar.w(i8);
            if (w8 != null) {
                c3980f2 = p6.c.f36397e;
                if (w8 != c3980f2) {
                    c3980f3 = p6.c.f36403k;
                    if (w8 != c3980f3) {
                        c3980f4 = p6.c.f36400h;
                        if (w8 == c3980f4) {
                            jVar.s(i8);
                            return 5;
                        }
                        if (w8 == p6.c.z()) {
                            jVar.s(i8);
                            G();
                            return 4;
                        }
                        jVar.s(i8);
                        if (w8 instanceof w) {
                            w8 = ((w) w8).f36435a;
                        }
                        if (C0(w8, obj)) {
                            c3980f7 = p6.c.f36401i;
                            jVar.A(i8, c3980f7);
                            n0();
                            return 0;
                        }
                        c3980f5 = p6.c.f36403k;
                        Object t8 = jVar.t(i8, c3980f5);
                        c3980f6 = p6.c.f36403k;
                        if (t8 != c3980f6) {
                            jVar.x(i8, true);
                        }
                        return 5;
                    }
                    jVar.s(i8);
                    return 5;
                }
                if (jVar.r(i8, w8, p6.c.f36396d)) {
                    return 1;
                }
            } else if (v(j8) && !z8) {
                if (jVar.r(i8, null, p6.c.f36396d)) {
                    return 1;
                }
            } else if (z8) {
                c3980f = p6.c.f36402j;
                if (jVar.r(i8, null, c3980f)) {
                    jVar.x(i8, false);
                    return 4;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i8, null, obj2)) {
                    return 2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j K(long j8, j jVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36370i;
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) p6.c.y();
        loop0: while (true) {
            c8 = AbstractC3984d.c(jVar, j8, interfaceC2072n);
            if (!AbstractC3978D.c(c8)) {
                AbstractC3977C b9 = AbstractC3978D.b(c8);
                while (true) {
                    AbstractC3977C abstractC3977C = (AbstractC3977C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3977C.f39163c >= b9.f39163c) {
                        break loop0;
                    }
                    if (!b9.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3977C, b9)) {
                        if (abstractC3977C.m()) {
                            abstractC3977C.k();
                        }
                    } else if (b9.m()) {
                        b9.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3978D.c(c8)) {
            G();
            if (jVar.f39163c * p6.c.f36394b >= R()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3978D.b(c8);
        if (!c0() && j8 <= M() / p6.c.f36394b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f36371j;
            while (true) {
                AbstractC3977C abstractC3977C2 = (AbstractC3977C) atomicReferenceFieldUpdater2.get(this);
                if (abstractC3977C2.f39163c >= jVar2.f39163c || !jVar2.q()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, abstractC3977C2, jVar2)) {
                    if (abstractC3977C2.m()) {
                        abstractC3977C2.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j9 = jVar2.f39163c;
        if (j9 > j8) {
            int i8 = p6.c.f36394b;
            K0(j9 * i8);
            if (jVar2.f39163c * i8 >= R()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final void K0(long j8) {
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36366e;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
        } while (!f36366e.compareAndSet(this, j9, j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j L(long j8, j jVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36369h;
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) p6.c.y();
        loop0: while (true) {
            c8 = AbstractC3984d.c(jVar, j8, interfaceC2072n);
            if (!AbstractC3978D.c(c8)) {
                AbstractC3977C b9 = AbstractC3978D.b(c8);
                while (true) {
                    AbstractC3977C abstractC3977C = (AbstractC3977C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3977C.f39163c >= b9.f39163c) {
                        break loop0;
                    }
                    if (!b9.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, abstractC3977C, b9)) {
                        if (abstractC3977C.m()) {
                            abstractC3977C.k();
                        }
                    } else if (b9.m()) {
                        b9.k();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC3978D.c(c8)) {
            G();
            if (jVar.f39163c * p6.c.f36394b >= P()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) AbstractC3978D.b(c8);
        long j9 = jVar2.f39163c;
        if (j9 > j8) {
            int i8 = p6.c.f36394b;
            L0(j9 * i8);
            if (jVar2.f39163c * i8 >= P()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final void L0(long j8) {
        long j9;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36365d;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            long j10 = 1152921504606846975L & j9;
            if (j10 < j8) {
                w8 = p6.c.w(j10, (int) (j9 >> 60));
            } else {
                return;
            }
        } while (!f36365d.compareAndSet(this, j9, w8));
    }

    private final long M() {
        return f36367f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable O() {
        Throwable N8 = N();
        if (N8 == null) {
            return new n("Channel was closed");
        }
        return N8;
    }

    private final void T(long j8) {
        if ((f36368g.addAndGet(this, j8) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((f36368g.get(this) & 4611686018427387904L) != 0);
    }

    static /* synthetic */ void U(b bVar, long j8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                j8 = 1;
            }
            bVar.T(j8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void V() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36373l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? p6.c.f36409q : p6.c.f36410r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(N());
    }

    private final boolean W(j jVar, int i8, long j8) {
        Object w8;
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3980F c3980f6;
        C3980F c3980f7;
        do {
            w8 = jVar.w(i8);
            if (w8 != null) {
                c3980f2 = p6.c.f36397e;
                if (w8 != c3980f2) {
                    if (w8 != p6.c.f36396d) {
                        c3980f3 = p6.c.f36402j;
                        if (w8 != c3980f3 && w8 != p6.c.z()) {
                            c3980f4 = p6.c.f36401i;
                            if (w8 != c3980f4) {
                                c3980f5 = p6.c.f36400h;
                                if (w8 != c3980f5) {
                                    c3980f6 = p6.c.f36399g;
                                    if (w8 != c3980f6) {
                                        c3980f7 = p6.c.f36398f;
                                        if (w8 == c3980f7 || j8 != P()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            c3980f = p6.c.f36400h;
        } while (!jVar.r(i8, w8, c3980f));
        I();
        return false;
    }

    private final boolean X(long j8, boolean z8) {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                E(j8 & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i8).toString());
            }
        } else {
            F(j8 & 1152921504606846975L);
            if (z8 && S()) {
                return false;
            }
        }
        return true;
    }

    private final boolean Z(long j8) {
        return X(j8, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(long j8) {
        return X(j8, false);
    }

    private final boolean c0() {
        long M8 = M();
        if (M8 != 0 && M8 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:            r9 = (p6.j) r9.g();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long d0(p6.j r9) {
        /*
            r8 = this;
        L0:
            int r0 = p6.c.f36394b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.f39163c
            int r5 = p6.c.f36394b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.P()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            s6.F r2 = p6.c.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            s6.F r2 = p6.c.f36396d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            s6.F r2 = p6.c.z()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            s6.e r9 = r9.g()
            p6.j r9 = (p6.j) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.d0(p6.j):long");
    }

    private final void e0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36365d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) == 0) {
                w8 = p6.c.w(1152921504606846975L & j8, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void f0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36365d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            w8 = p6.c.w(1152921504606846975L & j8, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    private final void g0() {
        long j8;
        long w8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36365d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                w8 = p6.c.w(j8 & 1152921504606846975L, 2);
            } else if (i8 == 1) {
                w8 = p6.c.w(j8 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, w8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h0(long r6, p6.j r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f39163c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            s6.e r0 = r8.e()
            p6.j r0 = (p6.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            s6.e r6 = r8.e()
            p6.j r6 = (p6.j) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p6.b.f36371j
        L24:
            java.lang.Object r7 = r6.get(r5)
            s6.C r7 = (s6.AbstractC3977C) r7
            long r0 = r7.f39163c
            long r2 = r8.f39163c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = androidx.concurrent.futures.a.a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.m()
            if (r6 == 0) goto L49
            r7.k()
        L49:
            return
        L4a:
            boolean r7 = r8.m()
            if (r7 == 0) goto L24
            r8.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.h0(long, p6.j):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(InterfaceC3470o interfaceC3470o) {
        s.a aVar = Q5.s.f8810b;
        interfaceC3470o.resumeWith(Q5.s.b(h.b(h.f36417b.a(N()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(InterfaceC3470o interfaceC3470o) {
        s.a aVar = Q5.s.f8810b;
        interfaceC3470o.resumeWith(Q5.s.b(Q5.t.a(O())));
    }

    private final Object l0(Object obj, U5.d dVar) {
        Q d8;
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        Function1 function1 = this.f36375b;
        if (function1 != null && (d8 = x.d(function1, obj, null, 2, null)) != null) {
            AbstractC1410e.a(d8, Q());
            s.a aVar = Q5.s.f8810b;
            c3472p.resumeWith(Q5.s.b(Q5.t.a(d8)));
        } else {
            Throwable Q8 = Q();
            s.a aVar2 = Q5.s.f8810b;
            c3472p.resumeWith(Q5.s.b(Q5.t.a(Q8)));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(Object obj, InterfaceC3470o interfaceC3470o) {
        Function1 function1 = this.f36375b;
        if (function1 != null) {
            x.b(function1, obj, interfaceC3470o.getContext());
        }
        Throwable Q8 = Q();
        s.a aVar = Q5.s.f8810b;
        interfaceC3470o.resumeWith(Q5.s.b(Q5.t.a(Q8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(e1 e1Var, j jVar, int i8) {
        o0();
        e1Var.a(jVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(e1 e1Var, j jVar, int i8) {
        e1Var.a(jVar, i8 + p6.c.f36394b);
    }

    static /* synthetic */ Object r0(b bVar, U5.d dVar) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        j jVar = (j) f36370i.get(bVar);
        while (!bVar.Y()) {
            long andIncrement = f36366e.getAndIncrement(bVar);
            int i8 = p6.c.f36394b;
            long j8 = andIncrement / i8;
            int i9 = (int) (andIncrement % i8);
            if (jVar.f39163c != j8) {
                j K8 = bVar.K(j8, jVar);
                if (K8 == null) {
                    continue;
                } else {
                    jVar = K8;
                }
            }
            Object G02 = bVar.G0(jVar, i9, andIncrement, null);
            c3980f = p6.c.f36405m;
            if (G02 != c3980f) {
                c3980f2 = p6.c.f36407o;
                if (G02 != c3980f2) {
                    c3980f3 = p6.c.f36406n;
                    if (G02 == c3980f3) {
                        return bVar.u0(jVar, i9, andIncrement, dVar);
                    }
                    jVar.b();
                    return G02;
                }
                if (andIncrement < bVar.R()) {
                    jVar.b();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw AbstractC3979E.a(bVar.O());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object s0(p6.b r13, U5.d r14) {
        /*
            boolean r0 = r14 instanceof p6.b.c
            if (r0 == 0) goto L14
            r0 = r14
            p6.b$c r0 = (p6.b.c) r0
            int r1 = r0.f36385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f36385c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p6.b$c r0 = new p6.b$c
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f36383a
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.f36385c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            Q5.t.b(r14)
            p6.h r14 = (p6.h) r14
            java.lang.Object r13 = r14.k()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            Q5.t.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = f()
            java.lang.Object r14 = r14.get(r13)
            p6.j r14 = (p6.j) r14
        L47:
            boolean r1 = r13.Y()
            if (r1 == 0) goto L58
            p6.h$b r14 = p6.h.f36417b
            java.lang.Throwable r13 = r13.N()
            java.lang.Object r13 = r14.a(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = g()
            long r4 = r1.getAndIncrement(r13)
            int r1 = p6.c.f36394b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f39163c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            p6.j r1 = a(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = t(r7, r8, r9, r10, r12)
            s6.F r7 = p6.c.r()
            if (r1 == r7) goto Lb3
            s6.F r7 = p6.c.h()
            if (r1 != r7) goto L98
            long r7 = r13.R()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.b()
            goto L47
        L98:
            s6.F r7 = p6.c.s()
            if (r1 != r7) goto La9
            r6.f36385c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.t0(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.b()
            p6.h$b r13 = p6.h.f36417b
            java.lang.Object r13 = r13.c(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.s0(p6.b, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t0(p6.j r11, int r12, long r13, U5.d r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.t0(p6.j, int, long, U5.d):java.lang.Object");
    }

    private final Object u0(j jVar, int i8, long j8, U5.d dVar) {
        C3980F c3980f;
        C3980F c3980f2;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        C3472p b9 = n6.r.b(V5.b.c(dVar));
        try {
            Object G02 = G0(jVar, i8, j8, b9);
            c3980f = p6.c.f36405m;
            if (G02 == c3980f) {
                p0(b9, jVar, i8);
            } else {
                c3980f2 = p6.c.f36407o;
                Function1 function1 = null;
                function1 = null;
                C3472p c3472p = null;
                if (G02 == c3980f2) {
                    if (j8 < R()) {
                        jVar.b();
                    }
                    j jVar2 = (j) f36370i.get(this);
                    while (true) {
                        if (Y()) {
                            k0(b9);
                            break;
                        }
                        long andIncrement = f36366e.getAndIncrement(this);
                        int i9 = p6.c.f36394b;
                        long j9 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (jVar2.f39163c != j9) {
                            j K8 = K(j9, jVar2);
                            if (K8 != null) {
                                jVar2 = K8;
                            }
                        }
                        G02 = G0(jVar2, i10, andIncrement, b9);
                        c3980f3 = p6.c.f36405m;
                        if (G02 != c3980f3) {
                            c3980f4 = p6.c.f36407o;
                            if (G02 != c3980f4) {
                                c3980f5 = p6.c.f36406n;
                                if (G02 != c3980f5) {
                                    jVar2.b();
                                    Function1 function12 = this.f36375b;
                                    if (function12 != null) {
                                        function1 = x.a(function12, G02, b9.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < R()) {
                                jVar2.b();
                            }
                        } else {
                            if (b9 instanceof e1) {
                                c3472p = b9;
                            }
                            if (c3472p != null) {
                                p0(c3472p, jVar2, i10);
                            }
                        }
                    }
                } else {
                    jVar.b();
                    Function1 function13 = this.f36375b;
                    if (function13 != null) {
                        function1 = x.a(function13, G02, b9.getContext());
                    }
                }
                b9.o(G02, function1);
            }
            Object y8 = b9.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        } catch (Throwable th) {
            b9.K();
            throw th;
        }
    }

    private final boolean v(long j8) {
        if (j8 >= M() && j8 >= P() + this.f36374a) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:            r13 = (p6.j) r13.g();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v0(p6.j r13) {
        /*
            r12 = this;
            kotlin.jvm.functions.Function1 r0 = r12.f36375b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = s6.AbstractC3992l.b(r1, r2, r1)
        L8:
            int r4 = p6.c.f36394b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.f39163c
            int r8 = p6.c.f36394b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.w(r4)
            s6.F r9 = p6.c.f()
            if (r8 == r9) goto Lbc
            s6.F r9 = p6.c.f36396d
            if (r8 != r9) goto L49
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            s6.F r9 = p6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.v(r4)
            s6.Q r1 = s6.x.c(r0, r5, r1)
        L41:
            r13.s(r4)
            r13.p()
            goto Lb0
        L49:
            s6.F r9 = p6.c.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof n6.e1
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof p6.w
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            s6.F r9 = p6.c.p()
            if (r8 == r9) goto Lbc
            s6.F r9 = p6.c.q()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            s6.F r9 = p6.c.p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.P()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof p6.w
            if (r9 == 0) goto L81
            r9 = r8
            p6.w r9 = (p6.w) r9
            n6.e1 r9 = r9.f36435a
            goto L84
        L81:
            r9 = r8
            n6.e1 r9 = (n6.e1) r9
        L84:
            s6.F r10 = p6.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.v(r4)
            s6.Q r1 = s6.x.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = s6.AbstractC3992l.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto Lb0
        La3:
            s6.F r9 = p6.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.p()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            s6.e r13 = r13.g()
            p6.j r13 = (p6.j) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            n6.e1 r3 = (n6.e1) r3
            r12.x0(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.AbstractC3292y.g(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            n6.e1 r0 = (n6.e1) r0
            r12.x0(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.v0(p6.j):void");
    }

    private final void w0(e1 e1Var) {
        y0(e1Var, true);
    }

    private final void x0(e1 e1Var) {
        y0(e1Var, false);
    }

    private final void y0(e1 e1Var, boolean z8) {
        Throwable Q8;
        if (e1Var instanceof InterfaceC3470o) {
            U5.d dVar = (U5.d) e1Var;
            s.a aVar = Q5.s.f8810b;
            if (z8) {
                Q8 = O();
            } else {
                Q8 = Q();
            }
            dVar.resumeWith(Q5.s.b(Q5.t.a(Q8)));
            return;
        }
        if (e1Var instanceof t) {
            C3472p c3472p = ((t) e1Var).f36434a;
            s.a aVar2 = Q5.s.f8810b;
            c3472p.resumeWith(Q5.s.b(h.b(h.f36417b.a(N()))));
        } else {
            if (e1Var instanceof a) {
                ((a) e1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + e1Var).toString());
        }
    }

    static /* synthetic */ Object z0(b bVar, Object obj, U5.d dVar) {
        j jVar = (j) f36369h.get(bVar);
        while (true) {
            long andIncrement = f36365d.getAndIncrement(bVar);
            long j8 = 1152921504606846975L & andIncrement;
            boolean a02 = bVar.a0(andIncrement);
            int i8 = p6.c.f36394b;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (jVar.f39163c != j9) {
                j L8 = bVar.L(j9, jVar);
                if (L8 == null) {
                    if (a02) {
                        Object l02 = bVar.l0(obj, dVar);
                        if (l02 == V5.b.e()) {
                            return l02;
                        }
                    }
                } else {
                    jVar = L8;
                }
            }
            int I02 = bVar.I0(jVar, i9, obj, j8, null, a02);
            if (I02 != 0) {
                if (I02 == 1) {
                    break;
                }
                if (I02 != 2) {
                    if (I02 != 3) {
                        if (I02 != 4) {
                            if (I02 == 5) {
                                jVar.b();
                            }
                        } else {
                            if (j8 < bVar.P()) {
                                jVar.b();
                            }
                            Object l03 = bVar.l0(obj, dVar);
                            if (l03 == V5.b.e()) {
                                return l03;
                            }
                        }
                    } else {
                        Object A02 = bVar.A0(jVar, i9, obj, j8, dVar);
                        if (A02 == V5.b.e()) {
                            return A02;
                        }
                    }
                } else if (a02) {
                    jVar.p();
                    Object l04 = bVar.l0(obj, dVar);
                    if (l04 == V5.b.e()) {
                        return l04;
                    }
                }
            } else {
                jVar.b();
                break;
            }
        }
        return I.f8786a;
    }

    @Override // p6.v
    public boolean A() {
        return a0(f36365d.get(this));
    }

    protected boolean D(Throwable th, boolean z8) {
        C3980F c3980f;
        if (z8) {
            e0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36372k;
        c3980f = p6.c.f36411s;
        boolean a9 = androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3980f, th);
        if (z8) {
            f0();
        } else {
            g0();
        }
        G();
        i0();
        if (a9) {
            V();
        }
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(long j8) {
        C3980F c3980f;
        Q d8;
        j jVar = (j) f36370i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f36366e;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f36374a + j9, M())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, j9 + 1)) {
                int i8 = p6.c.f36394b;
                long j10 = j9 / i8;
                int i9 = (int) (j9 % i8);
                if (jVar.f39163c != j10) {
                    j K8 = K(j10, jVar);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                }
                Object G02 = G0(jVar, i9, j9, null);
                c3980f = p6.c.f36407o;
                if (G02 == c3980f) {
                    if (j9 < R()) {
                        jVar.b();
                    }
                } else {
                    jVar.b();
                    Function1 function1 = this.f36375b;
                    if (function1 != null && (d8 = x.d(function1, G02, null, 2, null)) != null) {
                        throw d8;
                    }
                }
            }
        }
    }

    public final void M0(long j8) {
        int i8;
        long j9;
        long v8;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z8;
        long v9;
        long j10;
        long v10;
        if (c0()) {
            return;
        }
        do {
        } while (M() <= j8);
        i8 = p6.c.f36395c;
        for (int i9 = 0; i9 < i8; i9++) {
            long M8 = M();
            if (M8 == (f36368g.get(this) & 4611686018427387903L) && M8 == M()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f36368g;
        do {
            j9 = atomicLongFieldUpdater2.get(this);
            v8 = p6.c.v(j9 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, v8));
        while (true) {
            long M9 = M();
            atomicLongFieldUpdater = f36368g;
            long j11 = atomicLongFieldUpdater.get(this);
            long j12 = j11 & 4611686018427387903L;
            if ((4611686018427387904L & j11) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (M9 == j12 && M9 == M()) {
                break;
            } else if (!z8) {
                v9 = p6.c.v(j12, true);
                atomicLongFieldUpdater.compareAndSet(this, j11, v9);
            }
        }
        do {
            j10 = atomicLongFieldUpdater.get(this);
            v10 = p6.c.v(j10 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, v10));
    }

    protected final Throwable N() {
        return (Throwable) f36372k.get(this);
    }

    public final long P() {
        return f36366e.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable Q() {
        Throwable N8 = N();
        if (N8 == null) {
            return new o("Channel was closed");
        }
        return N8;
    }

    public final long R() {
        return f36365d.get(this) & 1152921504606846975L;
    }

    public final boolean S() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36370i;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long P8 = P();
            if (R() <= P8) {
                return false;
            }
            int i8 = p6.c.f36394b;
            long j8 = P8 / i8;
            if (jVar.f39163c != j8 && (jVar = K(j8, jVar)) == null) {
                if (((j) atomicReferenceFieldUpdater.get(this)).f39163c < j8) {
                    return false;
                }
            } else {
                jVar.b();
                if (W(jVar, (int) (P8 % i8), P8)) {
                    return true;
                }
                f36366e.compareAndSet(this, P8, P8 + 1);
            }
        }
    }

    public boolean Y() {
        return Z(f36365d.get(this));
    }

    protected boolean b0() {
        return false;
    }

    @Override // p6.u
    public Object c() {
        Object obj;
        j jVar;
        C3980F c3980f;
        e1 e1Var;
        C3980F c3980f2;
        C3980F c3980f3;
        long j8 = f36366e.get(this);
        long j9 = f36365d.get(this);
        if (Z(j9)) {
            return h.f36417b.a(N());
        }
        if (j8 < (j9 & 1152921504606846975L)) {
            obj = p6.c.f36403k;
            j jVar2 = (j) f36370i.get(this);
            while (!Y()) {
                long andIncrement = f36366e.getAndIncrement(this);
                int i8 = p6.c.f36394b;
                long j10 = andIncrement / i8;
                int i9 = (int) (andIncrement % i8);
                if (jVar2.f39163c != j10) {
                    j K8 = K(j10, jVar2);
                    if (K8 == null) {
                        continue;
                    } else {
                        jVar = K8;
                    }
                } else {
                    jVar = jVar2;
                }
                Object G02 = G0(jVar, i9, andIncrement, obj);
                c3980f = p6.c.f36405m;
                if (G02 != c3980f) {
                    c3980f2 = p6.c.f36407o;
                    if (G02 != c3980f2) {
                        c3980f3 = p6.c.f36406n;
                        if (G02 != c3980f3) {
                            jVar.b();
                            return h.f36417b.c(G02);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < R()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    if (obj instanceof e1) {
                        e1Var = (e1) obj;
                    } else {
                        e1Var = null;
                    }
                    if (e1Var != null) {
                        p0(e1Var, jVar, i9);
                    }
                    M0(andIncrement);
                    jVar.p();
                    return h.f36417b.b();
                }
            }
            return h.f36417b.a(N());
        }
        return h.f36417b.b();
    }

    @Override // p6.u
    public final void cancel(CancellationException cancellationException) {
        z(cancellationException);
    }

    @Override // p6.v
    public boolean d(Throwable th) {
        return D(th, false);
    }

    @Override // p6.u
    public f iterator() {
        return new a();
    }

    @Override // p6.v
    public Object l(Object obj, U5.d dVar) {
        return z0(this, obj, dVar);
    }

    @Override // p6.u
    public Object s(U5.d dVar) {
        return r0(this, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:            r3 = (p6.j) r3.e();     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.toString():java.lang.String");
    }

    @Override // p6.v
    public void w(Function1 function1) {
        C3980F c3980f;
        C3980F c3980f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3980F c3980f3;
        C3980F c3980f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f36373l;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            c3980f = p6.c.f36409q;
            if (obj != c3980f) {
                c3980f2 = p6.c.f36410r;
                if (obj == c3980f2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f36373l;
            c3980f3 = p6.c.f36409q;
            c3980f4 = p6.c.f36410r;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3980f3, c3980f4));
        function1.invoke(N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:            return p6.h.f36417b.c(Q5.I.f8786a);     */
    @Override // p6.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p6.b.f36365d
            long r0 = r0.get(r14)
            boolean r0 = r14.B0(r0)
            if (r0 == 0) goto L13
            p6.h$b r15 = p6.h.f36417b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            s6.F r8 = p6.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r14)
            p6.j r0 = (p6.j) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = j()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = k(r14, r1)
            int r1 = p6.c.f36394b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f39163c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            p6.j r1 = b(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            p6.h$b r15 = p6.h.f36417b
            java.lang.Throwable r0 = r14.Q()
            java.lang.Object r15 = r15.a(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = u(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.P()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.p()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof n6.e1
            if (r15 == 0) goto La1
            n6.e1 r8 = (n6.e1) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            q(r14, r8, r13, r12)
        La7:
            r13.p()
            p6.h$b r15 = p6.h.f36417b
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            p6.h$b r15 = p6.h.f36417b
            Q5.I r0 = Q5.I.f8786a
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.x(java.lang.Object):java.lang.Object");
    }

    @Override // p6.u
    public Object y(U5.d dVar) {
        return s0(this, dVar);
    }

    public boolean z(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return D(th, true);
    }

    protected void i0() {
    }

    protected void n0() {
    }

    protected void o0() {
    }
}
