package C6;

import A6.f;
import A6.k;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class S implements A6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1021a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1022b;

    /* renamed from: c, reason: collision with root package name */
    private final A6.f f1023c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1024d;

    public /* synthetic */ S(String str, A6.f fVar, A6.f fVar2, AbstractC3284p abstractC3284p) {
        this(str, fVar, fVar2);
    }

    @Override // A6.f
    public String a() {
        return this.f1021a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // A6.f
    public int e() {
        return this.f1024d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3292y.d(a(), s8.a()) && AbstractC3292y.d(this.f1022b, s8.f1022b) && AbstractC3292y.d(this.f1023c, s8.f1023c)) {
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
        return k.c.f290a;
    }

    @Override // A6.f
    public A6.f h(int i8) {
        if (i8 >= 0) {
            int i9 = i8 % 2;
            if (i9 != 0) {
                if (i9 == 1) {
                    return this.f1023c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f1022b;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f1022b.hashCode()) * 31) + this.f1023c.hashCode();
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
        return a() + '(' + this.f1022b + ", " + this.f1023c + ')';
    }

    private S(String str, A6.f fVar, A6.f fVar2) {
        this.f1021a = str;
        this.f1022b = fVar;
        this.f1023c = fVar2;
        this.f1024d = 2;
    }
}
