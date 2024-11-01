package j$.time;

/* loaded from: classes2.dex */
abstract /* synthetic */ class v {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f33006a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f33007b;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f33007b = iArr;
        try {
            iArr[j$.time.temporal.b.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33007b[j$.time.temporal.b.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33007b[j$.time.temporal.b.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33007b[j$.time.temporal.b.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33007b[j$.time.temporal.b.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33007b[j$.time.temporal.b.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[j$.time.temporal.a.values().length];
        f33006a = iArr2;
        try {
            iArr2[j$.time.temporal.a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f33006a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f33006a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f33006a[j$.time.temporal.a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f33006a[j$.time.temporal.a.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
