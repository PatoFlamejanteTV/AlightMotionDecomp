package w6;

import Q5.I;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.InterfaceC3470o;
import n6.e1;
import p6.i;
import s6.AbstractC3977C;
import s6.AbstractC3978D;
import s6.AbstractC3984d;
import s6.C3980F;

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4161d {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40764c = AtomicReferenceFieldUpdater.newUpdater(C4161d.class, Object.class, TtmlNode.TAG_HEAD);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40765d = AtomicLongFieldUpdater.newUpdater(C4161d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40766e = AtomicReferenceFieldUpdater.newUpdater(C4161d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f40767f = AtomicLongFieldUpdater.newUpdater(C4161d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f40768g = AtomicIntegerFieldUpdater.newUpdater(C4161d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    private final int f40769a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f40770b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w6.d$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends C3289v implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40771a = new a();

        a() {
            super(2, AbstractC4162e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C4163f d(long j8, C4163f c4163f) {
            C4163f h8;
            h8 = AbstractC4162e.h(j8, c4163f);
            return h8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C4163f) obj2);
        }
    }

    /* renamed from: w6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            C4161d.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w6.d$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C3289v implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40773a = new c();

        c() {
            super(2, AbstractC4162e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C4163f d(long j8, C4163f c4163f) {
            C4163f h8;
            h8 = AbstractC4162e.h(j8, c4163f);
            return h8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (C4163f) obj2);
        }
    }

    public C4161d(int i8, int i9) {
        this.f40769a = i8;
        if (i8 > 0) {
            if (i9 >= 0 && i9 <= i8) {
                C4163f c4163f = new C4163f(0L, null, 2);
                this.head = c4163f;
                this.tail = c4163f;
                this._availablePermits = i8 - i9;
                this.f40770b = new b();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
    }

    private final boolean f(e1 e1Var) {
        int i8;
        Object c8;
        int i9;
        C3980F c3980f;
        C3980F c3980f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40766e;
        C4163f c4163f = (C4163f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f40767f.getAndIncrement(this);
        a aVar = a.f40771a;
        i8 = AbstractC4162e.f40779f;
        long j8 = andIncrement / i8;
        loop0: while (true) {
            c8 = AbstractC3984d.c(c4163f, j8, aVar);
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
        C4163f c4163f2 = (C4163f) AbstractC3978D.b(c8);
        i9 = AbstractC4162e.f40779f;
        int i10 = (int) (andIncrement % i9);
        if (!i.a(c4163f2.r(), i10, null, e1Var)) {
            c3980f = AbstractC4162e.f40775b;
            c3980f2 = AbstractC4162e.f40776c;
            if (i.a(c4163f2.r(), i10, c3980f, c3980f2)) {
                if (e1Var instanceof InterfaceC3470o) {
                    AbstractC3292y.g(e1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC3470o) e1Var).o(I.f8786a, this.f40770b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + e1Var).toString());
            }
            return false;
        }
        e1Var.a(c4163f2, i10);
        return true;
    }

    private final void g() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = f40768g;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.f40769a;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f40768g.getAndDecrement(this);
        } while (andDecrement > this.f40769a);
        return andDecrement;
    }

    private final boolean l(Object obj) {
        if (obj instanceof InterfaceC3470o) {
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            InterfaceC3470o interfaceC3470o = (InterfaceC3470o) obj;
            Object n8 = interfaceC3470o.n(I.f8786a, null, this.f40770b);
            if (n8 != null) {
                interfaceC3470o.C(n8);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    private final boolean m() {
        int i8;
        Object c8;
        int i9;
        C3980F c3980f;
        C3980F c3980f2;
        int i10;
        C3980F c3980f3;
        C3980F c3980f4;
        C3980F c3980f5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40764c;
        C4163f c4163f = (C4163f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f40765d.getAndIncrement(this);
        i8 = AbstractC4162e.f40779f;
        long j8 = andIncrement / i8;
        c cVar = c.f40773a;
        loop0: while (true) {
            c8 = AbstractC3984d.c(c4163f, j8, cVar);
            if (AbstractC3978D.c(c8)) {
                break;
            }
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
        }
        C4163f c4163f2 = (C4163f) AbstractC3978D.b(c8);
        c4163f2.b();
        if (c4163f2.f39163c <= j8) {
            i9 = AbstractC4162e.f40779f;
            int i11 = (int) (andIncrement % i9);
            c3980f = AbstractC4162e.f40775b;
            Object andSet = c4163f2.r().getAndSet(i11, c3980f);
            if (andSet == null) {
                i10 = AbstractC4162e.f40774a;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = c4163f2.r().get(i11);
                    c3980f5 = AbstractC4162e.f40776c;
                    if (obj == c3980f5) {
                        return true;
                    }
                }
                c3980f3 = AbstractC4162e.f40775b;
                c3980f4 = AbstractC4162e.f40777d;
                return !i.a(c4163f2.r(), i11, c3980f3, c3980f4);
            }
            c3980f2 = AbstractC4162e.f40778e;
            if (andSet == c3980f2) {
                return false;
            }
            return l(andSet);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(InterfaceC3470o interfaceC3470o) {
        while (h() <= 0) {
            AbstractC3292y.g(interfaceC3470o, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((e1) interfaceC3470o)) {
                return;
            }
        }
        interfaceC3470o.o(I.f8786a, this.f40770b);
    }

    public int i() {
        return Math.max(f40768g.get(this), 0);
    }

    public void j() {
        do {
            int andIncrement = f40768g.getAndIncrement(this);
            if (andIncrement < this.f40769a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f40769a).toString());
            }
        } while (!m());
    }

    public boolean k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40768g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.f40769a) {
                g();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }
}
