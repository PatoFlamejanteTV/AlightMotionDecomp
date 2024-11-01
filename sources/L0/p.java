package l0;

/* loaded from: classes3.dex */
public enum p {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    private final String f34621a;

    p(String str) {
        this.f34621a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f34621a;
    }
}
