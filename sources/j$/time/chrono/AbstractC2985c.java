package j$.time.chrono;

/* renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC2985c {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f32836a;

    static {
        int[] iArr = new int[j$.time.temporal.b.values().length];
        f32836a = iArr;
        try {
            iArr[j$.time.temporal.b.DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32836a[j$.time.temporal.b.WEEKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32836a[j$.time.temporal.b.MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32836a[j$.time.temporal.b.YEARS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f32836a[j$.time.temporal.b.DECADES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f32836a[j$.time.temporal.b.CENTURIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f32836a[j$.time.temporal.b.MILLENNIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f32836a[j$.time.temporal.b.ERAS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
