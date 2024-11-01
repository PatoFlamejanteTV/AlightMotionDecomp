package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2983a;
import j$.time.chrono.AbstractC2991i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33004b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    private final int f33005a;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.v();
    }

    private u(int i8) {
        this.f33005a = i8;
    }

    public static u D(int i8) {
        j$.time.temporal.a.YEAR.D(i8);
        return new u(i8);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final u e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (u) uVar.j(this, j8);
        }
        int i8 = t.f32971b[((j$.time.temporal.b) uVar).ordinal()];
        if (i8 == 1) {
            return F(j8);
        }
        if (i8 == 2) {
            return F(j$.com.android.tools.r8.a.l(j8, 10));
        }
        if (i8 == 3) {
            return F(j$.com.android.tools.r8.a.l(j8, 100));
        }
        if (i8 == 4) {
            return F(j$.com.android.tools.r8.a.l(j8, 1000));
        }
        if (i8 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.f(r(aVar), j8), aVar);
        }
        throw new RuntimeException("Unsupported unit: " + uVar);
    }

    public final u F(long j8) {
        return j8 == 0 ? this : D(j$.time.temporal.a.YEAR.z(this.f33005a + j8));
    }

    @Override // j$.time.temporal.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final u d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (u) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.D(j8);
        int i8 = t.f32970a[aVar.ordinal()];
        int i9 = this.f33005a;
        if (i8 == 1) {
            if (i9 < 1) {
                j8 = 1 - j8;
            }
            return D((int) j8);
        }
        if (i8 == 2) {
            return D((int) j8);
        }
        if (i8 == 3) {
            return r(j$.time.temporal.a.ERA) == j8 ? this : D(1 - i9);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(DataOutput dataOutput) {
        dataOutput.writeInt(this.f33005a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33005a - ((u) obj).f33005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f33005a == ((u) obj).f33005a;
        }
        return false;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        return this.f33005a;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return (u) AbstractC2991i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f33005a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = t.f32970a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f33005a;
        if (i8 == 1) {
            if (i9 < 1) {
                i9 = 1 - i9;
            }
            return i9;
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 3) {
            return i9 < 1 ? 0 : 1;
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final String toString() {
        return Integer.toString(this.f33005a);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.t.f32869d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.YEARS : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((AbstractC2983a) AbstractC2991i.p(mVar)).equals(j$.time.chrono.t.f32869d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.f33005a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
