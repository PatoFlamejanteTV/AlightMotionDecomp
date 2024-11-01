package j4;

import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* renamed from: j4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3172c implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34097a;

    /* renamed from: b, reason: collision with root package name */
    private final r4.r f34098b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34099c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f34100d;

    public C3172c(r4.G identifier, r4.r rVar) {
        AbstractC3292y.i(identifier, "identifier");
        this.f34097a = identifier;
        this.f34098b = rVar;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34097a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34100d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34099c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.n(AbstractC1435t.m());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3172c)) {
            return false;
        }
        C3172c c3172c = (C3172c) obj;
        if (AbstractC3292y.d(this.f34097a, c3172c.f34097a) && AbstractC3292y.d(this.f34098b, c3172c.f34098b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f34097a.hashCode() * 31;
        r4.r rVar = this.f34098b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AffirmHeaderElement(identifier=" + this.f34097a + ", controller=" + this.f34098b + ")";
    }

    public /* synthetic */ C3172c(r4.G g8, r4.r rVar, int i8, AbstractC3284p abstractC3284p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
