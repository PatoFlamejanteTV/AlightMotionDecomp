package S7;

import D5.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f9853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9855c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9856d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9857e;

    public f(String identifier, String type, int i8, String domain, List purposes) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(domain, "domain");
        AbstractC3292y.i(purposes, "purposes");
        this.f9853a = identifier;
        this.f9854b = type;
        this.f9855c = i8;
        this.f9856d = domain;
        this.f9857e = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f9853a, fVar.f9853a) && AbstractC3292y.d(this.f9854b, fVar.f9854b) && this.f9855c == fVar.f9855c && AbstractC3292y.d(this.f9856d, fVar.f9856d) && AbstractC3292y.d(this.f9857e, fVar.f9857e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9857e.hashCode() + t.a(this.f9856d, H6.k.a(this.f9855c, t.a(this.f9854b, this.f9853a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("Disclosure(identifier=");
        a9.append(this.f9853a);
        a9.append(", type=");
        a9.append(this.f9854b);
        a9.append(", maxAgeSeconds=");
        a9.append(this.f9855c);
        a9.append(", domain=");
        a9.append(this.f9856d);
        a9.append(", purposes=");
        a9.append(this.f9857e);
        a9.append(')');
        return a9.toString();
    }
}
