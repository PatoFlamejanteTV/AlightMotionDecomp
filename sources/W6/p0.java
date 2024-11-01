package W6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC1494u f10867a = new s0();

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC1496w f10868b = new u0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1494u a(C1478e c1478e) {
        if (c1478e.f() < 1) {
            return f10867a;
        }
        return new s0(c1478e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1496w b(C1478e c1478e) {
        if (c1478e.f() < 1) {
            return f10868b;
        }
        return new u0(c1478e);
    }
}
