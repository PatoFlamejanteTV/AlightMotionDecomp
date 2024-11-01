package j4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j4.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3191l0 extends r4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f34183b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.w0 f34184c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34185d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f34186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3191l0(r4.G identifier, r4.w0 controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f34183b = identifier;
        this.f34184c = controller;
        this.f34185d = true;
    }

    @Override // r4.o0, r4.k0
    public r4.G a() {
        return this.f34183b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f34186e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f34185d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3191l0)) {
            return false;
        }
        C3191l0 c3191l0 = (C3191l0) obj;
        if (AbstractC3292y.d(this.f34183b, c3191l0.f34183b) && AbstractC3292y.d(this.f34184c, c3191l0.f34184c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34183b.hashCode() * 31) + this.f34184c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r4.w0 i() {
        return this.f34184c;
    }

    public String toString() {
        return "IbanElement(identifier=" + this.f34183b + ", controller=" + this.f34184c + ")";
    }
}
