package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends AbstractC2986d {

    /* renamed from: d, reason: collision with root package name */
    static final j$.time.h f32874d = j$.time.h.P(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f32875a;

    /* renamed from: b, reason: collision with root package name */
    private transient z f32876b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f32877c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(j$.time.h hVar) {
        if (hVar.M(f32874d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        z i8 = z.i(hVar);
        this.f32876b = i8;
        this.f32877c = (hVar.L() - i8.n().L()) + 1;
        this.f32875a = hVar;
    }

    private y L(j$.time.h hVar) {
        return hVar.equals(this.f32875a) ? this : new y(hVar);
    }

    private y M(z zVar, int i8) {
        w.f32872d.getClass();
        if (!(zVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int L8 = (zVar.n().L() + i8) - 1;
        if (i8 != 1 && (L8 < -999999999 || L8 > 999999999 || L8 < zVar.n().L() || zVar != z.i(j$.time.h.P(L8, 1, 1)))) {
            throw new RuntimeException("Invalid yearOfEra value");
        }
        return L(this.f32875a.a0(L8));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC2986d
    public final n E() {
        return this.f32876b;
    }

    @Override // j$.time.chrono.AbstractC2986d
    /* renamed from: F */
    public final InterfaceC2984b z(long j8, j$.time.temporal.u uVar) {
        return (y) super.z(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b G(long j8) {
        return L(this.f32875a.T(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b H(long j8) {
        return L(this.f32875a.U(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    final InterfaceC2984b I(long j8) {
        return L(this.f32875a.V(j8));
    }

    @Override // j$.time.chrono.AbstractC2986d
    /* renamed from: J */
    public final InterfaceC2984b l(j$.time.temporal.p pVar) {
        return (y) super.l(pVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final y d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (y) super.d(j8, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (r(aVar) == j8) {
            return this;
        }
        int[] iArr = x.f32873a;
        int i8 = iArr[aVar.ordinal()];
        j$.time.h hVar = this.f32875a;
        if (i8 == 3 || i8 == 8 || i8 == 9) {
            int a9 = w.f32872d.m(aVar).a(j8, aVar);
            int i9 = iArr[aVar.ordinal()];
            if (i9 == 3) {
                return M(this.f32876b, a9);
            }
            if (i9 == 8) {
                return M(z.y(a9), this.f32877c);
            }
            if (i9 == 9) {
                return L(hVar.a0(a9));
            }
        }
        return L(hVar.d(j8, rVar));
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final m a() {
        return w.f32872d;
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b, j$.time.temporal.m
    public final InterfaceC2984b e(long j8, j$.time.temporal.u uVar) {
        return (y) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j8, j$.time.temporal.u uVar) {
        return (y) super.e(j8, uVar);
    }

    @Override // j$.time.chrono.AbstractC2986d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f32875a.equals(((y) obj).f32875a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b, j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).v() : rVar != null && rVar.m(this);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final int hashCode() {
        w.f32872d.getClass();
        return this.f32875a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return (y) super.l(hVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        int O8;
        long j8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        if (!f(rVar)) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = x.f32873a[aVar.ordinal()];
        j$.time.h hVar = this.f32875a;
        if (i8 != 1) {
            z zVar = this.f32876b;
            if (i8 != 2) {
                if (i8 != 3) {
                    return w.f32872d.m(aVar);
                }
                int L8 = zVar.n().L();
                z q8 = zVar.q();
                j8 = q8 != null ? (q8.n().L() - L8) + 1 : 999999999 - L8;
                return j$.time.temporal.w.j(1L, j8);
            }
            z q9 = zVar.q();
            O8 = (q9 == null || q9.n().L() != hVar.L()) ? hVar.N() ? 366 : 365 : q9.n().J() - 1;
            if (this.f32877c == 1) {
                O8 -= zVar.n().J() - 1;
            }
        } else {
            O8 = hVar.O();
        }
        j8 = O8;
        return j$.time.temporal.w.j(1L, j8);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = x.f32873a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f32877c;
        z zVar = this.f32876b;
        j$.time.h hVar = this.f32875a;
        switch (i8) {
            case 2:
                return i9 == 1 ? (hVar.J() - zVar.n().J()) + 1 : hVar.J();
            case 3:
                return i9;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return zVar.getValue();
            default:
                return hVar.r(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final long s() {
        return this.f32875a.s();
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.chrono.InterfaceC2984b
    public final InterfaceC2987e t(j$.time.k kVar) {
        return C2989g.F(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC2986d, j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return (y) super.z(j8, uVar);
    }
}
