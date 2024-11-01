package C1;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f755a;

    /* renamed from: b, reason: collision with root package name */
    private final String f756b;

    private l(String str, String str2) {
        this.f755a = str;
        this.f756b = str2;
    }

    public static l a(String str, String str2) {
        I1.g.f(str, "Name is null or empty");
        I1.g.f(str2, "Version is null or empty");
        return new l(str, str2);
    }

    public String b() {
        return this.f755a;
    }

    public String c() {
        return this.f756b;
    }
}
