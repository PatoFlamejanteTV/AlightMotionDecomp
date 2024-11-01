package j4;

import kotlin.jvm.internal.AbstractC3292y;
import r4.C3925y;

/* loaded from: classes4.dex */
public final class K0 extends r4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f33871b;

    /* renamed from: c, reason: collision with root package name */
    private final C3925y f33872c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33873d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f33874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(r4.G identifier, C3925y controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f33871b = identifier;
        this.f33872c = controller;
        this.f33873d = true;
    }

    @Override // r4.o0, r4.k0
    public r4.G a() {
        return this.f33871b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f33874e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f33873d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3292y.d(this.f33871b, k02.f33871b) && AbstractC3292y.d(this.f33872c, k02.f33872c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f33871b.hashCode() * 31) + this.f33872c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3925y i() {
        return this.f33872c;
    }

    public String toString() {
        return "SimpleDropdownElement(identifier=" + this.f33871b + ", controller=" + this.f33872c + ")";
    }
}
