package n6;

import U5.g;
import m6.C3374a;

/* loaded from: classes5.dex */
public abstract class X {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f35681a;

        /* renamed from: b, reason: collision with root package name */
        int f35682b;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35681a = obj;
            this.f35682b |= Integer.MIN_VALUE;
            return X.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(U5.d r4) {
        /*
            boolean r0 = r4 instanceof n6.X.a
            if (r0 == 0) goto L13
            r0 = r4
            n6.X$a r0 = (n6.X.a) r0
            int r1 = r0.f35682b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35682b = r1
            goto L18
        L13:
            n6.X$a r0 = new n6.X$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f35681a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f35682b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            Q5.t.b(r4)
            goto L52
        L31:
            Q5.t.b(r4)
            r0.f35682b = r3
            n6.p r4 = new n6.p
            U5.d r2 = V5.b.c(r0)
            r4.<init>(r2, r3)
            r4.B()
            java.lang.Object r4 = r4.y()
            java.lang.Object r2 = V5.b.e()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            Q5.h r4 = new Q5.h
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.X.a(U5.d):java.lang.Object");
    }

    public static final Object b(long j8, U5.d dVar) {
        if (j8 <= 0) {
            return Q5.I.f8786a;
        }
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        if (j8 < Long.MAX_VALUE) {
            d(c3472p.getContext()).i(j8, c3472p);
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return Q5.I.f8786a;
    }

    public static final Object c(long j8, U5.d dVar) {
        Object b9 = b(e(j8), dVar);
        if (b9 == V5.b.e()) {
            return b9;
        }
        return Q5.I.f8786a;
    }

    public static final W d(U5.g gVar) {
        W w8;
        g.b bVar = gVar.get(U5.e.f10146a0);
        if (bVar instanceof W) {
            w8 = (W) bVar;
        } else {
            w8 = null;
        }
        if (w8 == null) {
            return T.a();
        }
        return w8;
    }

    public static final long e(long j8) {
        if (C3374a.g(j8, C3374a.f35036b.b()) > 0) {
            return i6.m.e(C3374a.o(j8), 1L);
        }
        return 0L;
    }
}
