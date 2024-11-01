package D5;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1372a;

    /* renamed from: b, reason: collision with root package name */
    public String f1373b;

    /* renamed from: c, reason: collision with root package name */
    public String f1374c;

    public f(int i8, String provider_name, String policy_url, String domains) {
        AbstractC3292y.i(provider_name, "provider_name");
        AbstractC3292y.i(policy_url, "policy_url");
        AbstractC3292y.i(domains, "domains");
        this.f1372a = i8;
        this.f1373b = provider_name;
        this.f1374c = policy_url;
    }

    public final G6.l a() {
        return new G6.l(this.f1372a, this.f1373b, null, null, null, null, null, null, null, this.f1374c, null, null, 0, false, false, null, null, null, null, null, 914940);
    }
}
