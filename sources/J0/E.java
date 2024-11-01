package J0;

/* loaded from: classes3.dex */
public enum E {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a, reason: collision with root package name */
    private final int f3848a;

    E(int i8) {
        this.f3848a = i8;
    }

    public static E b(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int c() {
        return this.f3848a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f3848a);
    }
}
