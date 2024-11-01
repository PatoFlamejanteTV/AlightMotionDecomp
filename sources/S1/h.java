package S1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class h implements U1.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9377a;

    /* renamed from: b, reason: collision with root package name */
    private final U1.b f9378b = new U1.b();

    public h(Set set) {
        if (set != null) {
            this.f9377a = DesugarCollections.unmodifiableSet(set);
            return;
        }
        throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
    }

    @Override // U1.a
    public U1.b d() {
        return this.f9378b;
    }

    public Set g() {
        return this.f9377a;
    }
}
