package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2991i;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    private final long f32801a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32802b;

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f32800c = new Instant(0, 0);
    public static final Instant MIN = H(-31557014167219200L, 0);
    public static final Instant MAX = H(31556889864403199L, 999999999);

    private Instant(long j8, int i8) {
        this.f32801a = j8;
        this.f32802b = i8;
    }

    private static Instant D(long j8, int i8) {
        if ((i8 | j8) == 0) {
            return f32800c;
        }
        if (j8 < -31557014167219200L || j8 > 31556889864403199L) {
            throw new RuntimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j8, i8);
    }

    public static Instant G() {
        a.f32819b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant H(long j8, long j9) {
        return D(j$.com.android.tools.r8.a.f(j8, j$.com.android.tools.r8.a.k(j9, C.NANOS_PER_SECOND)), (int) j$.com.android.tools.r8.a.j(j9, C.NANOS_PER_SECOND));
    }

    private Instant I(long j8, long j9) {
        if ((j8 | j9) == 0) {
            return this;
        }
        return H(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.f32801a, j8), j9 / C.NANOS_PER_SECOND), this.f32802b + (j9 % C.NANOS_PER_SECOND));
    }

    public static Instant ofEpochMilli(long j8) {
        long j9 = 1000;
        return D(j$.com.android.tools.r8.a.k(j8, j9), ((int) j$.com.android.tools.r8.a.j(j8, j9)) * 1000000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    public final long E() {
        return this.f32801a;
    }

    public final int F() {
        return this.f32802b;
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.j(this, j8);
        }
        switch (f.f32886b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return I(0L, j8);
            case 2:
                return I(j8 / 1000000, (j8 % 1000000) * 1000);
            case 3:
                return I(j8 / 1000, (j8 % 1000) * 1000000);
            case 4:
                return I(j8, 0L);
            case 5:
                return I(j$.com.android.tools.r8.a.l(j8, 60), 0L);
            case 6:
                return I(j$.com.android.tools.r8.a.l(j8, 3600), 0L);
            case 7:
                return I(j$.com.android.tools.r8.a.l(j8, 43200), 0L);
            case 8:
                return I(j$.com.android.tools.r8.a.l(j8, 86400), 0L);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(DataOutput dataOutput) {
        dataOutput.writeLong(this.f32801a);
        dataOutput.writeInt(this.f32802b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.E(this, zoneOffset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f32801a, instant2.f32801a);
        return compare != 0 ? compare : this.f32802b - instant2.f32802b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:            if (r7 != r2) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:            if (r7 != r2) goto L20;     */
    @Override // j$.time.temporal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.m d(long r6, j$.time.temporal.r r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L53
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.D(r6)
            int[] r1 = j$.time.f.f32885a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            int r2 = r5.f32802b
            long r3 = r5.f32801a
            if (r0 == r1) goto L4c
            r1 = 2
            if (r0 == r1) goto L46
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 != r1) goto L2d
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L2b
            j$.time.Instant r6 = D(r6, r2)
            goto L59
        L2b:
            r6 = r5
            goto L59
        L2d:
            j$.time.temporal.v r6 = new j$.time.temporal.v
            java.lang.String r7 = "Unsupported field: "
            java.lang.String r7 = j$.time.d.a(r7, r8)
            r6.<init>(r7)
            throw r6
        L39:
            int r7 = (int) r6
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r6
            if (r7 == r2) goto L2b
        L41:
            j$.time.Instant r6 = D(r3, r7)
            goto L59
        L46:
            int r7 = (int) r6
            int r7 = r7 * 1000
            if (r7 == r2) goto L2b
            goto L41
        L4c:
            long r0 = (long) r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r7 = (int) r6
            goto L41
        L53:
            j$.time.temporal.m r6 = r8.r(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.d(long, j$.time.temporal.r):j$.time.temporal.m");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f32801a == instant.f32801a && this.f32802b == instant.f32802b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.m(this);
    }

    public int hashCode() {
        long j8 = this.f32801a;
        return (this.f32802b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, rVar).a(rVar.l(this), rVar);
        }
        int i8 = f.f32885a[((j$.time.temporal.a) rVar).ordinal()];
        int i9 = this.f32802b;
        if (i8 == 1) {
            return i9;
        }
        if (i8 == 2) {
            return i9 / 1000;
        }
        if (i8 == 3) {
            return i9 / 1000000;
        }
        if (i8 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.z(this.f32801a);
        }
        throw new RuntimeException(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(h hVar) {
        return (Instant) AbstractC2991i.a(hVar, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        int i8;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i9 = f.f32885a[((j$.time.temporal.a) rVar).ordinal()];
        int i10 = this.f32802b;
        if (i9 == 1) {
            return i10;
        }
        if (i9 == 2) {
            i8 = i10 / 1000;
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    return this.f32801a;
                }
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
            }
            i8 = i10 / 1000000;
        }
        return i8;
    }

    public long toEpochMilli() {
        long l8;
        int i8;
        int i9 = this.f32802b;
        long j8 = this.f32801a;
        if (j8 >= 0 || i9 <= 0) {
            l8 = j$.com.android.tools.r8.a.l(j8, 1000);
            i8 = i9 / 1000000;
        } else {
            l8 = j$.com.android.tools.r8.a.l(j8 + 1, 1000);
            i8 = (i9 / 1000000) - 1000;
        }
        return j$.com.android.tools.r8.a.f(l8, i8);
    }

    public final String toString() {
        return DateTimeFormatter.f32887f.a(this);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(this.f32801a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f32802b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
