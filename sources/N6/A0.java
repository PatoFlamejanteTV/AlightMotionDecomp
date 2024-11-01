package n6;

/* loaded from: classes5.dex */
public class A0 extends F0 implements InterfaceC3435A {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35619c;

    public A0(InterfaceC3488x0 interfaceC3488x0) {
        super(true);
        g0(interfaceC3488x0);
        this.f35619c = J0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            r0 = r0.c0();     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:            if ((r0 instanceof n6.C3483v) == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:            r0 = (n6.C3483v) r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:            if (r0 == null) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:            r0 = r0.s();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            if (r0 != null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:            if (r0 != null) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:            if (r0.Z() == false) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean J0() {
        /*
            r4 = this;
            n6.u r0 = r4.c0()
            boolean r1 = r0 instanceof n6.C3483v
            r2 = 0
            if (r1 == 0) goto Lc
            n6.v r0 = (n6.C3483v) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            n6.F0 r0 = r0.s()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.Z()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            n6.u r0 = r0.c0()
            boolean r3 = r0 instanceof n6.C3483v
            if (r3 == 0) goto L2a
            n6.v r0 = (n6.C3483v) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            n6.F0 r0 = r0.s()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.A0.J0():boolean");
    }

    @Override // n6.F0
    public boolean Z() {
        return this.f35619c;
    }

    @Override // n6.InterfaceC3435A
    public boolean a(Throwable th) {
        return l0(new C3437C(th, false, 2, null));
    }

    @Override // n6.F0
    public boolean a0() {
        return true;
    }

    @Override // n6.InterfaceC3435A
    public boolean complete() {
        return l0(Q5.I.f8786a);
    }
}
