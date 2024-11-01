package z5;

import y5.InterfaceC4247a;

/* loaded from: classes5.dex */
public final class f implements e, InterfaceC4247a {

    /* renamed from: b, reason: collision with root package name */
    private static final f f41558b = new f(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f41559a;

    private f(Object obj) {
        this.f41559a = obj;
    }

    public static e a(Object obj) {
        return new f(h.c(obj, "instance cannot be null"));
    }

    public static e b(Object obj) {
        if (obj == null) {
            return c();
        }
        return new f(obj);
    }

    private static f c() {
        return f41558b;
    }

    @Override // N5.a
    public Object get() {
        return this.f41559a;
    }
}
