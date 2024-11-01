package s6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f39217e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39218f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f39219g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final C3980F f39220h = new C3980F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    private final int f39221a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39222b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39223c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f39224d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final int a(long j8) {
            if ((j8 & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        public final long b(long j8, int i8) {
            return d(j8, 1073741823L) | i8;
        }

        public final long c(long j8, int i8) {
            return d(j8, 1152921503533105152L) | (i8 << 30);
        }

        public final long d(long j8, long j9) {
            return j8 & (~j9);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f39225a;

        public b(int i8) {
            this.f39225a = i8;
        }
    }

    public s(int i8, boolean z8) {
        this.f39221a = i8;
        this.f39222b = z8;
        int i9 = i8 - 1;
        this.f39223c = i9;
        this.f39224d = new AtomicReferenceArray(i8);
        if (i9 <= 1073741823) {
            if ((i8 & i9) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final s b(long j8) {
        s sVar = new s(this.f39221a * 2, this.f39222b);
        int i8 = (int) (1073741823 & j8);
        int i9 = (int) ((1152921503533105152L & j8) >> 30);
        while (true) {
            int i10 = this.f39223c;
            if ((i8 & i10) != (i9 & i10)) {
                Object obj = this.f39224d.get(i10 & i8);
                if (obj == null) {
                    obj = new b(i8);
                }
                sVar.f39224d.set(sVar.f39223c & i8, obj);
                i8++;
            } else {
                f39219g.set(sVar, f39217e.d(j8, 1152921504606846976L));
                return sVar;
            }
        }
    }

    private final s c(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39218f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            androidx.concurrent.futures.a.a(f39218f, this, null, b(j8));
        }
    }

    private final s e(int i8, Object obj) {
        Object obj2 = this.f39224d.get(this.f39223c & i8);
        if ((obj2 instanceof b) && ((b) obj2).f39225a == i8) {
            this.f39224d.set(i8 & this.f39223c, obj);
            return this;
        }
        return null;
    }

    private final long h() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39219g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                return j8;
            }
            j9 = j8 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    private final s k(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39219g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) (1073741823 & j8);
            if ((1152921504606846976L & j8) != 0) {
                return i();
            }
        } while (!f39219g.compareAndSet(this, j8, f39217e.b(j8, i9)));
        this.f39224d.set(this.f39223c & i10, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:            return 1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = s6.s.f39219g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            s6.s$a r13 = s6.s.f39217e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r9 = (int) r5
            int r10 = r12.f39223c
            int r1 = r9 + 2
            r1 = r1 & r10
            r5 = r2 & r10
            r6 = 1
            if (r1 != r5) goto L30
            return r6
        L30:
            boolean r1 = r12.f39222b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f39224d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4f
            int r1 = r12.f39221a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L4e
            int r9 = r9 - r2
            r2 = r9 & r5
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = s6.s.f39219g
            s6.s$a r5 = s6.s.f39217e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f39224d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = s6.s.f39219g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L81
            s6.s r0 = r0.i()
            s6.s r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.s.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39219g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j8 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j8 = f39219g.get(this);
        return 1073741823 & (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j8)));
    }

    public final boolean g() {
        long j8 = f39219g.get(this);
        if (((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public final s i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39219g;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j8) != 0) {
                return f39220h;
            }
            int i8 = (int) (1073741823 & j8);
            int i9 = (int) ((1152921503533105152L & j8) >> 30);
            int i10 = this.f39223c;
            if ((i9 & i10) == (i8 & i10)) {
                return null;
            }
            Object obj = this.f39224d.get(i10 & i8);
            if (obj == null) {
                if (this.f39222b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i11 = (i8 + 1) & 1073741823;
                if (f39219g.compareAndSet(this, j8, f39217e.b(j8, i11))) {
                    this.f39224d.set(this.f39223c & i8, null);
                    return obj;
                }
                if (this.f39222b) {
                    s sVar = this;
                    do {
                        sVar = sVar.k(i8, i11);
                    } while (sVar != null);
                    return obj;
                }
            }
        }
    }
}
