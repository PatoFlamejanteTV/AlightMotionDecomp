package j4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class L extends r4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f33875b;

    /* renamed from: c, reason: collision with root package name */
    private final K f33876c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33877d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f33878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(r4.G _identifier, K controller) {
        super(_identifier);
        AbstractC3292y.i(_identifier, "_identifier");
        AbstractC3292y.i(controller, "controller");
        this.f33875b = _identifier;
        this.f33876c = controller;
        this.f33877d = true;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f33878e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f33877d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3292y.d(this.f33875b, l8.f33875b) && AbstractC3292y.d(this.f33876c, l8.f33876c)) {
            return true;
        }
        return false;
    }

    @Override // r4.o0, r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f33875b.hashCode() * 31) + this.f33876c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public K i() {
        return this.f33876c;
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this.f33875b + ", controller=" + this.f33876c + ")";
    }
}
