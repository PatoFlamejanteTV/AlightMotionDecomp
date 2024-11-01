package j4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class S extends r4.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f33979f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f33980b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f33981c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33982d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f33983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(r4.G _identifier, Q controller) {
        super(_identifier);
        AbstractC3292y.i(_identifier, "_identifier");
        AbstractC3292y.i(controller, "controller");
        this.f33980b = _identifier;
        this.f33981c = controller;
        this.f33982d = true;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f33983e;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f33982d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3292y.d(this.f33980b, s8.f33980b) && AbstractC3292y.d(this.f33981c, s8.f33981c)) {
            return true;
        }
        return false;
    }

    @Override // r4.o0, r4.k0
    public void h(Map rawValuesMap) {
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f33980b.hashCode() * 31) + this.f33981c.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f33981c;
    }

    public String toString() {
        return "CvcElement(_identifier=" + this.f33980b + ", controller=" + this.f33981c + ")";
    }
}
