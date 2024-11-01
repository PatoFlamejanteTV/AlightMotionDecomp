package r4;

import kotlin.jvm.internal.AbstractC3292y;
import r4.k0;

/* loaded from: classes4.dex */
public abstract class n0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f38537a;

    public n0(G identifier) {
        AbstractC3292y.i(identifier, "identifier");
        this.f38537a = identifier;
    }

    @Override // r4.k0
    public G a() {
        return this.f38537a;
    }

    @Override // r4.k0
    public boolean g() {
        return k0.a.a(this);
    }
}
