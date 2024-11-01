package C6;

import A6.f;
import Q5.C1413h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class k0 implements A6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1073a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.e f1074b;

    public k0(String serialName, A6.e kind) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(kind, "kind");
        this.f1073a = serialName;
        this.f1074b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // A6.f
    public String a() {
        return this.f1073a;
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
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (AbstractC3292y.d(a(), k0Var.a()) && AbstractC3292y.d(getKind(), k0Var.getKind())) {
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

    @Override // A6.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public A6.e getKind() {
        return this.f1074b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
