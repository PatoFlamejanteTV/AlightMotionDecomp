package U1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Provider f10013a;

    /* renamed from: b, reason: collision with root package name */
    private SecureRandom f10014b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f10013a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f10014b;
        if (secureRandom == null) {
            return new SecureRandom();
        }
        return secureRandom;
    }

    public void c(Provider provider) {
        this.f10013a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f10013a = provider;
        this.f10014b = secureRandom;
    }
}
