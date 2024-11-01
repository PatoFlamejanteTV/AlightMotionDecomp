package j$.time.chrono;

/* renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC2992j {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f32845a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f32845a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32845a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
