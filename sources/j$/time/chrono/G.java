package j$.time.chrono;

/* loaded from: classes2.dex */
abstract /* synthetic */ class G {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f32828a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f32828a = iArr;
        try {
            iArr[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32828a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32828a[j$.time.temporal.a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}