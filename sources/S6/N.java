package s6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public class N {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39180b = AtomicIntegerFieldUpdater.newUpdater(N.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    private O[] f39181a;

    private final O[] f() {
        O[] oArr = this.f39181a;
        if (oArr == null) {
            O[] oArr2 = new O[4];
            this.f39181a = oArr2;
            return oArr2;
        }
        if (c() >= oArr.length) {
            Object[] copyOf = Arrays.copyOf(oArr, c() * 2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            O[] oArr3 = (O[]) copyOf;
            this.f39181a = oArr3;
            return oArr3;
        }
        return oArr;
    }

    private final void j(int i8) {
        f39180b.set(this, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:            if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            s6.O[] r2 = r5.f39181a
            kotlin.jvm.internal.AbstractC3292y.f(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC3292y.f(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC3292y.f(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC3292y.f(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC3292y.f(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.N.k(int):void");
    }

    private final void l(int i8) {
        while (i8 > 0) {
            O[] oArr = this.f39181a;
            AbstractC3292y.f(oArr);
            int i9 = (i8 - 1) / 2;
            O o8 = oArr[i9];
            AbstractC3292y.f(o8);
            O o9 = oArr[i8];
            AbstractC3292y.f(o9);
            if (((Comparable) o8).compareTo(o9) <= 0) {
                return;
            }
            m(i8, i9);
            i8 = i9;
        }
    }

    private final void m(int i8, int i9) {
        O[] oArr = this.f39181a;
        AbstractC3292y.f(oArr);
        O o8 = oArr[i9];
        AbstractC3292y.f(o8);
        O o9 = oArr[i8];
        AbstractC3292y.f(o9);
        oArr[i8] = o8;
        oArr[i9] = o9;
        o8.setIndex(i8);
        o9.setIndex(i9);
    }

    public final void a(O o8) {
        o8.a(this);
        O[] f8 = f();
        int c8 = c();
        j(c8 + 1);
        f8[c8] = o8;
        o8.setIndex(c8);
        l(c8);
    }

    public final O b() {
        O[] oArr = this.f39181a;
        if (oArr != null) {
            return oArr[0];
        }
        return null;
    }

    public final int c() {
        return f39180b.get(this);
    }

    public final boolean d() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final O e() {
        O b9;
        synchronized (this) {
            b9 = b();
        }
        return b9;
    }

    public final boolean g(O o8) {
        boolean z8;
        synchronized (this) {
            if (o8.c() == null) {
                z8 = false;
            } else {
                h(o8.getIndex());
                z8 = true;
            }
        }
        return z8;
    }

    public final O h(int i8) {
        O[] oArr = this.f39181a;
        AbstractC3292y.f(oArr);
        j(c() - 1);
        if (i8 < c()) {
            m(i8, c());
            int i9 = (i8 - 1) / 2;
            if (i8 > 0) {
                O o8 = oArr[i8];
                AbstractC3292y.f(o8);
                O o9 = oArr[i9];
                AbstractC3292y.f(o9);
                if (((Comparable) o8).compareTo(o9) < 0) {
                    m(i8, i9);
                    l(i9);
                }
            }
            k(i8);
        }
        O o10 = oArr[c()];
        AbstractC3292y.f(o10);
        o10.a(null);
        o10.setIndex(-1);
        oArr[c()] = null;
        return o10;
    }

    public final O i() {
        O o8;
        synchronized (this) {
            if (c() > 0) {
                o8 = h(0);
            } else {
                o8 = null;
            }
        }
        return o8;
    }
}
