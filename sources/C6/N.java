package C6;

import A6.f;
import A6.k;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class N implements A6.f {

    /* renamed from: a, reason: collision with root package name */
    private final A6.f f1014a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1015b;

    public /* synthetic */ N(A6.f fVar, AbstractC3284p abstractC3284p) {
        this(fVar);
    }

    @Override // A6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        Integer i8 = l6.n.i(name);
        if (i8 != null) {
            return i8.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // A6.f
    public int e() {
        return this.f1015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        if (AbstractC3292y.d(this.f1014a, n8.f1014a) && AbstractC3292y.d(a(), n8.a())) {
            return true;
        }
        return false;
    }

    @Override // A6.f
    public String f(int i8) {
        return String.valueOf(i8);
    }

    @Override // A6.f
    public List g(int i8) {
        if (i8 >= 0) {
            return AbstractC1435t.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // A6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // A6.f
    public A6.j getKind() {
        return k.b.f289a;
    }

    @Override // A6.f
    public A6.f h(int i8) {
        if (i8 >= 0) {
            return this.f1014a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f1014a.hashCode() * 31) + a().hashCode();
    }

    @Override // A6.f
    public boolean i(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // A6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return a() + '(' + this.f1014a + ')';
    }

    private N(A6.f fVar) {
        this.f1014a = fVar;
        this.f1015b = 1;
    }
}
