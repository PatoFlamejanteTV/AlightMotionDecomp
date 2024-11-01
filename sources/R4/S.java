package r4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class S extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f38149b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f38150c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38151d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(G identifier, Q controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38149b = identifier;
        this.f38150c = controller;
        this.f38151d = true;
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38149b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38152e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38151d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3292y.d(this.f38149b, s8.f38149b) && AbstractC3292y.d(this.f38150c, s8.f38150c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38149b.hashCode() * 31) + this.f38150c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f38150c;
    }

    public String toString() {
        return "PhoneNumberElement(identifier=" + this.f38149b + ", controller=" + this.f38150c + ")";
    }
}
