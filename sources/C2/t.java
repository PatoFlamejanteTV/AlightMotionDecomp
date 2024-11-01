package c2;

/* loaded from: classes4.dex */
public final class t extends IndexOutOfBoundsException {

    /* renamed from: a, reason: collision with root package name */
    private final String f15360a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15361b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15362c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15363d;

    public t(String str, String str2, String str3, int i8) {
        super("Method too large: " + str + "." + str2 + " " + str3);
        this.f15360a = str;
        this.f15361b = str2;
        this.f15362c = str3;
        this.f15363d = i8;
    }
}
