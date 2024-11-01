package Q;

/* renamed from: Q.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1389i {

    /* renamed from: a, reason: collision with root package name */
    private final String f8269a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8270b;

    public C1389i(String str) {
        this(str, null);
    }

    public C1389i(String str, String str2) {
        AbstractC1396p.m(str, "log tag cannot be null");
        AbstractC1396p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f8269a = str;
        this.f8270b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
