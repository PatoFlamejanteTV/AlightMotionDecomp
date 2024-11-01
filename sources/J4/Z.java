package j4;

import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* loaded from: classes4.dex */
public final class Z implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34071a;

    /* renamed from: b, reason: collision with root package name */
    private final r4.r f34072b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34073c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f34074d;

    public Z(r4.G identifier, r4.r rVar) {
        AbstractC3292y.i(identifier, "identifier");
        this.f34071a = identifier;
        this.f34072b = rVar;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34071a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34074d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34073c;
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
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        if (AbstractC3292y.d(this.f34071a, z8.f34071a) && AbstractC3292y.d(this.f34072b, z8.f34072b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f34071a.hashCode() * 31;
        r4.r rVar = this.f34072b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EmptyFormElement(identifier=" + this.f34071a + ", controller=" + this.f34072b + ")";
    }

    public /* synthetic */ Z(r4.G g8, r4.r rVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? r4.G.Companion.a("empty_form") : g8, (i8 & 2) != 0 ? null : rVar);
    }
}
