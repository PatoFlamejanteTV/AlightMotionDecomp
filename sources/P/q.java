package P;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC2084b;

/* loaded from: classes3.dex */
public final class q extends n {

    /* renamed from: c, reason: collision with root package name */
    private final O.e f7962c;

    public q(O.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f7962c = eVar;
    }

    @Override // O.f
    public final AbstractC2084b a(AbstractC2084b abstractC2084b) {
        return this.f7962c.f(abstractC2084b);
    }

    @Override // O.f
    public final Looper c() {
        return this.f7962c.m();
    }
}
