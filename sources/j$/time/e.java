package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e implements j$.time.temporal.o, j$.time.temporal.p {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    /* renamed from: a, reason: collision with root package name */
    private static final e[] f32883a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ e[] f32884b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.time.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.e, java.lang.Enum] */
    static {
        ?? r72 = new Enum("MONDAY", 0);
        MONDAY = r72;
        ?? r8 = new Enum("TUESDAY", 1);
        TUESDAY = r8;
        ?? r9 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r9;
        ?? r10 = new Enum("THURSDAY", 3);
        THURSDAY = r10;
        ?? r11 = new Enum("FRIDAY", 4);
        FRIDAY = r11;
        ?? r12 = new Enum("SATURDAY", 5);
        SATURDAY = r12;
        ?? r13 = new Enum("SUNDAY", 6);
        SUNDAY = r13;
        f32884b = new e[]{r72, r8, r9, r10, r11, r12, r13};
        f32883a = values();
    }

    public static e D(int i8) {
        if (i8 >= 1 && i8 <= 7) {
            return f32883a[i8 - 1];
        }
        throw new RuntimeException("Invalid value for DayOfWeek: " + i8);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f32884b.clone();
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.DAY_OF_WEEK : rVar != null && rVar.m(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.DAY_OF_WEEK ? rVar.j() : j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", rVar));
        }
        return rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.DAYS : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
