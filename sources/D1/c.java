package D1;

/* loaded from: classes4.dex */
public enum c {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");


    /* renamed from: a, reason: collision with root package name */
    private final String f1226a;

    c(String str) {
        this.f1226a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1226a;
    }
}
