package K6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    final C1320a f4819a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f4820b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f4821c;

    public B(C1320a c1320a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c1320a != null) {
            if (proxy != null) {
                if (inetSocketAddress != null) {
                    this.f4819a = c1320a;
                    this.f4820b = proxy;
                    this.f4821c = inetSocketAddress;
                    return;
                }
                throw new NullPointerException("inetSocketAddress == null");
            }
            throw new NullPointerException("proxy == null");
        }
        throw new NullPointerException("address == null");
    }

    public C1320a a() {
        return this.f4819a;
    }

    public Proxy b() {
        return this.f4820b;
    }

    public boolean c() {
        if (this.f4819a.f4837i != null && this.f4820b.type() == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public InetSocketAddress d() {
        return this.f4821c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof B) {
            B b9 = (B) obj;
            if (b9.f4819a.equals(this.f4819a) && b9.f4820b.equals(this.f4820b) && b9.f4821c.equals(this.f4821c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f4819a.hashCode()) * 31) + this.f4820b.hashCode()) * 31) + this.f4821c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f4821c + "}";
    }
}
