package j$.time;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2991i;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f32947e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f32948f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f32949g;

    /* renamed from: h, reason: collision with root package name */
    private static final k[] f32950h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    private final byte f32951a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f32952b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f32953c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32954d;

    static {
        int i8 = 0;
        while (true) {
            k[] kVarArr = f32950h;
            if (i8 >= kVarArr.length) {
                k kVar = kVarArr[0];
                f32949g = kVar;
                k kVar2 = kVarArr[12];
                f32947e = kVar;
                f32948f = new k(23, 59, 59, 999999999);
                return;
            }
            kVarArr[i8] = new k(i8, 0, 0, 0);
            i8++;
        }
    }

    private k(int i8, int i9, int i10, int i11) {
        this.f32951a = (byte) i8;
        this.f32952b = (byte) i9;
        this.f32953c = (byte) i10;
        this.f32954d = i11;
    }

    private static k E(int i8, int i9, int i10, int i11) {
        return ((i9 | i10) | i11) == 0 ? f32950h[i8] : new k(i8, i9, i10, i11);
    }

    public static k F(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        k kVar = (k) oVar.u(j$.time.temporal.n.g());
        if (kVar != null) {
            return kVar;
        }
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private int G(j$.time.temporal.r rVar) {
        int i8 = j.f32945a[((j$.time.temporal.a) rVar).ordinal()];
        byte b9 = this.f32952b;
        int i9 = this.f32954d;
        byte b10 = this.f32951a;
        switch (i8) {
            case 1:
                return i9;
            case 2:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i9 / 1000;
            case 4:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i9 / 1000000;
            case 6:
                return (int) (U() / 1000000);
            case 7:
                return this.f32953c;
            case 8:
                return V();
            case 9:
                return b9;
            case 10:
                return (b10 * 60) + b9;
            case 11:
                return b10 % 12;
            case 12:
                int i10 = b10 % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return b10;
            case 14:
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return b10 / 12;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public static k K(int i8) {
        j$.time.temporal.a.HOUR_OF_DAY.D(i8);
        return f32950h[i8];
    }

    public static k L(int i8, int i9, int i10, int i11) {
        j$.time.temporal.a.HOUR_OF_DAY.D(i8);
        j$.time.temporal.a.MINUTE_OF_HOUR.D(i9);
        j$.time.temporal.a.SECOND_OF_MINUTE.D(i10);
        j$.time.temporal.a.NANO_OF_SECOND.D(i11);
        return E(i8, i9, i10, i11);
    }

    public static k M(long j8) {
        j$.time.temporal.a.NANO_OF_DAY.D(j8);
        int i8 = (int) (j8 / 3600000000000L);
        long j9 = j8 - (i8 * 3600000000000L);
        int i9 = (int) (j9 / 60000000000L);
        long j10 = j9 - (i9 * 60000000000L);
        int i10 = (int) (j10 / C.NANOS_PER_SECOND);
        return E(i8, i9, i10, (int) (j10 - (i10 * C.NANOS_PER_SECOND)));
    }

    public static k N(long j8) {
        j$.time.temporal.a.SECOND_OF_DAY.D(j8);
        int i8 = (int) (j8 / 3600);
        long j9 = j8 - (i8 * 3600);
        return E(i8, (int) (j9 / 60), (int) (j9 - (r0 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static k T(DataInput dataInput) {
        int i8;
        int i9;
        int readByte = dataInput.readByte();
        byte b9 = 0;
        if (readByte >= 0) {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r52 = ~readByte2;
                i9 = 0;
                b9 = r52;
                i8 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i8 = ~readByte3;
                    b9 = readByte2;
                } else {
                    int readInt = dataInput.readInt();
                    i8 = readByte3;
                    i9 = readInt;
                    b9 = readByte2;
                }
            }
            return L(readByte, b9, i8, i9);
        }
        readByte = ~readByte;
        i8 = 0;
        i9 = 0;
        return L(readByte, b9, i8, i9);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int compare = Integer.compare(this.f32951a, kVar.f32951a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f32952b, kVar.f32952b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f32953c, kVar.f32953c);
        return compare3 == 0 ? Integer.compare(this.f32954d, kVar.f32954d) : compare3;
    }

    public final int H() {
        return this.f32951a;
    }

    public final int I() {
        return this.f32954d;
    }

    public final int J() {
        return this.f32953c;
    }

    @Override // j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final k e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (k) uVar.j(this, j8);
        }
        switch (j.f32946b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return R(j8);
            case 2:
                return R((j8 % 86400000000L) * 1000);
            case 3:
                return R((j8 % 86400000) * 1000000);
            case 4:
                return S(j8);
            case 5:
                return Q(j8);
            case 6:
                return P(j8);
            case 7:
                return P((j8 % 2) * 12);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final k P(long j8) {
        if (j8 == 0) {
            return this;
        }
        return E(((((int) (j8 % 24)) + this.f32951a) + 24) % 24, this.f32952b, this.f32953c, this.f32954d);
    }

    public final k Q(long j8) {
        if (j8 == 0) {
            return this;
        }
        int i8 = (this.f32951a * 60) + this.f32952b;
        int i9 = ((((int) (j8 % 1440)) + i8) + 1440) % 1440;
        return i8 == i9 ? this : E(i9 / 60, i9 % 60, this.f32953c, this.f32954d);
    }

    public final k R(long j8) {
        if (j8 == 0) {
            return this;
        }
        long U8 = U();
        long j9 = (((j8 % 86400000000000L) + U8) + 86400000000000L) % 86400000000000L;
        return U8 == j9 ? this : E((int) (j9 / 3600000000000L), (int) ((j9 / 60000000000L) % 60), (int) ((j9 / C.NANOS_PER_SECOND) % 60), (int) (j9 % C.NANOS_PER_SECOND));
    }

    public final k S(long j8) {
        if (j8 == 0) {
            return this;
        }
        int i8 = (this.f32952b * 60) + (this.f32951a * 3600) + this.f32953c;
        int i9 = ((((int) (j8 % 86400)) + i8) + 86400) % 86400;
        return i8 == i9 ? this : E(i9 / 3600, (i9 / 60) % 60, i9 % 60, this.f32954d);
    }

    public final long U() {
        return (this.f32953c * C.NANOS_PER_SECOND) + (this.f32952b * 60000000000L) + (this.f32951a * 3600000000000L) + this.f32954d;
    }

    public final int V() {
        return (this.f32952b * 60) + (this.f32951a * 3600) + this.f32953c;
    }

    @Override // j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final k d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (k) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.D(j8);
        int i8 = j.f32945a[aVar.ordinal()];
        byte b9 = this.f32952b;
        byte b10 = this.f32953c;
        int i9 = this.f32954d;
        byte b11 = this.f32951a;
        switch (i8) {
            case 1:
                return X((int) j8);
            case 2:
                return M(j8);
            case 3:
                return X(((int) j8) * 1000);
            case 4:
                return M(j8 * 1000);
            case 5:
                return X(((int) j8) * 1000000);
            case 6:
                return M(j8 * 1000000);
            case 7:
                int i10 = (int) j8;
                if (b10 == i10) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.D(i10);
                return E(b11, b9, i10, i9);
            case 8:
                return S(j8 - V());
            case 9:
                int i11 = (int) j8;
                if (b9 == i11) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.D(i11);
                return E(b11, i11, b10, i9);
            case 10:
                return Q(j8 - ((b11 * 60) + b9));
            case 11:
                return P(j8 - (b11 % 12));
            case 12:
                if (j8 == 12) {
                    j8 = 0;
                }
                return P(j8 - (b11 % 12));
            case 13:
                int i12 = (int) j8;
                if (b11 == i12) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.D(i12);
                return E(i12, b9, b10, i9);
            case 14:
                if (j8 == 24) {
                    j8 = 0;
                }
                int i13 = (int) j8;
                if (b11 == i13) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.D(i13);
                return E(i13, b9, b10, i9);
            case 15:
                return P((j8 - (b11 / 12)) * 12);
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    public final k X(int i8) {
        if (this.f32954d == i8) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.D(i8);
        return E(this.f32951a, this.f32952b, this.f32953c, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        int i8;
        byte b9 = this.f32953c;
        byte b10 = this.f32951a;
        byte b11 = this.f32952b;
        int i9 = this.f32954d;
        if (i9 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b9);
            dataOutput.writeInt(i9);
            return;
        }
        if (b9 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            i8 = ~b9;
        } else if (b11 == 0) {
            i8 = ~b10;
        } else {
            dataOutput.writeByte(b10);
            i8 = ~b11;
        }
        dataOutput.writeByte(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f32951a == kVar.f32951a && this.f32952b == kVar.f32952b && this.f32953c == kVar.f32953c && this.f32954d == kVar.f32954d;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).E() : rVar != null && rVar.m(this);
    }

    public final int hashCode() {
        long U8 = U();
        return (int) (U8 ^ (U8 >>> 32));
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? G(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return (k) AbstractC2991i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.NANO_OF_DAY ? U() : rVar == j$.time.temporal.a.MICRO_OF_DAY ? U() / 1000 : G(rVar) : rVar.l(this);
    }

    public final String toString() {
        int i8;
        StringBuilder sb = new StringBuilder(18);
        byte b9 = this.f32951a;
        sb.append(b9 < 10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "");
        sb.append((int) b9);
        byte b10 = this.f32952b;
        sb.append(b10 < 10 ? ":0" : ":");
        sb.append((int) b10);
        byte b11 = this.f32953c;
        int i9 = this.f32954d;
        if (b11 > 0 || i9 > 0) {
            sb.append(b11 < 10 ? ":0" : ":");
            sb.append((int) b11);
            if (i9 > 0) {
                sb.append('.');
                int i10 = 1000000;
                if (i9 % 1000000 == 0) {
                    i8 = (i9 / 1000000) + 1000;
                } else {
                    if (i9 % 1000 == 0) {
                        i9 /= 1000;
                    } else {
                        i10 = 1000000000;
                    }
                    i8 = i9 + i10;
                }
                sb.append(Integer.toString(i8).substring(1));
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.n.f()) {
            return null;
        }
        return tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(U(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
