package S1;

import j$.util.DesugarCollections;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class g implements O1.o {

    /* renamed from: a, reason: collision with root package name */
    private final Set f9374a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9375b;

    /* renamed from: c, reason: collision with root package name */
    private final U1.c f9376c = new U1.c();

    public g(Set set, Set set2) {
        if (set != null) {
            this.f9374a = DesugarCollections.unmodifiableSet(set);
            if (set2 != null) {
                this.f9375b = set2;
                return;
            }
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }

    @Override // O1.o
    public Set b() {
        return this.f9375b;
    }

    @Override // O1.o
    public Set f() {
        return this.f9374a;
    }

    public U1.c g() {
        return this.f9376c;
    }
}
