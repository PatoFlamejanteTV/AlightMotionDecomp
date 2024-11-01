package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2983a;
import j$.time.chrono.AbstractC2991i;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    private final int f33008a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33009b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.v();
    }

    private w(int i8, int i9) {
        this.f33008a = i8;
        this.f33009b = i9;
    }

    private long D() {
        return ((this.f33008a * 12) + this.f33009b) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w H(DataInput dataInput) {
        int readInt = dataInput.readInt();
        byte readByte = dataInput.readByte();
        j$.time.temporal.a.YEAR.D(readInt);
        j$.time.temporal.a.MONTH_OF_YEAR.D(readByte);
        return new w(readInt, readByte);
    }

    private w I(int i8, int i9) {
        return (this.f33008a == i8 && this.f33009b == i9) ? this : new w(i8, i9);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final w e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (w) uVar.j(this, j8);
        }
        switch (v.f33007b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return F(j8);
            case 2:
                return G(j8);
            case 3:
                return G(j$.com.android.tools.r8.a.l(j8, 10));
            case 4:
                return G(j$.com.android.tools.r8.a.l(j8, 100));
            case 5:
                return G(j$.com.android.tools.r8.a.l(j8, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j8), aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final w F(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f33008a * 12) + (this.f33009b - 1) + j8;
        long j10 = 12;
        return I(j$.time.temporal.a.YEAR.z(j$.com.android.tools.r8.a.k(j9, j10)), ((int) j$.com.android.tools.r8.a.j(j9, j10)) + 1);
    }

    public final w G(long j8) {
        return j8 == 0 ? this : I(j$.time.temporal.a.YEAR.z(this.f33008a + j8), this.f33009b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final w d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (w) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.D(j8);
        int i8 = v.f33006a[aVar.ordinal()];
        int i9 = this.f33008a;
        if (i8 == 1) {
            int i10 = (int) j8;
            j$.time.temporal.a.MONTH_OF_YEAR.D(i10);
            return I(i9, i10);
        }
        if (i8 == 2) {
            return F(j8 - D());
        }
        int i11 = this.f33009b;
        if (i8 == 3) {
            if (i9 < 1) {
                j8 = 1 - j8;
            }
            int i12 = (int) j8;
            j$.time.temporal.a.YEAR.D(i12);
            return I(i12, i11);
        }
        if (i8 == 4) {
            int i13 = (int) j8;
            j$.time.temporal.a.YEAR.D(i13);
            return I(i13, i11);
        }
        if (i8 != 5) {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        if (r(j$.time.temporal.a.ERA) == j8) {
            return this;
        }
        int i14 = 1 - i9;
        j$.time.temporal.a.YEAR.D(i14);
        return I(i14, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(DataOutput dataOutput) {
        dataOutput.writeInt(this.f33008a);
        dataOutput.writeByte(this.f33009b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        int i8 = this.f33008a - wVar.f33008a;
        return i8 == 0 ? this.f33009b - wVar.f33009b : i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f33008a == wVar.f33008a && this.f33009b == wVar.f33009b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        return (this.f33009b << 27) ^ this.f33008a;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return (w) AbstractC2991i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f33008a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = v.f33006a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 == 1) {
            return this.f33009b;
        }
        if (i8 == 2) {
            return D();
        }
        int i9 = this.f33008a;
        if (i8 == 3) {
            if (i9 < 1) {
                i9 = 1 - i9;
            }
            return i9;
        }
        if (i8 == 4) {
            return i9;
        }
        if (i8 == 5) {
            return i9 < 1 ? 0 : 1;
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    public final String toString() {
        int i8;
        int i9 = this.f33008a;
        int abs = Math.abs(i9);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            if (i9 < 0) {
                sb.append(i9 - 10000);
                i8 = 1;
            } else {
                sb.append(i9 + 10000);
                i8 = 0;
            }
            sb.deleteCharAt(i8);
        } else {
            sb.append(i9);
        }
        int i10 = this.f33009b;
        sb.append(i10 < 10 ? "-0" : "-");
        sb.append(i10);
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.t.f32869d : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((AbstractC2983a) AbstractC2991i.p(mVar)).equals(j$.time.chrono.t.f32869d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.d(D(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
