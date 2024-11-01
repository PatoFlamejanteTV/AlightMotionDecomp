package r4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: r4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3912k extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f38491b;

    /* renamed from: c, reason: collision with root package name */
    private final C3925y f38492c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38493d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f38494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3912k(G identifier, C3925y controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f38491b = identifier;
        this.f38492c = controller;
        this.f38493d = true;
    }

    @Override // r4.o0, r4.k0
    public G a() {
        return this.f38491b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f38494e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f38493d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3912k)) {
            return false;
        }
        C3912k c3912k = (C3912k) obj;
        if (AbstractC3292y.d(this.f38491b, c3912k.f38491b) && AbstractC3292y.d(this.f38492c, c3912k.f38492c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38491b.hashCode() * 31) + this.f38492c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3925y i() {
        return this.f38492c;
    }

    public String toString() {
        return "AdministrativeAreaElement(identifier=" + this.f38491b + ", controller=" + this.f38492c + ")";
    }
}
