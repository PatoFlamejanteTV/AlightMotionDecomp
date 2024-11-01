package C6;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class m0 implements A6.f, InterfaceC1022l {

    /* renamed from: a, reason: collision with root package name */
    private final A6.f f1078a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1079b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f1080c;

    public m0(A6.f original) {
        AbstractC3292y.i(original, "original");
        this.f1078a = original;
        this.f1079b = original.a() + '?';
        this.f1080c = AbstractC1010c0.a(original);
    }

    @Override // A6.f
    public String a() {
        return this.f1079b;
    }

    @Override // C6.InterfaceC1022l
    public Set b() {
        return this.f1080c;
    }

    @Override // A6.f
    public boolean c() {
        return true;
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        return this.f1078a.d(name);
    }

    @Override // A6.f
    public int e() {
        return this.f1078a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m0) && AbstractC3292y.d(this.f1078a, ((m0) obj).f1078a)) {
            return true;
        }
        return false;
    }

    @Override // A6.f
    public String f(int i8) {
        return this.f1078a.f(i8);
    }

    @Override // A6.f
    public List g(int i8) {
        return this.f1078a.g(i8);
    }

    @Override // A6.f
    public List getAnnotations() {
        return this.f1078a.getAnnotations();
    }

    @Override // A6.f
    public A6.j getKind() {
        return this.f1078a.getKind();
    }

    @Override // A6.f
    public A6.f h(int i8) {
        return this.f1078a.h(i8);
    }

    public int hashCode() {
        return this.f1078a.hashCode() * 31;
    }

    @Override // A6.f
    public boolean i(int i8) {
        return this.f1078a.i(i8);
    }

    @Override // A6.f
    public boolean isInline() {
        return this.f1078a.isInline();
    }

    public final A6.f j() {
        return this.f1078a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1078a);
        sb.append('?');
        return sb.toString();
    }
}
