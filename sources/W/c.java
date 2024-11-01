package w;

/* loaded from: classes3.dex */
public final class c implements InterfaceC4139b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f40649b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f40650a;

    private c(Object obj) {
        this.f40650a = obj;
    }

    public static InterfaceC4139b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // N5.a
    public Object get() {
        return this.f40650a;
    }
}
