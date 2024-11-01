package U6;

import U6.Q;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1455k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10244a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1455k f10245b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f10246c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1455k f10247d;

    /* renamed from: U6.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        AbstractC1455k c1462s;
        try {
            Class.forName("java.nio.file.Files");
            c1462s = new K();
        } catch (ClassNotFoundException unused) {
            c1462s = new C1462s();
        }
        f10245b = c1462s;
        Q.a aVar = Q.f10156b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC3292y.h(property, "getProperty(\"java.io.tmpdir\")");
        f10246c = Q.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = V6.h.class.getClassLoader();
        AbstractC3292y.h(classLoader, "ResourceFileSystem::class.java.classLoader");
        f10247d = new V6.h(classLoader, false);
    }

    public abstract void a(Q q8, Q q9);

    public final void b(Q dir, boolean z8) {
        AbstractC3292y.i(dir, "dir");
        V6.c.a(this, dir, z8);
    }

    public final void c(Q dir) {
        AbstractC3292y.i(dir, "dir");
        d(dir, false);
    }

    public abstract void d(Q q8, boolean z8);

    public final void e(Q path) {
        AbstractC3292y.i(path, "path");
        f(path, false);
    }

    public abstract void f(Q q8, boolean z8);

    public final boolean g(Q path) {
        AbstractC3292y.i(path, "path");
        return V6.c.b(this, path);
    }

    public abstract C1454j h(Q q8);

    public abstract AbstractC1453i i(Q q8);

    public final AbstractC1453i j(Q file) {
        AbstractC3292y.i(file, "file");
        return k(file, false, false);
    }

    public abstract AbstractC1453i k(Q q8, boolean z8, boolean z9);

    public abstract Z l(Q q8);
}
