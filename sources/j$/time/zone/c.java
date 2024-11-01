package j$.time.zone;

/* loaded from: classes2.dex */
abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f33020a;

    static {
        int[] iArr = new int[d.values().length];
        f33020a = iArr;
        try {
            iArr[d.UTC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33020a[d.STANDARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
