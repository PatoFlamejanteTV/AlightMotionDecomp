package D6;

import E6.S;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class p extends x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1495a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1496b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1497c;

    public /* synthetic */ p(Object obj, boolean z8, A6.f fVar, int i8, AbstractC3284p abstractC3284p) {
        this(obj, z8, (i8 & 4) != 0 ? null : fVar);
    }

    @Override // D6.x
    public String c() {
        return this.f1497c;
    }

    public final A6.f e() {
        return this.f1496b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (g() == pVar.g() && AbstractC3292y.d(c(), pVar.c())) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.f1495a;
    }

    public int hashCode() {
        return (androidx.compose.foundation.a.a(g()) * 31) + c().hashCode();
    }

    @Override // D6.x
    public String toString() {
        if (g()) {
            StringBuilder sb = new StringBuilder();
            S.c(sb, c());
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            return sb2;
        }
        return c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Object body, boolean z8, A6.f fVar) {
        super(null);
        AbstractC3292y.i(body, "body");
        this.f1495a = z8;
        this.f1496b = fVar;
        this.f1497c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
