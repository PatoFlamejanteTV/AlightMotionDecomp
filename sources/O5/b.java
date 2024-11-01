package O5;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7877b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7878c;

    public b(String country, String region, String city) {
        AbstractC3292y.i(country, "country");
        AbstractC3292y.i(region, "region");
        AbstractC3292y.i(city, "city");
        this.f7876a = country;
        this.f7877b = region;
        this.f7878c = city;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f7876a, bVar.f7876a) && AbstractC3292y.d(this.f7877b, bVar.f7877b) && AbstractC3292y.d(this.f7878c, bVar.f7878c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7878c.hashCode() + t.a(this.f7877b, this.f7876a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GeoIP(country=");
        a9.append(this.f7876a);
        a9.append(", region=");
        a9.append(this.f7877b);
        a9.append(", city=");
        a9.append(this.f7878c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ b(String str, String str2, String str3, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) == 0 ? null : "");
    }
}
