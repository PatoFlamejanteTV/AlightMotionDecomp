package J3;

import g3.EnumC2906e;
import j4.P;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import r4.x0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f4101a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2906e f4102b;

    /* renamed from: c, reason: collision with root package name */
    private final P f4103c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4104d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4105e;

    /* renamed from: f, reason: collision with root package name */
    private final x0.c f4106f;

    public g(String cvc, EnumC2906e cardBrand) {
        int i8;
        AbstractC3292y.i(cvc, "cvc");
        AbstractC3292y.i(cardBrand, "cardBrand");
        this.f4101a = cvc;
        this.f4102b = cardBrand;
        P p8 = new P();
        this.f4103c = p8;
        this.f4104d = p8.c(cardBrand, cvc, cardBrand.m()).a();
        if (cardBrand == EnumC2906e.f32119q) {
            i8 = AbstractC3394E.f35223b0;
        } else {
            i8 = AbstractC3394E.f35229e0;
        }
        this.f4105e = i8;
        this.f4106f = new x0.c(cardBrand.g(), null, false, null, 10, null);
    }

    public final EnumC2906e a() {
        return this.f4102b;
    }

    public final String b() {
        return this.f4101a;
    }

    public final x0.c c() {
        return this.f4106f;
    }

    public final int d() {
        return this.f4105e;
    }

    public final boolean e() {
        return this.f4104d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3292y.d(this.f4101a, gVar.f4101a) && this.f4102b == gVar.f4102b) {
            return true;
        }
        return false;
    }

    public final g f(String cvc) {
        AbstractC3292y.i(cvc, "cvc");
        if (cvc.length() > this.f4102b.m()) {
            return this;
        }
        return new g(cvc, this.f4102b);
    }

    public int hashCode() {
        return (this.f4101a.hashCode() * 31) + this.f4102b.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.f4101a + ", cardBrand=" + this.f4102b + ")";
    }
}
