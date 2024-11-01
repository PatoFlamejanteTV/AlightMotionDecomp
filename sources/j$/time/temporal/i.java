package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    private final String f32981a;

    static {
        Duration duration = Duration.f32797c;
    }

    i(String str) {
        this.f32981a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j8) {
        int i8 = c.f32977a[ordinal()];
        if (i8 == 1) {
            return mVar.d(j$.com.android.tools.r8.a.f(mVar.j(r0), j8), j.f32984c);
        }
        if (i8 == 2) {
            return mVar.e(j8 / 4, b.YEARS).e((j8 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32981a;
    }
}
