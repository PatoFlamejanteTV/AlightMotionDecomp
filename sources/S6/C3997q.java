package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3997q {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39211a = AtomicReferenceFieldUpdater.newUpdater(C3997q.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39212b = AtomicReferenceFieldUpdater.newUpdater(C3997q.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39213c = AtomicReferenceFieldUpdater.newUpdater(C3997q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: s6.q$a */
    /* loaded from: classes5.dex */
    public static abstract class a extends AbstractC3982b {

        /* renamed from: b, reason: collision with root package name */
        public final C3997q f39214b;

        /* renamed from: c, reason: collision with root package name */
        public C3997q f39215c;

        public a(C3997q c3997q) {
            this.f39214b = c3997q;
        }

        @Override // s6.AbstractC3982b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(C3997q c3997q, Object obj) {
            boolean z8;
            C3997q c3997q2;
            if (obj == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                c3997q2 = this.f39214b;
            } else {
                c3997q2 = this.f39215c;
            }
            if (c3997q2 != null && androidx.concurrent.futures.a.a(C3997q.f39211a, c3997q, this, c3997q2) && z8) {
                C3997q c3997q3 = this.f39214b;
                C3997q c3997q4 = this.f39215c;
                AbstractC3292y.f(c3997q4);
                c3997q3.i(c3997q4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:            if (androidx.concurrent.futures.a.a(r4, r3, r2, ((s6.z) r5).f39231a) != false) goto L26;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final s6.C3997q f(s6.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = s6.C3997q.f39212b
            java.lang.Object r0 = r0.get(r8)
            s6.q r0 = (s6.C3997q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = s6.C3997q.f39211a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = s6.C3997q.f39212b
            boolean r0 = androidx.concurrent.futures.a.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof s6.y
            if (r6 == 0) goto L34
            s6.y r5 = (s6.y) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof s6.z
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            s6.z r5 = (s6.z) r5
            s6.q r5 = r5.f39231a
            boolean r2 = androidx.concurrent.futures.a.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = s6.C3997q.f39212b
            java.lang.Object r2 = r4.get(r2)
            s6.q r2 = (s6.C3997q) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC3292y.g(r5, r3)
            r3 = r5
            s6.q r3 = (s6.C3997q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C3997q.f(s6.y):s6.q");
    }

    private final C3997q g(C3997q c3997q) {
        while (c3997q.m()) {
            c3997q = (C3997q) f39212b.get(c3997q);
        }
        return c3997q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(C3997q c3997q) {
        C3997q c3997q2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39212b;
        do {
            c3997q2 = (C3997q) atomicReferenceFieldUpdater.get(c3997q);
            if (j() != c3997q) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f39212b, c3997q, c3997q2, this));
        if (m()) {
            c3997q.f(null);
        }
    }

    private final z p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39213c;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar == null) {
            z zVar2 = new z(this);
            atomicReferenceFieldUpdater.lazySet(this, zVar2);
            return zVar2;
        }
        return zVar;
    }

    public final boolean e(C3997q c3997q) {
        f39212b.lazySet(c3997q, this);
        f39211a.lazySet(c3997q, this);
        while (j() == this) {
            if (androidx.concurrent.futures.a.a(f39211a, this, this, c3997q)) {
                c3997q.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39211a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final C3997q k() {
        return AbstractC3996p.b(j());
    }

    public final C3997q l() {
        C3997q f8 = f(null);
        if (f8 == null) {
            return g((C3997q) f39212b.get(this));
        }
        return f8;
    }

    public boolean m() {
        return j() instanceof z;
    }

    public boolean n() {
        if (o() == null) {
            return true;
        }
        return false;
    }

    public final C3997q o() {
        Object j8;
        C3997q c3997q;
        do {
            j8 = j();
            if (j8 instanceof z) {
                return ((z) j8).f39231a;
            }
            if (j8 == this) {
                return (C3997q) j8;
            }
            AbstractC3292y.g(j8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c3997q = (C3997q) j8;
        } while (!androidx.concurrent.futures.a.a(f39211a, this, j8, c3997q.p()));
        c3997q.f(null);
        return null;
    }

    public final int q(C3997q c3997q, C3997q c3997q2, a aVar) {
        f39212b.lazySet(c3997q, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39211a;
        atomicReferenceFieldUpdater.lazySet(c3997q, c3997q2);
        aVar.f39215c = c3997q2;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3997q2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new kotlin.jvm.internal.I(this) { // from class: s6.q.b
            @Override // j6.j
            public Object get() {
                return n6.Q.a(this.receiver);
            }
        } + '@' + n6.Q.b(this);
    }
}
