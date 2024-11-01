package b2;

/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1968f {

    /* renamed from: b, reason: collision with root package name */
    private static String f14912b = "Invalid or non Implemented status";

    /* renamed from: a, reason: collision with root package name */
    public final C1967e f14913a;

    public AbstractC1968f(C1967e c1967e) {
        this.f14913a = c1967e;
    }

    public abstract void a(Object obj, Object obj2);

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f14912b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) {
        throw new RuntimeException(f14912b + " setValue in " + getClass() + " key=" + str);
    }

    public AbstractC1968f f(String str) {
        throw new RuntimeException(f14912b + " startArray in " + getClass() + " key=" + str);
    }

    public AbstractC1968f g(String str) {
        throw new RuntimeException(f14912b + " startObject(String key) in " + getClass() + " key=" + str);
    }

    public Object b(Object obj) {
        return obj;
    }
}
