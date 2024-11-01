package j$.time;

import j$.time.chrono.AbstractC2983a;
import j$.time.chrono.AbstractC2991i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m implements j$.time.temporal.o, j$.time.temporal.p {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* renamed from: a, reason: collision with root package name */
    private static final m[] f32956a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m[] f32957b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.m] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r72 = new Enum("JULY", 6);
        JULY = r72;
        ?? r62 = new Enum("AUGUST", 7);
        AUGUST = r62;
        ?? r52 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r52;
        ?? r42 = new Enum("OCTOBER", 9);
        OCTOBER = r42;
        ?? r32 = new Enum("NOVEMBER", 10);
        NOVEMBER = r32;
        ?? r22 = new Enum("DECEMBER", 11);
        DECEMBER = r22;
        f32957b = new m[]{r12, r13, r14, r15, r9, r8, r72, r62, r52, r42, r32, r22};
        f32956a = values();
    }

    public static m G(int i8) {
        if (i8 >= 1 && i8 <= 12) {
            return f32956a[i8 - 1];
        }
        throw new RuntimeException("Invalid value for MonthOfYear: " + i8);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f32957b.clone();
    }

    public final int D(boolean z8) {
        switch (l.f32955a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z8 ? 1 : 0) + 91;
            case 3:
                return (z8 ? 1 : 0) + 152;
            case 4:
                return (z8 ? 1 : 0) + 244;
            case 5:
                return (z8 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z8 ? 1 : 0) + 60;
            case 8:
                return (z8 ? 1 : 0) + 121;
            case 9:
                return (z8 ? 1 : 0) + 182;
            case 10:
                return (z8 ? 1 : 0) + 213;
            case 11:
                return (z8 ? 1 : 0) + 274;
            default:
                return (z8 ? 1 : 0) + 335;
        }
    }

    public final int E(boolean z8) {
        int i8 = l.f32955a[ordinal()];
        return i8 != 1 ? (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31 : z8 ? 29 : 28;
    }

    public final int F() {
        int i8 = l.f32955a[ordinal()];
        if (i8 != 1) {
            return (i8 == 2 || i8 == 3 || i8 == 4 || i8 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final m H() {
        return f32956a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR : rVar != null && rVar.m(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.MONTH_OF_YEAR ? rVar.j() : j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return rVar.l(this);
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
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
