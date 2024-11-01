package r4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: r4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3921u extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f38645b;

    /* renamed from: c, reason: collision with root package name */
    private final C3925y f38646c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38647d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3921u(G identifier, C3925y controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38645b = identifier;
        this.f38646c = controller;
        this.f38647d = true;
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38645b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38648e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38647d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3921u)) {
            return false;
        }
        C3921u c3921u = (C3921u) obj;
        if (AbstractC3292y.d(this.f38645b, c3921u.f38645b) && AbstractC3292y.d(this.f38646c, c3921u.f38646c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38645b.hashCode() * 31) + this.f38646c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3925y i() {
        return this.f38646c;
    }

    public String toString() {
        return "CountryElement(identifier=" + this.f38645b + ", controller=" + this.f38646c + ")";
    }
}
