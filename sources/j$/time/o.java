package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import j$.time.chrono.AbstractC2983a;
import j$.time.chrono.AbstractC2991i;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.o, j$.time.temporal.p, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    private final int f32959a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32960b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.f("--");
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.v();
    }

    private o(int i8, int i9) {
        this.f32959a = i8;
        this.f32960b = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o D(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        m G8 = m.G(readByte);
        Objects.requireNonNull(G8, "month");
        j$.time.temporal.a.DAY_OF_MONTH.D(readByte2);
        if (readByte2 <= G8.F()) {
            return new o(G8.getValue(), readByte2);
        }
        throw new RuntimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + G8.name());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(DataOutput dataOutput) {
        dataOutput.writeByte(this.f32959a);
        dataOutput.writeByte(this.f32960b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i8 = this.f32959a - oVar.f32959a;
        return i8 == 0 ? this.f32960b - oVar.f32960b : i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f32959a == oVar.f32959a && this.f32960b == oVar.f32960b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        return (this.f32959a << 6) + this.f32960b;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.j();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, rVar);
        }
        m G8 = m.G(this.f32959a);
        G8.getClass();
        int i8 = l.f32955a[G8.ordinal()];
        return j$.time.temporal.w.k(i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : 28, m.G(r5).F());
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        int i8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i9 = n.f32958a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 == 1) {
            i8 = this.f32960b;
        } else {
            if (i9 != 2) {
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            }
            i8 = this.f32959a;
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i8 = this.f32959a;
        sb.append(i8 < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
        sb.append(i8);
        int i9 = this.f32960b;
        sb.append(i9 < 10 ? "-0" : "-");
        sb.append(i9);
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? j$.time.chrono.t.f32869d : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((AbstractC2983a) AbstractC2991i.p(mVar)).equals(j$.time.chrono.t.f32869d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m d8 = mVar.d(this.f32959a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d8.d(Math.min(d8.m(aVar).d(), this.f32960b), aVar);
    }
}
