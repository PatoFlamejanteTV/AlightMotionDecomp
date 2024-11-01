package C6;

import A6.f;
import A6.k;
import Q5.C1413h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class X implements A6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final X f1029a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.j f1030b = k.d.f291a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f1031c = "kotlin.Nothing";

    private X() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // A6.f
    public String a() {
        return f1031c;
    }

    @Override // A6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        b();
        throw new C1413h();
    }

    @Override // A6.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // A6.f
    public String f(int i8) {
        b();
        throw new C1413h();
    }

    @Override // A6.f
    public List g(int i8) {
        b();
        throw new C1413h();
    }

    @Override // A6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // A6.f
    public A6.j getKind() {
        return f1030b;
    }

    @Override // A6.f
    public A6.f h(int i8) {
        b();
        throw new C1413h();
    }

    public int hashCode() {
        return a().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // A6.f
    public boolean i(int i8) {
        b();
        throw new C1413h();
    }

    @Override // A6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
