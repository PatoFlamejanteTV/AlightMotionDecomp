package r4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f38365f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final G f38366b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f38367c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38368d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(G identifier, d0 controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38366b = identifier;
        this.f38367c = controller;
        this.f38368d = true;
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38366b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38369e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38368d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (AbstractC3292y.d(this.f38366b, e0Var.f38366b) && AbstractC3292y.d(this.f38367c, e0Var.f38367c)) {
            return true;
        }
        return false;
    }

    @Override // r4.o0, r4.k0
    public boolean g() {
        return true;
    }

    @Override // r4.o0, r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().q(str);
        }
    }

    public int hashCode() {
        return (this.f38366b.hashCode() * 31) + this.f38367c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d0 i() {
        return this.f38367c;
    }

    public String toString() {
        return "SameAsShippingElement(identifier=" + this.f38366b + ", controller=" + this.f38367c + ")";
    }
}
