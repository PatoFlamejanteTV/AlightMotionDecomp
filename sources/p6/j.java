package p6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC3292y;
import s6.AbstractC3977C;

/* loaded from: classes5.dex */
public final class j extends AbstractC3977C {

    /* renamed from: e, reason: collision with root package name */
    private final b f36421e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReferenceArray f36422f;

    public j(long j8, j jVar, b bVar, int i8) {
        super(j8, jVar, i8);
        this.f36421e = bVar;
        this.f36422f = new AtomicReferenceArray(c.f36394b * 2);
    }

    private final void z(int i8, Object obj) {
        this.f36422f.lazySet(i8 * 2, obj);
    }

    public final void A(int i8, Object obj) {
        this.f36422f.set((i8 * 2) + 1, obj);
    }

    public final void B(int i8, Object obj) {
        z(i8, obj);
    }

    @Override // s6.AbstractC3977C
    public int n() {
        return c.f36394b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:            s(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:            if (r0 == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:            r4 = u().f36375b;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:            if (r4 == null) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:            s6.x.b(r4, r5, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:            return;     */
    @Override // s6.AbstractC3977C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, U5.g r6) {
        /*
            r3 = this;
            int r5 = p6.c.f36394b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof n6.e1
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof p6.w
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            s6.F r2 = p6.c.j()
            if (r1 == r2) goto L63
            s6.F r2 = p6.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            s6.F r2 = p6.c.p()
            if (r1 == r2) goto Le
            s6.F r2 = p6.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            s6.F r4 = p6.c.f()
            if (r1 == r4) goto L62
            s6.F r4 = p6.c.f36396d
            if (r1 != r4) goto L40
            goto L62
        L40:
            s6.F r4 = p6.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            p6.b r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.f36375b
            if (r4 == 0) goto L73
            s6.x.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            s6.F r2 = p6.c.j()
            goto L7f
        L7b:
            s6.F r2 = p6.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            p6.b r4 = r3.u()
            kotlin.jvm.functions.Function1 r4 = r4.f36375b
            if (r4 == 0) goto L9a
            s6.x.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.j.o(int, java.lang.Throwable, U5.g):void");
    }

    public final boolean r(int i8, Object obj, Object obj2) {
        return i.a(this.f36422f, (i8 * 2) + 1, obj, obj2);
    }

    public final void s(int i8) {
        z(i8, null);
    }

    public final Object t(int i8, Object obj) {
        return this.f36422f.getAndSet((i8 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f36421e;
        AbstractC3292y.f(bVar);
        return bVar;
    }

    public final Object v(int i8) {
        return this.f36422f.get(i8 * 2);
    }

    public final Object w(int i8) {
        return this.f36422f.get((i8 * 2) + 1);
    }

    public final void x(int i8, boolean z8) {
        if (z8) {
            u().M0((this.f39163c * c.f36394b) + i8);
        }
        p();
    }

    public final Object y(int i8) {
        Object v8 = v(i8);
        s(i8);
        return v8;
    }
}
