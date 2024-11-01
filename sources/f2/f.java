package F2;

import d3.C2752d;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f2149a;

    /* renamed from: b, reason: collision with root package name */
    private final C2752d f2150b;

    /* renamed from: c, reason: collision with root package name */
    private final List f2151c;

    /* renamed from: d, reason: collision with root package name */
    private final b f2152d;

    /* renamed from: e, reason: collision with root package name */
    private final List f2153e;

    /* renamed from: f, reason: collision with root package name */
    private final D3.f f2154f;

    /* renamed from: g, reason: collision with root package name */
    private final Throwable f2155g;

    public f(c config, C2752d paymentMethodMetadata, List customerPaymentMethods, b customerPermissions, List supportedPaymentMethods, D3.f fVar, Throwable th) {
        AbstractC3292y.i(config, "config");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(customerPaymentMethods, "customerPaymentMethods");
        AbstractC3292y.i(customerPermissions, "customerPermissions");
        AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
        this.f2149a = config;
        this.f2150b = paymentMethodMetadata;
        this.f2151c = customerPaymentMethods;
        this.f2152d = customerPermissions;
        this.f2153e = supportedPaymentMethods;
        this.f2154f = fVar;
        this.f2155g = th;
    }

    public final List a() {
        return this.f2151c;
    }

    public final b b() {
        return this.f2152d;
    }

    public final C2752d c() {
        return this.f2150b;
    }

    public final D3.f d() {
        return this.f2154f;
    }

    public final List e() {
        return this.f2153e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f2149a, fVar.f2149a) && AbstractC3292y.d(this.f2150b, fVar.f2150b) && AbstractC3292y.d(this.f2151c, fVar.f2151c) && AbstractC3292y.d(this.f2152d, fVar.f2152d) && AbstractC3292y.d(this.f2153e, fVar.f2153e) && AbstractC3292y.d(this.f2154f, fVar.f2154f) && AbstractC3292y.d(this.f2155g, fVar.f2155g)) {
            return true;
        }
        return false;
    }

    public final Throwable f() {
        return this.f2155g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f2149a.hashCode() * 31) + this.f2150b.hashCode()) * 31) + this.f2151c.hashCode()) * 31) + this.f2152d.hashCode()) * 31) + this.f2153e.hashCode()) * 31;
        D3.f fVar = this.f2154f;
        int i8 = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        Throwable th = this.f2155g;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Full(config=" + this.f2149a + ", paymentMethodMetadata=" + this.f2150b + ", customerPaymentMethods=" + this.f2151c + ", customerPermissions=" + this.f2152d + ", supportedPaymentMethods=" + this.f2153e + ", paymentSelection=" + this.f2154f + ", validationError=" + this.f2155g + ")";
    }
}
