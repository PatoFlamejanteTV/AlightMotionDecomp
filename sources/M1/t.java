package m1;

/* loaded from: classes4.dex */
public enum t implements X0.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    private final int f34950a;

    t(int i8) {
        this.f34950a = i8;
    }

    @Override // X0.f
    public int getNumber() {
        return this.f34950a;
    }
}
