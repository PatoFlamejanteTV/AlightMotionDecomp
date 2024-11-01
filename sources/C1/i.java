package C1;

/* loaded from: classes4.dex */
public enum i {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* renamed from: a, reason: collision with root package name */
    private final String f746a;

    i(String str) {
        this.f746a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f746a;
    }
}
