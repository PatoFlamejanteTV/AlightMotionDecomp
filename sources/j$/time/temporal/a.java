package j$.time.temporal;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public enum a implements r {
    NANO_OF_SECOND("NanoOfSecond", w.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", w.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", w.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", w.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", w.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", w.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", w.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", w.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", w.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", w.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", w.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", w.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", w.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", w.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", w.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", w.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", w.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", w.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", w.k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", w.k(365, 366)),
    EPOCH_DAY("EpochDay", w.j(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", w.k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", w.j(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", w.j(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", w.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", w.k(999999999, C.NANOS_PER_SECOND)),
    YEAR("Year", w.j(-999999999, 999999999), 0),
    ERA("Era", w.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", w.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", w.j(-64800, 64800));


    /* renamed from: a, reason: collision with root package name */
    private final String f32973a;

    /* renamed from: b, reason: collision with root package name */
    private final w f32974b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, w wVar) {
        this.f32973a = str;
        this.f32974b = wVar;
    }

    a(String str, w wVar, int i8) {
        this.f32973a = str;
        this.f32974b = wVar;
    }

    public final void D(long j8) {
        this.f32974b.b(j8, this);
    }

    public final boolean E() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.r
    public final w j() {
        return this.f32974b;
    }

    @Override // j$.time.temporal.r
    public final long l(o oVar) {
        return oVar.r(this);
    }

    @Override // j$.time.temporal.r
    public final boolean m(o oVar) {
        return oVar.f(this);
    }

    @Override // j$.time.temporal.r
    public final m r(m mVar, long j8) {
        return mVar.d(j8, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32973a;
    }

    @Override // j$.time.temporal.r
    public final w u(o oVar) {
        return oVar.m(this);
    }

    @Override // j$.time.temporal.r
    public final boolean v() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final int z(long j8) {
        return this.f32974b.a(j8, this);
    }
}
