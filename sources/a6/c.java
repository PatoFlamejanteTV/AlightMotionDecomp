package A6;

import j6.InterfaceC3214c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f251a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3214c f252b;

    /* renamed from: c, reason: collision with root package name */
    private final String f253c;

    public c(f original, InterfaceC3214c kClass) {
        AbstractC3292y.i(original, "original");
        AbstractC3292y.i(kClass, "kClass");
        this.f251a = original;
        this.f252b = kClass;
        this.f253c = original.a() + '<' + kClass.b() + '>';
    }

    @Override // A6.f
    public String a() {
        return this.f253c;
    }

    @Override // A6.f
    public boolean c() {
        return this.f251a.c();
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        return this.f251a.d(name);
    }

    @Override // A6.f
    public int e() {
        return this.f251a.e();
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3292y.d(this.f251a, cVar.f251a) || !AbstractC3292y.d(cVar.f252b, this.f252b)) {
            return false;
        }
        return true;
    }

    @Override // A6.f
    public String f(int i8) {
        return this.f251a.f(i8);
    }

    @Override // A6.f
    public List g(int i8) {
        return this.f251a.g(i8);
    }

    @Override // A6.f
    public List getAnnotations() {
        return this.f251a.getAnnotations();
    }

    @Override // A6.f
    public j getKind() {
        return this.f251a.getKind();
    }

    @Override // A6.f
    public f h(int i8) {
        return this.f251a.h(i8);
    }

    public int hashCode() {
        return (this.f252b.hashCode() * 31) + a().hashCode();
    }

    @Override // A6.f
    public boolean i(int i8) {
        return this.f251a.i(i8);
    }

    @Override // A6.f
    public boolean isInline() {
        return this.f251a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f252b + ", original: " + this.f251a + ')';
    }
}
