package j$.time.temporal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.time.chrono.AbstractC2983a;
import j$.time.chrono.AbstractC2991i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f32978a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f32979b;

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final long l(o oVar) {
                int[] iArr;
                if (!m(oVar)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                int j8 = oVar.j(a.DAY_OF_YEAR);
                int j9 = oVar.j(a.MONTH_OF_YEAR);
                long r8 = oVar.r(a.YEAR);
                iArr = h.f32978a;
                int i8 = (j9 - 1) / 3;
                j$.time.chrono.t.f32869d.getClass();
                return j8 - iArr[i8 + (j$.time.chrono.t.m(r8) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.DAY_OF_YEAR) && oVar.f(a.MONTH_OF_YEAR) && oVar.f(a.YEAR)) {
                    r rVar = j.f32982a;
                    if (((AbstractC2983a) AbstractC2991i.p(oVar)).equals(j$.time.chrono.t.f32869d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m r(m mVar, long j8) {
                long l8 = l(mVar);
                j().b(j8, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j8 - l8) + mVar.r(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.r
            public final w u(o oVar) {
                if (!m(oVar)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                long r8 = oVar.r(h.QUARTER_OF_YEAR);
                if (r8 != 1) {
                    return r8 == 2 ? w.j(1L, 91L) : (r8 == 3 || r8 == 4) ? w.j(1L, 92L) : j();
                }
                long r9 = oVar.r(a.YEAR);
                j$.time.chrono.t.f32869d.getClass();
                return j$.time.chrono.t.m(r9) ? w.j(1L, 91L) : w.j(1L, 90L);
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w j() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final long l(o oVar) {
                if (m(oVar)) {
                    return (oVar.r(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.MONTH_OF_YEAR)) {
                    r rVar = j.f32982a;
                    if (((AbstractC2983a) AbstractC2991i.p(oVar)).equals(j$.time.chrono.t.f32869d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m r(m mVar, long j8) {
                long l8 = l(mVar);
                j().b(j8, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j8 - l8) * 3) + mVar.r(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.r
            public final w u(o oVar) {
                if (m(oVar)) {
                    return j();
                }
                throw new RuntimeException("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final long l(o oVar) {
                if (m(oVar)) {
                    return h.D(j$.time.h.F(oVar));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f32982a;
                    if (((AbstractC2983a) AbstractC2991i.p(oVar)).equals(j$.time.chrono.t.f32869d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m r(m mVar, long j8) {
                j().b(j8, this);
                return mVar.e(j$.com.android.tools.r8.a.m(j8, l(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.r
            public final w u(o oVar) {
                if (m(oVar)) {
                    return h.G(j$.time.h.F(oVar));
                }
                throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w j() {
                return a.YEAR.j();
            }

            @Override // j$.time.temporal.r
            public final long l(o oVar) {
                int H8;
                if (!m(oVar)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                H8 = h.H(j$.time.h.F(oVar));
                return H8;
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f32982a;
                    if (((AbstractC2983a) AbstractC2991i.p(oVar)).equals(j$.time.chrono.t.f32869d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final m r(m mVar, long j8) {
                int I8;
                if (!m(mVar)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                int a9 = a.YEAR.j().a(j8, h.WEEK_BASED_YEAR);
                j$.time.h F8 = j$.time.h.F(mVar);
                int j9 = F8.j(a.DAY_OF_WEEK);
                int D8 = h.D(F8);
                if (D8 == 53) {
                    I8 = h.I(a9);
                    if (I8 == 52) {
                        D8 = 52;
                    }
                }
                return mVar.l(j$.time.h.P(a9, 1, 4).T(((D8 - 1) * 7) + (j9 - r6.j(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.r
            public final w u(o oVar) {
                if (m(oVar)) {
                    return a.YEAR.j();
                }
                throw new RuntimeException("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f32979b = new h[]{hVar, hVar2, hVar3, hVar4};
        f32978a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(j$.time.h hVar) {
        int ordinal = hVar.I().ordinal();
        int i8 = 1;
        int J8 = hVar.J() - 1;
        int i9 = (3 - ordinal) + J8;
        int i10 = i9 - ((i9 / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (J8 < i11) {
            return (int) w.j(1L, I(H(hVar.Z(SubsamplingScaleImageView.ORIENTATION_180).V(-1L)))).d();
        }
        int i12 = ((J8 - i11) / 7) + 1;
        if (i12 != 53 || i11 == -3 || (i11 == -2 && hVar.N())) {
            i8 = i12;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w G(j$.time.h hVar) {
        return w.j(1L, I(H(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(j$.time.h hVar) {
        int L8 = hVar.L();
        int J8 = hVar.J();
        if (J8 <= 3) {
            return J8 - hVar.I().ordinal() < -2 ? L8 - 1 : L8;
        }
        if (J8 >= 363) {
            return ((J8 - 363) - (hVar.N() ? 1 : 0)) - hVar.I().ordinal() >= 0 ? L8 + 1 : L8;
        }
        return L8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(int i8) {
        j$.time.h P8 = j$.time.h.P(i8, 1, 1);
        if (P8.I() != j$.time.e.THURSDAY) {
            return (P8.I() == j$.time.e.WEDNESDAY && P8.N()) ? 53 : 52;
        }
        return 53;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f32979b.clone();
    }

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }
}
