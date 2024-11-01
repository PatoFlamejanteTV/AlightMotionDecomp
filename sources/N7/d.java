package N7;

/* loaded from: classes5.dex */
public enum d {
    ALWAYS("always"),
    WIFI_ONLY("wifi_only"),
    EXCEPTION("exception");


    /* renamed from: a, reason: collision with root package name */
    private final String f6884a;

    d(String str) {
        this.f6884a = str;
    }

    public static d b(String str) {
        for (d dVar : values()) {
            if (dVar.f6884a.equals(str)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f6884a;
    }
}
