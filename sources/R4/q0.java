package r4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class q0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f38590b;

    /* renamed from: c, reason: collision with root package name */
    private final w0 f38591c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38592d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(G identifier, w0 controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38590b = identifier;
        this.f38591c = controller;
        this.f38592d = true;
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38590b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38593e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38592d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (AbstractC3292y.d(this.f38590b, q0Var.f38590b) && AbstractC3292y.d(this.f38591c, q0Var.f38591c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38590b.hashCode() * 31) + this.f38591c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return this.f38591c;
    }

    public String toString() {
        return "SimpleTextElement(identifier=" + this.f38590b + ", controller=" + this.f38591c + ")";
    }
}
