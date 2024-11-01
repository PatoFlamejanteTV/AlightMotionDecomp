package g1;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2888b implements InterfaceC2887a {

    /* renamed from: a, reason: collision with root package name */
    private static C2888b f31932a;

    private C2888b() {
    }

    public static C2888b a() {
        if (f31932a == null) {
            f31932a = new C2888b();
        }
        return f31932a;
    }

    @Override // g1.InterfaceC2887a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
