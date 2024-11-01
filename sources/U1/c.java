package U1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private Provider f10015c;

    /* renamed from: d, reason: collision with root package name */
    private Provider f10016d;

    /* renamed from: e, reason: collision with root package name */
    private Provider f10017e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f10016d;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider e() {
        Provider provider = this.f10015c;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider f() {
        Provider provider = this.f10017e;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f10015c = provider2;
        this.f10016d = provider3;
        this.f10017e = provider4;
    }
}
