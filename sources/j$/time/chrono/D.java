package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class D extends AbstractC2986d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f32824a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f32824a = hVar;
    }

    private int K() {
        return this.f32824a.L() - 1911;
    }

    private D M(j$.time.h hVar) {
        return hVar.equals(this.f32824a) ? this : new D(hVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC2986d
    public final n E() {
        return K() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC2986d
    /* renamed from: F */
    public final InterfaceC2984b z(long j8, j$.time.temporal.u uVar) {
        return (D) super.z(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b G(long j8) {
        return M(this.f32824a.T(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b H(long j8) {
        return M(this.f32824a.U(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b I(long j8) {
        return M(this.f32824a.V(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    /* renamed from: J */
    public final InterfaceC2984b l(j$.time.temporal.p pVar) {
        return (D) super.l(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:            if (r2 != 7) goto L20;     */
    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.D d(long r9, j$.time.temporal.r r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.r(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.f32823a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f32824a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.f32822d
            j$.time.temporal.w r11 = r11.m(r0)
            r11.b(r9, r0)
            int r11 = r8.K()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.K()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.U(r9)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L4c:
            j$.time.chrono.B r2 = j$.time.chrono.B.f32822d
            j$.time.temporal.w r2 = r2.m(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.h r9 = r3.d(r9, r11)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L6b:
            int r9 = r8.K()
            int r9 = 1912 - r9
            j$.time.h r9 = r3.a0(r9)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L7a:
            int r2 = r2 + 1911
            j$.time.h r9 = r3.a0(r2)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L85:
            int r9 = r8.K()
            r10 = 1
            if (r9 < r10) goto L8f
            int r2 = r2 + 1911
            goto L91
        L8f:
            int r2 = 1912 - r2
        L91:
            j$.time.h r9 = r3.a0(r2)
            j$.time.chrono.D r9 = r8.M(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.d(long, j$.time.temporal.r):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final m a() {
        return B.f32822d;
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b, j$.time.temporal.m
    public final InterfaceC2984b e(long j8, j$.time.temporal.u uVar) {
        return (D) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (D) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f32824a.equals(((D) obj).f32824a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final int hashCode() {
        B.f32822d.getClass();
        return this.f32824a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return (D) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!AbstractC2991i.h(this, rVar)) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = C.f32823a[aVar.ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return this.f32824a.m(rVar);
        }
        if (i8 != 4) {
            return B.f32822d.m(aVar);
        }
        j$.time.temporal.w j8 = j$.time.temporal.a.YEAR.j();
        return j$.time.temporal.w.j(1L, K() <= 0 ? (-j8.e()) + 1912 : j8.d() - 1911);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = C.f32823a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 == 4) {
            int K8 = K();
            if (K8 < 1) {
                K8 = 1 - K8;
            }
            return K8;
        }
        j$.time.h hVar = this.f32824a;
        if (i8 == 5) {
            return ((K() * 12) + hVar.K()) - 1;
        }
        if (i8 == 6) {
            return K();
        }
        if (i8 != 7) {
            return hVar.r(rVar);
        }
        return K() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final long s() {
        return this.f32824a.s();
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final InterfaceC2987e t(j$.time.k kVar) {
        return C2989g.F(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return (D) super.z(j8, uVar);
    }
}
