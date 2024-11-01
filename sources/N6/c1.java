package n6;

import s6.C3976B;

/* loaded from: classes5.dex */
public final class c1 extends C3976B {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal f35701e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c1(U5.g r3, U5.d r4) {
        /*
            r2 = this;
            n6.d1 r0 = n6.d1.f35703a
            U5.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            U5.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f35701e = r0
            U5.g r4 = r4.getContext()
            U5.e$b r0 = U5.e.f10146a0
            U5.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof n6.I
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = s6.J.c(r3, r4)
            s6.J.a(r3, r4)
            r2.O0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.c1.<init>(U5.g, U5.d):void");
    }

    @Override // s6.C3976B, n6.AbstractC3442a
    protected void J0(Object obj) {
        if (this.threadLocalIsSet) {
            Q5.r rVar = (Q5.r) this.f35701e.get();
            if (rVar != null) {
                s6.J.a((U5.g) rVar.a(), rVar.b());
            }
            this.f35701e.remove();
        }
        Object a9 = AbstractC3441G.a(obj, this.f39161d);
        U5.d dVar = this.f39161d;
        U5.g context = dVar.getContext();
        c1 c1Var = null;
        Object c8 = s6.J.c(context, null);
        if (c8 != s6.J.f39169a) {
            c1Var = H.g(dVar, context, c8);
        }
        try {
            this.f39161d.resumeWith(a9);
            Q5.I i8 = Q5.I.f8786a;
        } finally {
            if (c1Var == null || c1Var.N0()) {
                s6.J.a(context, c8);
            }
        }
    }

    public final boolean N0() {
        boolean z8;
        if (this.threadLocalIsSet && this.f35701e.get() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f35701e.remove();
        return !z8;
    }

    public final void O0(U5.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f35701e.set(Q5.x.a(gVar, obj));
    }
}
