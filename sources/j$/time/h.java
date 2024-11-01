package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.chrono.AbstractC2991i;
import j$.time.chrono.InterfaceC2984b;
import j$.time.chrono.InterfaceC2987e;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.p, InterfaceC2984b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f32939d = P(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h f32940e = P(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    private final int f32941a;

    /* renamed from: b, reason: collision with root package name */
    private final short f32942b;

    /* renamed from: c, reason: collision with root package name */
    private final short f32943c;

    static {
        P(1970, 1, 1);
    }

    private h(int i8, int i9, int i10) {
        this.f32941a = i8;
        this.f32942b = (short) i9;
        this.f32943c = (short) i10;
    }

    private static h E(int i8, int i9, int i10) {
        int i11 = 28;
        if (i10 > 28) {
            if (i9 != 2) {
                i11 = (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f32869d.getClass();
                if (j$.time.chrono.t.m(i8)) {
                    i11 = 29;
                }
            }
            if (i10 > i11) {
                if (i10 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i8 + "' is not a leap year");
                }
                throw new RuntimeException("Invalid date '" + m.G(i9).name() + " " + i10 + "'");
            }
        }
        return new h(i8, i9, i10);
    }

    public static h F(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        h hVar = (h) oVar.u(j$.time.temporal.n.f());
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private int G(j$.time.temporal.r rVar) {
        int i8;
        int i9 = g.f32937a[((j$.time.temporal.a) rVar).ordinal()];
        short s8 = this.f32943c;
        int i10 = this.f32941a;
        switch (i9) {
            case 1:
                return s8;
            case 2:
                return J();
            case 3:
                i8 = (s8 - 1) / 7;
                break;
            case 4:
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return I().getValue();
            case 6:
                i8 = (s8 - 1) % 7;
                break;
            case 7:
                return ((J() - 1) % 7) + 1;
            case 8:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((J() - 1) / 7) + 1;
            case 10:
                return this.f32942b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i10;
            case 13:
                return i10 >= 1 ? 1 : 0;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return i8 + 1;
    }

    public static h P(int i8, int i9, int i10) {
        j$.time.temporal.a.YEAR.D(i8);
        j$.time.temporal.a.MONTH_OF_YEAR.D(i9);
        j$.time.temporal.a.DAY_OF_MONTH.D(i10);
        return E(i8, i9, i10);
    }

    public static h Q(int i8, m mVar, int i9) {
        j$.time.temporal.a.YEAR.D(i8);
        Objects.requireNonNull(mVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.D(i9);
        return E(i8, mVar.getValue(), i9);
    }

    public static h R(long j8) {
        long j9;
        j$.time.temporal.a.EPOCH_DAY.D(j8);
        long j10 = 719468 + j8;
        if (j10 < 0) {
            long j11 = ((j8 + 719469) / 146097) - 1;
            j9 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j9 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i8 = (int) j13;
        int i9 = ((i8 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.z(j12 + j9 + (i9 / 10)), ((i9 + 2) % 12) + 1, (i8 - (((i9 * 306) + 5) / 10)) + 1);
    }

    private static h W(int i8, int i9, int i10) {
        int i11;
        if (i9 != 2) {
            if (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) {
                i11 = 30;
            }
            return new h(i8, i9, i10);
        }
        j$.time.chrono.t.f32869d.getClass();
        i11 = j$.time.chrono.t.m((long) i8) ? 29 : 28;
        i10 = Math.min(i10, i11);
        return new h(i8, i9, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC2984b interfaceC2984b) {
        return interfaceC2984b instanceof h ? D((h) interfaceC2984b) : AbstractC2991i.b(this, interfaceC2984b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int D(h hVar) {
        int i8 = this.f32941a - hVar.f32941a;
        if (i8 != 0) {
            return i8;
        }
        int i9 = this.f32942b - hVar.f32942b;
        return i9 == 0 ? this.f32943c - hVar.f32943c : i9;
    }

    public final int H() {
        return this.f32943c;
    }

    public final e I() {
        return e.D(((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1);
    }

    public final int J() {
        return (m.G(this.f32942b).D(N()) + this.f32943c) - 1;
    }

    public final int K() {
        return this.f32942b;
    }

    public final int L() {
        return this.f32941a;
    }

    public final boolean M(InterfaceC2984b interfaceC2984b) {
        return interfaceC2984b instanceof h ? D((h) interfaceC2984b) < 0 : s() < interfaceC2984b.s();
    }

    public final boolean N() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f32869d;
        long j8 = this.f32941a;
        tVar.getClass();
        return j$.time.chrono.t.m(j8);
    }

    public final int O() {
        short s8 = this.f32942b;
        return s8 != 2 ? (s8 == 4 || s8 == 6 || s8 == 9 || s8 == 11) ? 30 : 31 : N() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final h e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) uVar.j(this, j8);
        }
        switch (g.f32938b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return T(j8);
            case 2:
                return T(j$.com.android.tools.r8.a.l(j8, 7));
            case 3:
                return U(j8);
            case 4:
                return V(j8);
            case 5:
                return V(j$.com.android.tools.r8.a.l(j8, 10));
            case 6:
                return V(j$.com.android.tools.r8.a.l(j8, 100));
            case 7:
                return V(j$.com.android.tools.r8.a.l(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j8), aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    public final h T(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = this.f32943c + j8;
        if (j9 > 0) {
            short s8 = this.f32942b;
            int i8 = this.f32941a;
            if (j9 <= 28) {
                return new h(i8, s8, (int) j9);
            }
            if (j9 <= 59) {
                long O8 = O();
                if (j9 <= O8) {
                    return new h(i8, s8, (int) j9);
                }
                if (s8 < 12) {
                    return new h(i8, s8 + 1, (int) (j9 - O8));
                }
                int i9 = i8 + 1;
                j$.time.temporal.a.YEAR.D(i9);
                return new h(i9, 1, (int) (j9 - O8));
            }
        }
        return R(j$.com.android.tools.r8.a.f(s(), j8));
    }

    public final h U(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j9 = (this.f32941a * 12) + (this.f32942b - 1) + j8;
        long j10 = 12;
        return W(j$.time.temporal.a.YEAR.z(j$.com.android.tools.r8.a.k(j9, j10)), ((int) j$.com.android.tools.r8.a.j(j9, j10)) + 1, this.f32943c);
    }

    public final h V(long j8) {
        return j8 == 0 ? this : W(j$.time.temporal.a.YEAR.z(this.f32941a + j8), this.f32942b, this.f32943c);
    }

    @Override // j$.time.temporal.m
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final h d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) rVar.r(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.D(j8);
        int i8 = g.f32937a[aVar.ordinal()];
        short s8 = this.f32943c;
        short s9 = this.f32942b;
        int i9 = this.f32941a;
        switch (i8) {
            case 1:
                int i10 = (int) j8;
                return s8 == i10 ? this : P(i9, s9, i10);
            case 2:
                return Z((int) j8);
            case 3:
                return T(j$.com.android.tools.r8.a.l(j8 - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i9 < 1) {
                    j8 = 1 - j8;
                }
                return a0((int) j8);
            case 5:
                return T(j8 - I().getValue());
            case 6:
                return T(j8 - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return T(j8 - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return R(j8);
            case 9:
                return T(j$.com.android.tools.r8.a.l(j8 - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i11 = (int) j8;
                if (s9 == i11) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.D(i11);
                return W(i9, i11, s8);
            case 11:
                return U(j8 - (((i9 * 12) + s9) - 1));
            case 12:
                return a0((int) j8);
            case 13:
                return r(j$.time.temporal.a.ERA) == j8 ? this : a0(1 - i9);
            default:
                throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.temporal.m
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final h l(j$.time.temporal.p pVar) {
        return pVar instanceof h ? (h) pVar : (h) pVar.v(this);
    }

    public final h Z(int i8) {
        if (J() == i8) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i9 = this.f32941a;
        long j8 = i9;
        aVar.D(j8);
        j$.time.temporal.a.DAY_OF_YEAR.D(i8);
        j$.time.chrono.t.f32869d.getClass();
        boolean m8 = j$.time.chrono.t.m(j8);
        if (i8 == 366 && !m8) {
            throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i9 + "' is not a leap year");
        }
        m G8 = m.G(((i8 - 1) / 31) + 1);
        if (i8 > (G8.E(m8) + G8.D(m8)) - 1) {
            G8 = G8.H();
        }
        return new h(i9, G8.getValue(), (i8 - G8.D(m8)) + 1);
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f32869d;
    }

    public final h a0(int i8) {
        if (this.f32941a == i8) {
            return this;
        }
        j$.time.temporal.a.YEAR.D(i8);
        return W(i8, this.f32942b, this.f32943c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f32941a);
        dataOutput.writeByte(this.f32942b);
        dataOutput.writeByte(this.f32943c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && D((h) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return AbstractC2991i.h(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final int hashCode() {
        int i8 = this.f32941a;
        return (((i8 << 11) + (this.f32942b << 6)) + this.f32943c) ^ (i8 & (-2048));
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? G(rVar) : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.v()) {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        int i8 = g.f32937a[aVar.ordinal()];
        if (i8 == 1) {
            return j$.time.temporal.w.j(1L, O());
        }
        if (i8 == 2) {
            return j$.time.temporal.w.j(1L, N() ? 366 : 365);
        }
        if (i8 == 3) {
            return j$.time.temporal.w.j(1L, (m.G(this.f32942b) != m.FEBRUARY || N()) ? 5L : 4L);
        }
        if (i8 != 4) {
            return ((j$.time.temporal.a) rVar).j();
        }
        return j$.time.temporal.w.j(1L, this.f32941a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.EPOCH_DAY ? s() : rVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.f32941a * 12) + this.f32942b) - 1 : G(rVar) : rVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final long s() {
        long j8 = this.f32941a;
        long j9 = this.f32942b;
        long j10 = 365 * j8;
        long j11 = (((367 * j9) - 362) / 12) + (j8 >= 0 ? ((j8 + 399) / 400) + (((3 + j8) / 4) - ((99 + j8) / 100)) + j10 : j10 - ((j8 / (-400)) + ((j8 / (-4)) - (j8 / (-100))))) + (this.f32943c - 1);
        if (j9 > 2) {
            j11 = !N() ? j11 - 2 : j11 - 1;
        }
        return j11 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final InterfaceC2987e t(k kVar) {
        return LocalDateTime.O(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC2984b
    public final String toString() {
        int i8;
        int i9 = this.f32941a;
        int abs = Math.abs(i9);
        StringBuilder sb = new StringBuilder(10);
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
            if (i9 > 9999) {
                sb.append('+');
            }
            sb.append(i9);
        }
        short s8 = this.f32942b;
        sb.append(s8 < 10 ? "-0" : "-");
        sb.append((int) s8);
        short s9 = this.f32943c;
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append((int) s9);
        return sb.toString();
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this : AbstractC2991i.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return AbstractC2991i.a(this, mVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m z(long j8, j$.time.temporal.u uVar) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, uVar).e(1L, uVar) : e(-j8, uVar);
    }
}
