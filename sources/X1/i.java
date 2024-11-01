package X1;

import b2.C1967e;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static g f10944a = g.f10933h;

    /* renamed from: b, reason: collision with root package name */
    public static final a2.d f10945b = new a2.d();

    /* renamed from: c, reason: collision with root package name */
    public static final C1967e f10946c = new C1967e();

    public static void a(String str, Appendable appendable, g gVar) {
        if (str == null) {
            return;
        }
        gVar.f(str, appendable);
    }

    public static void b(Object obj, Appendable appendable, g gVar) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        a2.d dVar = f10945b;
        a2.e a9 = dVar.a(cls);
        if (a9 == null) {
            if (cls.isArray()) {
                a9 = a2.d.f14068l;
            } else {
                a9 = dVar.b(obj.getClass());
                if (a9 == null) {
                    a9 = a2.d.f14066j;
                }
            }
            dVar.d(a9, cls);
        }
        a9.a(obj, appendable, gVar);
    }
}
